package ast.visitor;

import ast.Expression;
import ast.expression.Boolean;
import ast.expression.*;
import ast.statement.Assignment;
import ast.statement.Input;
import ast.type.ErrorType;

public class TypeCheckingVisitor<TR,TP> extends AbstractVisitor<TR,TP> {

    @Override
    public TR visit(Arithmetic arithmetic, TP p) {
        arithmetic.setLValue(false);
        super.visit(arithmetic,p);
        return null;
    }

    @Override
    public TR visit(Boolean bool, TP p) {
        bool.setLValue(false);
        super.visit(bool,p);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP p) {
        cast.setLValue(false);
        super.visit(cast, p);
        return null;
    }

    @Override
    public TR visit(CharLiteral lit, TP p) {
        lit.setLValue(false);
        super.visit(lit,p);
        return null;
    }

    @Override
    public TR visit(Comparison comp, TP p) {
        comp.setLValue(false);
        super.visit(comp,p);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral lit, TP p) {
        lit.setLValue(false);
        super.visit(lit,p);
        return null;
    }

    @Override
    public TR visit(IntLiteral lit, TP p) {
        lit.setLValue(false);
        super.visit(lit,p);
        return null;
    }

    @Override
    public TR visit(Not not, TP p) {
        not.setLValue(false);
        super.visit(not,p);
        return null;
    }

    @Override
    public TR visit(Point point, TP p) {
        point.setLValue(true);
        super.visit(point,p);
        return null;
    }

    @Override
    public TR visit(SquareBrackets sB, TP p) {
        sB.setLValue(true);
        super.visit(sB,p);
        return null;
    }

    @Override
    public TR visit(UnaryMinus minus, TP p) {
        minus.setLValue(false);
        super.visit(minus,p);
        return null;
    }

    @Override
    public TR visit(Variable var, TP p) {
        var.setLValue(true);
        super.visit(var,p);
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP p) {
        super.visit(assignment,p);
        if(!assignment.getLeft().getLValue()){
            new ErrorType(assignment.getLine(),assignment.getColumn(),"Error: Not LValue");
        }
        return null;
    }

    @Override
    public TR visit(Input input, TP p) {
        super.visit(input,p);
        for(Expression exp: input.getExpressions()){
            if(!exp.getLValue()){
                new ErrorType(exp.getLine(),exp.getColumn(),"Error: Not LValue");
            }
        }
        return null;
    }
}
