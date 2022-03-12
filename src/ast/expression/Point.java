package ast.expression;

import ast.BaseNode;
import ast.Expression;

public class Point extends BaseNode implements Expression {

    private Expression expression;
    private Variable variable;

    public Point(Expression expression, Variable variable, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "Acceso a campo at line: " + getLine() + "Column: " + getColumn() + ": Expression: " + expression.toString() + ". Variable:" + variable.toString();
    }
}
