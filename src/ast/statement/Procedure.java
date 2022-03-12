package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;

import java.util.List;

public class Procedure extends BaseNode implements Statement, Expression {

    private String id;

    private List<Expression> parameters;

    public Procedure(String id, List<Expression> parameters, int line, int column) {
        super(line, column);
        this.id = id;
        this.parameters = parameters;
    }
}
