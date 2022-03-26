package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class Comparison extends AbstractOperation implements Expression {

    public Comparison(int line, int column, Expression left, Expression right, String operator) {
        super(line,column,left,right, operator);
    }

    @Override
    public String toString() {
        return "Comparison at line: " + getLine() + "Column: " + getColumn() + "Left: " + getLeft().toString() + ". Right: " + getRight().toString() + "Operator='" + getOperator();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
