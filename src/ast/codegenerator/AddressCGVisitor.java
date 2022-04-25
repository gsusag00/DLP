package ast.codegenerator;

import ast.definition.VarDefinition;
import ast.expression.Point;
import ast.expression.SquareBrackets;
import ast.expression.Variable;
import ast.type.Integer;
import ast.type.RecordField;
import ast.type.Struct;
import ast.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Object, Object> {

    //Variable, Point (FieldAccess), AccessoArray.
    private CodeGenerator cg;
    private ValueCGVisitor valueCGVisitor;

    public AddressCGVisitor() {
        cg = CodeGenerator.getInstance();
    }

    public void setValueCGVisitor(ValueCGVisitor valueCGVisitor) {
        this.valueCGVisitor = valueCGVisitor;
    }

    /*
        address[[Variable: Expression => ID]]() =
            if(expression.getDefinition().getScope() = 0)
                <pusha> expression.getDefinition().getOffset()
            else {
                <push bp>
                <push> expression.getDefinition().getOffset()
                <add>
            }
     */
    @Override
    public Object visit(Variable var, Object p) {
        if (var.getDef().getScope() == 0) {
            cg.pusha(((VarDefinition) var.getDef()).getOffset());
        } else {
            cg.pushBP();
            cg.push(Integer.getInstance(), String.valueOf(((VarDefinition) var.getDef()).getOffset()));
            cg.add(Integer.getInstance());
        }
        return null;
    }

    /*
        address[[Point: expression => expression1 ID]]() =
            address[[expression1]]
            for(RecordField f: ((Struct)expression1.getType()).getRecords()){
                if(rf.getName().equals(ID)){
                    <pushi> f.getOffset()
                }
            }
            <add>
     */
    @Override
    public Object visit(Point point, Object p) {
        point.getExpression().accept(this, null);
        for (RecordField rf : ((Struct) point.getExpression().getType()).getRecords()) {
            if (rf.getName().equals(point.getName())) {
                cg.push(Integer.getInstance(), String.valueOf(rf.getOffset()));
                break;
            }
        }
        cg.add(Integer.getInstance());

        return null;
    }

    /*
        address[[ArrayAccess: expression => expression1 expression2]]()=
            address[[expression1]]
            value[[expression2]]
            <pushi> exprssion1.getType().getBytes()
            <muli>
            <addi>
     */
    @Override
    public Object visit(SquareBrackets sb, Object p) {
        sb.getLeft().accept(this,null);
        sb.getRight().accept(this.valueCGVisitor,null);
        cg.push(Integer.getInstance(),String.valueOf(sb.getType().numberOfBytes()));
        cg.mul(Integer.getInstance());
        cg.add(Integer.getInstance());
        return null;
    }


}
