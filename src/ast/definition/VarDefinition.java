package ast.definition;

import ast.BaseNode;
import ast.Definition;
import ast.Statement;
import ast.Type;
import ast.expression.Variable;

import java.util.List;

public class VarDefinition  extends BaseNode implements Definition{

    private String name;
    private Type type;

    public VarDefinition(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    public void setType(Type type){
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Var Definition at line: " + getLine() + "Column: " + getColumn() + "Name: " + name + ". Type: " + type.toString();
    }
}
