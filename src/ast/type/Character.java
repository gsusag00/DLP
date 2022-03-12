package ast.type;

import ast.BaseNode;
import ast.Type;

public class Character extends BaseNode implements Type {

    public Character(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Character";
    }
}
