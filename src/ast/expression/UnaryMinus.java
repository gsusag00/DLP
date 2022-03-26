package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class UnaryMinus extends BaseNode implements Expression {

    private Expression expression;
    private boolean lValue;

    public UnaryMinus(Expression expression ,int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Unary Minus at line: " + getLine() + "Column: " + getColumn() + ". Expression: " + expression.toString() + '.';
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
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
