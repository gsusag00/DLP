package ast.definition;

import ast.BaseNode;
import ast.Definition;
import ast.Statement;
import ast.Type;
import ast.expression.Variable;
import ast.visitor.Visitor;

import java.util.List;

public class VarDefinition  extends AbstractDefinition implements Definition{

    private String name;
    private Type type;

    public VarDefinition(int line, int column, String name) {
        super(line, column,name);
        this.name = name;
    }

    public VarDefinition(int line, int column, String name,Object test) {
        super(line, column,name);
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

//    @Override
//    public String toString() {
//        return "Var Definition at line: " + getLine() + "Column: " + getColumn() + "Name: " + name + ". Type: " + type.toString();
//    }

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
