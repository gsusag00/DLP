package ast.definition;

import ast.BaseNode;
import ast.Definition;
import ast.Statement;
import ast.Type;
import ast.expression.Variable;
import ast.visitor.Visitor;
import java.util.List;

public class FuncDefinition extends BaseNode implements Definition {

    private List<Statement> statements;
    private List<VarDefinition> varDefinitions;
    private String name;
    private Type type;

    public FuncDefinition(String name, int line, int column, Type type, List<VarDefinition> varDefinitions, List<Statement> statements) {
        super(line, column);
        this.name = name;
        this.type = type;
        this.varDefinitions = varDefinitions;
        this.statements = statements;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Func Definition at line: " + getLine() + "Column: " + getColumn() + ". Statements: " + statements.toString() + ". Variable Definitions" + varDefinitions.toString() + ". Name: " + name + ". Type" + type.toString();
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

    public void setName(Variable variable) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }
}
