package ast.expression;

import ast.Expression;
import ast.visitor.Visitor;


public class Arithmetic extends AbstractOperation implements Expression {

    public Arithmetic(int line, int column, Expression left, Expression right, String operator) {
        super(line,column,left,right,operator);
    }

    @Override
    public String toString() {
        return "Arithmetic at line: " + getLine() + "Column: " + getColumn() + ". Operator: " + getOperator() + ". Left:" + getLeft().toString() + ". Right: " + getRight().toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
