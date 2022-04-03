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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		ID=39, INT_CONSTANT=40, CHAR_CONSTANT=41, REAL_CONSTANT=42, ONELINECOMMENT=43, 
		MULTIPLELINECOMMENT=44, THRASH=45;
	public static final int
		RULE_program = 0, RULE_definitions = 1, RULE_mainFunc = 2, RULE_funcDef = 3, 
		RULE_funcVarList = 4, RULE_funcVar = 5, RULE_varDef = 6, RULE_varDec = 7, 
		RULE_type = 8, RULE_recordFields = 9, RULE_statement = 10, RULE_body = 11, 
		RULE_expression = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "definitions", "mainFunc", "funcDef", "funcVarList", "funcVar", 
			"varDef", "varDec", "type", "recordFields", "statement", "body", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'def'", "'main'", "'():'", "'{'", "'}'", "'('", "')'", "':'", 
			"','", "';'", "'double'", "'char'", "'int'", "'['", "']'", "'struct'", 
			"'print'", "'input'", "'='", "'if'", "'else'", "'while'", "'return'", 
			"'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'>'", "'>='", "'<'", 
			"'<='", "'!='", "'=='", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
			"ONELINECOMMENT", "MULTIPLELINECOMMENT", "THRASH"
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
			setState(31);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(26);
					((ProgramContext)_localctx).definitions = definitions();
					_localctx.def.addAll(((ProgramContext)_localctx).definitions.ast);
					}
					} 
				}
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(34);
			((ProgramContext)_localctx).mainFunc = mainFunc();
			_localctx.def.add(((ProgramContext)_localctx).mainFunc.ast);
			((ProgramContext)_localctx).ast =  new Program(0,0,_localctx.def);
			setState(37);
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
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((DefinitionsContext)_localctx).funcDef = funcDef();
				_localctx.ast.add(((DefinitionsContext)_localctx).funcDef.ast);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
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
		public VarDefContext varDef;
		public StatementContext statement;
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
			setState(47);
			((MainFuncContext)_localctx).DEF = match(T__0);
			setState(48);
			((MainFuncContext)_localctx).MAIN = match(T__1);
			setState(49);
			match(T__2);
			setState(50);
			match(T__3);
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(51);
					((MainFuncContext)_localctx).varDef = varDef();
					_localctx.varDecs.addAll(((MainFuncContext)_localctx).varDef.ast);
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(59);
				((MainFuncContext)_localctx).statement = statement();
				_localctx.statements.add(((MainFuncContext)_localctx).statement.ast);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			match(T__4);
			((MainFuncContext)_localctx).ast =  new FuncDefinition(
			        (((MainFuncContext)_localctx).MAIN!=null?((MainFuncContext)_localctx).MAIN.getText():null),
			        ((MainFuncContext)_localctx).DEF.getLine(),
			        ((MainFuncContext)_localctx).DEF.getCharPositionInLine() + 1,
			        new FunctionType(((MainFuncContext)_localctx).DEF.getLine(), ((MainFuncContext)_localctx).DEF.getCharPositionInLine() + 1, new ArrayList<VarDefinition>(), new VoidType()),
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
		public Type ret = new VoidType();
		public Token DEF;
		public Token ID;
		public FuncVarListContext funcVarList;
		public TypeContext type;
		public VarDefContext varDef;
		public StatementContext statement;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public FuncVarListContext funcVarList() {
			return getRuleContext(FuncVarListContext.class,0);
		}
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
			setState(70);
			((FuncDefContext)_localctx).DEF = match(T__0);
			setState(71);
			((FuncDefContext)_localctx).ID = match(ID);
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(72);
				match(T__5);
				setState(73);
				((FuncDefContext)_localctx).funcVarList = funcVarList();
				setState(74);
				match(T__6);
				setState(75);
				match(T__7);
				}
				break;
			case T__2:
				{
				setState(77);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15))) != 0)) {
				{
				setState(80);
				((FuncDefContext)_localctx).type = type();
				((FuncDefContext)_localctx).ret = ((FuncDefContext)_localctx).type.ast;
				}
			}

			setState(85);
			match(T__3);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					((FuncDefContext)_localctx).varDef = varDef();
					_localctx.varDecs.addAll(((FuncDefContext)_localctx).varDef.ast);
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(94);
				((FuncDefContext)_localctx).statement = statement();
				_localctx.statements.add(((FuncDefContext)_localctx).statement.ast);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			match(T__4);
			((FuncDefContext)_localctx).ast =  new FuncDefinition(
			        (((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),
			        ((FuncDefContext)_localctx).DEF.getLine(),
			        ((FuncDefContext)_localctx).DEF.getCharPositionInLine() + 1,
			        new FunctionType(((FuncDefContext)_localctx).DEF.getLine(), ((FuncDefContext)_localctx).DEF.getCharPositionInLine() + 1, ((FuncDefContext)_localctx).funcVarList.ast, _localctx.ret),
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

	public static class FuncVarListContext extends ParserRuleContext {
		public List<VarDefinition> ast = new ArrayList<VarDefinition>();
		public FuncVarContext f1;
		public FuncVarContext fn;
		public List<FuncVarContext> funcVar() {
			return getRuleContexts(FuncVarContext.class);
		}
		public FuncVarContext funcVar(int i) {
			return getRuleContext(FuncVarContext.class,i);
		}
		public FuncVarListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcVarList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncVarList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncVarListContext funcVarList() throws RecognitionException {
		FuncVarListContext _localctx = new FuncVarListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_funcVarList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(105);
				((FuncVarListContext)_localctx).f1 = funcVar();
				_localctx.ast.add(((FuncVarListContext)_localctx).f1.ast);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(107);
					match(T__8);
					setState(108);
					((FuncVarListContext)_localctx).fn = funcVar();
					_localctx.ast.add(((FuncVarListContext)_localctx).fn.ast);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class FuncVarContext extends ParserRuleContext {
		public VarDefinition ast;
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FuncVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcVar; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmmVisitor ) return ((PmmVisitor<? extends T>)visitor).visitFuncVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncVarContext funcVar() throws RecognitionException {
		FuncVarContext _localctx = new FuncVarContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((FuncVarContext)_localctx).ID = match(ID);
			setState(119);
			match(T__7);
			setState(120);
			((FuncVarContext)_localctx).type = type();
			((FuncVarContext)_localctx).ast =  new VarDefinition(
			         ((FuncVarContext)_localctx).ID.getLine(),
			         ((FuncVarContext)_localctx).ID.getCharPositionInLine() + 1,
			         (((FuncVarContext)_localctx).ID!=null?((FuncVarContext)_localctx).ID.getText():null)
			     ); _localctx.ast.setType(((FuncVarContext)_localctx).type.ast);
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
		enterRule(_localctx, 12, RULE_varDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((VarDefContext)_localctx).varDec = varDec();

			    for(VarDefinition def: ((VarDefContext)_localctx).varDec.ast){
			        if(_localctx.ast.contains(def)){
			            new ErrorType(def.getLine(),def.getColumn(), "Error: variable duplicada");
			        } else {
			            _localctx.ast.add(def);
			        }
			    };
			setState(125);
			match(T__9);
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
		enterRule(_localctx, 14, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((VarDecContext)_localctx).ID1 = match(ID);
			 _localctx.ast.add(
			    new VarDefinition(
			            ((VarDecContext)_localctx).ID1.getLine(),
			            ((VarDecContext)_localctx).ID1.getCharPositionInLine() + 1,
			            (((VarDecContext)_localctx).ID1!=null?((VarDecContext)_localctx).ID1.getText():null)
			        )
			    );
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(129);
				match(T__8);
				setState(130);
				((VarDecContext)_localctx).IDN = match(ID);
				_localctx.ast.add( new VarDefinition(((VarDecContext)_localctx).IDN.getLine(),((VarDecContext)_localctx).IDN.getCharPositionInLine() + 1, (((VarDecContext)_localctx).IDN!=null?((VarDecContext)_localctx).IDN.getText():null)));
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(137);
			match(T__7);
			setState(138);
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
		public Token DOUBLE;
		public Token CHAR;
		public Token INT;
		public Token INT_CONSTANT;
		public TypeContext tipo;
		public Token ST;
		public RecordFieldsContext recordFields;
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
		enterRule(_localctx, 16, RULE_type);
		int _la;
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				((TypeContext)_localctx).DOUBLE = match(T__10);
				 ((TypeContext)_localctx).ast =  _localctx.doub;
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				((TypeContext)_localctx).CHAR = match(T__11);
				 ((TypeContext)_localctx).ast =  _localctx.character;
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				((TypeContext)_localctx).INT = match(T__12);
				 ((TypeContext)_localctx).ast =  _localctx.integer;
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__13);
				setState(148);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(149);
				match(T__14);
				setState(150);
				((TypeContext)_localctx).tipo = type();
				 ((TypeContext)_localctx).ast =  new Array(
				        ((TypeContext)_localctx).INT_CONSTANT.getLine(),
				        ((TypeContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1,
				        ((TypeContext)_localctx).tipo.ast,
				        LexerHelper.lexemeToInt((((TypeContext)_localctx).INT_CONSTANT!=null?((TypeContext)_localctx).INT_CONSTANT.getText():null))
				    );
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				((TypeContext)_localctx).ST = match(T__15);
				setState(154);
				match(T__3);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					((TypeContext)_localctx).recordFields = recordFields();

					        for(RecordField r: ((TypeContext)_localctx).recordFields.ast){
					            if(_localctx.records.contains(r)){
					                new ErrorType(((TypeContext)_localctx).ST.getLine(),((TypeContext)_localctx).ST.getCharPositionInLine() + 1, "Error: Campo duplicado");
					            }
					            else{
					                _localctx.records.add(r);
					            }
					        };
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(162);
				match(T__4);
				 ((TypeContext)_localctx).ast =  new Struct(
				        ((TypeContext)_localctx).ST.getLine(),
				        ((TypeContext)_localctx).ST.getCharPositionInLine() + 1,
				        _localctx.records
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
		enterRule(_localctx, 18, RULE_recordFields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((RecordFieldsContext)_localctx).ID1 = match(ID);
			_localctx.ast.add(new RecordField((((RecordFieldsContext)_localctx).ID1!=null?((RecordFieldsContext)_localctx).ID1.getText():null),((RecordFieldsContext)_localctx).ID1.getLine(), ((RecordFieldsContext)_localctx).ID1.getCharPositionInLine() + 1));
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(169);
				match(T__8);
				setState(170);
				((RecordFieldsContext)_localctx).IDN = match(ID);
				_localctx.ast.add(new RecordField((((RecordFieldsContext)_localctx).IDN!=null?((RecordFieldsContext)_localctx).IDN.getText():null), ((RecordFieldsContext)_localctx).IDN.getLine(), ((RecordFieldsContext)_localctx).IDN.getCharPositionInLine() + 1));
				}
				}
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(177);
			match(T__7);
			setState(178);
			((RecordFieldsContext)_localctx).type = type();
			setState(179);
			match(T__9);
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
		enterRule(_localctx, 20, RULE_statement);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				((StatementContext)_localctx).PRINT = match(T__16);
				{
				setState(183);
				((StatementContext)_localctx).exp1 = expression(0);
				_localctx.aux.add(((StatementContext)_localctx).exp1.ast);
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(185);
					match(T__8);
					setState(186);
					((StatementContext)_localctx).expN = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).expN.ast);
					}
					}
					setState(193);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(194);
				match(T__9);
				((StatementContext)_localctx).ast =  new Print(((StatementContext)_localctx).PRINT.getLine(),((StatementContext)_localctx).PRINT.getCharPositionInLine() + 1, _localctx.aux);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				((StatementContext)_localctx).INPUT = match(T__17);
				{
				setState(198);
				((StatementContext)_localctx).exp1 = expression(0);
				_localctx.aux.add(((StatementContext)_localctx).exp1.ast);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(200);
					match(T__8);
					setState(201);
					((StatementContext)_localctx).expN = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).expN.ast);
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(209);
				match(T__9);
				((StatementContext)_localctx).ast =  new Input(((StatementContext)_localctx).INPUT.getLine(),((StatementContext)_localctx).INPUT.getCharPositionInLine() + 1, _localctx.aux);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				((StatementContext)_localctx).left = expression(0);
				setState(213);
				match(T__18);
				setState(214);
				((StatementContext)_localctx).right = expression(0);
				setState(215);
				match(T__9);
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
				setState(218);
				((StatementContext)_localctx).IF = match(T__19);
				setState(220); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(219);
					((StatementContext)_localctx).expr = expression(0);
					}
					}
					setState(222); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(224);
				match(T__7);
				setState(225);
				((StatementContext)_localctx).ifBody = body();
				setState(230);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(226);
					match(T__20);
					setState(227);
					((StatementContext)_localctx).elseBody = body();
					_localctx.elseBod.addAll(((StatementContext)_localctx).elseBody.ast);
					}
					break;
				}
				 ((StatementContext)_localctx).ast =  new IfElse(
				        ((StatementContext)_localctx).IF.getLine(),
				        ((StatementContext)_localctx).IF.getCharPositionInLine() + 1,
				        ((StatementContext)_localctx).expr.ast,
				        ((StatementContext)_localctx).ifBody.ast,
				        _localctx.elseBod
				    );
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(234);
				((StatementContext)_localctx).WHILE = match(T__21);
				setState(236); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(235);
					((StatementContext)_localctx).expr = expression(0);
					}
					}
					setState(238); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(240);
				match(T__7);
				setState(241);
				((StatementContext)_localctx).body = body();
				 ((StatementContext)_localctx).ast =  new While(
				        ((StatementContext)_localctx).WHILE.getLine(),
				        ((StatementContext)_localctx).WHILE.getCharPositionInLine() + 1,
				        ((StatementContext)_localctx).expr.ast,
				        ((StatementContext)_localctx).body.ast
				    );
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(244);
				((StatementContext)_localctx).ID = match(ID);
				setState(245);
				match(T__5);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(246);
					((StatementContext)_localctx).exp1 = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).exp1.ast);
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(248);
						match(T__8);
						setState(249);
						((StatementContext)_localctx).expN = expression(0);
						_localctx.aux.add(((StatementContext)_localctx).expN.ast);
						}
						}
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(259);
				match(T__6);
				setState(260);
				match(T__9);
				((StatementContext)_localctx).ast =  new Function(
				        ((StatementContext)_localctx).ID.getLine(),
				        ((StatementContext)_localctx).ID.getCharPositionInLine() + 1,
				        new Variable((((StatementContext)_localctx).ID!=null?((StatementContext)_localctx).ID.getText():null), ((StatementContext)_localctx).ID.getLine(), ((StatementContext)_localctx).ID.getCharPositionInLine() + 1),
				        _localctx.aux
				    );
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				((StatementContext)_localctx).RET = match(T__22);
				setState(263);
				((StatementContext)_localctx).exp = expression(0);
				setState(264);
				match(T__9);
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
		enterRule(_localctx, 22, RULE_body);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__16:
			case T__17:
			case T__19:
			case T__21:
			case T__22:
			case T__24:
			case T__25:
			case ID:
			case INT_CONSTANT:
			case CHAR_CONSTANT:
			case REAL_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				((BodyContext)_localctx).statement = statement();
				_localctx.ast.add(((BodyContext)_localctx).statement.ast);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(T__3);
				setState(276); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(273);
					((BodyContext)_localctx).statement = statement();
					_localctx.ast.add(((BodyContext)_localctx).statement.ast); 
					}
					}
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(280);
				match(T__4);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(285);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(286);
				match(T__5);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(287);
					((ExpressionContext)_localctx).exp1 = ((ExpressionContext)_localctx).expression = expression(0);
					_localctx.args.add(((ExpressionContext)_localctx).exp1.ast);
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(289);
						match(T__8);
						setState(290);
						((ExpressionContext)_localctx).expN = ((ExpressionContext)_localctx).expression = expression(0);
						_localctx.args.add(((ExpressionContext)_localctx).expN.ast);
						}
						}
						setState(297);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(300);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  new Function(
				        ((ExpressionContext)_localctx).ID.getLine(),
				        ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
				        new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1),
				        _localctx.args
				    );
				}
				break;
			case 2:
				{
				setState(302);
				match(T__5);
				setState(303);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(304);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 3:
				{
				setState(307);
				match(T__5);
				setState(308);
				((ExpressionContext)_localctx).tipo = type();
				setState(309);
				match(T__6);
				setState(310);
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
				setState(313);
				match(T__24);
				setState(314);
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
				setState(317);
				match(T__25);
				setState(318);
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
				setState(321);
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
				setState(323);
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
				setState(325);
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
				setState(327);
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
			setState(363);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(361);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(331);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(332);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
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
						setState(336);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(337);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__29) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(338);
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
						setState(341);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(342);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(343);
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
						setState(346);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(347);
						((ExpressionContext)_localctx).OP = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((ExpressionContext)_localctx).OP = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(348);
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
						setState(351);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(352);
						match(T__13);
						setState(353);
						((ExpressionContext)_localctx).inBrackets = ((ExpressionContext)_localctx).expression = expression(0);
						setState(354);
						match(T__14);
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
						setState(357);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(358);
						match(T__23);
						setState(359);
						((ExpressionContext)_localctx).ID = match(ID);
						 ((ExpressionContext)_localctx).ast =  new Point(
						                  ((ExpressionContext)_localctx).exp.ast,
						                  (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
						                  ((ExpressionContext)_localctx).exp.ast.getLine(),
						                  ((ExpressionContext)_localctx).exp.ast.getColumn()
						              );
						}
						break;
					}
					} 
				}
				setState(365);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u0171\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\3\4\7\4A\n\4\f\4\16\4D\13\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\5\3\5\3\5\5\5"+
		"V\n\5\3\5\3\5\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\3\5\3\5\7\5d\n\5\f"+
		"\5\16\5g\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6r\n\6\f\6\16\6u\13"+
		"\6\5\6w\n\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\7"+
		"\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00a1\n\n\r\n\16\n"+
		"\u00a2\3\n\3\n\3\n\5\n\u00a8\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u00af\n"+
		"\13\f\13\16\13\u00b2\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00c0\n\f\f\f\16\f\u00c3\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00cf\n\f\f\f\16\f\u00d2\13\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\6\f\u00df\n\f\r\f\16\f\u00e0\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00e9\n\f\3\f\3\f\3\f\3\f\6\f\u00ef\n\f\r\f\16\f\u00f0\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ff\n\f\f\f\16\f\u0102"+
		"\13\f\5\f\u0104\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u010e\n\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0117\n\r\r\r\16\r\u0118\3\r\3\r\5\r\u011d"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0128\n\16\f\16"+
		"\16\16\u012b\13\16\5\16\u012d\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u014c\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u016c\n\16\f\16\16\16\u016f\13\16\3\16\2\3\32\17\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\2\6\3\2\35\37\4\2\33\33  \3\2!&\3\2\'(\2\u0193\2!\3\2\2\2"+
		"\4/\3\2\2\2\6\61\3\2\2\2\bH\3\2\2\2\nv\3\2\2\2\fx\3\2\2\2\16}\3\2\2\2"+
		"\20\u0081\3\2\2\2\22\u00a7\3\2\2\2\24\u00a9\3\2\2\2\26\u010d\3\2\2\2\30"+
		"\u011c\3\2\2\2\32\u014b\3\2\2\2\34\35\5\4\3\2\35\36\b\2\1\2\36 \3\2\2"+
		"\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2"+
		"$%\5\6\4\2%&\b\2\1\2&\'\b\2\1\2\'(\7\2\2\3(\3\3\2\2\2)*\5\b\5\2*+\b\3"+
		"\1\2+\60\3\2\2\2,-\5\16\b\2-.\b\3\1\2.\60\3\2\2\2/)\3\2\2\2/,\3\2\2\2"+
		"\60\5\3\2\2\2\61\62\7\3\2\2\62\63\7\4\2\2\63\64\7\5\2\2\64:\7\6\2\2\65"+
		"\66\5\16\b\2\66\67\b\4\1\2\679\3\2\2\28\65\3\2\2\29<\3\2\2\2:8\3\2\2\2"+
		":;\3\2\2\2;B\3\2\2\2<:\3\2\2\2=>\5\26\f\2>?\b\4\1\2?A\3\2\2\2@=\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2EF\7\7\2\2FG\b\4\1"+
		"\2G\7\3\2\2\2HI\7\3\2\2IP\7)\2\2JK\7\b\2\2KL\5\n\6\2LM\7\t\2\2MN\7\n\2"+
		"\2NQ\3\2\2\2OQ\7\5\2\2PJ\3\2\2\2PO\3\2\2\2QU\3\2\2\2RS\5\22\n\2ST\b\5"+
		"\1\2TV\3\2\2\2UR\3\2\2\2UV\3\2\2\2VW\3\2\2\2W]\7\6\2\2XY\5\16\b\2YZ\b"+
		"\5\1\2Z\\\3\2\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^e\3\2\2\2_"+
		"]\3\2\2\2`a\5\26\f\2ab\b\5\1\2bd\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2"+
		"ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7\7\2\2ij\b\5\1\2j\t\3\2\2\2kl\5\f\7"+
		"\2ls\b\6\1\2mn\7\13\2\2no\5\f\7\2op\b\6\1\2pr\3\2\2\2qm\3\2\2\2ru\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2tw\3\2\2\2us\3\2\2\2vk\3\2\2\2vw\3\2\2\2w\13\3"+
		"\2\2\2xy\7)\2\2yz\7\n\2\2z{\5\22\n\2{|\b\7\1\2|\r\3\2\2\2}~\5\20\t\2~"+
		"\177\b\b\1\2\177\u0080\7\f\2\2\u0080\17\3\2\2\2\u0081\u0082\7)\2\2\u0082"+
		"\u0088\b\t\1\2\u0083\u0084\7\13\2\2\u0084\u0085\7)\2\2\u0085\u0087\b\t"+
		"\1\2\u0086\u0083\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\n"+
		"\2\2\u008c\u008d\5\22\n\2\u008d\u008e\b\t\1\2\u008e\21\3\2\2\2\u008f\u0090"+
		"\7\r\2\2\u0090\u00a8\b\n\1\2\u0091\u0092\7\16\2\2\u0092\u00a8\b\n\1\2"+
		"\u0093\u0094\7\17\2\2\u0094\u00a8\b\n\1\2\u0095\u0096\7\20\2\2\u0096\u0097"+
		"\7*\2\2\u0097\u0098\7\21\2\2\u0098\u0099\5\22\n\2\u0099\u009a\b\n\1\2"+
		"\u009a\u00a8\3\2\2\2\u009b\u009c\7\22\2\2\u009c\u00a0\7\6\2\2\u009d\u009e"+
		"\5\24\13\2\u009e\u009f\b\n\1\2\u009f\u00a1\3\2\2\2\u00a0\u009d\3\2\2\2"+
		"\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\b\n\1\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u008f\3\2\2\2\u00a7\u0091\3\2\2\2\u00a7\u0093\3\2\2\2\u00a7\u0095\3\2"+
		"\2\2\u00a7\u009b\3\2\2\2\u00a8\23\3\2\2\2\u00a9\u00aa\7)\2\2\u00aa\u00b0"+
		"\b\13\1\2\u00ab\u00ac\7\13\2\2\u00ac\u00ad\7)\2\2\u00ad\u00af\b\13\1\2"+
		"\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\n\2\2\u00b4"+
		"\u00b5\5\22\n\2\u00b5\u00b6\7\f\2\2\u00b6\u00b7\b\13\1\2\u00b7\25\3\2"+
		"\2\2\u00b8\u00b9\7\23\2\2\u00b9\u00ba\5\32\16\2\u00ba\u00c1\b\f\1\2\u00bb"+
		"\u00bc\7\13\2\2\u00bc\u00bd\5\32\16\2\u00bd\u00be\b\f\1\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\f"+
		"\2\2\u00c5\u00c6\b\f\1\2\u00c6\u010e\3\2\2\2\u00c7\u00c8\7\24\2\2\u00c8"+
		"\u00c9\5\32\16\2\u00c9\u00d0\b\f\1\2\u00ca\u00cb\7\13\2\2\u00cb\u00cc"+
		"\5\32\16\2\u00cc\u00cd\b\f\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00ca\3\2\2\2"+
		"\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d3"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\7\f\2\2\u00d4\u00d5\b\f\1\2\u00d5"+
		"\u010e\3\2\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00d8\7\25\2\2\u00d8\u00d9"+
		"\5\32\16\2\u00d9\u00da\7\f\2\2\u00da\u00db\b\f\1\2\u00db\u010e\3\2\2\2"+
		"\u00dc\u00de\7\26\2\2\u00dd\u00df\5\32\16\2\u00de\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e3\7\n\2\2\u00e3\u00e8\5\30\r\2\u00e4\u00e5\7\27\2\2\u00e5"+
		"\u00e6\5\30\r\2\u00e6\u00e7\b\f\1\2\u00e7\u00e9\3\2\2\2\u00e8\u00e4\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\b\f\1\2\u00eb"+
		"\u010e\3\2\2\2\u00ec\u00ee\7\30\2\2\u00ed\u00ef\5\32\16\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\7\n\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5\b"+
		"\f\1\2\u00f5\u010e\3\2\2\2\u00f6\u00f7\7)\2\2\u00f7\u0103\7\b\2\2\u00f8"+
		"\u00f9\5\32\16\2\u00f9\u0100\b\f\1\2\u00fa\u00fb\7\13\2\2\u00fb\u00fc"+
		"\5\32\16\2\u00fc\u00fd\b\f\1\2\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3\2\2\2"+
		"\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0104"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u00f8\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0106\7\t\2\2\u0106\u0107\7\f\2\2\u0107\u010e\b\f"+
		"\1\2\u0108\u0109\7\31\2\2\u0109\u010a\5\32\16\2\u010a\u010b\7\f\2\2\u010b"+
		"\u010c\b\f\1\2\u010c\u010e\3\2\2\2\u010d\u00b8\3\2\2\2\u010d\u00c7\3\2"+
		"\2\2\u010d\u00d6\3\2\2\2\u010d\u00dc\3\2\2\2\u010d\u00ec\3\2\2\2\u010d"+
		"\u00f6\3\2\2\2\u010d\u0108\3\2\2\2\u010e\27\3\2\2\2\u010f\u0110\5\26\f"+
		"\2\u0110\u0111\b\r\1\2\u0111\u011d\3\2\2\2\u0112\u0116\7\6\2\2\u0113\u0114"+
		"\5\26\f\2\u0114\u0115\b\r\1\2\u0115\u0117\3\2\2\2\u0116\u0113\3\2\2\2"+
		"\u0117\u0118\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011b\7\7\2\2\u011b\u011d\3\2\2\2\u011c\u010f\3\2\2\2\u011c"+
		"\u0112\3\2\2\2\u011d\31\3\2\2\2\u011e\u011f\b\16\1\2\u011f\u0120\7)\2"+
		"\2\u0120\u012c\7\b\2\2\u0121\u0122\5\32\16\2\u0122\u0129\b\16\1\2\u0123"+
		"\u0124\7\13\2\2\u0124\u0125\5\32\16\2\u0125\u0126\b\16\1\2\u0126\u0128"+
		"\3\2\2\2\u0127\u0123\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u0121\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\t\2\2\u012f"+
		"\u014c\b\16\1\2\u0130\u0131\7\b\2\2\u0131\u0132\5\32\16\2\u0132\u0133"+
		"\7\t\2\2\u0133\u0134\b\16\1\2\u0134\u014c\3\2\2\2\u0135\u0136\7\b\2\2"+
		"\u0136\u0137\5\22\n\2\u0137\u0138\7\t\2\2\u0138\u0139\5\32\16\r\u0139"+
		"\u013a\b\16\1\2\u013a\u014c\3\2\2\2\u013b\u013c\7\33\2\2\u013c\u013d\5"+
		"\32\16\f\u013d\u013e\b\16\1\2\u013e\u014c\3\2\2\2\u013f\u0140\7\34\2\2"+
		"\u0140\u0141\5\32\16\13\u0141\u0142\b\16\1\2\u0142\u014c\3\2\2\2\u0143"+
		"\u0144\7)\2\2\u0144\u014c\b\16\1\2\u0145\u0146\7,\2\2\u0146\u014c\b\16"+
		"\1\2\u0147\u0148\7+\2\2\u0148\u014c\b\16\1\2\u0149\u014a\7*\2\2\u014a"+
		"\u014c\b\16\1\2\u014b\u011e\3\2\2\2\u014b\u0130\3\2\2\2\u014b\u0135\3"+
		"\2\2\2\u014b\u013b\3\2\2\2\u014b\u013f\3\2\2\2\u014b\u0143\3\2\2\2\u014b"+
		"\u0145\3\2\2\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u016d\3\2"+
		"\2\2\u014d\u014e\f\n\2\2\u014e\u014f\t\2\2\2\u014f\u0150\5\32\16\13\u0150"+
		"\u0151\b\16\1\2\u0151\u016c\3\2\2\2\u0152\u0153\f\t\2\2\u0153\u0154\t"+
		"\3\2\2\u0154\u0155\5\32\16\n\u0155\u0156\b\16\1\2\u0156\u016c\3\2\2\2"+
		"\u0157\u0158\f\b\2\2\u0158\u0159\t\4\2\2\u0159\u015a\5\32\16\t\u015a\u015b"+
		"\b\16\1\2\u015b\u016c\3\2\2\2\u015c\u015d\f\7\2\2\u015d\u015e\t\5\2\2"+
		"\u015e\u015f\5\32\16\b\u015f\u0160\b\16\1\2\u0160\u016c\3\2\2\2\u0161"+
		"\u0162\f\17\2\2\u0162\u0163\7\20\2\2\u0163\u0164\5\32\16\2\u0164\u0165"+
		"\7\21\2\2\u0165\u0166\b\16\1\2\u0166\u016c\3\2\2\2\u0167\u0168\f\16\2"+
		"\2\u0168\u0169\7\32\2\2\u0169\u016a\7)\2\2\u016a\u016c\b\16\1\2\u016b"+
		"\u014d\3\2\2\2\u016b\u0152\3\2\2\2\u016b\u0157\3\2\2\2\u016b\u015c\3\2"+
		"\2\2\u016b\u0161\3\2\2\2\u016b\u0167\3\2\2\2\u016c\u016f\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\33\3\2\2\2\u016f\u016d\3\2\2"+
		"\2\37!/:BPU]esv\u0088\u00a2\u00a7\u00b0\u00c1\u00d0\u00e0\u00e8\u00f0"+
		"\u0100\u0103\u010d\u0118\u011c\u0129\u012c\u014b\u016b\u016d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}