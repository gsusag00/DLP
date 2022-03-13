// Generated from C:/Users/jesus/OneDrive/Escritorio/Workspaces/DLP/src/parser\Pmm.g4 by ANTLR 4.9.2
package parser;

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

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, ID=38, INT_CONSTANT=39, 
		CHAR_CONSTANT=40, REAL_CONSTANT=41, ONELINECOMMENT=42, MULTIPLELINECOMMENT=43, 
		THRASH=44;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_mainFunc = 2, RULE_funcDef = 3, 
		RULE_varDef = 4, RULE_varDec = 5, RULE_type = 6, RULE_recordFields = 7, 
		RULE_statement = 8, RULE_body = 9, RULE_expression = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "mainFunc", "funcDef", "varDef", "varDec", 
			"type", "recordFields", "statement", "body", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'{'", "'}'", "';'", "','", "':'", "'double'", 
			"'char'", "'int'", "'['", "']'", "'struct'", "'('", "')'", "'print'", 
			"'input'", "'='", "'if'", "'else'", "'while'", "'return'", "'.'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", "'<='", "'!='", 
			"'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", "ONELINECOMMENT", 
			"MULTIPLELINECOMMENT", "THRASH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public List<Definition> def = new ArrayList<Definition>();
		public DefinitionsContext definitions;
		public MainFuncContext mainFunc;
		public MainFuncContext mainFunc() {
			return getRuleContext(MainFuncContext.class,0);
		}
		public TerminalNode EOF() { return getToken(PmmParser.EOF, 0); }
		public List<DefinitionsContext> definitions() {
			return getRuleContexts(DefinitionsContext.class);
		}
		public DefinitionsContext definitions(int i) {
			return getRuleContext(DefinitionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(22);
					((ProgramContext)_localctx).definitions = definitions();
					_localctx.def.addAll(((ProgramContext)_localctx).definitions.ast);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(27); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(29);
			((ProgramContext)_localctx).mainFunc = mainFunc();
			_localctx.def.add(((ProgramContext)_localctx).mainFunc.ast);
			((ProgramContext)_localctx).ast =  new Program(0,0,_localctx.def);
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefinitionsContext extends ParserRuleContext {
		public List<Definition> ast = new ArrayList<Definition>();
		public FuncDefContext funcDef;
		public VarDefContext varDef;
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public VarDefContext varDef() {
			return getRuleContext(VarDefContext.class,0);
		}
		public DefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitDefinitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionsContext definitions() throws RecognitionException {
		DefinitionsContext _localctx = new DefinitionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definitions);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((DefinitionsContext)_localctx).funcDef = funcDef();
				_localctx.ast.add(((DefinitionsContext)_localctx).funcDef.ast);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((DefinitionsContext)_localctx).varDef = varDef();
				_localctx.ast.addAll(((DefinitionsContext)_localctx).varDef.ast);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainFuncContext extends ParserRuleContext {
		public FuncDefinition ast;
		public List<VarDefinition> varDecs = new ArrayList<VarDefinition>();
		public List<Statement> statements = new ArrayList<Statement>();
		public Token DEF;
		public Token MAIN;
		public TypeContext type;
		public VarDefContext varDef;
		public StatementContext statement;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunc; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitMainFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFuncContext mainFunc() throws RecognitionException {
		MainFuncContext _localctx = new MainFuncContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainFunc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((MainFuncContext)_localctx).DEF = match(T__0);
			setState(43);
			((MainFuncContext)_localctx).MAIN = match(T__1);
			setState(44);
			((MainFuncContext)_localctx).type = type();
			setState(45);
			match(T__2);
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(46);
					((MainFuncContext)_localctx).varDef = varDef();
					_localctx.varDecs.addAll(((MainFuncContext)_localctx).varDef.ast);
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(54);
				((MainFuncContext)_localctx).statement = statement();
				_localctx.statements.add(((MainFuncContext)_localctx).statement.ast);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__3);
			((MainFuncContext)_localctx).ast =  new FuncDefinition(
			        new Variable( (((MainFuncContext)_localctx).MAIN!=null?((MainFuncContext)_localctx).MAIN.getText():null), ((MainFuncContext)_localctx).MAIN.getLine(), ((MainFuncContext)_localctx).MAIN.getCharPositionInLine() + 1 ),
			        ((MainFuncContext)_localctx).DEF.getLine(),
			        ((MainFuncContext)_localctx).DEF.getCharPositionInLine() + 1,
			        ((MainFuncContext)_localctx).type.ast,
			        _localctx.varDecs,
			        _localctx.statements
			    );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDefContext extends ParserRuleContext {
		public FuncDefinition ast;
		public List<VarDefinition> varDecs = new ArrayList<VarDefinition>();
		public List<Statement> statements = new ArrayList<Statement>();
		public Token DEF;
		public Token ID;
		public TypeContext type;
		public VarDefContext varDef;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcDef);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			((FuncDefContext)_localctx).DEF = match(T__0);
			setState(66);
			((FuncDefContext)_localctx).ID = match(ID);
			setState(67);
			((FuncDefContext)_localctx).type = type();
			setState(68);
			match(T__2);
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(69);
					((FuncDefContext)_localctx).varDef = varDef();
					_localctx.varDecs.addAll(((FuncDefContext)_localctx).varDef.ast);
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(77);
				((FuncDefContext)_localctx).statement = statement();
				_localctx.statements.add(((FuncDefContext)_localctx).statement.ast);
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(T__3);
			((FuncDefContext)_localctx).ast =  new FuncDefinition(
			        new Variable( (((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null), ((FuncDefContext)_localctx).ID.getLine(), ((FuncDefContext)_localctx).ID.getCharPositionInLine() + 1 ),
			        ((FuncDefContext)_localctx).DEF.getLine(),
			        ((FuncDefContext)_localctx).DEF.getCharPositionInLine() + 1,
			        ((FuncDefContext)_localctx).type.ast,
			        _localctx.varDecs,
			        _localctx.statements
			    );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDefContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public VarDecContext varDec;
		public VarDecContext varDec() {
			return getRuleContext(VarDecContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((VarDefContext)_localctx).varDec = varDec();
			_localctx.ast.addAll(((VarDefContext)_localctx).varDec.ast);
			setState(90);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarDecContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public Token ID1;
		public Token IDN;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			((VarDecContext)_localctx).ID1 = match(ID);
			 _localctx.ast.add(
			        new VarDefinition(
			                ((VarDecContext)_localctx).ID1.getLine(),
			                ((VarDecContext)_localctx).ID1.getCharPositionInLine() + 1,
			                new Variable( (((VarDecContext)_localctx).ID1!=null?((VarDecContext)_localctx).ID1.getText():null), ((VarDecContext)_localctx).ID1.getLine(), ((VarDecContext)_localctx).ID1.getCharPositionInLine() + 1 )
			            )
			        );
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(94);
				match(T__5);
				setState(95);
				((VarDecContext)_localctx).IDN = match(ID);
				_localctx.ast.add( new VarDefinition(((VarDecContext)_localctx).IDN.getLine(),((VarDecContext)_localctx).IDN.getCharPositionInLine() + 1, new Variable((((VarDecContext)_localctx).IDN!=null?((VarDecContext)_localctx).IDN.getText():null),((VarDecContext)_localctx).IDN.getLine(),((VarDecContext)_localctx).IDN.getCharPositionInLine() + 1)));
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__6);
			setState(103);
			((VarDecContext)_localctx).type = type();
			for(VarDefinition var : _localctx.ast){var.setType(((VarDecContext)_localctx).type.ast);}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public Type ast;
		public Integer integer = new Integer(0,0);
		public Character character = new Character(0,0);
		public Double doub = new Double(0,0);
		public List<RecordField> records = new ArrayList<RecordField>();
		public Type ret = new VoidType();
		public List<VarDefinition> defs = new ArrayList<VarDefinition>();
		public Token DOUBLE;
		public Token CHAR;
		public Token INT;
		public Token INT_CONSTANT;
		public TypeContext tipo;
		public Token ST;
		public RecordFieldsContext recordFields;
		public Token LP;
		public VarDecContext var1;
		public VarDecContext varN;
		public TypeContext type;
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<RecordFieldsContext> recordFields() {
			return getRuleContexts(RecordFieldsContext.class);
		}
		public RecordFieldsContext recordFields(int i) {
			return getRuleContext(RecordFieldsContext.class,i);
		}
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				((TypeContext)_localctx).DOUBLE = match(T__7);
				 ((TypeContext)_localctx).ast =  _localctx.doub;
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				((TypeContext)_localctx).CHAR = match(T__8);
				 ((TypeContext)_localctx).ast =  _localctx.character;
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				((TypeContext)_localctx).INT = match(T__9);
				 ((TypeContext)_localctx).ast =  _localctx.integer;
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(T__10);
				setState(113);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(114);
				match(T__11);
				setState(115);
				((TypeContext)_localctx).tipo = type();
				 ((TypeContext)_localctx).ast =  new Array(
				        ((TypeContext)_localctx).INT_CONSTANT.getLine(),
				        ((TypeContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1,
				        ((TypeContext)_localctx).tipo.ast,
				        LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null))
				    );
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				((TypeContext)_localctx).ST = match(T__12);
				setState(119);
				match(T__2);
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					((TypeContext)_localctx).recordFields = recordFields();
					_localctx.records.addAll(((TypeContext)_localctx).recordFields.ast);
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(127);
				match(T__3);
				 ((TypeContext)_localctx).ast =  new Struct(
				        ((TypeContext)_localctx).ST.getLine(),
				        ((TypeContext)_localctx).ST.getCharPositionInLine() + 1,
				        _localctx.records
				    );
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				((TypeContext)_localctx).LP = match(T__13);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(131);
					((TypeContext)_localctx).var1 = varDec();
					_localctx.defs.addAll(((TypeContext)_localctx).var1.ast);
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(133);
						match(T__5);
						setState(134);
						((TypeContext)_localctx).varN = varDec();
						_localctx.defs.addAll(((TypeContext)_localctx).varN.ast);
						}
						}
						setState(141);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(144);
				match(T__14);
				setState(145);
				match(T__6);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					setState(146);
					((TypeContext)_localctx).type = type();
					((TypeContext)_localctx).ret =  ((TypeContext)_localctx).type.ast;
					}
				}

				((TypeContext)_localctx).ast =  new FunctionType(
				        ((TypeContext)_localctx).LP.getLine(),
				        ((TypeContext)_localctx).LP.getCharPositionInLine() + 1,
				        _localctx.defs,
				        _localctx.ret
				    );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecordFieldsContext extends ParserRuleContext {
		public List<RecordField> ast = new ArrayList<RecordField>();
		public Token ID1;
		public Token IDN;
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(PmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmmParser.ID, i);
		}
		public RecordFieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordFields; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitRecordFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RecordFieldsContext recordFields() throws RecognitionException {
		RecordFieldsContext _localctx = new RecordFieldsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((RecordFieldsContext)_localctx).ID1 = match(ID);
			_localctx.ast.add(new RecordField((((RecordFieldsContext)_localctx).ID1!=null?((RecordFieldsContext)_localctx).ID1.getText():null)));
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(156);
				match(T__5);
				setState(157);
				((RecordFieldsContext)_localctx).IDN = match(ID);
				_localctx.ast.add(new RecordField((((RecordFieldsContext)_localctx).IDN!=null?((RecordFieldsContext)_localctx).IDN.getText():null)));
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(164);
			match(T__6);
			setState(165);
			((RecordFieldsContext)_localctx).type = type();
			setState(166);
			match(T__4);
			for(RecordField var : _localctx.ast){var.setType(((RecordFieldsContext)_localctx).type.ast);}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement ast;
		public List<Statement> elseBod = new ArrayList<Statement>();
		public List<Expression> aux = new ArrayList<Expression>();
		public Token PRINT;
		public ExpressionContext exp1;
		public ExpressionContext expN;
		public Token INPUT;
		public ExpressionContext left;
		public ExpressionContext right;
		public Token IF;
		public ExpressionContext expr;
		public BodyContext ifBody;
		public BodyContext elseBody;
		public Token WHILE;
		public BodyContext body;
		public Token ID;
		public Token RET;
		public ExpressionContext exp;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		int _la;
		try {
			setState(255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				((StatementContext)_localctx).PRINT = match(T__15);
				{
				setState(170);
				((StatementContext)_localctx).exp1 = expression(0);
				_localctx.aux.add(((StatementContext)_localctx).exp1.ast);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(172);
					match(T__5);
					setState(173);
					((StatementContext)_localctx).expN = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).expN.ast);
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(181);
				match(T__4);
				((StatementContext)_localctx).ast =  new Print(((StatementContext)_localctx).PRINT.getLine(),((StatementContext)_localctx).PRINT.getCharPositionInLine() + 1, _localctx.aux);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				((StatementContext)_localctx).INPUT = match(T__16);
				{
				setState(185);
				expression(0);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(186);
					match(T__5);
					setState(187);
					expression(0);
					}
					}
					setState(192);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(193);
				match(T__4);
				((StatementContext)_localctx).ast =  new Input(((StatementContext)_localctx).INPUT.getLine(),((StatementContext)_localctx).INPUT.getCharPositionInLine() + 1, _localctx.aux);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				((StatementContext)_localctx).left = expression(0);
				setState(197);
				match(T__17);
				setState(198);
				((StatementContext)_localctx).right = expression(0);
				setState(199);
				match(T__4);
				 ((StatementContext)_localctx).ast =  new Assignment(
				        ((StatementContext)_localctx).left.ast.getLine(),
				        ((StatementContext)_localctx).left.ast.getColumn(),
				        ((StatementContext)_localctx).left.ast,
				        ((StatementContext)_localctx).right.ast
				    );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(202);
				((StatementContext)_localctx).IF = match(T__18);
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(203);
					((StatementContext)_localctx).expr = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).expr.ast);
					}
					}
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__24) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(210);
				match(T__6);
				setState(211);
				((StatementContext)_localctx).ifBody = body();
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(212);
					match(T__19);
					setState(213);
					((StatementContext)_localctx).elseBody = body();
					_localctx.elseBod.addAll(((StatementContext)_localctx).elseBody.ast);
					}
					break;
				}
				 ((StatementContext)_localctx).ast =  new IfElse(
				        ((StatementContext)_localctx).IF.getLine(),
				        ((StatementContext)_localctx).IF.getCharPositionInLine() + 1,
				        _localctx.aux,
				        ((StatementContext)_localctx).ifBody.ast,
				        _localctx.elseBod
				    );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				((StatementContext)_localctx).WHILE = match(T__20);
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221);
					((StatementContext)_localctx).expr = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).expr.ast);
					}
					}
					setState(226); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__24) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(228);
				match(T__6);
				setState(229);
				((StatementContext)_localctx).body = body();
				 ((StatementContext)_localctx).ast =  new While(
				        ((StatementContext)_localctx).WHILE.getLine(),
				        ((StatementContext)_localctx).WHILE.getCharPositionInLine() + 1,
				        _localctx.aux,
				        ((StatementContext)_localctx).body.ast
				    );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(232);
				((StatementContext)_localctx).ID = match(ID);
				setState(233);
				match(T__13);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__24) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(234);
					((StatementContext)_localctx).exp1 = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).exp1.ast);
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(236);
						match(T__5);
						setState(237);
						((StatementContext)_localctx).expN = expression(0);
						_localctx.aux.add(((StatementContext)_localctx).expN.ast);
						}
						}
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(247);
				match(T__14);
				setState(248);
				match(T__4);
				((StatementContext)_localctx).ast =  new Function(
				        ((StatementContext)_localctx).ID.getLine(),
				        ((StatementContext)_localctx).ID.getCharPositionInLine() + 1,
				        new Variable( (((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine() + 1 ),
				        _localctx.aux
				    );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(250);
				((StatementContext)_localctx).RET = match(T__21);
				setState(251);
				((StatementContext)_localctx).exp = expression(0);
				setState(252);
				match(T__4);
				 ((StatementContext)_localctx).ast =  new Return(((StatementContext)_localctx).RET.getLine(),((StatementContext)_localctx).RET.getCharPositionInLine(),((StatementContext)_localctx).exp.ast);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public List<Statement> ast = new ArrayList<Statement>();;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_body);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
			case T__15:
			case T__16:
			case T__18:
			case T__20:
			case T__21:
			case T__23:
			case T__24:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				((BodyContext)_localctx).statement = statement();
				_localctx.ast.add(((BodyContext)_localctx).statement.ast);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(T__2);
				setState(264); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(261);
					((BodyContext)_localctx).statement = statement();
					_localctx.ast.add(((BodyContext)_localctx).statement.ast); 
					}
					}
					setState(266); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(268);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression ast;
		public List<Expression> args = new ArrayList<Expression>();
		public ExpressionContext outBrackets;
		public ExpressionContext exp;
		public ExpressionContext left;
		public Token ID;
		public ExpressionContext exp1;
		public ExpressionContext expression;
		public ExpressionContext expN;
		public TypeContext tipo;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token INT_CONSTANT;
		public Token OP;
		public ExpressionContext right;
		public ExpressionContext inBrackets;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(273);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(274);
				match(T__13);
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__23) | (1L << T__24) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(275);
					((ExpressionContext)_localctx).exp1 = ((ExpressionContext)_localctx).expression = expression(0);
					_localctx.args.add(((ExpressionContext)_localctx).exp1.ast);
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__5) {
						{
						{
						setState(277);
						match(T__5);
						setState(278);
						((ExpressionContext)_localctx).expN = ((ExpressionContext)_localctx).expression = expression(0);
						_localctx.args.add(((ExpressionContext)_localctx).expN.ast);
						}
						}
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(288);
				match(T__14);
				 ((ExpressionContext)_localctx).ast =  new Function(
				        ((ExpressionContext)_localctx).ID.getLine(),
				        ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
				        new Variable( (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1 ),
				        _localctx.args
				    );
				}
				break;
			case 2:
				{
				setState(290);
				match(T__13);
				setState(291);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(292);
				match(T__14);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 3:
				{
				setState(295);
				match(T__13);
				setState(296);
				((ExpressionContext)_localctx).tipo = type();
				setState(297);
				match(T__14);
				setState(298);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(11);
				 ((ExpressionContext)_localctx).ast =  new Cast(
				        ((ExpressionContext)_localctx).tipo.ast,
				        ((ExpressionContext)_localctx).exp.ast,
				        ((ExpressionContext)_localctx).tipo.ast.getLine(),
				        ((ExpressionContext)_localctx).tipo.ast.getColumn()
				    );
				}
				break;
			case 4:
				{
				setState(301);
				match(T__23);
				setState(302);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(10);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(
				        ((ExpressionContext)_localctx).exp.ast,
				        ((ExpressionContext)_localctx).exp.ast.getLine(),
				        ((ExpressionContext)_localctx).exp.ast.getColumn()
				    );
				}
				break;
			case 5:
				{
				setState(305);
				match(T__24);
				setState(306);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(9);
				 ((ExpressionContext)_localctx).ast =  new Not(
				        ((ExpressionContext)_localctx).exp.ast,
				        ((ExpressionContext)_localctx).exp.ast.getLine(),
				        ((ExpressionContext)_localctx).exp.ast.getColumn()
				    );
				}
				break;
			case 6:
				{
				setState(309);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(
				        (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
				        ((ExpressionContext)_localctx).ID.getLine(),
				        ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1
				    ); 
				}
				break;
			case 7:
				{
				setState(311);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(
				        LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				        ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1
				    );
				}
				break;
			case 8:
				{
				setState(313);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(
				        LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				        ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1
				    );
				}
				break;
			case 9:
				{
				setState(315);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(
				        LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				        ((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1
				    );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(351);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(349);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(319);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(320);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(321);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                  ((ExpressionContext)_localctx).left.ast.getLine(),
						                  ((ExpressionContext)_localctx).left.ast.getColumn(),
						                  ((ExpressionContext)_localctx).left.ast,
						                  ((ExpressionContext)_localctx).right.ast,
						                  (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)
						              );
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(324);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(325);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).ast =  new Arithmetic(
						                  ((ExpressionContext)_localctx).left.ast.getLine(),
						                  ((ExpressionContext)_localctx).left.ast.getColumn(),
						                  ((ExpressionContext)_localctx).left.ast,
						                  ((ExpressionContext)_localctx).right.ast,
						                  (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)
						              );
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(329);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(330);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(331);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).ast =  new Comparison(
						                  ((ExpressionContext)_localctx).left.ast.getLine(),
						                  ((ExpressionContext)_localctx).left.ast.getColumn(),
						                  ((ExpressionContext)_localctx).left.ast,
						                  ((ExpressionContext)_localctx).right.ast,
						                  (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)
						              );
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(334);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(335);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(336);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
						 ((ExpressionContext)_localctx).ast =  new Boolean(
						                      ((ExpressionContext)_localctx).left.ast.getLine(),
						                      ((ExpressionContext)_localctx).left.ast.getColumn(),
						                      ((ExpressionContext)_localctx).left.ast,
						                      ((ExpressionContext)_localctx).right.ast,
						                      (((ExpressionContext)_localctx).OP!=null?((ExpressionContext)_localctx).OP.getText():null)
						              );
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.outBrackets = _prevctx;
						_localctx.outBrackets = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(339);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(340);
						match(T__10);
						setState(341);
						((ExpressionContext)_localctx).inBrackets = ((ExpressionContext)_localctx).expression = expression(0);
						setState(342);
						match(T__11);
						 ((ExpressionContext)_localctx).ast =  new SquareBrackets(
						                  ((ExpressionContext)_localctx).outBrackets.ast,
						                  ((ExpressionContext)_localctx).inBrackets.ast,
						                  ((ExpressionContext)_localctx).outBrackets.ast.getLine(),
						                  ((ExpressionContext)_localctx).outBrackets.ast.getColumn()
						              );
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(345);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(346);
						match(T__22);
						setState(347);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new Point(
						                  ((ExpressionContext)_localctx).exp.ast,
						                  new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),((ExpressionContext)_localctx).ID.getLine(),((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1),
						                  ((ExpressionContext)_localctx).exp.ast.getLine(),
						                  ((ExpressionContext)_localctx).exp.ast.getColumn()
						              );
						}
						break;
					}
					} 
				}
				setState(353);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0165\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\64\n\4\f"+
		"\4\16\4\67\13\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\3\5\7\5S\n\5\f"+
		"\5\16\5V\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7d\n\7"+
		"\f\7\16\7g\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b~\n\b\r\b\16\b\177\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u008c\n\b\f\b\16\b\u008f\13\b\5\b\u0091\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\b\5\b\u009b\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\7\t\u00a2\n\t\f\t\16\t\u00a5\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00b3\n\n\f\n\16\n\u00b6\13\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\7\n\u00bf\n\n\f\n\16\n\u00c2\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\6\n\u00d1\n\n\r\n\16\n\u00d2\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00db\n\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00e3\n\n\r\n\16\n\u00e4"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00f3\n\n\f\n\16"+
		"\n\u00f6\13\n\5\n\u00f8\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0102"+
		"\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u010b\n\13\r\13\16\13\u010c"+
		"\3\13\3\13\5\13\u0111\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u011c"+
		"\n\f\f\f\16\f\u011f\13\f\5\f\u0121\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0140\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0160\n\f\f\f\16\f\u0163\13\f\3\f\2\3\26\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\6\3\2\34\36\4\2\32\32\37\37\3\2 %\3\2&\'\2\u0189\2\33\3"+
		"\2\2\2\4*\3\2\2\2\6,\3\2\2\2\bC\3\2\2\2\nZ\3\2\2\2\f^\3\2\2\2\16\u009a"+
		"\3\2\2\2\20\u009c\3\2\2\2\22\u0101\3\2\2\2\24\u0110\3\2\2\2\26\u013f\3"+
		"\2\2\2\30\31\5\4\3\2\31\32\b\2\1\2\32\34\3\2\2\2\33\30\3\2\2\2\34\35\3"+
		"\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 \5\6\4\2 !\b\2\1\2"+
		"!\"\b\2\1\2\"#\7\2\2\3#\3\3\2\2\2$%\5\b\5\2%&\b\3\1\2&+\3\2\2\2\'(\5\n"+
		"\6\2()\b\3\1\2)+\3\2\2\2*$\3\2\2\2*\'\3\2\2\2+\5\3\2\2\2,-\7\3\2\2-.\7"+
		"\4\2\2./\5\16\b\2/\65\7\5\2\2\60\61\5\n\6\2\61\62\b\4\1\2\62\64\3\2\2"+
		"\2\63\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66=\3\2\2\2"+
		"\67\65\3\2\2\289\5\22\n\29:\b\4\1\2:<\3\2\2\2;8\3\2\2\2<?\3\2\2\2=;\3"+
		"\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\6\2\2AB\b\4\1\2B\7\3\2\2\2CD"+
		"\7\3\2\2DE\7(\2\2EF\5\16\b\2FL\7\5\2\2GH\5\n\6\2HI\b\5\1\2IK\3\2\2\2J"+
		"G\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MT\3\2\2\2NL\3\2\2\2OP\5\22\n\2"+
		"PQ\b\5\1\2QS\3\2\2\2RO\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2"+
		"VT\3\2\2\2WX\7\6\2\2XY\b\5\1\2Y\t\3\2\2\2Z[\5\f\7\2[\\\b\6\1\2\\]\7\7"+
		"\2\2]\13\3\2\2\2^_\7(\2\2_e\b\7\1\2`a\7\b\2\2ab\7(\2\2bd\b\7\1\2c`\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\t\2\2ij\5\16"+
		"\b\2jk\b\7\1\2k\r\3\2\2\2lm\7\n\2\2m\u009b\b\b\1\2no\7\13\2\2o\u009b\b"+
		"\b\1\2pq\7\f\2\2q\u009b\b\b\1\2rs\7\r\2\2st\7)\2\2tu\7\16\2\2uv\5\16\b"+
		"\2vw\b\b\1\2w\u009b\3\2\2\2xy\7\17\2\2y}\7\5\2\2z{\5\20\t\2{|\b\b\1\2"+
		"|~\3\2\2\2}z\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\7\6\2\2\u0082\u0083\b\b\1\2\u0083\u009b\3\2"+
		"\2\2\u0084\u0090\7\20\2\2\u0085\u0086\5\f\7\2\u0086\u008d\b\b\1\2\u0087"+
		"\u0088\7\b\2\2\u0088\u0089\5\f\7\2\u0089\u008a\b\b\1\2\u008a\u008c\3\2"+
		"\2\2\u008b\u0087\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0085\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\21\2\2\u0093"+
		"\u0097\7\t\2\2\u0094\u0095\5\16\b\2\u0095\u0096\b\b\1\2\u0096\u0098\3"+
		"\2\2\2\u0097\u0094\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009b\b\b\1\2\u009al\3\2\2\2\u009an\3\2\2\2\u009ap\3\2\2\2\u009ar\3\2"+
		"\2\2\u009ax\3\2\2\2\u009a\u0084\3\2\2\2\u009b\17\3\2\2\2\u009c\u009d\7"+
		"(\2\2\u009d\u00a3\b\t\1\2\u009e\u009f\7\b\2\2\u009f\u00a0\7(\2\2\u00a0"+
		"\u00a2\b\t\1\2\u00a1\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\7\t\2\2\u00a7\u00a8\5\16\b\2\u00a8\u00a9\7\7\2\2\u00a9\u00aa\b"+
		"\t\1\2\u00aa\21\3\2\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5\26\f\2\u00ad"+
		"\u00b4\b\n\1\2\u00ae\u00af\7\b\2\2\u00af\u00b0\5\26\f\2\u00b0\u00b1\b"+
		"\n\1\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00b9\b\n\1\2\u00b9\u0102\3\2\2\2\u00ba"+
		"\u00bb\7\23\2\2\u00bb\u00c0\5\26\f\2\u00bc\u00bd\7\b\2\2\u00bd\u00bf\5"+
		"\26\f\2\u00be\u00bc\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\7\7"+
		"\2\2\u00c4\u00c5\b\n\1\2\u00c5\u0102\3\2\2\2\u00c6\u00c7\5\26\f\2\u00c7"+
		"\u00c8\7\24\2\2\u00c8\u00c9\5\26\f\2\u00c9\u00ca\7\7\2\2\u00ca\u00cb\b"+
		"\n\1\2\u00cb\u0102\3\2\2\2\u00cc\u00d0\7\25\2\2\u00cd\u00ce\5\26\f\2\u00ce"+
		"\u00cf\b\n\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\7\t\2\2\u00d5\u00da\5\24\13\2\u00d6\u00d7\7\26\2\2\u00d7\u00d8"+
		"\5\24\13\2\u00d8\u00d9\b\n\1\2\u00d9\u00db\3\2\2\2\u00da\u00d6\3\2\2\2"+
		"\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\n\1\2\u00dd\u0102"+
		"\3\2\2\2\u00de\u00e2\7\27\2\2\u00df\u00e0\5\26\f\2\u00e0\u00e1\b\n\1\2"+
		"\u00e1\u00e3\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\7\t\2\2\u00e7"+
		"\u00e8\5\24\13\2\u00e8\u00e9\b\n\1\2\u00e9\u0102\3\2\2\2\u00ea\u00eb\7"+
		"(\2\2\u00eb\u00f7\7\20\2\2\u00ec\u00ed\5\26\f\2\u00ed\u00f4\b\n\1\2\u00ee"+
		"\u00ef\7\b\2\2\u00ef\u00f0\5\26\f\2\u00f0\u00f1\b\n\1\2\u00f1\u00f3\3"+
		"\2\2\2\u00f2\u00ee\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00ec\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\21\2\2\u00fa"+
		"\u00fb\7\7\2\2\u00fb\u0102\b\n\1\2\u00fc\u00fd\7\30\2\2\u00fd\u00fe\5"+
		"\26\f\2\u00fe\u00ff\7\7\2\2\u00ff\u0100\b\n\1\2\u0100\u0102\3\2\2\2\u0101"+
		"\u00ab\3\2\2\2\u0101\u00ba\3\2\2\2\u0101\u00c6\3\2\2\2\u0101\u00cc\3\2"+
		"\2\2\u0101\u00de\3\2\2\2\u0101\u00ea\3\2\2\2\u0101\u00fc\3\2\2\2\u0102"+
		"\23\3\2\2\2\u0103\u0104\5\22\n\2\u0104\u0105\b\13\1\2\u0105\u0111\3\2"+
		"\2\2\u0106\u010a\7\5\2\2\u0107\u0108\5\22\n\2\u0108\u0109\b\13\1\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010a\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7\6\2\2\u010f"+
		"\u0111\3\2\2\2\u0110\u0103\3\2\2\2\u0110\u0106\3\2\2\2\u0111\25\3\2\2"+
		"\2\u0112\u0113\b\f\1\2\u0113\u0114\7(\2\2\u0114\u0120\7\20\2\2\u0115\u0116"+
		"\5\26\f\2\u0116\u011d\b\f\1\2\u0117\u0118\7\b\2\2\u0118\u0119\5\26\f\2"+
		"\u0119\u011a\b\f\1\2\u011a\u011c\3\2\2\2\u011b\u0117\3\2\2\2\u011c\u011f"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u0121\3\2\2\2\u011f"+
		"\u011d\3\2\2\2\u0120\u0115\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\u0123\7\21\2\2\u0123\u0140\b\f\1\2\u0124\u0125\7\20\2\2\u0125"+
		"\u0126\5\26\f\2\u0126\u0127\7\21\2\2\u0127\u0128\b\f\1\2\u0128\u0140\3"+
		"\2\2\2\u0129\u012a\7\20\2\2\u012a\u012b\5\16\b\2\u012b\u012c\7\21\2\2"+
		"\u012c\u012d\5\26\f\r\u012d\u012e\b\f\1\2\u012e\u0140\3\2\2\2\u012f\u0130"+
		"\7\32\2\2\u0130\u0131\5\26\f\f\u0131\u0132\b\f\1\2\u0132\u0140\3\2\2\2"+
		"\u0133\u0134\7\33\2\2\u0134\u0135\5\26\f\13\u0135\u0136\b\f\1\2\u0136"+
		"\u0140\3\2\2\2\u0137\u0138\7(\2\2\u0138\u0140\b\f\1\2\u0139\u013a\7+\2"+
		"\2\u013a\u0140\b\f\1\2\u013b\u013c\7*\2\2\u013c\u0140\b\f\1\2\u013d\u013e"+
		"\7)\2\2\u013e\u0140\b\f\1\2\u013f\u0112\3\2\2\2\u013f\u0124\3\2\2\2\u013f"+
		"\u0129\3\2\2\2\u013f\u012f\3\2\2\2\u013f\u0133\3\2\2\2\u013f\u0137\3\2"+
		"\2\2\u013f\u0139\3\2\2\2\u013f\u013b\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0161\3\2\2\2\u0141\u0142\f\n\2\2\u0142\u0143\t\2\2\2\u0143\u0144\5\26"+
		"\f\13\u0144\u0145\b\f\1\2\u0145\u0160\3\2\2\2\u0146\u0147\f\t\2\2\u0147"+
		"\u0148\t\3\2\2\u0148\u0149\5\26\f\n\u0149\u014a\b\f\1\2\u014a\u0160\3"+
		"\2\2\2\u014b\u014c\f\b\2\2\u014c\u014d\t\4\2\2\u014d\u014e\5\26\f\t\u014e"+
		"\u014f\b\f\1\2\u014f\u0160\3\2\2\2\u0150\u0151\f\7\2\2\u0151\u0152\t\5"+
		"\2\2\u0152\u0153\5\26\f\b\u0153\u0154\b\f\1\2\u0154\u0160\3\2\2\2\u0155"+
		"\u0156\f\17\2\2\u0156\u0157\7\r\2\2\u0157\u0158\5\26\f\2\u0158\u0159\7"+
		"\16\2\2\u0159\u015a\b\f\1\2\u015a\u0160\3\2\2\2\u015b\u015c\f\16\2\2\u015c"+
		"\u015d\7\31\2\2\u015d\u015e\7(\2\2\u015e\u0160\b\f\1\2\u015f\u0141\3\2"+
		"\2\2\u015f\u0146\3\2\2\2\u015f\u014b\3\2\2\2\u015f\u0150\3\2\2\2\u015f"+
		"\u0155\3\2\2\2\u015f\u015b\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2"+
		"\2\2\u0161\u0162\3\2\2\2\u0162\27\3\2\2\2\u0163\u0161\3\2\2\2\36\35*\65"+
		"=LTe\177\u008d\u0090\u0097\u009a\u00a3\u00b4\u00c0\u00d2\u00da\u00e4\u00f4"+
		"\u00f7\u0101\u010c\u0110\u011d\u0120\u013f\u015f\u0161";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}