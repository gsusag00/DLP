package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class Variable extends BaseNode implements Expression {

    private String name;

    public Variable(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Variable at line: " + getLine() + "Column: " + getColumn() + "Name: " + name;
    }
}
