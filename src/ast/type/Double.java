package ast.type;

import ast.BaseNode;
import ast.Type;

public class Double extends BaseNode implements Type {

    public Double(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Double";
    }
}
