package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class Point extends AbstractExpression implements Expression {

    private Expression expression;
    private String name;

    public Point(Expression expression, String name, int line, int column) {
        super(line, column);
        this.expression = expression;
        this.name = name;
    }

    public Expression getExpression() {
        return expression;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Acceso a campo at line: " + getLine() + "Column: " + getColumn() + ": Expression: " + expression.toString() + ". Variable:" + name;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }


}
