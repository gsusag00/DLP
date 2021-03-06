package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class RecordField extends AbstractType {

    private String name;
    private Type type;
    private int offset;

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

    public Type getType() {
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
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Campo. Linea: %d - Columna: %d - Nombre: %s - Offset: %d\n",getLine(),getColumn(),name,offset));
        return sb.toString();
    }

    @Override
    public int numberOfBytes() {
        return type.numberOfBytes();
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getOffset() {
        return offset;
    }
}
