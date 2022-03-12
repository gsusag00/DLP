package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class IntLiteral extends BaseNode implements Expression {

    private int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Int Literal at line: " + getLine() + "Column: " + getColumn() + ". Value: " + value;
    }
}
