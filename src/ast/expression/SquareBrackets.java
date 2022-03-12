package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class SquareBrackets extends BaseNode implements Expression {

    private Expression left;
    private Expression right;

    public SquareBrackets(Expression left, Expression right,int line, int column) {
        super(line, column);
        this.left=left;
        this.right=right;
    }

    @Override
    public String toString() {
        return "Square Brackets at line: " + getLine() + "Column: " + getColumn() + ": Left:" + left.toString() + ". Right:" + right.toString();
    }
}
