package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class DoubleLiteral extends BaseNode implements Expression {

    public Double value;

    public DoubleLiteral(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Double Literal at line: " + getLine() + "Column: " + getColumn() + ". Value=" + value;
    }
}
