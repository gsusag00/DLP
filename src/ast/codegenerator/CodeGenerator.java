package ast.codegenerator;

import ast.Type;
import ast.type.Character;
import ast.type.Double;
import ast.type.Integer;

import java.io.IOException;
import java.io.PrintWriter;

public class CodeGenerator {

    private static CodeGenerator codeGeneratorInstance;
    private final PrintWriter out;
    private int elseCounter;
    private int endIfCounter;
    private int whileCounter;
    private int endWhileCounter;
    private int endTerniaryCounter;
    private int terniaryFalseCounter;

    private CodeGenerator(String input, String output) {
        try {
            out = new PrintWriter(output);
        } catch (IOException e) {
            throw new IllegalArgumentException("Output erroneo");
        }

        elseCounter = 0;
        endIfCounter = 0;
        whileCounter = 0;
        endWhileCounter = 0;
        endTerniaryCounter = 0;
        terniaryFalseCounter = 0;
        source(input);
    }

    public static CodeGenerator getInstance(String input, String output) {
        if (codeGeneratorInstance == null) {
            codeGeneratorInstance = new CodeGenerator(input, output);
        }
        return codeGeneratorInstance;
    }

    public static CodeGenerator getInstance() {
        return codeGeneratorInstance;
    }

    public int getElseCounter() {
        return elseCounter;
    }

    public int getEndIfCounter() {
        return endIfCounter;
    }

    public int getWhileCounter() {
        return whileCounter;
    }

    public int getEndWhileCounter() {
        return endWhileCounter;
    }

    public int getEndTerniaryCounter() {
        return endTerniaryCounter;
    }

    public int getTerniaryFalseCounter() {
        return terniaryFalseCounter;
    }

    public void increaseElseCounter() {
        elseCounter++;
    }

    public void increaseEndIfCounter() {
        endIfCounter++;
    }

    public void increaseWhileCounter() {
        whileCounter++;
    }

    public void increaseEndWhileCounter() {
        endWhileCounter++;
    }

    public void increaseTerniaryFalseCounter() {
        terniaryFalseCounter++;
    }

    public void increaseEndTerniaryCounter() {
        endTerniaryCounter++;
    }

    /**
     * There is three versions.
     * -pushb: Pushes the character (1 byte) onto the stack
     * -pushi: Pushes the integer (2 bytes) onto the stack (Default so the "i" is not always needed.
     * -pushf: Pushes the real number (4 bytes) onto the stack
     *
     * @param type  The type of the push instruction (b,i or f)
     * @param value Value that is going to be pushed onto the stack
     */
    public void push(Type type, String value) {
        out.println(String.format("\tpush%c\t%s", type.suffix(), value));
        out.flush();
    }

    /**
     * Pushes an integer address onto the stack
     *
     * @param offset the direction of the address
     */
    public void pusha(int offset) {
        out.println(String.format("\tpusha\t%d", offset));
        out.flush();
    }

    /**
     * Pushes the value of the bp register onto the stack.
     */
    public void pushBP() {
        out.println("\tpush\tbp");
        out.flush();
    }

    /**
     * Pops an address off the stack and then depending on the version pushes the content of the addres onto the stack
     * There is three versions:
     * -loadb: for characters
     * -loadi: for integers (the "i" is not needed)
     * -loadf: for real values
     *
     * @param type The type of the action, which will add it's suffix (b,i or f)
     */
    public void load(Type type) {
        out.println(String.format("\tload%c", type.suffix()));
        out.flush();
    }

    /**
     * Pops an address off the stack and then depending on the version pushes the content of the of the stack into
     * the memory address.
     * There is three versions:
     * -storeb: for characters
     * -storei: for integers (the "i" is not needed)
     * -storef: for real values
     *
     * @param type The type of the action, which will add it's suffix (b,i or f)
     */
    public void store(Type type) {
        out.println(String.format("\tstore%c", type.suffix()));
        out.flush();
    }

    /**
     * Pops an amount of bytes depending on its version.
     * -popb: 1 byte
     * -popi: 2 bytes ("i" not needed)
     * -popf: 4 bytes
     *
     * @param type The type of the action, which will add it's suffix (b,i or f)
     */
    public void pop(Type type) {
        out.println(String.format("\tpop%c", type.suffix()));
        out.flush();
    }

