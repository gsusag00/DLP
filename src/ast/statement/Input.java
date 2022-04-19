package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;
import ast.visitor.Visitor;

import java.util.List;

public class Input extends BaseNode implements Statement {

    private List<Expression> expressions;

    public Input(int line, int column, List<Expression> expressions) {
        super(line, column);
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "Input at line: " + getLine() + "Column: " + getColumn() + ". Expressions: " + expressions.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Input. Linea: %d - Columna: %d \n"),getLine(),getColumn());
        for(Expression exp : expressions) {
            sb.append(String.format("%s\t- %s \n",tab, exp.toString(tab+"\t")));
        }
        return sb.toString();
    }
}
