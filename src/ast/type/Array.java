package ast.type;

import ast.ASTNode;
import ast.Expression;
import ast.Type;
import ast.BaseNode;
import ast.visitor.Visitor;

import java.util.List;

public class Array extends AbstractType {

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
    public boolean isLogical(ASTNode node) {
        return false;
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        if(type instanceof ErrorType) {
            return type;
        }
        if (type.equals(Integer.getInstance())){
            return arrayType;
        }
        return new ErrorType(node.getLine(), node.getColumn(), "El indice tiene que ser de tipo entero");
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array. Linea: %d - Columna: %d - Dimension: %b\n",getLine(),getColumn(),dimension));
        sb.append(String.format("%s\tTipo del array.%s \n",tab, arrayType.toString(tab+"\t")));
        return sb.toString();
    }

    @Override
    public int numberOfBytes() {
        return dimension * arrayType.numberOfBytes();
    }
}