    /**
     * Duplicates an amount of bytes depending on its version.
     * -popb: 1 byte
     * -popi: 2 bytes ("i" not needed)
     * -popf: 4 bytes
     *
     * @param type The type of the action, which will add it's suffix (b,i or f)
     */
    public void dup(Type type) {
        out.println(String.format("\tdup%c", type.suffix()));
    }

    /**
     * Performs an arithmetic operation. Pop the two operands and then pushes the value of the resulting operation.
     * cases:
     * -"+": For addition
     * -"-": For substraction
     * -"*": For multiplication
     * -"/": For division
     * -"%": For modulus
     *
     * @param type     Depending on the type of the operation there will be different suffixes for each operation.
     *                 - For integer operations "i" is used
     *                 - For real operations "f" is used
     *                 - For byte operations they are treated as integer operations
     * @param operator The operator of the arithmetic operation
     */
    public void arithmetic(Type type, String operator) {
        switch (operator) {
            case "+":
                out.println(String.format("\tadd%c", type.suffix()));
                break;
            case "-":
                out.println(String.format("\tsub%c", type.suffix()));
                break;
            case "*":
                out.println(String.format("\tmul%c", type.suffix()));
                break;
            case "/":
                out.println(String.format("\tdiv%c", type.suffix()));
                break;
            case "%":
                out.println(String.format("\tmod%c", type.suffix()));
                break;
        }
        out.flush();
    }

    public void add(Type type) {
        out.println(String.format("\tadd%c", type.suffix()));
        out.flush();
    }

    public void sub(Type type) {
        out.println(String.format("\tsub%c", type.suffix()));
        out.flush();
    }

    public void mul(Type type) {
        out.println(String.format("\tmul%c", type.suffix()));
        out.flush();
    }

    /**
     * Performs an arithmetic operation. Pop the two operands and then pushes the value of the resulting operation.
     * cases:
     * -">": For greater than
     * -"<": For lower than
     * -">=": For greater than or equal
     * -"<=": For lower than or equal
     * -"==": For equal
     * -"!=": For not equal
     *
     * @param type     Depending on the type of the operation there will be different suffixes for each operation.
     *                 - For integer operations "i" is used
     *                 - For real operations "f" is used
     *                 - For byte operations they are treated as integer operations
     * @param operator The operator of the comparison operation
     */
    public void comparison(Type type, String operator) {
        switch (operator) {
            case ">":
                out.println(String.format("\tgt%c", type.suffix()));
                break;
            case "<":
                out.println(String.format("\tlt%c", type.suffix()));
                break;
            case ">=":
                out.println(String.format("\tge%c", type.suffix()));
                break;
            case "<=":
                out.println(String.format("\tle%c", type.suffix()));
                break;
            case "==":
                out.println(String.format("\teq%c", type.suffix()));
                break;
            case "!=":
                out.println(String.format("\tne%c", type.suffix()));
                break;
        }
        out.flush();
    }

    /**
     * Performs an arithmetic operation. Pop the two operands and then pushes the value of the resulting operation.
     * cases:
     * -"&&": For greater than
     * -"||": For lower than
     *
     * @param operator The operator of the comparison operation
     */
    public void logical(String operator) {
        switch (operator) {
            case "&&":
                out.println("\tand");
                break;
            case "||":
                out.println("\tor");
                break;
        }
        out.flush();
    }

    /**
     * Performs a negation.
     */
    public void not() {
        out.println("\tnot");
        out.flush();
    }

    /**
     * Pops a value of the stack and shows it on the console.
     *
     * @param type based on the type the operation will have a suffix.
     *             -For integers: "i"
     *             -For real: "f"
     *             -For byte: "b"
     */
    public void out(Type type) {
        out.println(String.format("\tout%c", type.suffix()));
        out.flush();
    }

    /**
     * Read a value from the keyboard and pushes it to the stack.
     *
     * @param type based on the type the operation will have a suffix.
     *             -For integers: "i"
     *             -For real: "f"
     *             -For byte: "b"
     */
    public void in(Type type) {
        out.println(String.format("\tin%c", type.suffix()));
        out.flush();
    }

