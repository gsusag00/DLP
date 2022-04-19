package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class VoidType extends AbstractType {

    private static VoidType voidType;

    private VoidType(int line, int column) {
        super(line, column);
    }

    public static VoidType getInstance() {
        if(voidType == null) {
            voidType = new VoidType(0,0);
        }
        return voidType;
    }

    @Override
    public String toString() {
        return "VoidType";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        return toString();
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }
}
