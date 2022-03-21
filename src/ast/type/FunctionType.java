package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.definition.VarDefinition;
import ast.visitor.Visitor;

import java.util.List;

public class FunctionType extends BaseNode implements Type {
    private List<VarDefinition> defs;
    private Type returnType;

    public FunctionType(int line, int column, List<VarDefinition> defs, Type type) {
        super(line, column);
        this.defs = defs;
        this.returnType = type;
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
        return "Function Type at line: " + getLine() + "Column: " + getColumn() + ". Definitions: " + defs.toString() + ". Return Type: " + returnType.toString();
    }

    @Override
    public Object accept(Visitor v, Object p) {
        return v.visit(this,p);
    }
}