package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;


public abstract class AbstractOperation extends AbstractExpression implements Expression  {

    private Expression left,right;

    private String operator;

    public AbstractOperation(int line, int column, Expression left, Expression right, String operator) {
        super(line, column);
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    public String getOperator() {
        return operator;
    }


}
