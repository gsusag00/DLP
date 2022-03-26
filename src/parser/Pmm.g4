grammar Pmm;

@header {
    import ast.*;
    import ast.expression.*;
    import ast.definition.*;
    import ast.type.*;
    import ast.type.Integer;
    import ast.type.Double;
    import ast.type.Character;
    import ast.statement.*;
    import java.util.ArrayList;
    import java.util.List;
    import ast.expression.Boolean;
}

program returns [Program ast] locals [List<Definition> def = new ArrayList<Definition>()]: (definitions {$def.addAll($definitions.ast);})* mainFunc {$def.add($mainFunc.ast);} {$ast = new Program(0,0,$def);} EOF ;

definitions returns [List<Definition> ast = new ArrayList<Definition>()]: funcDef {$ast.add($funcDef.ast);}
    | varDef {$ast.addAll($varDef.ast);};

mainFunc returns [FuncDefinition ast] locals [List<VarDefinition> varDecs = new ArrayList<VarDefinition>(),List<Statement> statements = new ArrayList<Statement>()]:
    DEF='def' MAIN='main' '():' '{'(varDef {$varDecs.addAll($varDef.ast);})* (statement {$statements.add($statement.ast);})*'}' {$ast = new FuncDefinition(
        $MAIN.text,
        $DEF.getLine(),
        $DEF.getCharPositionInLine() + 1,
        new FunctionType($DEF.getLine(), $DEF.getCharPositionInLine() + 1, new ArrayList<VarDefinition>(), new VoidType()),
        $varDecs,
        $statements
    );};

funcDef returns [FuncDefinition ast] locals [List<VarDefinition> varDecs = new ArrayList<VarDefinition>(),List<Statement> statements = new ArrayList<Statement>(), Type ret = new VoidType()]:
     DEF='def' ID '(' funcVarList ')' ':' (type{$ret=$type.ast;})? '{'(varDef {$varDecs.addAll($varDef.ast);})* (statement {$statements.add($statement.ast);})*'}' {$ast = new FuncDefinition(
        $ID.text,
        $DEF.getLine(),
        $DEF.getCharPositionInLine() + 1,
        new FunctionType($DEF.getLine(), $DEF.getCharPositionInLine() + 1, $funcVarList.ast, $ret),
        $varDecs,
        $statements
    );};

    /**
        Sinceramente no tengo ni puta idea de lo que esta pasando aqui. Preguntar a Miguel en clase.
    */

funcVarList returns [List<VarDefinition> ast= new ArrayList<VarDefinition>()]: (f1=funcVar {$ast.add($f1.ast);} (',' fn=funcVar {$ast.add($fn.ast);})*)?;

funcVar returns [VarDefinition ast]: ID ':' type {$ast = new VarDefinition(
         $ID.getLine(),
         $ID.getCharPositionInLine() + 1,
         $ID.text
     ); $ast.setType($type.ast);};

varDef returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]: varDec {
    for(VarDefinition def: $varDec.ast){
        if($ast.contains(def)){
            new ErrorType(def.getLine(),def.getColumn(), "Error: variable duplicada");
        } else {
            $ast.add(def);
        }
    };}';';

varDec returns [List<VarDefinition> ast = new ArrayList<VarDefinition>()]: ID1=ID { $ast.add(
    new VarDefinition(
            $ID1.getLine(),
            $ID1.getCharPositionInLine() + 1,
            $ID1.text
        )
    );} (',' IDN=ID{$ast.add( new VarDefinition($IDN.getLine(),$IDN.getCharPositionInLine() + 1, $IDN.text));})* ':' type {for(VarDefinition var : $ast){var.setType($type.ast);}};

type returns [Type ast] locals [Integer integer = new Integer(0,0),Character character = new Character(0,0),Double doub = new Double(0,0),List<RecordField> records = new ArrayList<RecordField>()]:
    DOUBLE='double' { $ast = $doub;}
    | CHAR='char' { $ast = $character;}
    | INT='int' { $ast = $integer;}
    | '[' INT_CONSTANT ']' tipo=type { $ast = new Array(
        $INT_CONSTANT.getLine(),
        $INT_CONSTANT.getCharPositionInLine() + 1,
        $tipo.ast,
        LexerHelper.lexemeToInt($INT_CONSTANT.text)
    );}
    | ST='struct' '{' (recordFields {
        for(RecordField r: $recordFields.ast){
            if($records.contains(r)){
                new ErrorType($ST.getLine(),$ST.getCharPositionInLine() + 1, "Error: Campo duplicado");
            }
            else{
                $records.add(r);
            }
        };})+ '}' { $ast = new Struct(
        $ST.getLine(),
        $ST.getCharPositionInLine() + 1,
        $records
    );}
    ;

