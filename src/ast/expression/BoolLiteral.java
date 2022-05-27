package ast.expression;

import ast.Expression;
import ast.visitor.Visitor;

public class BoolLiteral extends AbstractExpression implements Expression {

    private boolean value;

    public BoolLiteral(boolean value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public boolean getValue() {
        return value;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        return null;
    }
}
