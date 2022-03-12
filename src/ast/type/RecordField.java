package ast.type;

import ast.Type;

public class RecordField {

    private String name;
    private Type type;

    public RecordField(String name, Type type) {
        this.name = name;
        this.type = type;
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
