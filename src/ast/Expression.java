package ast;

public interface Expression extends ASTNode {

    boolean getLValue();
    void setLValue(boolean LValue);
    Type getType();
    void setType(Type type);
}
