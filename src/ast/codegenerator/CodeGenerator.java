package ast.codegenerator;

import ast.Type;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private static CodeGenerator codeGeneratorInstance;
    private final PrintWriter out;
    private int labelCounter;

    private CodeGenerator(String input, String output) {
        try {
            out = new PrintWriter(output);
        } catch (IOException e) {
            throw new IllegalArgumentException("Output erroneo");
        }

        labelCounter = 0;
        source(input);
    }

    public static CodeGenerator getInstance(String input, String output) {
        if (codeGeneratorInstance == null) {
            codeGeneratorInstance = new CodeGenerator(input, output);
        }
        return codeGeneratorInstance;
    }

    public void source(String value) {
        out.println(String.format("\n source \"%s\"", value));
        out.flush();
    }

    public void push(Type type, String value) {
        out.println(String.format("\tpush%c \t %s", type.suffix(), value));
        out.flush();
    }

    public void pusha(int offset) {
        out.println(String.format("\tpusha\t%d", offset));
        out.flush();
    }

    public void pushBP() {
        out.println("\tpusha\t bop");
        out.flush();
    }

    public void load(Type type) {
        out.println(String.format("\tload%c",type.suffix()));
        out.flush();
    }

    public void store(Type type) {
        out.println(String.format("\tstore%c",type.suffix()));
        out.flush();
    }

    public void pop(Type type) {
        out.println(String.format("\tpop%c",type.suffix()));
        out.flush();
    }

    public void dup(Type type){
        out.println(String.format("\tdup%c",type.suffix()));
    }

    public void arithmetic(Type type, String operator){
        switch(operator) {
            case "+":
                out.println(String.format("\tadd%c",type.suffix()));
                break;
            case "-":
                out.println(String.format("\tsub%c",type.suffix()));
                break;
            case "*":
                out.println(String.format("\tmul%c",type.suffix()));
                break;
            case "/":
                out.println(String.format("\tdiv%c",type.suffix()));
                break;
            case "%":
                out.println(String.format("\tmod%c",type.suffix()));
                break;
        }
        out.flush();
    }

    public void comparison(Type type, String operator){
        switch(operator) {
            case ">":
                out.println(String.format("\tgt%c",type.suffix()));
                break;
            case "<":
                out.println(String.format("\tlt%c",type.suffix()));
                break;
            case ">=":
                out.println(String.format("\tge%c",type.suffix()));
                break;
            case "<=":
                out.println(String.format("\tle%c",type.suffix()));
                break;
            case "==":
                out.println(String.format("\teq%c",type.suffix()));
                break;
            case "!=":
                out.println(String.format("\tne%c",type.suffix()));
                break;
        }
        out.flush();
    }

    public void logical(Type type, String operator) {
        switch(operator) {
            case "&&":
                out.println("\tand");
                break;
            case "||":
                out.println("\tor");
                break;
        }
        out.flush();
    }

    public void not() {
        out.println("\tnot");
        out.flush();
    }

    public void out(Type type){
        out.println(String.format("\tout%c",type.suffix()));
        out.flush();
    }

    public void in(Type type){
        out.println(String.format("\tin%c",type.suffix()));
        out.flush();
    }

    public void cast(Type type, Type castType) {
        if(!type.equals(castType)){
//            if(type.equals)
        }
    }

}
