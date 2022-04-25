package ast.codegenerator;

import ast.Definition;
import ast.Expression;
import ast.Program;
import ast.Statement;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.statement.*;
import ast.type.FunctionType;
import ast.type.VoidType;
import ast.visitor.AbstractVisitor;

public class ExecuteCGVisitor extends AbstractVisitor<Object,Object> {

    private ValueCGVisitor valueCGVisitor;
    private AddressCGVisitor addressCGVisitor;
    private CodeGenerator cg;

    public ExecuteCGVisitor(CodeGenerator cg) {
        this.cg = cg;
        this.valueCGVisitor = new ValueCGVisitor();
        this.addressCGVisitor = new AddressCGVisitor();
        this.valueCGVisitor.setAddressCGVisitor(addressCGVisitor);
        this.addressCGVisitor.setValueCGVisitor(valueCGVisitor);
    }

    /*
        execute[[Program: program => Definition*]]()=
            <call> main
            <halt>
            for(Definition def: Definition*)
                execute[[def]]
     */
    @Override
    public Object visit(Program program, Object p) {
        for(Definition def : program.getDefiniciones()){
            if(def instanceof VarDefinition){
                def.accept(this,null);
            }
        }
        cg.breakLine();
        cg.commentWithoutTab("Invocation to the main function");
        cg.call("main");
        cg.halt();
        for(Definition def : program.getDefiniciones()){
            if(def instanceof FuncDefinition)
                def.accept(this,p);
        }
        return null;
    }

    /*
        execute[[FuncDefinition: definition => ID type statement*]]()=
        ID<:>
        <enter> type.getLocalOffset()

        for(statement st : statement*)
            execute[[st]]
        if(type.getReturnType == Void.getInstance())
            cg.ret(0,type.getLocalOffset(),type.getParamOffset())
        else
            cg.ret(type.getReturnType().numberOfBytes(),type.getLocalOffset(), type.getParamOffset())
     */
    @Override
    public Object visit(FuncDefinition funcDef, Object p) {
        cg.line(funcDef.getLine());
        cg.id(funcDef.getName());
        FunctionType ft = (FunctionType)funcDef.getType();
        cg.comment("Parameters");
        for (VarDefinition varDef : ft.getDefs()) {
            varDef.accept(this,null);
        }
        cg.comment("Local variables");
        for(VarDefinition varDef : funcDef.getVarDefinitions()) {
            varDef.accept(this,null);
        }
        cg.enter(funcDef.getLocalOffset());
        for(Statement st : funcDef.getStatements()){
            st.accept(this,p);
        }
        if(ft.getReturnType().equals(VoidType.getInstance()))
            cg.ret(0,funcDef.getLocalOffset(),ft.getParamsOffset());
        return null;
    }

    @Override
    public Object visit(VarDefinition varDef, Object p) {
        cg.comment(String.format("%s %s (offset %d)", varDef.getType().toString(),varDef.getName(),varDef.getOffset()));
        return null;
    }

    /*
        execute[[Assignment: statement => expresison1 expression2]]()=
            address[[expression1]]
            value[[expression2]]
            <store>expression1.getType().suffix()
     */
    public Object visit(Assignment assignment, Object p) {
        cg.line(assignment.getLine());
        cg.comment("Assignment");
        assignment.getLeft().accept(this.addressCGVisitor,p);
        assignment.getRight().accept(this.valueCGVisitor,p);
        cg.store(assignment.getLeft().getType());
        return null;
    }

    /*
        execute[[Function: statement => variable:expression expression*]]()=
            value[[function]]
            if(!function.getType().equals(VoidType.getInstance())
                <pop>function.getType().suffix()
     */
    @Override
    public Object visit(Function function, Object p) {
        cg.line(function.getLine());
        function.accept(this.valueCGVisitor,p);
        if(!function.getType().equals(VoidType.getInstance()))
            cg.pop(function.getType());
        return null;
    }

    /*
        execute[[IfElse: statement => expression statement1* statement2*]]()=
            value[[expression]]
            <jz else> cg.getElseCounter()<:>
                for(Statement st: statement*)
                    execute[[st]]
                <jmp endIf> cg.getEndIfCounter()
            <else> cg.getElseCounter()<:>
                for(Statement st: statement2*)
                    execute[[st]]
            <endIf> cg.getEndIfCounter<:>
            cg.increaseElseCounter()
            cg.increaseEndIfCounter()
     */
    @Override
    public Object visit(IfElse ifElse, Object p) {
        cg.comment("If");
        int elseIf = cg.getElseCounter();
        cg.increaseElseCounter();
        int endIf = cg.getEndIfCounter();
        cg.increaseEndIfCounter();
        ifElse.getExpression().accept(this.valueCGVisitor,p);
        cg.jz("else",elseIf);
        for(Statement st : ifElse.getIfStatements()){
            st.accept(this,p);
        }
        cg.jmp("endIf",endIf);
        cg.label(String.format("else%d",elseIf));
        for(Statement st : ifElse.getElseStatements()){
            st.accept(this,p);
        }
        cg.label(String.format("endIf%d",endIf));
        return null;
    }

    /*
        execute[[input: statement => expression]]()=
            address[[expression]]
            <in> expression.getType().suffix()
            <store> expression.getType().suffix()
     */
    @Override
    public Object visit(Input input, Object p) {
        cg.line(input.getLine());
        cg.comment("Read");
        input.getExpression().accept(this.addressCGVisitor,p);
        cg.in(input.getExpression().getType());
        cg.store(input.getExpression().getType());
        return null;
    }

    /*
        execute[[Print: statement => expression*]]()=
            for(Expression exp: expression*){
                value[[exp]]
                <out> exp.getType().suffix()
            }
     */
    @Override
    public Object visit(Print print, Object p) {
        for(Expression exp: print.getExpressions()){
            cg.line(print.getLine());
            cg.comment("Write");
            exp.accept(this.valueCGVisitor,p);
            cg.out(exp.getType());
        }

        return null;
    }

    /*
        execute[[Return: statement => expression]](funcDefinition)=
            value[[expression]]
            <ret> funcDefinition.getType().getReturnType().numberOfBytes()
                <,> funcDefinition.getLocalOffset()
                <,> funcDefinition.getType().getParamsOffset()
     */
    @Override
    public Object visit(Return ret, Object p) {
        cg.line(ret.getLine());
        cg.comment("Return");
        ret.getExpression().accept(this.valueCGVisitor,p);
        FunctionType ft = (FunctionType)((FuncDefinition) p).getType();
        cg.ret(ft.numberOfBytes(),((FuncDefinition)p).getLocalOffset(),ft.getParamsOffset());
        return null;
    }

    /*
        execute[[while: statement => expression statement*]]()=
            <while> cg.getWhileCounter()<:>
                value[[expression]]
                <jz> endWhile cg.getWhileCounter()
                for(Statement st : statement*)
                    execute[[st]]
            <endWhile> cg.getEndWhileCounter()<:>
            cg.increaseWhileCounter()
            cg.increaseEndWhileCounter()
     */
    @Override
    public Object visit(While whil, Object p) {
        cg.line(whil.getLine());
        cg.comment("While");
        int whi = cg.getWhileCounter();
        cg.increaseWhileCounter();
        int end = cg.getWhileCounter();
        cg.increaseEndWhileCounter();
        cg.label(String.format("while%d",whi));
        whil.getExpression().accept(this.valueCGVisitor,p);
        cg.jz("endwhile",end);
        for(Statement st: whil.getStatements()){
            st.accept(this,p);
        }
        cg.jmp("while",whi);
        cg.label(String.format("endwhile%d",end));
        return null;
    }

}
