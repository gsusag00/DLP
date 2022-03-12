package ast.expression;

import ast.Expression;

public class Comparison extends Operation implements Expression {

    public Comparison(int line, int column, Expression left, Expression right, String operator) {
        super(line, column, left, right, operator);
    }

    @Override
    public String toString() {
        return "Comparison at line: " + getLine() + "Column: " + getColumn() + "Left: " + left.toString() + ". Right: " + right.toString() + "Operator='" + operator;
    }
}
