package ast.visitor;

import ast.Definition;
import ast.Expression;
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
            new ErrorType(funcDef.getLine(),funcDef.getColumn(),"Error: Variable duplicada en ambito");
        }
        table.set();

        super.visit(funcDef, p);

        table.reset();
        return null;
    }

    @Override
    public TR visit(VarDefinition varDef, TP p) {
        super.visit(varDef, p);
        if(!table.insert(varDef)){
            new ErrorType(varDef.getLine(),varDef.getColumn(),"Error: Variable duplicada en ambito");
        }
        return null;
    }

    @Override
    public TR visit(Variable var, TP p) {
        super.visit(var, p);
        Definition def = table.findInCurrentScope(var.getName()) == null? table.find(var.getName()) : table.findInCurrentScope(var.getName());
        if(def == null){
            new ErrorType(var.getLine(),var.getColumn(),"Error: Variable no definida");
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
            new ErrorType(function.getLine(),function.getColumn(),"Error: Funcion no definida");
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
        super.visit(funcType, p);
        return null;
    }
}
