package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;
import ast.expression.Variable;

import java.util.List;

public class Function extends BaseNode implements Statement, Expression {

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
        return "Function at line: " + getLine() + "Column: " + getColumn() + ". Variable: " + variable.toString() + ". Expressions: " + expressions.toString();
    }
}
