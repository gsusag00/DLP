package ast.visitor;

import ast.Definition;
import ast.Expression;
import ast.Statement;
import ast.Type;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import ast.statement.Function;
import ast.symboltable.SymbolTable;
import ast.type.ErrorType;
import ast.type.FunctionType;

public class IdentificationVisitor<TR,TP> extends AbstractVisitor<TR,TP>{

    public SymbolTable table = new SymbolTable();

    @Override
    public TR visit(FuncDefinition funcDef, TP p) {
        if(!table.insert(funcDef)){
            new ErrorType(funcDef.getLine(),funcDef.getColumn(),String.format(" Error: Funcion '%s' esta ya existe en el ambito",funcDef.getName()));
        }
        table.set();

        funcDef.getType().accept(this,p);

        for(VarDefinition varDef : funcDef.getVarDefinitions()){
            varDef.accept(this,p);
        }

        for(Statement st : funcDef.getStatements()){
            st.accept(this,null);
        }

        table.reset();
        return null;
    }

    @Override
    public TR visit(VarDefinition varDef, TP p) {
        super.visit(varDef, p);
        if(!table.insert(varDef)){
            new ErrorType(varDef.getLine(),varDef.getColumn(),String.format(" Error: La variable '%s' ya existe en este ambito",varDef.getName()));
        }
        return null;
    }

    @Override
    public TR visit(Variable var, TP p) {
        super.visit(var, p);
        Definition def = table.findInCurrentScope(var.getName()) == null? table.find(var.getName()) : table.findInCurrentScope(var.getName());
        if(def == null){
            var.setType(new ErrorType(var.getLine(),var.getColumn(),String.format(" Error: La variable '%s' no esta definida",var.getName())));
        } else {
            var.setDef(def);
        }
        return null;
    }

    @Override
    public TR visit(Function function, TP p) {
        function.getVariable().accept(this,p);
        Definition def = table.find(function.getVariable().getName());
        if(def == null){
            if(function.getVariable().getType() instanceof ErrorType) {
                ((ErrorType)function.getVariable().getType()).setMessage(String.format(" Error: La funcion '%s' no ha " +
                        "sido declarada.", function.getVariable().getName()));
            } else {
                new ErrorType(function.getLine(), function.getColumn(), String.format(" Error: La funcion '%s' no ha " +
                        "sido declarada.", function.getVariable().getName()));
            }
        } else {
            function.getVariable().setDef(def);
        }
        for(Expression exp: function.getExpressions()){
            exp.accept(this,p);
        }
        return null;
    }

    @Override
    public TR visit(FunctionType funcType, TP p) {
        for(VarDefinition varDef: funcType.getDefs()) {
            if(!table.insert(varDef)) {
                new ErrorType(varDef.getLine(), varDef.getColumn(), String.format(" Error: La variable '%s' ya es parte de los argumentos",varDef.getName()));
            }
        }

        funcType.getReturnType().accept(this,null);
        return null;
    }
}
