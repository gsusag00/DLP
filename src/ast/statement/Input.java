package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;
import ast.visitor.Visitor;

import java.util.List;

public class Input extends BaseNode implements Statement {

    private Expression expression;

    public Input(int line, int column, Expression expressions) {
        super(line, column);
        this.expression = expressions;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpressions(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "Input at line: " + getLine() + "Column: " + getColumn() + ". Expressions: " + expression.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Input. Linea: %d - Columna: %d \n",getLine(),getColumn()));
        sb.append(String.format("%s\t- %s \n",tab, expression.toString(tab+"\t")));
        return sb.toString();
    }
}
