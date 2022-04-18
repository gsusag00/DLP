package ast.type;

import ast.Type;
import ast.BaseNode;
import ast.visitor.Visitor;

public class Array extends BaseNode implements Type {

    private Type arrayType;
    private int dimension;

    public Array(int line, int column, Type type, int dimension) {
        super(line, column);
        this.arrayType = type;
        this.dimension = dimension;
    }

    public Type getArrayType() {
        return arrayType;
    }

    public void setArrayType(Type arrayType) {
        this.arrayType = arrayType;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Array at line: " + getLine() + "Column: " + getColumn() + ". Array Type: " + arrayType.toString() + ". Dimension=" + dimension;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public int numberOfBytes() {
        return dimension * arrayType.numberOfBytes();
    }
}
