package ast.statement;

import ast.BaseNode;
import ast.Definition;
import ast.Expression;
import ast.Statement;
import ast.expression.AbstractExpression;
import ast.expression.Variable;
import ast.visitor.Visitor;

import java.util.List;

public class Function extends AbstractExpression implements Statement {

    private List<Expression> expressions;
    private Variable variable;

    public Function(int line, int column,Variable variable, List<Expression> expressions) {
        super(line, column);
        this.variable = variable;
        this.expressions = expressions;
    }

    public List<Expression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<Expression> expressions) {
        this.expressions = expressions;
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    @Override
    public String toString() {
        return "Function at line: " + getLine() + "Column: " + getColumn() + ". Name: " + variable.getName() + ". Expressions: " + expressions.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

}
