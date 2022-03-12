package ast.type;

import ast.BaseNode;
import ast.Type;

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
}