    /**
     * There is 4 operations posible.
     * -b2i: Pops a character and pushes it as an integer
     * -i2f: Pops an integer and pushes it as a real
     * -f2i: Pops a real and pushes it as an integer
     * -i2b: Pops an integer and pushes it as a character.
     * There is no explicit conversion between bytes and reals and viceversa, instead this operations are made by
     * casting the byte to integer and then casting the result of that operation is casted to a real. For real to
     * byte the process woudl be flipped.
     *
     * @param type     the base type
     * @param castType the target type
     */
    public void cast(Type type, Type castType) {
        if (!type.equals(castType)) {
            if (type.equals(Double.getInstance()) && castType.equals(Character.getInstance()) || type.equals(Character.getInstance()) && castType.equals(Double.getInstance())) {
                cast(type, Integer.getInstance());
                cast(Integer.getInstance(), castType);
            } else {
                out.println(String.format("\t%c2%c", type.suffix(), castType.suffix()));
                out.flush();
            }
        }
    }

    /**
     * Defines a label for jumps and invocations
     *
     * @param value the name of the value.
     */
    public void id(String value) {
        out.println(String.format("\n %s:", value));
        out.flush();
    }

    public void label(String value) {
        out.println(String.format(String.format(" %s:", value)));
        out.flush();
    }

    /**
     * Jumps to the label especified as a parameter
     *
     * @param label the name of the label
     * @param value this is to differentiate the labels as there might be some with the same name. (E.g: else1,
     *              else2,...)
     */
    public void jmp(String label, int value) {
        out.println(String.format("\tjmp\t%s%d", label, value));
        out.flush();
    }

    /**
     * Pops one integer from the stack and jumps to the label if the value was a 0
     *
     * @param label the name of the label
     * @param value this is to differentiate the labels as there might be some with the same name. (E.g: else1,
     *              else2,...)
     */
    public void jz(String label, int value) {
        out.println(String.format("\tjz\t%s%d", label, value));
        out.flush();
    }

    /**
     * Pops one integer from the stack and jumps to the label if the value wasn't a 0
     *
     * @param label the name of the label
     * @param value this is to differentiate the labels as there might be some with the same name. (E.g: else1,
     *              else2,...)
     */
    public void jnz(String label, int value) {
        out.println(String.format("\tjnz\t%s%d", label, value));
        out.flush();
    }

    /**
     * Invokes the {@code id} function
     *
     * @param label the label of the function
     */
    public void call(String label) {
        out.println(String.format("call %s", label));
        out.flush();
    }

    /**
     * Allocates {@code int_constant} bytes on the top of the stack.
     *
     * @param value the number of bytes of the local variables.
     */
    public void enter(int value) {
        out.println(String.format("\tenter\t%d", value));
        out.flush();
    }

    /**
     * Returns from a function invocation.
     *
     * @param returnBytes represents the bytes to return
     * @param localBytes  represents the bytes of the local variables
     * @param paramBytes  represents the bytes of all parameters
     */
    public void ret(int returnBytes, int localBytes, int paramBytes) {
        out.println(String.format("\tret\t%d, %d, %d", returnBytes, localBytes, paramBytes));
        out.flush();
    }

    /**
     * Terminates the program execution
     */
    public void halt() {
        out.println("halt\n");
        out.flush();
    }

    /**
     * Allows the MAPL IDE to associate assembly code to the high-level source program
     *
     * @param value the name of the source program
     */
    public void source(String value) {
        out.println(String.format("\n#source\t\"%s\"\n", value));
        out.flush();
    }

    /**
     * Allows the MAPL IDE to associate assembly code to the high-level statement.
     *
     * @param value the line where the statement happens
     */
    public void line(int value) {
        out.println(String.format("\n#line\t%d", value));
        out.flush();
    }

    public void comment(String value) {
        out.println(String.format("\t' * %s",value));
        out.flush();
    }

    public void commentWithoutTab(String value) {
        out.println(String.format("' %s",value));
        out.flush();
    }

    public void breakLine() {
        out.println();
        out.flush();
    }
}
