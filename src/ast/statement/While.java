package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class While extends BaseNode implements Statement {

    private List<Expression> expressions;
    private List<Statement> statements;

    public While(int line, int column, List<Expression> expressions, List<Statement> statements) {
        super(line, column);
        this.expressions = expressions;
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public String toString() {
        return "While at line: " + getLine() + "Column: " + getColumn() + ". Expressions: " + expressions.toString() + ". Statements: " + statements.toString();
    }
}
