package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class Point extends BaseNode implements Expression {

    private Expression expression;
    private String name;

    public Point(Expression expression, String name, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Acceso a campo at line: " + getLine() + "Column: " + getColumn() + ": Expression: " + expression.toString() + ". Variable:" + name;
    }
}
