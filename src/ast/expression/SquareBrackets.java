package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class SquareBrackets extends AbstractExpression implements Expression {

    private Expression left;
    private Expression right;

    public SquareBrackets(Expression left, Expression right,int line, int column) {
        super(line, column);
        this.left=left;
        this.right=right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "Square Brackets at line: " + getLine() + "Column: " + getColumn() + ": Left:" + left.toString() + ". Right:" + right.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }


}
