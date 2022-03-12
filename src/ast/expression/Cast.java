package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.Type;

public class Cast extends BaseNode implements Expression {

    private Type type;
    private Expression expression;

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
}
