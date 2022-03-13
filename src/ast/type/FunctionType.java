package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.definition.VarDefinition;

import java.util.List;

public class FunctionType extends BaseNode implements Type {

    private int dimension;
    private List<VarDefinition> defs;
    private Type returnType;

    public FunctionType(int line, int column, List<VarDefinition> defs, Type type) {
        super(line, column);
        this.defs = defs;
        this.returnType = type;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<VarDefinition> getDefs() {
        return defs;
    }

    public void setDefs(List<VarDefinition> defs) {
        this.defs = defs;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    @Override
    public String toString() {
        return "Function Type at line: " + getLine() + "Column: " + getColumn() + ". Dimension: " + dimension + ". Definitions: " + defs.toString() + ". Return Type: " + returnType.toString();
    }
}