recordFields returns [List<RecordField> ast = new ArrayList<RecordField>()]: ID1=ID {$ast.add(new RecordField($ID1.text,$ID1.getLine(), $ID1.getCharPositionInLine() + 1));} (',' IDN=ID {$ast.add(new RecordField($IDN.text, $IDN.getLine(), $IDN.getCharPositionInLine() + 1));})* ':' type ';' {for(RecordField var : $ast){var.setType($type.ast);}};

statement returns [Statement ast] locals [List<Statement> elseBod = new ArrayList<Statement>(),List<Expression> aux = new ArrayList<Expression>()]:
    PRINT='print' (exp1=expression {$aux.add($exp1.ast);}(',' expN=expression {$aux.add($expN.ast);})*) ';' {$ast = new Print($PRINT.getLine(),$PRINT.getCharPositionInLine() + 1, $aux);}
    |INPUT='input' (exp1=expression {$aux.add($exp1.ast);}(',' expN=expression {$aux.add($expN.ast);})*) ';' {$ast = new Input($INPUT.getLine(),$INPUT.getCharPositionInLine() + 1, $aux);}
    | left=expression '=' right=expression ';' { $ast = new Assignment(
        $left.ast.getLine(),
        $left.ast.getColumn(),
        $left.ast,
        $right.ast
    );}
    | IF='if' (expr=expression)+ ':' ifBody=body ('else' elseBody=body {$elseBod.addAll($elseBody.ast);})? { $ast = new IfElse(
        $IF.getLine(),
        $IF.getCharPositionInLine() + 1,
        $expr.ast,
        $ifBody.ast,
        $elseBod
    );}
    | WHILE='while' (expr=expression)+ ':' body { $ast = new While(
        $WHILE.getLine(),
        $WHILE.getCharPositionInLine() + 1,
        $expr.ast,
        $body.ast
    );}
    | ID '(' (exp1=expression {$aux.add($exp1.ast);} (',' expN=expression {$aux.add($expN.ast);})*)? ')' ';' {$ast = new Function(
        $ID.getLine(),
        $ID.getCharPositionInLine() + 1,
        $ID.text,
        $aux
    );}
    | RET='return' exp=expression ';' { $ast = new Return($RET.getLine(),$RET.getCharPositionInLine(),$exp.ast);}
    ;

body returns [List<Statement> ast = new ArrayList<Statement>();]: statement {$ast.add($statement.ast);}
    |'{' (statement  {$ast.add($statement.ast); })+  '}';

