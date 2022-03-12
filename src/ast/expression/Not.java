package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class Not extends BaseNode implements Expression {

    private Expression expression;

    public Not(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Not at line: " + getLine() + "Column: " + getColumn() + ". Expression:" + expression.toString();
    }
}
