package ast.visitor;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.expression.Boolean;
import ast.statement.*;
import ast.type.*;
import ast.type.Character;
import ast.type.Double;
import ast.type.Integer;

public abstract class AbstractVisitor<TR,TP> implements Visitor<TR,TP>{

    @Override
    public TR visit(Program program, TP p) {
        for(Definition def : program.getDefiniciones()){
            def.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(FuncDefinition funcDef, TP p) {
        funcDef.getType().accept(this,p);
        for(VarDefinition varDef : funcDef.getVarDefinitions()){
            varDef.accept(this,p);
        }
        for(Statement st : funcDef.getStatements()){
            st.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(VarDefinition varDef, TP p) {
        varDef.getType().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP p) {
        arithmetic.getLeft().accept(this,p);
        arithmetic.getRight().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Boolean bool, TP p) {
        bool.getLeft().accept(this,p);
        bool.getRight().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP p) {
        cast.getType().accept(this,p);
        cast.getExpression().accept(this,p);
        return null;
    }

    @Override
    public TR visit(CharLiteral lit, TP p) {
        return null;
    }

    @Override
    public TR visit(Comparison comp, TP p) {
        comp.getLeft().accept(this,p);
        comp.getRight().accept(this,p);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral lit, TP p) {
        return null;
    }

    @Override
    public TR visit(IntLiteral lit, TP p) {
        return null;
    }

    @Override
    public TR visit(Not not, TP p) {
        not.getExpression().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Point point, TP p) {
        point.getExpression().accept(this,p);
        return null;
    }

    @Override
    public TR visit(SquareBrackets sB, TP p) {
        sB.getLeft().accept(this,p);
        sB.getRight().accept(this,p);
        return null;
    }

    @Override
    public TR visit(UnaryMinus minus, TP p) {
        minus.getExpression().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Variable var, TP p) {
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP p) {
        assignment.getLeft().accept(this,p);
        assignment.getRight().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Function function, TP p) {
        for(Expression exp: function.getExpressions()){
            exp.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP p) {
        ifElse.getExpression().accept(this,p);
        for(Statement st : ifElse.getIfStatements()){
            st.accept(this,p);
        }
        for(Statement st : ifElse.getElseStatements()){
            st.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(Input input, TP p) {
        for(Expression exp: input.getExpressions()){
            exp.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(Print print, TP p) {
        for(Expression exp: print.getExpressions()){
            exp.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(Return ret, TP p) {
        ret.getExpression().accept(this,p);
        return null;
    }

    @Override
    public TR visit(While whil, TP p) {
        whil.getExpression().accept(this,p);
        for(Statement st : whil.getStatements()){
            st.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(Array arr, TP p) {
        arr.getArrayType().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Character character, TP p) {
        return null;
    }

    @Override
    public TR visit(Double doub, TP p) {
        return null;
    }

    @Override
    public TR visit(ErrorType err, TP p) {
        return null;
    }

    @Override
    public TR visit(FunctionType funcType, TP p) {
        funcType.getReturnType().accept(this,p);
        for(VarDefinition varDef: funcType.getDefs()){
            varDef.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(Integer integer, TP p) {
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP p) {
        recordField.getType().accept(this,p);
        return null;
    }

    @Override
    public TR visit(Struct struct, TP p) {
        for(RecordField rf : struct.getRecords()){
            rf.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP p) {
        return null;
    }
}
