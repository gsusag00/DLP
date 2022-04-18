package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class Character extends BaseNode implements Type {

    private static Character character;

    private Character(int line, int column) {
        super(line, column);
    }

    public static Character getInstance() {
        if(character == null) {
            character = new Character(0,0);
        }
        return character;
    }

    @Override
    public String toString() {
        return "Character";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public int numberOfBytes() {
        return 1;
    }
}
