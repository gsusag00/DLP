package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class UnaryMinus extends BaseNode implements Expression {

    private Expression expression;

    public UnaryMinus(Expression expression ,int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Unary Minus at line: " + getLine() + "Column: " + getColumn() + ". Expression: " + expression.toString() + '.';
    }
}
