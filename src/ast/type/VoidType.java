package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class VoidType implements Type {

    public VoidType() {};

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    @Override
    public String toString() {
        return "VoidType";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
