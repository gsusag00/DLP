package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public abstract class AbstractExpression extends BaseNode implements Expression {

    private boolean LValue;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLValue() {
        return LValue;
    }

    @Override
    public void setLValue(boolean LValue) {
        this.LValue = LValue;
    }

}
