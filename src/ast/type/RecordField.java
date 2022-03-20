package ast.type;

import ast.BaseNode;
import ast.Type;

public class RecordField extends BaseNode implements Type {

    private String name;
    private Type type;

    public RecordField(String name, int line, int column) {
        super(line,column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private Type getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RecordField: . Name='" + name + ". Type" + type.toString();
    }
}
