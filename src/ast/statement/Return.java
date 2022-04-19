package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;
import ast.visitor.Visitor;

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

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Return. Linea: %d - Columna: %d \n",getLine(),getColumn()));
        sb.append(String.format("%s\tExpresion de retorno - %s \n",tab, expression.toString(tab+"\t")));
        return sb.toString();
    }
}
