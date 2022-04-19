package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class Not extends AbstractExpression implements Expression {

    private Expression expression;

    public Not(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "Not at line: " + getLine() + "Column: " + getColumn() + ". Expression:" + expression.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Negación. Linea: %d - Columna: %d - LValue: %b\n",getLine(),getColumn(),getLValue()));
        sb.append(String.format("%s\t%s \n",tab, expression.toString(tab+"\t")));
        return sb.toString();
    }
}
