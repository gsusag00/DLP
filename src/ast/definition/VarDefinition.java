package ast.definition;

import ast.Statement;
import ast.Type;
import ast.visitor.Visitor;

public class VarDefinition  extends AbstractDefinition implements Statement{

    private int offset;

    public VarDefinition(int line, int column, String name) {
        super(line, column,name);
        offset = -1;
    }

    public VarDefinition(int line, int column, String name,Type type) {
        super(line, column,name,type);
        offset = -1;
    }


    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Definicion de variable. Linea: %d, Columna: %d \n",getLine(),getColumn()));
        sb.append(String.format("%s\tNombre de la variable: %s - Tipo: %s",tab, getName(),getType().toString(tab+"\n")));
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

        return getName().equals(that.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
