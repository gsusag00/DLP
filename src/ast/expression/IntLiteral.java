package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class IntLiteral extends BaseNode implements Expression {

    private int value;
    private boolean lValue;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Int Literal at line: " + getLine() + "Column: " + getColumn() + ". Value: " + value;
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
