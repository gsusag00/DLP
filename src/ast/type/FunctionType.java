package ast.type;

import ast.ASTNode;
import ast.BaseNode;
import ast.Expression;
import ast.Type;
import ast.definition.VarDefinition;
import ast.visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
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
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public Type parenthesis(ASTNode node, List<Expression> expressions) {
        if(expressions.size() != defs.size()) {
            return new ErrorType(node.getLine(),node.getColumn(), "Numero de parametros equivocado");
        }
        for(int i = 0; i<expressions.size(); i++) {
            if(expressions.get(i).getType().promotesTo(defs.get(i).getType(), node) instanceof ErrorType) {
                return new ErrorType(node.getLine(),node.getColumn(), "El tipo del parametro no coincide con el esperado");
            }
        }
        return new ErrorType(node.getLine(),node.getColumn(), "Uso erroneo de los parentesis");
    }
}