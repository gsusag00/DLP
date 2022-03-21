package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class Character extends BaseNode implements Type {

    public Character(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Character";
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this,p);
    }
}
