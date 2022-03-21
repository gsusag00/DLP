package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class Integer extends BaseNode implements Type {

    public Integer(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Integer";
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this,p);
    }
}
