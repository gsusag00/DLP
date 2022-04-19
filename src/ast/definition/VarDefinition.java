package ast.definition;

import ast.Statement;
import ast.Type;
import ast.visitor.Visitor;

public class VarDefinition  extends AbstractDefinition implements Statement{

    private String name;
    private Type type;
    private int offset;

    public VarDefinition(int line, int column, String name) {
        super(line, column,name);
        this.name = name;
        offset = -1;
    }

    public VarDefinition(int line, int column, String name,Object test) {
        super(line, column,name);
        this.name = name;
        offset = -1;
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


    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Definicion de variable. Linea: %d, Columna: %d \n",getLine(),getColumn()));
        sb.append(String.format("%s\tNombre de la variable: %s - Tipo: %s",tab, name,type.toString(tab+"\n")));
        return sb.toString();
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VarDefinition that = (VarDefinition) o;

        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
