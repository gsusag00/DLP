package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;

public class Return extends BaseNode implements Statement {

    private Expression expression;

    public Return(int line, int column, Expression exp) {
        super(line, column);
        this.expression = exp;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Return at line: " + getLine() + "Column: " + getColumn() + ". Expression: " + expression.toString();
    }
}
