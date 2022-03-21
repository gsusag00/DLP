package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class SquareBrackets extends BaseNode implements Expression {

    private Expression left;
    private Expression right;
    private boolean lValue;

    public SquareBrackets(Expression left, Expression right,int line, int column) {
        super(line, column);
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return "Square Brackets at line: " + getLine() + "Column: " + getColumn() + ": Left:" + left.toString() + ". Right:" + right.toString();
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
