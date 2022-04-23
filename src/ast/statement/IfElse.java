package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;
import ast.visitor.Visitor;

import java.util.List;

public class IfElse extends BaseNode implements Statement {

    private List<Statement> ifStatements;
    private List<Statement> elseStatements;

    private Expression expression;

    public IfElse(int line, int column, Expression expression, List<Statement> ifStatements, List<Statement> elseStatements) {
        super(line, column);
        this.expression = expression;
        this.ifStatements = ifStatements;
        this.elseStatements = elseStatements;
    }

    public List<Statement> getIfStatements() {
        return ifStatements;
    }

    public void setIfStatements(List<Statement> ifStatements) {
        this.ifStatements = ifStatements;
    }

    public List<Statement> getElseStatements() {
        return elseStatements;
    }

    public void setElseStatements(List<Statement> elseStatements) {
        this.elseStatements = elseStatements;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "If Else at line: " + getLine() + "Column: " + getColumn() + "If Statements: " + ifStatements.toString() + ". Else Statements: " + elseStatements.toString() + ". Expressions: " + expression.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("If Else. Linea: %d - Columna: %d \n",getLine(),getColumn()));
        sb.append(String.format("%s\tCondicion - %s \n",tab, expression.toString(tab+"\t")));
        sb.append(String.format("%s\tSentencias del if. \n",tab));
        for(Statement st: ifStatements) {
            sb.append(String.format("%s\t\t- %s \n",tab, st.toString(tab+"\t")));
        }
        if(elseStatements.size() > 0) {
            sb.append(String.format("%s\tSentencias del else \n",tab));
            for (Statement st : elseStatements) {
                sb.append(String.format("%s\t\t- %s \n", tab, st.toString(tab+"\t")));
            }
        }
        return sb.toString();
    }
}
