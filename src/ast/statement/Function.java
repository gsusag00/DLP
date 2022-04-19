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
        return "Funcion at line: " + getLine() + "Column: " + getColumn() + ". Name: " + variable.getName() + ". Expressions: " + expressions.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Funcion. Linea: %d - Columna: %d \n",getLine(),getColumn()));
        sb.append(String.format("%s\t%s \n",tab,variable.toString(tab+"\t")));
        for(Expression exp : expressions) {
            sb.append(String.format("%s\t- %s \n",tab, exp.toString(tab+"\t")));
        }
        return sb.toString();
    }
}
