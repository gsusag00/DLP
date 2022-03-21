package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;


public abstract class Operation extends BaseNode implements Expression  {


    public Operation(int line, int column) {
        super(line, column);
    }
}
