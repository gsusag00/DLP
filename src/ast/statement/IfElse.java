package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class IfElse extends BaseNode implements Statement {

    private List<Statement> ifStatements;
    private List<Statement> elseStatements;

    private List<Expression> expressions;

    public IfElse(int line, int column, List<Expression> expressions, List<Statement> ifStatements, List<Statement> elseStatements) {
        super(line, column);
        this.expressions = expressions;
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

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "If Else at line: " + getLine() + "Column: " + getColumn() + "If Statements: " + ifStatements.toString() + ". Else Statements: " + elseStatements.toString() + ". Expressions: " + expressions.toString();
    }
}
