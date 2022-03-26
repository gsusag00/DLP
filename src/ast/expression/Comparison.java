package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class Comparison extends BaseNode implements Expression {

    protected Expression left, right;
    protected String operator;
    private boolean lValue;

    public Comparison(int line, int column, Expression left, Expression right, String operator) {
        super(line,column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Comparison at line: " + getLine() + "Column: " + getColumn() + "Left: " + left.toString() + ". Right: " + right.toString() + "Operator='" + operator;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }
}
