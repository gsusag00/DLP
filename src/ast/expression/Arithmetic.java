package ast.expression;

import ast.Expression;


public class Arithmetic extends Operation implements Expression {

    public Arithmetic(int line, int column, Expression left, Expression right, String operator) {
        super(line, column, left, right, operator);
    }

    @Override
    public String toString() {
        return "Arithmetic at line: " + getLine() + "Column: " + getColumn() + ". Operator: " + operator + ". Left:" + left.toString() + ". Right: " + right.toString();
    }
}
