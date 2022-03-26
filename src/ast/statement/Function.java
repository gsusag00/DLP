package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;
import ast.expression.AbstractExpression;
import ast.expression.Variable;
import ast.visitor.Visitor;

import java.util.List;

public class Function extends AbstractExpression implements Statement, Expression {

    private List<Expression> expressions;
    private String name;

    public Function(int line, int column,String name, List<Expression> expressions) {
        super(line, column);
        this.name = name;
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Function at line: " + getLine() + "Column: " + getColumn() + ". Name: " + name + ". Expressions: " + expressions.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
