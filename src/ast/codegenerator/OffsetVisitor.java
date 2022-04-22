package ast.codegenerator;

import ast.Statement;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.type.FunctionType;
import ast.type.RecordField;
import ast.type.Struct;
import ast.visitor.AbstractVisitor;

public class OffsetVisitor extends AbstractVisitor<Object,Object> {

    private static final int GLOBAL = 0;

    private int globalOffset = 0;
    //Guardar el offset de todos los parametros y las variables locales en el tipo funcion. Para hacer la vida mas facil en el CodeGen.
    private int localOffset = 0;
    private int structCounter = 0;

    @Override
    public Object visit(VarDefinition varDef, Object p) {
        if(varDef.getScope() == GLOBAL) {
            varDef.setOffset(globalOffset);
            globalOffset += varDef.getType().numberOfBytes();
        } else {
            //Condicion para diferenciar entre locales y parametros
            //No hace falta, esta en el function type
            localOffset -= varDef.getType().numberOfBytes();
            varDef.setOffset(localOffset);
        }
        return super.visit(varDef,p);
    }

    @Override
    public Object visit(FuncDefinition funcDef, Object p) {
        localOffset = 0;
        return super.visit(funcDef, p);
    }

    @Override
    public Object visit(FunctionType funcType, Object p) {
        int paramsOffset = 4;
        funcType.getReturnType().accept(this,p);
        for(int i = funcType.getDefs().size() - 1; i>=0; i--){
            funcType.getDefs().get(i).setOffset(paramsOffset);
            paramsOffset += funcType.getDefs().get(i).getType().numberOfBytes();
        }

        funcType.getReturnType().accept(this,p);

        funcType.setLocalOffset(localOffset);
        funcType.setParamsOffset(paramsOffset);

        return null;
    }

    @Override
    public Object visit(RecordField recordField, Object p) {
        recordField.setOffset(structCounter);

        structCounter += recordField.getType().numberOfBytes();
        return super.visit(recordField, p);
    }

    @Override
    public Object visit(Struct struct, Object p) {
        structCounter = 0;
        return super.visit(struct,p);
    }

}
