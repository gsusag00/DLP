package ast.type;

import ast.BaseNode;
import ast.Type;

public  abstract class AbstractType extends BaseNode implements Type{

    public AbstractType(int line, int column) {
        super(line, column);
    }
}
