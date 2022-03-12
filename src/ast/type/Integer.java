package ast.type;

import ast.BaseNode;
import ast.Type;

public class Integer extends BaseNode implements Type {

    public Integer(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Integer";
    }
}
