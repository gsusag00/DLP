package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class IdeaDeLiterales<T> extends BaseNode implements Expression {

    private T value;

    public IdeaDeLiterales(int line, int column) {
        super(line, column);
    }
}
