package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.visitor.Visitor;

import java.util.List;

public class Struct extends BaseNode implements Type {

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
    public Object accept(Visitor v, Object p) {
        return v.visit(this,p);
    }
}
