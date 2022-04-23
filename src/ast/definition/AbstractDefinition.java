package ast.definition;

import ast.BaseNode;
import ast.Definition;
import ast.Type;

public abstract class AbstractDefinition extends BaseNode implements Definition {

    private String name;
    private Type type;
    private int scope;

    public AbstractDefinition(int line, int column,String name, Type type) {
        super(line, column);
        this.name = name;
        this.type = type;
    }

    public AbstractDefinition(int line, int column,String name) {
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
    public int getScope() {
        return scope;
    }

    @Override
    public void setScope(int scope) {
        this.scope = scope;
    }
}
