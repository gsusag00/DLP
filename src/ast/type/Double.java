package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class Double extends AbstractType {

    private static Double doub;

    private Double(int line, int column) {
        super(line, column);
    }

    public static Double getInstance() {
        if(doub == null) {
            doub = new Double(0,0);
        }
        return doub;
    }

    @Override
    public String toString() {
        return "Double";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public int numberOfBytes() {
        return 4;
    }
}
