package ast.definition;

import ast.BaseNode;
import ast.Definition;
import ast.Statement;
import ast.Type;
import ast.expression.Variable;

import java.util.ArrayList;
import java.util.List;

public class FuncDefinition extends BaseNode implements Definition, Statement {

    private List<Statement> statements;
    private List<VarDefinition> varDefinitions;
    private Variable variable;
    private Type type;

    public FuncDefinition(Variable variable, int line, int column, Type type, List<VarDefinition> varDefinitions, List<Statement> statements) {
        super(line, column);
        this.variable = variable;
        this.type = type;
        this.varDefinitions = varDefinitions;
        this.statements = statements;
    }

    @Override
    public Variable getVariable() {
        return variable;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Func Definition at line: " + getLine() + "Column: " + getColumn() + ". Statements: " + statements.toString() + ". Variable Definitions" + varDefinitions.toString() + ". Variable: " + variable.toString() + ". Type" + type.toString();
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

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
