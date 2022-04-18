package ast.codegenerator;

import ast.definition.VarDefinition;
import ast.visitor.AbstractVisitor;

public class OffsetVisitor<TR,TP> extends AbstractVisitor<TR,TP> {

    private int sumOfOffsets = 0;

    @Override
    public TR visit(VarDefinition varDef, TP p) {
        varDef.getType().accept(this,p);

        if(varDef.getScope() == 0) {
            varDef.setOffset(sumOfOffsets);
            sumOfOffsets += varDef.getType().numberOfBytes();
        }
        return null;
    }
}
