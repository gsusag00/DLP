package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.Type;
import ast.visitor.Visitor;

public class Cast extends AbstractExpression implements Expression {

    private Type castType;
    private Expression expression;

    public Cast(Type type, Expression expression, int line, int column) {
        super(line, column);
        this.castType = type;
        this.expression = expression;
    }

    public Type getCastType() {
        return castType;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Cast at line: " + getLine() + "Column: " + getColumn() + ". Type:" + castType.toString() + ". Expression=" + expression.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
