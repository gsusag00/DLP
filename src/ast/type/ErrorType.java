package ast.type;

import ast.Type;

public class ErrorType implements Type {

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }
}
