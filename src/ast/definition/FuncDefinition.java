package ast.definition;

import ast.Definition;
import ast.Statement;
import ast.Type;
import ast.visitor.Visitor;

import java.util.List;

public class FuncDefinition extends AbstractDefinition implements Definition {

    private List<Statement> statements;
    private List<VarDefinition> varDefinitions;
    private int localOffset;

    public FuncDefinition(String name, int line, int column, Type type, List<VarDefinition> varDefinitions, List<Statement> statements) {
        super(line, column,name,type);
        this.varDefinitions = varDefinitions;
        this.statements = statements;
    }

    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Definición de función. Linea: %d - Columna: %d - Nombre: %s \n", getLine(),getColumn(),getName()));
        for(int i = 0; i<varDefinitions.size(); i++) {
            sb.append(String.format("%s\t - %s \n",tab,varDefinitions.get(i).toString(tab + "\t")));
        }
        for(int i = 0; i<statements.size(); i++) {
            sb.append(String.format("%s\t - %s \n",tab,statements.get(i).toString(tab+"\t")));
        }
        sb.append(getType().toString(tab+"\n"));
        return sb.toString();
    }

    public List<Statement> getStatements() {
        return statements;
    }

    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public List<VarDefinition> getVarDefinitions() {
        return varDefinitions;
    }

    public void setVarDefinitions(List<VarDefinition> varDefinitions) {
        this.varDefinitions = varDefinitions;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    public int getLocalOffset() {
        return localOffset;
    }

    public void setLocalOffset(int localOffset) {
        this.localOffset = localOffset;
    }
}
