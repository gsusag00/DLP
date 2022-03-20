package ast.errorHandler;

import ast.type.ErrorType;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ErrorHandler {

    private static ErrorHandler errorHandler;
    private List<ErrorType> errors;

    private ErrorHandler() {
        errors = new ArrayList<>();
    }

    public static ErrorHandler getInstance() {
        if(errorHandler == null){
            errorHandler=new ErrorHandler();
        }
        return errorHandler;
    }

    public boolean hasErrors() {
        return !this.errors.isEmpty();
    }

    public void showErrors(PrintStream out){
        for(ErrorType err: errors) {
            out.println(err.toString());
        }
    }

    public void addError(ErrorType error) {
        this.errors.add(error);
    }
}
