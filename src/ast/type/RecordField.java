package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecordField that = (RecordField) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
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

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this,p);
    }

}
