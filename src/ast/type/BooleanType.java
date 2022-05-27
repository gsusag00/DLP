package ast.type;

import ast.ASTNode;
import ast.Type;
import ast.visitor.Visitor;

public class BooleanType extends AbstractType{

    private static BooleanType aBooleanType;

    private BooleanType(int line, int column) {
        super(line,column);
    }

    public static BooleanType getInstance() {
        if(aBooleanType == null) {
            aBooleanType = new BooleanType(0,0);
        }
        return aBooleanType;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return null;
    }

    @Override
    public String toString() {
        return "boolean";
    }

    @Override
    public String toString(String tab) {
        return toString();
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public String getName() {
        return "Boolean";
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if (type.equals(BooleanType.getInstance())) {
            return type;
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se pueden realizar operaciones logicas con tipos no booleanos",type.getName()));
    }

    @Override
    public Type logical(ASTNode node) {
        return BooleanType.getInstance();
    }

    @Override
    public boolean isLogical(ASTNode node) {
        return true;
    }

    @Override
    public Type promotesTo(Type type, ASTNode node) {
        if(type.equals(BooleanType.getInstance())) {
            return type;
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se permite la asignacion entre %s e Integer",type.getName()));
    }

    @Override
    public char suffix() {
        return 'i';
    }


}
