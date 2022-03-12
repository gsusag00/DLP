package ast.definition;

import ast.BaseNode;
import ast.Definition;
import ast.Statement;
import ast.Type;
import ast.expression.Variable;

import java.util.List;

public class VarDefinition  extends BaseNode implements Definition{

    private Variable variable;
    private Type type;

    public VarDefinition(int line, int column, Variable variable) {
        super(line, column);
        this.variable = variable;
    }

    public void setType(Type type){
        this.type = type;
    }

    @Override
    public Variable getVariable() {
        return variable;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Var Definition at line: " + getLine() + "Column: " + getColumn() + "Variable: " + variable.toString() + ". Type: " + type.toString();
    }
}
