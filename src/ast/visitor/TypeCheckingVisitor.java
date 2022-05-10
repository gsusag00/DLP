package ast.visitor;

import ast.Expression;
import ast.Statement;
import ast.Type;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Boolean;
import ast.expression.*;
import ast.statement.*;
import ast.type.*;
import ast.type.Character;
import ast.type.Double;
import ast.type.Integer;

public class TypeCheckingVisitor extends AbstractVisitor<Object,Object> {

    @Override
    public Object visit(FuncDefinition funcDef, Object p) {
        funcDef.getType().accept(this,p);
        for(VarDefinition varDef : funcDef.getVarDefinitions()){
            varDef.accept(this,p);
        }

        Type retType = ((FunctionType) funcDef.getType()).getReturnType();
        for(Statement st : funcDef.getStatements()){
            st.accept(this,retType);
        }
        return null;
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object p) {
        arithmetic.getLeft().accept(this,p);
        arithmetic.getRight().accept(this,p);

        arithmetic.setType(arithmetic.getLeft().getType().arithmetic(arithmetic.getRight().getType(),arithmetic));

        arithmetic.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Boolean bool, Object p) {
        bool.getLeft().accept(this,p);
        bool.getRight().accept(this,p);

        bool.setType(bool.getLeft().getType().logical(bool.getRight().getType(),bool));

        bool.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Cast cast, Object p) {
        cast.getCastType().accept(this,p);
        cast.getExpression().accept(this,p);

        if(!cast.getCastType().isBuiltInType(cast)) {
            new ErrorType(cast.getLine(),cast.getColumn(),"El tipo del cast no es built in");
        }
        cast.setType(cast.getExpression().getType().canBeCastTo(cast.getCastType(),cast));

        cast.setLValue(false);
        return null;
    }

    @Override
    public Object visit(CharLiteral lit, Object p) {
        lit.setLValue(false);
        lit.setType(Character.getInstance());
        return null;
    }

    @Override
    public Object visit(Comparison comp, Object p) {
        comp.getLeft().accept(this,p);
        comp.getRight().accept(this,p);

        comp.setType(comp.getLeft().getType().comparison(comp.getRight().getType(),comp));

        comp.setLValue(false);
        return null;
    }

    @Override
    public Object visit(DoubleLiteral lit, Object p) {
        lit.setLValue(false);
        lit.setType(Double.getInstance());
        return null;
    }

    @Override
    public Object visit(IntLiteral lit, Object p) {
        lit.setLValue(false);
        lit.setType(Integer.getInstance());
        return null;
    }

    @Override
    public Object visit(Not not, Object p) {
        not.getExpression().accept(this,p);

        not.setType(not.getExpression().getType().logical(not));

        not.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Point point, Object p) {
        point.getExpression().accept(this,p);

        point.setType(point.getExpression().getType().Dot(point.getName(),point));

        point.setLValue(true);
        return null;
    }

    @Override
    public Object visit(SquareBrackets sB, Object p) {
        sB.getLeft().accept(this,p);
        sB.getRight().accept(this,p);

        sB.setType(sB.getLeft().getType().squareBrackets(sB.getRight().getType(),sB));

        sB.setLValue(true);
        return null;
    }

    @Override
    public Object visit(UnaryMinus minus, Object p) {
        minus.getExpression().accept(this,p);

        minus.setType(minus.getExpression().getType().arithmetic(minus));

        minus.setLValue(false);
        return null;
    }

    @Override
    public Object visit(Variable var, Object p) {
        if(var.getDef() == null) {
            var.setDef(new VarDefinition(var.getLine(), var.getColumn(), var.getName(), var.getType()));
        }
        var.setType(var.getDef().getType());

        var.setLValue(true);
        return null;
    }

    @Override
    public Object visit(Assignment assignment, Object p) {
        assignment.getLeft().accept(this,p);
        assignment.getRight().accept(this,p);

        if(!assignment.getLeft().getLValue()) {
            new ErrorType(assignment.getLine(), assignment.getColumn(), "Error: No es un LValue");
        }
        assignment.getLeft().setType(assignment.getRight().getType().promotesTo(assignment.getLeft().getType(),assignment));
        return null;
    }

    @Override
    public Object visit(Function function, Object p) {
        function.getVariable().accept(this,p);

        for(Expression exp: function.getExpressions()){
            exp.accept(this,p);
        }

        //Si el tipo asociado a la definicion de la funcion es distinto de void.
        if(!(function.getVariable().getType() instanceof VoidType)) {
            if(!(function.getVariable().getType() instanceof ErrorType))
                function.setType(function.getVariable().getType().parenthesis(function, function.getExpressions()));
        }

        return null;
    }

    @Override
    public Object visit(Input input, Object p) {
        for(Expression exp: input.getExpressions()){
            exp.accept(this,p);
        }

        for(Expression exp: input.getExpressions()){
            if(!exp.getLValue()){
                new ErrorType(exp.getLine(),exp.getColumn(),"Error: Se esperaba un LValue");
            }
            if(!exp.getType().isBuiltInType(exp)) {
                new ErrorType(exp.getLine(),exp.getColumn(),"Error: No es built-in");
            }
        }




        return null;
    }

    @Override
    public Object visit(IfElse ifElse, Object p) {
        ifElse.getExpression().accept(this,p);

        if(!ifElse.getExpression().getType().isLogical(ifElse)) {
            new ErrorType(ifElse.getLine(),ifElse.getColumn(),"Error: Se esperaba un valor logico");
        }
        for(Statement st : ifElse.getIfStatements()){
            st.accept(this,p);
        }
        for(Statement st : ifElse.getElseStatements()){
            st.accept(this,p);
        }
        return null;
    }

    @Override
    public Object visit(While whil, Object p) {
        whil.getExpression().accept(this,p);
        if(!whil.getExpression().getType().isLogical(whil)) {
            new ErrorType(whil.getLine(),whil.getColumn(),"Error: Se esperaba un valor logico");
        }
        for(Statement st : whil.getStatements()){
            st.accept(this,p);
        }
        return null;
    }

    @Override
    public Object visit(Return ret, Object p) {
        ret.getExpression().accept(this,p);

        ret.getExpression().setType(ret.getExpression().getType().promotesTo((Type) p, ret));
        return null;
    }
}
