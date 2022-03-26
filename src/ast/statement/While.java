package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;
import ast.visitor.Visitor;

import java.util.List;

public class While extends BaseNode implements Statement {

    private Expression expression;
    private List<Statement> statements;

    public While(int line, int column, Expression expression, List<Statement> statements) {
        super(line, column);
        this.expression = expression;
        this.statements = statements;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "While at line: " + getLine() + "Column: " + getColumn() + ". Expressions: " + expression.toString() + ". Statements: " + statements.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
