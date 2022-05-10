package ast.type;

import ast.ASTNode;
import ast.BaseNode;
import ast.Statement;
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
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: %s no existe en esta estrucutra ",var));
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("If Else. Linea: %d - Columna: %d \n",getLine(),getColumn()));
        sb.append(String.format("%s\tCampos. \n",tab));
        for(RecordField rf: records) {
            sb.append(String.format("%s\t\t - %s \n",tab, rf.toString(tab+"\t")));
        }
        return sb.toString();
    }

    @Override
    public int numberOfBytes() {
        int counter = 0;
        for(RecordField r: records){
            counter += r.numberOfBytes();
        }
        return counter;
    }

    @Override
    public String getName() {
        return "Struct";
    }
}
