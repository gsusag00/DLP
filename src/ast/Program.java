package ast;

import java.util.List;

public class Program extends BaseNode {

    private List<Definition> definiciones;

    public Program (int line, int column, List<Definition> definiciones){
        super(line,column);
        this.definiciones = definiciones;
    }

    public List<Definition> getDefiniciones() {
        return definiciones;
    }

    public void setDefiniciones(List<Definition> definiciones) {
        this.definiciones = definiciones;
    }

    @Override
    public String toString() {
        return "Program at line: " + getLine() + "Column: " + getColumn() + ". Definiciones: " + definiciones.toString();
    }
}
