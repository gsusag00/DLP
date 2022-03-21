package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class Boolean extends BaseNode implements Expression {

    protected Expression left, right;
    protected String operator;

    private boolean lValue;

    public Boolean(int line, int column, Expression left, Expression right, String operator) {
        super(line,column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Boolean at line: " + getLine() + "Column: " + getColumn() + ". Operator: " + operator + ". Left:" + left.toString() + ". Right: " + right.toString();
    }

    @Override
    public Object accept(Visitor v, Object p) {
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
