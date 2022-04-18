package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

public class Integer extends AbstractType {

    private static Integer integer;

    private Integer(int line, int column) {
        super(line, column);
    }

    public static Integer getInstance() {
        if(integer == null) {
            integer = new Integer(0,0);
        }
        return integer;
    }

    @Override
    public String toString() {
        return "Integer";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }
}
