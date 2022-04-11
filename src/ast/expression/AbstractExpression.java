package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.Type;
import ast.visitor.Visitor;

public abstract class AbstractExpression extends BaseNode implements Expression {

    private boolean LValue;
    private Type type;

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

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

}