expression returns [Expression ast] locals [List<Expression> args = new ArrayList<Expression>()]:
    ID '(' (exp1=expression {$args.add($exp1.ast);} (',' expN=expression{$args.add($expN.ast);})*)? ')' { $ast = new Function(
        $ID.getLine(),
        $ID.getCharPositionInLine() + 1,
        $ID.text,
        $args
    );}
    | '(' expression ')' { $ast = $expression.ast;}
    | outBrackets=expression '[' inBrackets=expression ']' { $ast = new SquareBrackets(
        $outBrackets.ast,
        $inBrackets.ast,
        $outBrackets.ast.getLine(),
        $outBrackets.ast.getColumn()
    );}
    | exp=expression '.' ID { $ast = new Point(
        $exp.ast,
        $ID.text,
        $exp.ast.getLine(),
        $exp.ast.getColumn()
    );}
    | '(' tipo=type ')' exp=expression { $ast = new Cast(
        $tipo.ast,
        $exp.ast,
        $tipo.ast.getLine(),
        $tipo.ast.getColumn()
    );}
    | '-' exp=expression { $ast = new UnaryMinus(
        $exp.ast,
        $exp.ast.getLine(),
        $exp.ast.getColumn()
    );}
    | '!' exp=expression { $ast = new Not(
        $exp.ast,
        $exp.ast.getLine(),
        $exp.ast.getColumn()
    );}
    | left=expression OP=('*'|'/'|'%') right=expression { $ast = new Arithmetic(
        $left.ast.getLine(),
        $left.ast.getColumn(),
        $left.ast,
        $right.ast,
        $OP.text
    );}
    | left=expression OP=('+'|'-') right=expression { $ast = new Arithmetic(
        $left.ast.getLine(),
        $left.ast.getColumn(),
        $left.ast,
        $right.ast,
        $OP.text
    );}
    | left=expression OP=('>'|'>='|'<'|'<='|'!='|'==') right=expression { $ast = new Comparison(
        $left.ast.getLine(),
        $left.ast.getColumn(),
        $left.ast,
        $right.ast,
        $OP.text
    );}
    | left=expression OP=('&&'|'||') right=expression { $ast = new Boolean(
            $left.ast.getLine(),
            $left.ast.getColumn(),
            $left.ast,
            $right.ast,
            $OP.text
    );}
    | ID { $ast = new Variable(
        $ID.text,
        $ID.getLine(),
        $ID.getCharPositionInLine() + 1
    ); }
    | REAL_CONSTANT { $ast = new DoubleLiteral(
        LexerHelper.lexemeToReal($REAL_CONSTANT.text),
        $REAL_CONSTANT.getLine(),
        $REAL_CONSTANT.getCharPositionInLine() + 1
    );}
    | CHAR_CONSTANT { $ast = new CharLiteral(
        LexerHelper.lexemeToChar($CHAR_CONSTANT.text),
        $CHAR_CONSTANT.getLine(),
        $CHAR_CONSTANT.getCharPositionInLine() + 1
    );}
    | INT_CONSTANT { $ast = new IntLiteral(
        LexerHelper.lexemeToInt($INT_CONSTANT.text),
        $INT_CONSTANT.getLine(),
        $INT_CONSTANT.getCharPositionInLine() + 1
    );}
    ;

/*
Para que una regla devuelva algo tenemos que tener la palabra "returns"

expression returrns [Expression ex]

luego el no terminal se convierte en un objeto con un parametro ex.

Nosotros lo vamos a llamar AST para los no terminales.

expression returns [Expression ast]: ID '(' (expression (',' expression)*)? ')'
          | '(' expression ')'
          | expression '[' expression ']'
          | expression '.' ID
          | '(' type ')' expression
          | '-' expression
          | '!' expression
          | expression ('&&'|'||') expression
          | expression ('*'|'/'|'%') expression
          | expression ('+'|'-') expression
          | expression ('>'|'>='|'<'|'<='|'!='|'==') expression
          | ID
          | REAL_CONSTANT
          | CHAR_CONSTANT
          | INT_CONSTANT
          ;

El '$' es una manera para acceder a las variables de antlr

para coger la linea se hace $ID.getLine(), para la columna $ID.getCharPositionInLine() + 1 (Ya que esta en base 0)
Para coger el lexema hacemos $ID.text

En reglas recursivas le damos nombres a los terminales.
    - De normal los no terminales no tienen linea o columna, pero llamando a start podemos aceder al primer token
    - Tambien se puede hacer con nombre.ast, ya que al ser una regla recursiva nos va a llegar el ast.

Para cuando se devuelve una lista podemos hacer

expressions returns[ArrayList<Expression> ast = new ArrayList<Expression>()]:
          {int i = 0;} expression=expression+ {$ast.add(expression.ast)};
          (Podemos acceder a la variable i con $i dentro de el otro codigo java.

expressions returns[ArrayList<Expression> ast = new ArrayList<Expression>()] locals [Type returnType]:
    (Hace lo mismo que antes pero queda mas comodo.

*/
/* en bnf poner un comentario donde vaya haber un landa.*/


fragment INT: [0]|[1-9] [0-9]*;
fragment REAL_PART: ('.' [0-9]*);
fragment EXP:([e|E] [-|+]? INT);
fragment LETTER: [a-zA-Z];
ID: (LETTER|'_') (LETTER|[0-9]|'_')*;
INT_CONSTANT: INT;
CHAR_CONSTANT: '\'' (.|'\\'([0-9][0-9][0-9])|'\\'('n'|'r'|'t'))'\'';
REAL_CONSTANT: (INT REAL_PART? EXP?) | (REAL_PART EXP?);
ONELINECOMMENT: '#' .*? '\t'? ('\n'|EOF) -> skip;
MULTIPLELINECOMMENT: '"""' .*? '"""' -> skip;
THRASH: (' '|'\n'|'\t'|'\r') -> skip;
