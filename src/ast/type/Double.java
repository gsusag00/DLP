package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class Double extends BaseNode implements Type {

    public Double(int line, int column) {
        super(line, column);
    }

    @Override
    public String toString() {
        return "Double";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
