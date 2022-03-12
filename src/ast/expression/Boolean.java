package ast.expression;

import ast.Expression;

public class Boolean extends Operation implements Expression {

    public Boolean(int line, int column, Expression left, Expression right, String operator) {
        super(line, column, left, right, operator);
    }

    @Override
    public String toString() {
        return "Boolean at line: " + getLine() + "Column: " + getColumn() + ". Operator: " + operator + ". Left:" + left.toString() + ". Right: " + right.toString();
    }
}
