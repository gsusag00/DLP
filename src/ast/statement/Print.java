package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class Print extends BaseNode implements Statement {

    private List<Expression> expressions;

    public Print(int line, int column, List<Expression> expressions) {
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
        return "Print at line: " + getLine() + "Column: " + getColumn() + ". Expressions: " + expressions.toString();
    }
}
