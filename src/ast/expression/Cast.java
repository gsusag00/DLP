package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.Type;
import ast.visitor.Visitor;

public class Cast extends BaseNode implements Expression {

    private Type type;
    private Expression expression;
    private boolean lValue;

    public Cast(Type type, Expression expression, int line, int column) {
        super(line, column);
        this.type = type;
        this.expression = expression;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Cast at line: " + getLine() + "Column: " + getColumn() + ". Type:" + type.toString() + ". Expression=" + expression.toString();
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
