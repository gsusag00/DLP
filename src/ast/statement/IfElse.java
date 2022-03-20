package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;

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
}
