package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class Point extends BaseNode implements Expression {

    private Expression expression;
    private String name;
    private boolean lValue;

    public Point(Expression expression, String name, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Acceso a campo at line: " + getLine() + "Column: " + getColumn() + ": Expression: " + expression.toString() + ". Variable:" + name;
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this,p);
    }

    @Override
    public boolean getLValue() {
        return lValue;
    }

    @Override
    public void setLValue(boolean lValue) {
        this.lValue = lValue;
    }
}
