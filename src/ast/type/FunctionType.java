package ast.type;

import ast.*;
import ast.definition.VarDefinition;
import ast.visitor.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {
    private List<VarDefinition> defs;
    private Type returnType;
    private int paramsOffset;

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

    public int getParamsOffset() {
        return paramsOffset;
    }

    public void setParamsOffset(int paramsOffset) {
        this.paramsOffset = paramsOffset;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public Type parenthesis(ASTNode node, List<Expression> expressions) {
        if(expressions.size() != defs.size()) {
            return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: Numero de parametros equivocado, se esperaban %d parametros", defs.size()));
        }
        for(int i = 0; i<expressions.size(); i++) {
            Type t = expressions.get(i).getType().promotesTo(defs.get(i).getType(), node);
            if(t instanceof ErrorType) {
                ((ErrorType) t).setMessage("El tipo del parametro no coincide con el esperado");
                return t;
            }
        }
        return returnType;
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Tipo Funcion. Linea: %d - Columna: %d - Tipo Retorno: %s \n",getLine(),getColumn(),returnType.toString(tab+"\t")));
        sb.append(String.format("%s\tParametros. \n",tab));
        for(VarDefinition def: defs) {
            sb.append(String.format("%s\t\t- %s \n",tab, def.toString(tab+"\t")));
        }
        return sb.toString();
    }

    @Override
    public int numberOfBytes() {
        return 0;
    }

    @Override
    public String getName() {
        return "FunctionType";
    }
}