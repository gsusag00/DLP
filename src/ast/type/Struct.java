package ast.type;

import ast.ASTNode;
import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

import java.util.List;

public class Struct extends AbstractType {

    //Posible cambio a un set?
    private List<RecordField> records;

    public Struct(int line, int column, List<RecordField> records) {
        super(line, column);
        this.records = records;
    }

    public List<RecordField> getRecords() {
        return records;
    }

    public void setRecords(List<RecordField> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "Struct at at line: " + getLine() + "Column: " + getColumn() + ". Records: " + records.toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public Type Dot(String var, ASTNode node) {
        for(RecordField rf : records) {
            if(rf.getName().equals(var)) {
                return rf.getType();
            }
        }
        return super.Dot(var,node);
    }

    @Override
    public int numberOfBytes() {
        int counter = 0;
        for(RecordField r: records){
            counter += r.numberOfBytes();
        }
        return counter;
    }
}
