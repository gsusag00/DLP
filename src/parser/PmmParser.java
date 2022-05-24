// Generated from C:/Users/jesus/OneDrive/Escritorio/Workspaces/DLP/src/parser\Pmm.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, ID=40, INT_CONSTANT=41, CHAR_CONSTANT=42, REAL_CONSTANT=43, 
		ONELINECOMMENT=44, MULTIPLELINECOMMENT=45, THRASH=46;
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
			"'<='", "'!='", "'=='", "'&&'", "'||'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "INT_CONSTANT", "CHAR_CONSTANT", "REAL_CONSTANT", 
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
			        new FunctionType(((MainFuncContext)_localctx).DEF.getLine(), ((MainFuncContext)_localctx).DEF.getCharPositionInLine() + 1, new ArrayList<VarDefinition>(), VoidType.getInstance()),
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
		public List<VarDefinition> varList = new ArrayList<VarDefinition>();
		public List<Statement> statements = new ArrayList<Statement>();
		public Type ret = VoidType.getInstance();
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
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				{
				setState(72);
				match(T__5);
				setState(73);
				((FuncDefContext)_localctx).funcVarList = funcVarList();
				_localctx.varList.addAll(((FuncDefContext)_localctx).funcVarList.ast);
				setState(75);
				match(T__6);
				setState(76);
				match(T__7);
				}
				break;
			case T__2:
				{
				setState(78);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__15))) != 0)) {
				{
				setState(81);
				((FuncDefContext)_localctx).type = type();
				((FuncDefContext)_localctx).ret = ((FuncDefContext)_localctx).type.ast;
				}
			}

			setState(86);
			match(T__3);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					((FuncDefContext)_localctx).varDef = varDef();
					_localctx.varDecs.addAll(((FuncDefContext)_localctx).varDef.ast);
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
				{
				{
				setState(95);
				((FuncDefContext)_localctx).statement = statement();
				_localctx.statements.add(((FuncDefContext)_localctx).statement.ast);
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
			match(T__4);
			((FuncDefContext)_localctx).ast =  new FuncDefinition(
			        (((FuncDefContext)_localctx).ID!=null?((FuncDefContext)_localctx).ID.getText():null),
			        ((FuncDefContext)_localctx).DEF.getLine(),
			        ((FuncDefContext)_localctx).DEF.getCharPositionInLine() + 1,
			        new FunctionType(((FuncDefContext)_localctx).DEF.getLine(), ((FuncDefContext)_localctx).DEF.getCharPositionInLine() + 1, _localctx.varList, _localctx.ret),
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
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(106);
				((FuncVarListContext)_localctx).f1 = funcVar();
				_localctx.ast.add(((FuncVarListContext)_localctx).f1.ast);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(108);
					match(T__8);
					setState(109);
					((FuncVarListContext)_localctx).fn = funcVar();
					_localctx.ast.add(((FuncVarListContext)_localctx).fn.ast);
					}
					}
					setState(116);
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
			setState(119);
			((FuncVarContext)_localctx).ID = match(ID);
			setState(120);
			match(T__7);
			setState(121);
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
			setState(124);
			((VarDefContext)_localctx).varDec = varDec();

			    for(VarDefinition def: ((VarDefContext)_localctx).varDec.ast){
			        if(_localctx.ast.contains(def)){
			            new ErrorType(def.getLine(),def.getColumn(), "Error: variable duplicada");
			        } else {
			            _localctx.ast.add(def);
			        }
			    };
			setState(126);
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
			setState(128);
			((VarDecContext)_localctx).ID1 = match(ID);
			 _localctx.ast.add(
			    new VarDefinition(
			            ((VarDecContext)_localctx).ID1.getLine(),
			            ((VarDecContext)_localctx).ID1.getCharPositionInLine() + 1,
			            (((VarDecContext)_localctx).ID1!=null?((VarDecContext)_localctx).ID1.getText():null)
			        )
			    );
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(130);
				match(T__8);
				setState(131);
				((VarDecContext)_localctx).IDN = match(ID);
				_localctx.ast.add( new VarDefinition(((VarDecContext)_localctx).IDN.getLine(),((VarDecContext)_localctx).IDN.getCharPositionInLine() + 1, (((VarDecContext)_localctx).IDN!=null?((VarDecContext)_localctx).IDN.getText():null)));
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			match(T__7);
			setState(139);
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
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((TypeContext)_localctx).DOUBLE = match(T__10);
				 ((TypeContext)_localctx).ast =  Double.getInstance();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				((TypeContext)_localctx).CHAR = match(T__11);
				 ((TypeContext)_localctx).ast =  Character.getInstance();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				((TypeContext)_localctx).INT = match(T__12);
				 ((TypeContext)_localctx).ast =  Integer.getInstance();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				match(T__13);
				setState(149);
				((TypeContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(150);
				match(T__14);
				setState(151);
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
				setState(154);
				((TypeContext)_localctx).ST = match(T__15);
				setState(155);
				match(T__3);
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156);
					((TypeContext)_localctx).recordFields = recordFields();

					        for(RecordField r: ((TypeContext)_localctx).recordFields.ast){
					            if(_localctx.records.contains(r)){
					                new ErrorType(((TypeContext)_localctx).ST.getLine(),((TypeContext)_localctx).ST.getCharPositionInLine() + 1, String.format("Error: El campo %s ya existe en esta estructura", r.getName()));
					            }
					            else{
					                _localctx.records.add(r);
					            }
					        };
					}
					}
					setState(161); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(163);
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
			setState(168);
			((RecordFieldsContext)_localctx).ID1 = match(ID);
			_localctx.ast.add(new RecordField((((RecordFieldsContext)_localctx).ID1!=null?((RecordFieldsContext)_localctx).ID1.getText():null),((RecordFieldsContext)_localctx).ID1.getLine(), ((RecordFieldsContext)_localctx).ID1.getCharPositionInLine() + 1));
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(170);
				match(T__8);
				setState(171);
				((RecordFieldsContext)_localctx).IDN = match(ID);
				_localctx.ast.add(new RecordField((((RecordFieldsContext)_localctx).IDN!=null?((RecordFieldsContext)_localctx).IDN.getText():null), ((RecordFieldsContext)_localctx).IDN.getLine(), ((RecordFieldsContext)_localctx).IDN.getCharPositionInLine() + 1));
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			match(T__7);
			setState(179);
			((RecordFieldsContext)_localctx).type = type();
			setState(180);
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
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((StatementContext)_localctx).PRINT = match(T__16);
				{
				setState(184);
				((StatementContext)_localctx).exp1 = expression(0);
				_localctx.aux.add(((StatementContext)_localctx).exp1.ast);
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(186);
					match(T__8);
					setState(187);
					((StatementContext)_localctx).expN = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).expN.ast);
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(195);
				match(T__9);
				((StatementContext)_localctx).ast =  new Print(((StatementContext)_localctx).PRINT.getLine(),((StatementContext)_localctx).PRINT.getCharPositionInLine() + 1, _localctx.aux);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				((StatementContext)_localctx).INPUT = match(T__17);
				{
				setState(199);
				((StatementContext)_localctx).exp1 = expression(0);
				_localctx.aux.add(((StatementContext)_localctx).exp1.ast);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(201);
					match(T__8);
					setState(202);
					((StatementContext)_localctx).expN = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).expN.ast);
					}
					}
					setState(209);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(210);
				match(T__9);
				((StatementContext)_localctx).ast =  new Input(((StatementContext)_localctx).INPUT.getLine(),((StatementContext)_localctx).INPUT.getCharPositionInLine() + 1, _localctx.aux);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				((StatementContext)_localctx).left = expression(0);
				setState(214);
				match(T__18);
				setState(215);
				((StatementContext)_localctx).right = expression(0);
				setState(216);
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
				setState(219);
				((StatementContext)_localctx).IF = match(T__19);
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					((StatementContext)_localctx).expr = expression(0);
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(225);
				match(T__7);
				setState(226);
				((StatementContext)_localctx).ifBody = body();
				setState(231);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(227);
					match(T__20);
					setState(228);
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
				setState(235);
				((StatementContext)_localctx).WHILE = match(T__21);
				setState(237); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					((StatementContext)_localctx).expr = expression(0);
					}
					}
					setState(239); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(241);
				match(T__7);
				setState(242);
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
				setState(245);
				((StatementContext)_localctx).ID = match(ID);
				setState(246);
				match(T__5);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(247);
					((StatementContext)_localctx).exp1 = expression(0);
					_localctx.aux.add(((StatementContext)_localctx).exp1.ast);
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(249);
						match(T__8);
						setState(250);
						((StatementContext)_localctx).expN = expression(0);
						_localctx.aux.add(((StatementContext)_localctx).expN.ast);
						}
						}
						setState(257);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(260);
				match(T__6);
				setState(261);
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
				setState(263);
				((StatementContext)_localctx).RET = match(T__22);
				setState(264);
				((StatementContext)_localctx).exp = expression(0);
				setState(265);
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
			setState(283);
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
				setState(270);
				((BodyContext)_localctx).statement = statement();
				_localctx.ast.add(((BodyContext)_localctx).statement.ast);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(T__3);
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(274);
					((BodyContext)_localctx).statement = statement();
					_localctx.ast.add(((BodyContext)_localctx).statement.ast); 
					}
					}
					setState(279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__16) | (1L << T__17) | (1L << T__19) | (1L << T__21) | (1L << T__22) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0) );
				setState(281);
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
		public ExpressionContext cond;
		public Token ID;
		public Token REAL_CONSTANT;
		public Token CHAR_CONSTANT;
		public Token INT_CONSTANT;
		public ExpressionContext exp1;
		public ExpressionContext expression;
		public ExpressionContext expN;
		public TypeContext tipo;
		public Token OP;
		public ExpressionContext right;
		public ExpressionContext trueVal;
		public ExpressionContext falseVal;
		public ExpressionContext inBrackets;
		public TerminalNode ID() { return getToken(PmmParser.ID, 0); }
		public TerminalNode REAL_CONSTANT() { return getToken(PmmParser.REAL_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(PmmParser.CHAR_CONSTANT, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(PmmParser.INT_CONSTANT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(286);
				((ExpressionContext)_localctx).ID = match(ID);
				 ((ExpressionContext)_localctx).ast =  new Variable(
				        (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null),
				        ((ExpressionContext)_localctx).ID.getLine(),
				        ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1
				    ); 
				}
				break;
			case 2:
				{
				setState(288);
				((ExpressionContext)_localctx).REAL_CONSTANT = match(REAL_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new DoubleLiteral(
				        LexerHelper.lexemeToReal((((ExpressionContext)_localctx).REAL_CONSTANT!=null?((ExpressionContext)_localctx).REAL_CONSTANT.getText():null)),
				        ((ExpressionContext)_localctx).REAL_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).REAL_CONSTANT.getCharPositionInLine() + 1
				    );
				}
				break;
			case 3:
				{
				setState(290);
				((ExpressionContext)_localctx).CHAR_CONSTANT = match(CHAR_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new CharLiteral(
				        LexerHelper.lexemeToChar((((ExpressionContext)_localctx).CHAR_CONSTANT!=null?((ExpressionContext)_localctx).CHAR_CONSTANT.getText():null)),
				        ((ExpressionContext)_localctx).CHAR_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).CHAR_CONSTANT.getCharPositionInLine() + 1
				    );
				}
				break;
			case 4:
				{
				setState(292);
				((ExpressionContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				 ((ExpressionContext)_localctx).ast =  new IntLiteral(
				        LexerHelper.lexemeToInt((((ExpressionContext)_localctx).INT_CONSTANT!=null?((ExpressionContext)_localctx).INT_CONSTANT.getText():null)),
				        ((ExpressionContext)_localctx).INT_CONSTANT.getLine(),
				        ((ExpressionContext)_localctx).INT_CONSTANT.getCharPositionInLine() + 1
				    );
				}
				break;
			case 5:
				{
				setState(294);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(295);
				match(T__5);
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__24) | (1L << T__25) | (1L << ID) | (1L << INT_CONSTANT) | (1L << CHAR_CONSTANT) | (1L << REAL_CONSTANT))) != 0)) {
					{
					setState(296);
					((ExpressionContext)_localctx).exp1 = ((ExpressionContext)_localctx).expression = expression(0);
					_localctx.args.add(((ExpressionContext)_localctx).exp1.ast);
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(298);
						match(T__8);
						setState(299);
						((ExpressionContext)_localctx).expN = ((ExpressionContext)_localctx).expression = expression(0);
						_localctx.args.add(((ExpressionContext)_localctx).expN.ast);
						}
						}
						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(309);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  new Function(
				        ((ExpressionContext)_localctx).ID.getLine(),
				        ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1,
				        new Variable((((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null), ((ExpressionContext)_localctx).ID.getLine(), ((ExpressionContext)_localctx).ID.getCharPositionInLine() + 1),
				        _localctx.args
				    );
				}
				break;
			case 6:
				{
				setState(311);
				match(T__5);
				setState(312);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(313);
				match(T__6);
				 ((ExpressionContext)_localctx).ast =  ((ExpressionContext)_localctx).expression.ast;
				}
				break;
			case 7:
				{
				setState(316);
				match(T__5);
				setState(317);
				((ExpressionContext)_localctx).tipo = type();
				setState(318);
				match(T__6);
				setState(319);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(8);
				 ((ExpressionContext)_localctx).ast =  new Cast(
				        ((ExpressionContext)_localctx).tipo.ast,
				        ((ExpressionContext)_localctx).exp.ast,
				        ((ExpressionContext)_localctx).tipo.ast.getLine(),
				        ((ExpressionContext)_localctx).tipo.ast.getColumn()
				    );
				}
				break;
			case 8:
				{
				setState(322);
				match(T__24);
				setState(323);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(7);
				 ((ExpressionContext)_localctx).ast =  new UnaryMinus(
				        ((ExpressionContext)_localctx).exp.ast,
				        ((ExpressionContext)_localctx).exp.ast.getLine(),
				        ((ExpressionContext)_localctx).exp.ast.getColumn()
				    );
				}
				break;
			case 9:
				{
				setState(326);
				match(T__25);
				setState(327);
				((ExpressionContext)_localctx).exp = ((ExpressionContext)_localctx).expression = expression(6);
				 ((ExpressionContext)_localctx).ast =  new Not(
				        ((ExpressionContext)_localctx).exp.ast,
				        ((ExpressionContext)_localctx).exp.ast.getLine(),
				        ((ExpressionContext)_localctx).exp.ast.getColumn()
				    );
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(371);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(369);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(332);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(333);
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
						setState(334);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(6);
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
						setState(337);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(338);
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
						setState(339);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(5);
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
						setState(342);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(343);
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
						setState(344);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(4);
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
						setState(347);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(348);
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
						setState(349);
						((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).expression = expression(3);
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
						_localctx.cond = _prevctx;
						_localctx.cond = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(352);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(353);
						match(T__38);
						setState(354);
						((ExpressionContext)_localctx).trueVal = ((ExpressionContext)_localctx).expression = expression(0);
						setState(355);
						match(T__7);
						setState(356);
						((ExpressionContext)_localctx).falseVal = ((ExpressionContext)_localctx).expression = expression(2);

						                      ((ExpressionContext)_localctx).ast =  new Terniary(
						                          ((ExpressionContext)_localctx).cond.ast,
						                          ((ExpressionContext)_localctx).trueVal.ast,
						                          ((ExpressionContext)_localctx).falseVal.ast,
						                          ((ExpressionContext)_localctx).cond.ast.getLine(),
						                          ((ExpressionContext)_localctx).cond.ast.getColumn()
						                  );
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.outBrackets = _prevctx;
						_localctx.outBrackets = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(360);
						match(T__13);
						setState(361);
						((ExpressionContext)_localctx).inBrackets = ((ExpressionContext)_localctx).expression = expression(0);
						setState(362);
						match(T__14);
						 ((ExpressionContext)_localctx).ast =  new SquareBrackets(
						                  ((ExpressionContext)_localctx).outBrackets.ast,
						                  ((ExpressionContext)_localctx).inBrackets.ast,
						                  ((ExpressionContext)_localctx).outBrackets.ast.getLine(),
						                  ((ExpressionContext)_localctx).outBrackets.ast.getColumn()
						              );
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp = _prevctx;
						_localctx.exp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(365);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(366);
						match(T__23);
						setState(367);
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
				setState(373);
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
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001.\u0177\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001e\b\u0000"+
		"\n\u0000\f\u0000!\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00027\b\u0002"+
		"\n\u0002\f\u0002:\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"?\b\u0002\n\u0002\f\u0002B\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003P\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003U\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003[\b\u0003\n\u0003\f\u0003^\t\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003c\b\u0003\n\u0003\f\u0003"+
		"f\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004q\b\u0004"+
		"\n\u0004\f\u0004t\t\u0004\u0003\u0004v\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u0086\b\u0007\n\u0007\f\u0007\u0089\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0004\b\u00a0\b\b\u000b\b\f\b\u00a1\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00a7\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0005\t\u00ae\b\t\n\t\f\t\u00b1\t\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00bf\b\n\n\n\f\n\u00c2\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00ce\b\n\n\n\f\n\u00d1"+
		"\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\n\u00de\b\n\u000b\n\f\n\u00df\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00e8\b\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0004\n\u00ee\b\n\u000b\n\f\n\u00ef\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00fe\b\n\n\n\f\n\u0101\t\n\u0003\n\u0103\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u010d\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0116\b\u000b\u000b\u000b\f\u000b\u0117\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u011c\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u012f\b\f\n\f\f\f\u0132\t\f"+
		"\u0003\f\u0134\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u014b\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005"+
		"\f\u0172\b\f\n\f\f\f\u0175\t\f\u0001\f\u0000\u0001\u0018\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0004\u0001"+
		"\u0000\u001b\u001d\u0002\u0000\u0019\u0019\u001e\u001e\u0001\u0000\u001f"+
		"$\u0001\u0000%&\u019a\u0000\u001f\u0001\u0000\u0000\u0000\u0002-\u0001"+
		"\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000\u0006F\u0001\u0000\u0000"+
		"\u0000\bu\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f|\u0001"+
		"\u0000\u0000\u0000\u000e\u0080\u0001\u0000\u0000\u0000\u0010\u00a6\u0001"+
		"\u0000\u0000\u0000\u0012\u00a8\u0001\u0000\u0000\u0000\u0014\u010c\u0001"+
		"\u0000\u0000\u0000\u0016\u011b\u0001\u0000\u0000\u0000\u0018\u014a\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0006"+
		"\u0000\uffff\uffff\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d\u001a"+
		"\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \"\u0001\u0000\u0000"+
		"\u0000!\u001f\u0001\u0000\u0000\u0000\"#\u0003\u0004\u0002\u0000#$\u0006"+
		"\u0000\uffff\uffff\u0000$%\u0006\u0000\uffff\uffff\u0000%&\u0005\u0000"+
		"\u0000\u0001&\u0001\u0001\u0000\u0000\u0000\'(\u0003\u0006\u0003\u0000"+
		"()\u0006\u0001\uffff\uffff\u0000).\u0001\u0000\u0000\u0000*+\u0003\f\u0006"+
		"\u0000+,\u0006\u0001\uffff\uffff\u0000,.\u0001\u0000\u0000\u0000-\'\u0001"+
		"\u0000\u0000\u0000-*\u0001\u0000\u0000\u0000.\u0003\u0001\u0000\u0000"+
		"\u0000/0\u0005\u0001\u0000\u000001\u0005\u0002\u0000\u000012\u0005\u0003"+
		"\u0000\u000028\u0005\u0004\u0000\u000034\u0003\f\u0006\u000045\u0006\u0002"+
		"\uffff\uffff\u000057\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u0000"+
		"7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000"+
		"\u00009@\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0003\u0014"+
		"\n\u0000<=\u0006\u0002\uffff\uffff\u0000=?\u0001\u0000\u0000\u0000>;\u0001"+
		"\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AC\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000"+
		"\u0000CD\u0005\u0005\u0000\u0000DE\u0006\u0002\uffff\uffff\u0000E\u0005"+
		"\u0001\u0000\u0000\u0000FG\u0005\u0001\u0000\u0000GO\u0005(\u0000\u0000"+
		"HI\u0005\u0006\u0000\u0000IJ\u0003\b\u0004\u0000JK\u0006\u0003\uffff\uffff"+
		"\u0000KL\u0005\u0007\u0000\u0000LM\u0005\b\u0000\u0000MP\u0001\u0000\u0000"+
		"\u0000NP\u0005\u0003\u0000\u0000OH\u0001\u0000\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000PT\u0001\u0000\u0000\u0000QR\u0003\u0010\b\u0000RS\u0006\u0003"+
		"\uffff\uffff\u0000SU\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000"+
		"TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\\\u0005\u0004\u0000"+
		"\u0000WX\u0003\f\u0006\u0000XY\u0006\u0003\uffff\uffff\u0000Y[\u0001\u0000"+
		"\u0000\u0000ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]d\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_`\u0003\u0014\n\u0000`a\u0006\u0003\uffff"+
		"\uffff\u0000ac\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000cf\u0001"+
		"\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gh\u0005\u0005\u0000"+
		"\u0000hi\u0006\u0003\uffff\uffff\u0000i\u0007\u0001\u0000\u0000\u0000"+
		"jk\u0003\n\u0005\u0000kr\u0006\u0004\uffff\uffff\u0000lm\u0005\t\u0000"+
		"\u0000mn\u0003\n\u0005\u0000no\u0006\u0004\uffff\uffff\u0000oq\u0001\u0000"+
		"\u0000\u0000pl\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000"+
		"tr\u0001\u0000\u0000\u0000uj\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000v\t\u0001\u0000\u0000\u0000wx\u0005(\u0000\u0000xy\u0005\b\u0000"+
		"\u0000yz\u0003\u0010\b\u0000z{\u0006\u0005\uffff\uffff\u0000{\u000b\u0001"+
		"\u0000\u0000\u0000|}\u0003\u000e\u0007\u0000}~\u0006\u0006\uffff\uffff"+
		"\u0000~\u007f\u0005\n\u0000\u0000\u007f\r\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005(\u0000\u0000\u0081\u0087\u0006\u0007\uffff\uffff\u0000\u0082"+
		"\u0083\u0005\t\u0000\u0000\u0083\u0084\u0005(\u0000\u0000\u0084\u0086"+
		"\u0006\u0007\uffff\uffff\u0000\u0085\u0082\u0001\u0000\u0000\u0000\u0086"+
		"\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0005\b\u0000\u0000\u008b\u008c"+
		"\u0003\u0010\b\u0000\u008c\u008d\u0006\u0007\uffff\uffff\u0000\u008d\u000f"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u000b\u0000\u0000\u008f\u00a7"+
		"\u0006\b\uffff\uffff\u0000\u0090\u0091\u0005\f\u0000\u0000\u0091\u00a7"+
		"\u0006\b\uffff\uffff\u0000\u0092\u0093\u0005\r\u0000\u0000\u0093\u00a7"+
		"\u0006\b\uffff\uffff\u0000\u0094\u0095\u0005\u000e\u0000\u0000\u0095\u0096"+
		"\u0005)\u0000\u0000\u0096\u0097\u0005\u000f\u0000\u0000\u0097\u0098\u0003"+
		"\u0010\b\u0000\u0098\u0099\u0006\b\uffff\uffff\u0000\u0099\u00a7\u0001"+
		"\u0000\u0000\u0000\u009a\u009b\u0005\u0010\u0000\u0000\u009b\u009f\u0005"+
		"\u0004\u0000\u0000\u009c\u009d\u0003\u0012\t\u0000\u009d\u009e\u0006\b"+
		"\uffff\uffff\u0000\u009e\u00a0\u0001\u0000\u0000\u0000\u009f\u009c\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00a4\u0005\u0005\u0000\u0000\u00a4\u00a5\u0006"+
		"\b\uffff\uffff\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u008e\u0001"+
		"\u0000\u0000\u0000\u00a6\u0090\u0001\u0000\u0000\u0000\u00a6\u0092\u0001"+
		"\u0000\u0000\u0000\u00a6\u0094\u0001\u0000\u0000\u0000\u00a6\u009a\u0001"+
		"\u0000\u0000\u0000\u00a7\u0011\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005"+
		"(\u0000\u0000\u00a9\u00af\u0006\t\uffff\uffff\u0000\u00aa\u00ab\u0005"+
		"\t\u0000\u0000\u00ab\u00ac\u0005(\u0000\u0000\u00ac\u00ae\u0006\t\uffff"+
		"\uffff\u0000\u00ad\u00aa\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\b\u0000\u0000\u00b3\u00b4\u0003\u0010\b"+
		"\u0000\u00b4\u00b5\u0005\n\u0000\u0000\u00b5\u00b6\u0006\t\uffff\uffff"+
		"\u0000\u00b6\u0013\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0011\u0000"+
		"\u0000\u00b8\u00b9\u0003\u0018\f\u0000\u00b9\u00c0\u0006\n\uffff\uffff"+
		"\u0000\u00ba\u00bb\u0005\t\u0000\u0000\u00bb\u00bc\u0003\u0018\f\u0000"+
		"\u00bc\u00bd\u0006\n\uffff\uffff\u0000\u00bd\u00bf\u0001\u0000\u0000\u0000"+
		"\u00be\u00ba\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0005\n\u0000\u0000\u00c4\u00c5\u0006\n\uffff\uffff\u0000"+
		"\u00c5\u010d\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0012\u0000\u0000"+
		"\u00c7\u00c8\u0003\u0018\f\u0000\u00c8\u00cf\u0006\n\uffff\uffff\u0000"+
		"\u00c9\u00ca\u0005\t\u0000\u0000\u00ca\u00cb\u0003\u0018\f\u0000\u00cb"+
		"\u00cc\u0006\n\uffff\uffff\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000\u00cd"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ce\u00d1\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d2\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d2"+
		"\u00d3\u0005\n\u0000\u0000\u00d3\u00d4\u0006\n\uffff\uffff\u0000\u00d4"+
		"\u010d\u0001\u0000\u0000\u0000\u00d5\u00d6\u0003\u0018\f\u0000\u00d6\u00d7"+
		"\u0005\u0013\u0000\u0000\u00d7\u00d8\u0003\u0018\f\u0000\u00d8\u00d9\u0005"+
		"\n\u0000\u0000\u00d9\u00da\u0006\n\uffff\uffff\u0000\u00da\u010d\u0001"+
		"\u0000\u0000\u0000\u00db\u00dd\u0005\u0014\u0000\u0000\u00dc\u00de\u0003"+
		"\u0018\f\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000"+
		"\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\b\u0000"+
		"\u0000\u00e2\u00e7\u0003\u0016\u000b\u0000\u00e3\u00e4\u0005\u0015\u0000"+
		"\u0000\u00e4\u00e5\u0003\u0016\u000b\u0000\u00e5\u00e6\u0006\n\uffff\uffff"+
		"\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0006\n\uffff\uffff\u0000\u00ea\u010d\u0001\u0000\u0000"+
		"\u0000\u00eb\u00ed\u0005\u0016\u0000\u0000\u00ec\u00ee\u0003\u0018\f\u0000"+
		"\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\b\u0000\u0000\u00f2"+
		"\u00f3\u0003\u0016\u000b\u0000\u00f3\u00f4\u0006\n\uffff\uffff\u0000\u00f4"+
		"\u010d\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005(\u0000\u0000\u00f6\u0102"+
		"\u0005\u0006\u0000\u0000\u00f7\u00f8\u0003\u0018\f\u0000\u00f8\u00ff\u0006"+
		"\n\uffff\uffff\u0000\u00f9\u00fa\u0005\t\u0000\u0000\u00fa\u00fb\u0003"+
		"\u0018\f\u0000\u00fb\u00fc\u0006\n\uffff\uffff\u0000\u00fc\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fe\u0101\u0001"+
		"\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000\u00ff\u0100\u0001"+
		"\u0000\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001"+
		"\u0000\u0000\u0000\u0102\u00f7\u0001\u0000\u0000\u0000\u0102\u0103\u0001"+
		"\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104\u0105\u0005"+
		"\u0007\u0000\u0000\u0105\u0106\u0005\n\u0000\u0000\u0106\u010d\u0006\n"+
		"\uffff\uffff\u0000\u0107\u0108\u0005\u0017\u0000\u0000\u0108\u0109\u0003"+
		"\u0018\f\u0000\u0109\u010a\u0005\n\u0000\u0000\u010a\u010b\u0006\n\uffff"+
		"\uffff\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u00b7\u0001\u0000"+
		"\u0000\u0000\u010c\u00c6\u0001\u0000\u0000\u0000\u010c\u00d5\u0001\u0000"+
		"\u0000\u0000\u010c\u00db\u0001\u0000\u0000\u0000\u010c\u00eb\u0001\u0000"+
		"\u0000\u0000\u010c\u00f5\u0001\u0000\u0000\u0000\u010c\u0107\u0001\u0000"+
		"\u0000\u0000\u010d\u0015\u0001\u0000\u0000\u0000\u010e\u010f\u0003\u0014"+
		"\n\u0000\u010f\u0110\u0006\u000b\uffff\uffff\u0000\u0110\u011c\u0001\u0000"+
		"\u0000\u0000\u0111\u0115\u0005\u0004\u0000\u0000\u0112\u0113\u0003\u0014"+
		"\n\u0000\u0113\u0114\u0006\u000b\uffff\uffff\u0000\u0114\u0116\u0001\u0000"+
		"\u0000\u0000\u0115\u0112\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000"+
		"\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000"+
		"\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0005"+
		"\u0000\u0000\u011a\u011c\u0001\u0000\u0000\u0000\u011b\u010e\u0001\u0000"+
		"\u0000\u0000\u011b\u0111\u0001\u0000\u0000\u0000\u011c\u0017\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0006\f\uffff\uffff\u0000\u011e\u011f\u0005("+
		"\u0000\u0000\u011f\u014b\u0006\f\uffff\uffff\u0000\u0120\u0121\u0005+"+
		"\u0000\u0000\u0121\u014b\u0006\f\uffff\uffff\u0000\u0122\u0123\u0005*"+
		"\u0000\u0000\u0123\u014b\u0006\f\uffff\uffff\u0000\u0124\u0125\u0005)"+
		"\u0000\u0000\u0125\u014b\u0006\f\uffff\uffff\u0000\u0126\u0127\u0005("+
		"\u0000\u0000\u0127\u0133\u0005\u0006\u0000\u0000\u0128\u0129\u0003\u0018"+
		"\f\u0000\u0129\u0130\u0006\f\uffff\uffff\u0000\u012a\u012b\u0005\t\u0000"+
		"\u0000\u012b\u012c\u0003\u0018\f\u0000\u012c\u012d\u0006\f\uffff\uffff"+
		"\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u012a\u0001\u0000\u0000"+
		"\u0000\u012f\u0132\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0134\u0001\u0000\u0000"+
		"\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0133\u0128\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005\u0007\u0000\u0000\u0136\u014b\u0006\f\uffff\uffff"+
		"\u0000\u0137\u0138\u0005\u0006\u0000\u0000\u0138\u0139\u0003\u0018\f\u0000"+
		"\u0139\u013a\u0005\u0007\u0000\u0000\u013a\u013b\u0006\f\uffff\uffff\u0000"+
		"\u013b\u014b\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u0006\u0000\u0000"+
		"\u013d\u013e\u0003\u0010\b\u0000\u013e\u013f\u0005\u0007\u0000\u0000\u013f"+
		"\u0140\u0003\u0018\f\b\u0140\u0141\u0006\f\uffff\uffff\u0000\u0141\u014b"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0005\u0019\u0000\u0000\u0143\u0144"+
		"\u0003\u0018\f\u0007\u0144\u0145\u0006\f\uffff\uffff\u0000\u0145\u014b"+
		"\u0001\u0000\u0000\u0000\u0146\u0147\u0005\u001a\u0000\u0000\u0147\u0148"+
		"\u0003\u0018\f\u0006\u0148\u0149\u0006\f\uffff\uffff\u0000\u0149\u014b"+
		"\u0001\u0000\u0000\u0000\u014a\u011d\u0001\u0000\u0000\u0000\u014a\u0120"+
		"\u0001\u0000\u0000\u0000\u014a\u0122\u0001\u0000\u0000\u0000\u014a\u0124"+
		"\u0001\u0000\u0000\u0000\u014a\u0126\u0001\u0000\u0000\u0000\u014a\u0137"+
		"\u0001\u0000\u0000\u0000\u014a\u013c\u0001\u0000\u0000\u0000\u014a\u0142"+
		"\u0001\u0000\u0000\u0000\u014a\u0146\u0001\u0000\u0000\u0000\u014b\u0173"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\n\u0005\u0000\u0000\u014d\u014e\u0007"+
		"\u0000\u0000\u0000\u014e\u014f\u0003\u0018\f\u0006\u014f\u0150\u0006\f"+
		"\uffff\uffff\u0000\u0150\u0172\u0001\u0000\u0000\u0000\u0151\u0152\n\u0004"+
		"\u0000\u0000\u0152\u0153\u0007\u0001\u0000\u0000\u0153\u0154\u0003\u0018"+
		"\f\u0005\u0154\u0155\u0006\f\uffff\uffff\u0000\u0155\u0172\u0001\u0000"+
		"\u0000\u0000\u0156\u0157\n\u0003\u0000\u0000\u0157\u0158\u0007\u0002\u0000"+
		"\u0000\u0158\u0159\u0003\u0018\f\u0004\u0159\u015a\u0006\f\uffff\uffff"+
		"\u0000\u015a\u0172\u0001\u0000\u0000\u0000\u015b\u015c\n\u0002\u0000\u0000"+
		"\u015c\u015d\u0007\u0003\u0000\u0000\u015d\u015e\u0003\u0018\f\u0003\u015e"+
		"\u015f\u0006\f\uffff\uffff\u0000\u015f\u0172\u0001\u0000\u0000\u0000\u0160"+
		"\u0161\n\u0001\u0000\u0000\u0161\u0162\u0005\'\u0000\u0000\u0162\u0163"+
		"\u0003\u0018\f\u0000\u0163\u0164\u0005\b\u0000\u0000\u0164\u0165\u0003"+
		"\u0018\f\u0002\u0165\u0166\u0006\f\uffff\uffff\u0000\u0166\u0172\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\n\n\u0000\u0000\u0168\u0169\u0005\u000e"+
		"\u0000\u0000\u0169\u016a\u0003\u0018\f\u0000\u016a\u016b\u0005\u000f\u0000"+
		"\u0000\u016b\u016c\u0006\f\uffff\uffff\u0000\u016c\u0172\u0001\u0000\u0000"+
		"\u0000\u016d\u016e\n\t\u0000\u0000\u016e\u016f\u0005\u0018\u0000\u0000"+
		"\u016f\u0170\u0005(\u0000\u0000\u0170\u0172\u0006\f\uffff\uffff\u0000"+
		"\u0171\u014c\u0001\u0000\u0000\u0000\u0171\u0151\u0001\u0000\u0000\u0000"+
		"\u0171\u0156\u0001\u0000\u0000\u0000\u0171\u015b\u0001\u0000\u0000\u0000"+
		"\u0171\u0160\u0001\u0000\u0000\u0000\u0171\u0167\u0001\u0000\u0000\u0000"+
		"\u0171\u016d\u0001\u0000\u0000\u0000\u0172\u0175\u0001\u0000\u0000\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u0174\u0019\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000"+
		"\u001d\u001f-8@OT\\dru\u0087\u00a1\u00a6\u00af\u00c0\u00cf\u00df\u00e7"+
		"\u00ef\u00ff\u0102\u010c\u0117\u011b\u0130\u0133\u014a\u0171\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}