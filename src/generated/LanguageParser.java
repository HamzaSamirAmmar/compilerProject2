// Generated from C:/Users/ASUS/Desktop/cloned compiler/compiler-project-2/grammers\LanguageParser.g4 by ANTLR 4.9.2
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PAGE=1, CONTROLLER=2, EXTENDS=3, CONTROLES=4, HEAD=5, IF=6, CHECK_AUTH=7, 
		CHECK_VALID=8, CHECK_ROLE=9, REDIRECT=10, TEXT=11, IMAGE=12, SEMI_COLON=13, 
		LIST=14, TABLE=15, BUTTON=16, HEADER=17, BODY=18, BOOLEAN=19, CASE=20, 
		METHOD=21, DEFAULT=22, FORM=23, TEXT_FIELD=24, DATE=25, CHECKBOX=26, SELCTION=27, 
		RADIO=28, SWITCH=29, LINK=30, AT_AUTH=31, AT_GUEST=32, AT_ROLE=33, AT_INVERSE_ROLE=34, 
		AT_RAW_PHP=35, AT_SECTION=36, AT_YIELD=37, FOR=38, ELSE=39, AT_END_AUTH=40, 
		AT_END_GUEST=41, AT_END_ROLE=42, AT_END_INVERSE_ROLE=43, AT_END_SECTION=44, 
		SHARED_DATA=45, FORM_DATA=46, BRACKET_OPEN=47, BRACKET_CLOSE=48, SQUARE_OPEN=49, 
		SQUARE_CLOSE=50, CURLEY_BRACKET_OPEN=51, CURLEY_BRACKET_CLOSE=52, COMMA=53, 
		COLON=54, OPERATOR_TWO_OPERAND=55, CONDITIONAL_CONCAT_OPERATOR=56, ONE_LOGICAL_OPERAND=57, 
		ONE_VALUABLE_OPERAND=58, ADDITIVE_OPERATOR=59, MULTIPLICATIVE_OPERATOR=60, 
		EQUAL=61, AT=62, ARROW=63, ID=64, WHITESPACE=65, DECIMAL=66, HEXCHARS=67, 
		STRING=68, CHAR=69, AT_END_RAW_PHP=70;
	public static final int
		RULE_program = 0, RULE_start_page = 1, RULE_page = 2, RULE_head = 3, RULE_title = 4, 
		RULE_body_element = 5, RULE_statement = 6, RULE_element = 7, RULE_if_statement = 8, 
		RULE_elsebody = 9, RULE_switch_statement = 10, RULE_switch_body = 11, 
		RULE_switch_case = 12, RULE_switch_default = 13, RULE_variable_declaration = 14, 
		RULE_shared_data_declaration = 15, RULE_for_statement = 16, RULE_for_index = 17, 
		RULE_authentication = 18, RULE_authorization = 19, RULE_rawphp = 20, RULE_layoutInheritance = 21, 
		RULE_out_element = 22, RULE_text = 23, RULE_text_attributes = 24, RULE_image = 25, 
		RULE_image_attributes = 26, RULE_button = 27, RULE_button_attributes = 28, 
		RULE_list = 29, RULE_list_attributes = 30, RULE_table = 31, RULE_link = 32, 
		RULE_link_attributes = 33, RULE_body_options = 34, RULE_in_element = 35, 
		RULE_form = 36, RULE_form_attributes = 37, RULE_form_body = 38, RULE_text_field = 39, 
		RULE_text_field_attributes = 40, RULE_date = 41, RULE_date_attributes = 42, 
		RULE_check_box = 43, RULE_check_box_attributes = 44, RULE_selection = 45, 
		RULE_selection_attribute = 46, RULE_selection_body = 47, RULE_option = 48, 
		RULE_radio = 49, RULE_extra_attributes = 50, RULE_array_value = 51, RULE_table_body = 52, 
		RULE_table_header_body = 53, RULE_controller = 54, RULE_controller_body_element = 55, 
		RULE_array = 56, RULE_map_value = 57, RULE_map = 58, RULE_expression = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "start_page", "page", "head", "title", "body_element", "statement", 
			"element", "if_statement", "elsebody", "switch_statement", "switch_body", 
			"switch_case", "switch_default", "variable_declaration", "shared_data_declaration", 
			"for_statement", "for_index", "authentication", "authorization", "rawphp", 
			"layoutInheritance", "out_element", "text", "text_attributes", "image", 
			"image_attributes", "button", "button_attributes", "list", "list_attributes", 
			"table", "link", "link_attributes", "body_options", "in_element", "form", 
			"form_attributes", "form_body", "text_field", "text_field_attributes", 
			"date", "date_attributes", "check_box", "check_box_attributes", "selection", 
			"selection_attribute", "selection_body", "option", "radio", "extra_attributes", 
			"array_value", "table_body", "table_header_body", "controller", "controller_body_element", 
			"array", "map_value", "map", "expression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'page'", "'controller'", "'extends'", "'controles'", "'head'", 
			"'if'", "'checkAuthenticated'", "'checkValid'", "'checkRole'", "'redirect'", 
			"'text'", "'image'", "';'", "'list'", "'table'", "'button'", "'header'", 
			"'body'", null, "'case'", null, "'dafaultl'", "'form'", "'textField'", 
			"'date'", "'checkbox'", "'selection'", "'radio'", "'switch'", "'link'", 
			"'@auth'", "'@guest'", "'@role'", "'@inverserole'", "'@rawphp'", "'@section'", 
			"'@yield'", "'for'", null, "'@endauth'", "'@endguest'", "'@endrole'", 
			"'@endinverserole'", "'@endsection'", "'shared_data'", "'form_data'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "':'", null, null, "'!'", 
			null, null, null, "'='", "'@'", "'=>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PAGE", "CONTROLLER", "EXTENDS", "CONTROLES", "HEAD", "IF", "CHECK_AUTH", 
			"CHECK_VALID", "CHECK_ROLE", "REDIRECT", "TEXT", "IMAGE", "SEMI_COLON", 
			"LIST", "TABLE", "BUTTON", "HEADER", "BODY", "BOOLEAN", "CASE", "METHOD", 
			"DEFAULT", "FORM", "TEXT_FIELD", "DATE", "CHECKBOX", "SELCTION", "RADIO", 
			"SWITCH", "LINK", "AT_AUTH", "AT_GUEST", "AT_ROLE", "AT_INVERSE_ROLE", 
			"AT_RAW_PHP", "AT_SECTION", "AT_YIELD", "FOR", "ELSE", "AT_END_AUTH", 
			"AT_END_GUEST", "AT_END_ROLE", "AT_END_INVERSE_ROLE", "AT_END_SECTION", 
			"SHARED_DATA", "FORM_DATA", "BRACKET_OPEN", "BRACKET_CLOSE", "SQUARE_OPEN", 
			"SQUARE_CLOSE", "CURLEY_BRACKET_OPEN", "CURLEY_BRACKET_CLOSE", "COMMA", 
			"COLON", "OPERATOR_TWO_OPERAND", "CONDITIONAL_CONCAT_OPERATOR", "ONE_LOGICAL_OPERAND", 
			"ONE_VALUABLE_OPERAND", "ADDITIVE_OPERATOR", "MULTIPLICATIVE_OPERATOR", 
			"EQUAL", "AT", "ARROW", "ID", "WHITESPACE", "DECIMAL", "HEXCHARS", "STRING", 
			"CHAR", "AT_END_RAW_PHP"
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
	public String getGrammarFileName() { return "LanguageParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Start_pageContext start_page() {
			return getRuleContext(Start_pageContext.class,0);
		}
		public List<PageContext> page() {
			return getRuleContexts(PageContext.class);
		}
		public PageContext page(int i) {
			return getRuleContext(PageContext.class,i);
		}
		public List<ControllerContext> controller() {
			return getRuleContexts(ControllerContext.class);
		}
		public ControllerContext controller(int i) {
			return getRuleContext(ControllerContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			start_page();
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAGE) {
				{
				{
				setState(121);
				page();
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONTROLLER) {
				{
				{
				setState(127);
				controller();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Start_pageContext extends ParserRuleContext {
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public Start_pageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterStart_page(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitStart_page(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitStart_page(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_pageContext start_page() throws RecognitionException {
		Start_pageContext _localctx = new Start_pageContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start_page);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			page();
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

	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(LanguageParser.PAGE, 0); }
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public TerminalNode EXTENDS() { return getToken(LanguageParser.EXTENDS, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(PAGE);
			setState(136);
			match(ID);
			setState(137);
			head();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(138);
				match(EXTENDS);
				setState(139);
				match(ID);
				}
			}

			setState(142);
			match(CURLEY_BRACKET_OPEN);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
				{
				{
				setState(143);
				body_element();
				}
				}
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(149);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode HEAD() { return getToken(LanguageParser.HEAD, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_head);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(HEAD);
			setState(152);
			match(BRACKET_OPEN);
			setState(153);
			title();
			setState(154);
			match(BRACKET_CLOSE);
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

	public static class TitleContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(STRING);
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

	public static class Body_elementContext extends ParserRuleContext {
		public In_elementContext in_element() {
			return getRuleContext(In_elementContext.class,0);
		}
		public Out_elementContext out_element() {
			return getRuleContext(Out_elementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public AuthenticationContext authentication() {
			return getRuleContext(AuthenticationContext.class,0);
		}
		public AuthorizationContext authorization() {
			return getRuleContext(AuthorizationContext.class,0);
		}
		public LayoutInheritanceContext layoutInheritance() {
			return getRuleContext(LayoutInheritanceContext.class,0);
		}
		public Body_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterBody_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitBody_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitBody_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_elementContext body_element() throws RecognitionException {
		Body_elementContext _localctx = new Body_elementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body_element);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORM:
			case TEXT_FIELD:
			case DATE:
			case CHECKBOX:
			case SELCTION:
			case RADIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				in_element();
				}
				break;
			case TEXT:
			case IMAGE:
			case LIST:
			case TABLE:
			case BUTTON:
			case LINK:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				out_element();
				}
				break;
			case IF:
			case CHECK_AUTH:
			case CHECK_VALID:
			case CHECK_ROLE:
			case BOOLEAN:
			case SWITCH:
			case AT_RAW_PHP:
			case FOR:
			case SHARED_DATA:
			case FORM_DATA:
			case BRACKET_OPEN:
			case SQUARE_OPEN:
			case CURLEY_BRACKET_OPEN:
			case ONE_LOGICAL_OPERAND:
			case ONE_VALUABLE_OPERAND:
			case AT:
			case DECIMAL:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				statement();
				}
				break;
			case AT_AUTH:
			case AT_GUEST:
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				authentication();
				}
				break;
			case AT_ROLE:
			case AT_INVERSE_ROLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
				authorization();
				}
				break;
			case AT_SECTION:
			case AT_YIELD:
				enterOuterAlt(_localctx, 6);
				{
				setState(163);
				layoutInheritance();
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

	public static class StatementContext extends ParserRuleContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Switch_statementContext switch_statement() {
			return getRuleContext(Switch_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Shared_data_declarationContext shared_data_declaration() {
			return getRuleContext(Shared_data_declarationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RawphpContext rawphp() {
			return getRuleContext(RawphpContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				if_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				switch_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				for_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				variable_declaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				shared_data_declaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				expression(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				rawphp();
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

	public static class ElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Body_elementContext body_element() {
			return getRuleContext(Body_elementContext.class,0);
		}
		public Controller_body_elementContext controller_body_element() {
			return getRuleContext(Controller_body_elementContext.class,0);
		}
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_element);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				body_element();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				controller_body_element();
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

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(LanguageParser.IF, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public List<TerminalNode> CURLEY_BRACKET_OPEN() { return getTokens(LanguageParser.CURLEY_BRACKET_OPEN); }
		public TerminalNode CURLEY_BRACKET_OPEN(int i) {
			return getToken(LanguageParser.CURLEY_BRACKET_OPEN, i);
		}
		public List<TerminalNode> CURLEY_BRACKET_CLOSE() { return getTokens(LanguageParser.CURLEY_BRACKET_CLOSE); }
		public TerminalNode CURLEY_BRACKET_CLOSE(int i) {
			return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LanguageParser.ELSE, 0); }
		public ElsebodyContext elsebody() {
			return getRuleContext(ElsebodyContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(IF);
			setState(181);
			match(BRACKET_OPEN);
			setState(182);
			expression(0);
			setState(183);
			match(BRACKET_CLOSE);
			setState(184);
			match(CURLEY_BRACKET_OPEN);
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (REDIRECT - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
				{
				{
				setState(185);
				element();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(CURLEY_BRACKET_CLOSE);
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(192);
				match(ELSE);
				setState(193);
				match(CURLEY_BRACKET_OPEN);
				setState(194);
				elsebody();
				setState(195);
				match(CURLEY_BRACKET_CLOSE);
				}
				break;
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

	public static class ElsebodyContext extends ParserRuleContext {
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public ElsebodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsebody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterElsebody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitElsebody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitElsebody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElsebodyContext elsebody() throws RecognitionException {
		ElsebodyContext _localctx = new ElsebodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elsebody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (REDIRECT - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
				{
				{
				setState(199);
				element();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Switch_statementContext extends ParserRuleContext {
		public TerminalNode SWITCH() { return getToken(LanguageParser.SWITCH, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public Switch_bodyContext switch_body() {
			return getRuleContext(Switch_bodyContext.class,0);
		}
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public Switch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSwitch_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSwitch_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSwitch_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_statementContext switch_statement() throws RecognitionException {
		Switch_statementContext _localctx = new Switch_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_switch_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(SWITCH);
			setState(206);
			match(BRACKET_OPEN);
			setState(207);
			expression(0);
			setState(208);
			match(BRACKET_CLOSE);
			setState(209);
			match(CURLEY_BRACKET_OPEN);
			setState(210);
			switch_body();
			setState(211);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class Switch_bodyContext extends ParserRuleContext {
		public List<Switch_caseContext> switch_case() {
			return getRuleContexts(Switch_caseContext.class);
		}
		public Switch_caseContext switch_case(int i) {
			return getRuleContext(Switch_caseContext.class,i);
		}
		public Switch_defaultContext switch_default() {
			return getRuleContext(Switch_defaultContext.class,0);
		}
		public Switch_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSwitch_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSwitch_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSwitch_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_bodyContext switch_body() throws RecognitionException {
		Switch_bodyContext _localctx = new Switch_bodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_switch_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CASE) {
				{
				{
				setState(213);
				switch_case();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(219);
				switch_default();
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

	public static class Switch_caseContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(LanguageParser.CASE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LanguageParser.COLON, 0); }
		public TerminalNode SEMI_COLON() { return getToken(LanguageParser.SEMI_COLON, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Switch_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSwitch_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSwitch_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSwitch_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_caseContext switch_case() throws RecognitionException {
		Switch_caseContext _localctx = new Switch_caseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switch_case);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(CASE);
			setState(223);
			expression(0);
			setState(224);
			match(COLON);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (REDIRECT - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
				{
				{
				setState(225);
				element();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(SEMI_COLON);
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

	public static class Switch_defaultContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(LanguageParser.DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(LanguageParser.COLON, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public Switch_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSwitch_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSwitch_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSwitch_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Switch_defaultContext switch_default() throws RecognitionException {
		Switch_defaultContext _localctx = new Switch_defaultContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switch_default);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(DEFAULT);
			setState(234);
			match(COLON);
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (REDIRECT - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
				{
				{
				setState(235);
				element();
				}
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(LanguageParser.AT, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(LanguageParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitVariable_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(AT);
			setState(242);
			match(ID);
			setState(243);
			match(EQUAL);
			setState(244);
			expression(0);
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

	public static class Shared_data_declarationContext extends ParserRuleContext {
		public TerminalNode SHARED_DATA() { return getToken(LanguageParser.SHARED_DATA, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode EQUAL() { return getToken(LanguageParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Shared_data_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shared_data_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterShared_data_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitShared_data_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitShared_data_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Shared_data_declarationContext shared_data_declaration() throws RecognitionException {
		Shared_data_declarationContext _localctx = new Shared_data_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_shared_data_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(SHARED_DATA);
			setState(247);
			match(BRACKET_OPEN);
			setState(248);
			match(ID);
			setState(249);
			match(BRACKET_CLOSE);
			setState(250);
			match(EQUAL);
			setState(251);
			expression(0);
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

	public static class For_statementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(LanguageParser.FOR, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public For_indexContext for_index() {
			return getRuleContext(For_indexContext.class,0);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(LanguageParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(LanguageParser.SEMI_COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(FOR);
			setState(254);
			match(BRACKET_OPEN);
			setState(255);
			for_index();
			setState(256);
			match(SEMI_COLON);
			setState(257);
			expression(0);
			setState(258);
			match(SEMI_COLON);
			setState(259);
			expression(0);
			setState(260);
			match(BRACKET_CLOSE);
			setState(261);
			match(CURLEY_BRACKET_OPEN);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (REDIRECT - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
				{
				{
				setState(262);
				element();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class For_indexContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public For_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterFor_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitFor_index(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitFor_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_indexContext for_index() throws RecognitionException {
		For_indexContext _localctx = new For_indexContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			variable_declaration();
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

	public static class AuthenticationContext extends ParserRuleContext {
		public TerminalNode AT_AUTH() { return getToken(LanguageParser.AT_AUTH, 0); }
		public TerminalNode AT_END_AUTH() { return getToken(LanguageParser.AT_END_AUTH, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LanguageParser.ELSE, 0); }
		public TerminalNode AT_GUEST() { return getToken(LanguageParser.AT_GUEST, 0); }
		public TerminalNode AT_END_GUEST() { return getToken(LanguageParser.AT_END_GUEST, 0); }
		public AuthenticationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authentication; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterAuthentication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitAuthentication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitAuthentication(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthenticationContext authentication() throws RecognitionException {
		AuthenticationContext _localctx = new AuthenticationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_authentication);
		int _la;
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_AUTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				match(AT_AUTH);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
					{
					{
					setState(273);
					body_element();
					}
					}
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(279);
					match(ELSE);
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
						{
						{
						setState(280);
						body_element();
						}
						}
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(288);
				match(AT_END_AUTH);
				}
				break;
			case AT_GUEST:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				match(AT_GUEST);
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
					{
					{
					setState(290);
					body_element();
					}
					}
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(296);
					match(ELSE);
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
						{
						{
						setState(297);
						body_element();
						}
						}
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(305);
				match(AT_END_GUEST);
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

	public static class AuthorizationContext extends ParserRuleContext {
		public TerminalNode AT_ROLE() { return getToken(LanguageParser.AT_ROLE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TerminalNode SQUARE_OPEN() { return getToken(LanguageParser.SQUARE_OPEN, 0); }
		public List<TerminalNode> STRING() { return getTokens(LanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LanguageParser.STRING, i);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LanguageParser.SQUARE_CLOSE, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode AT_END_ROLE() { return getToken(LanguageParser.AT_END_ROLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LanguageParser.ELSE, 0); }
		public TerminalNode AT_INVERSE_ROLE() { return getToken(LanguageParser.AT_INVERSE_ROLE, 0); }
		public TerminalNode AT_END_INVERSE_ROLE() { return getToken(LanguageParser.AT_END_INVERSE_ROLE, 0); }
		public AuthorizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authorization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterAuthorization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitAuthorization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitAuthorization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorizationContext authorization() throws RecognitionException {
		AuthorizationContext _localctx = new AuthorizationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_authorization);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_ROLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(AT_ROLE);
				setState(309);
				match(BRACKET_OPEN);
				setState(310);
				match(SQUARE_OPEN);
				setState(311);
				match(STRING);
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(312);
					match(COMMA);
					setState(313);
					match(STRING);
					}
					}
					setState(318);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(319);
				match(SQUARE_CLOSE);
				setState(320);
				match(BRACKET_CLOSE);
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
					{
					{
					setState(321);
					body_element();
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(327);
					match(ELSE);
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
						{
						{
						setState(328);
						body_element();
						}
						}
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(336);
				match(AT_END_ROLE);
				}
				break;
			case AT_INVERSE_ROLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(AT_INVERSE_ROLE);
				setState(338);
				match(BRACKET_OPEN);
				setState(339);
				match(SQUARE_OPEN);
				setState(340);
				match(STRING);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(341);
					match(COMMA);
					setState(342);
					match(STRING);
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(348);
				match(SQUARE_CLOSE);
				setState(349);
				match(BRACKET_CLOSE);
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
					{
					{
					setState(350);
					body_element();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(356);
					match(ELSE);
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
						{
						{
						setState(357);
						body_element();
						}
						}
						setState(362);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(365);
				match(AT_END_INVERSE_ROLE);
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

	public static class RawphpContext extends ParserRuleContext {
		public TerminalNode AT_RAW_PHP() { return getToken(LanguageParser.AT_RAW_PHP, 0); }
		public TerminalNode AT_END_RAW_PHP() { return getToken(LanguageParser.AT_END_RAW_PHP, 0); }
		public RawphpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawphp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterRawphp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitRawphp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitRawphp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RawphpContext rawphp() throws RecognitionException {
		RawphpContext _localctx = new RawphpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_rawphp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(AT_RAW_PHP);
			setState(369);
			match(AT_END_RAW_PHP);
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

	public static class LayoutInheritanceContext extends ParserRuleContext {
		public TerminalNode AT_SECTION() { return getToken(LanguageParser.AT_SECTION, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode AT_END_SECTION() { return getToken(LanguageParser.AT_END_SECTION, 0); }
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public TerminalNode AT_YIELD() { return getToken(LanguageParser.AT_YIELD, 0); }
		public LayoutInheritanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layoutInheritance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLayoutInheritance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLayoutInheritance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLayoutInheritance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LayoutInheritanceContext layoutInheritance() throws RecognitionException {
		LayoutInheritanceContext _localctx = new LayoutInheritanceContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_layoutInheritance);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_SECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				match(AT_SECTION);
				setState(372);
				match(BRACKET_OPEN);
				setState(373);
				match(STRING);
				setState(374);
				match(BRACKET_CLOSE);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
					{
					{
					setState(375);
					body_element();
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(381);
				match(AT_END_SECTION);
				}
				break;
			case AT_YIELD:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(AT_YIELD);
				setState(383);
				match(BRACKET_OPEN);
				setState(384);
				match(STRING);
				setState(385);
				match(BRACKET_CLOSE);
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

	public static class Out_elementContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public TableContext table() {
			return getRuleContext(TableContext.class,0);
		}
		public ButtonContext button() {
			return getRuleContext(ButtonContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public Out_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterOut_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitOut_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitOut_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Out_elementContext out_element() throws RecognitionException {
		Out_elementContext _localctx = new Out_elementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_out_element);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				text();
				}
				break;
			case TABLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				table();
				}
				break;
			case BUTTON:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				button();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				image();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 5);
				{
				setState(392);
				list();
				}
				break;
			case LINK:
				enterOuterAlt(_localctx, 6);
				{
				setState(393);
				link();
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

	public static class TextContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LanguageParser.TEXT, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Text_attributesContext text_attributes() {
			return getRuleContext(Text_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(TEXT);
			setState(397);
			match(BRACKET_OPEN);
			setState(398);
			text_attributes();
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(399);
				match(COMMA);
				setState(400);
				extra_attributes();
				}
			}

			setState(403);
			match(BRACKET_CLOSE);
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

	public static class Text_attributesContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public TerminalNode DECIMAL() { return getToken(LanguageParser.DECIMAL, 0); }
		public TerminalNode HEXCHARS() { return getToken(LanguageParser.HEXCHARS, 0); }
		public Text_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterText_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitText_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitText_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_attributesContext text_attributes() throws RecognitionException {
		Text_attributesContext _localctx = new Text_attributesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_text_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			expression(0);
			setState(406);
			match(COMMA);
			setState(407);
			match(DECIMAL);
			setState(408);
			match(COMMA);
			setState(409);
			match(HEXCHARS);
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

	public static class ImageContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(LanguageParser.IMAGE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Image_attributesContext image_attributes() {
			return getRuleContext(Image_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			match(IMAGE);
			setState(412);
			match(BRACKET_OPEN);
			setState(413);
			image_attributes();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(414);
				match(COMMA);
				setState(415);
				extra_attributes();
				}
			}

			setState(418);
			match(BRACKET_CLOSE);
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

	public static class Image_attributesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public List<TerminalNode> DECIMAL() { return getTokens(LanguageParser.DECIMAL); }
		public TerminalNode DECIMAL(int i) {
			return getToken(LanguageParser.DECIMAL, i);
		}
		public Image_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterImage_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitImage_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitImage_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Image_attributesContext image_attributes() throws RecognitionException {
		Image_attributesContext _localctx = new Image_attributesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_image_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(STRING);
			setState(421);
			match(COMMA);
			setState(422);
			match(DECIMAL);
			setState(423);
			match(COMMA);
			setState(424);
			match(DECIMAL);
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

	public static class ButtonContext extends ParserRuleContext {
		public TerminalNode BUTTON() { return getToken(LanguageParser.BUTTON, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Button_attributesContext button_attributes() {
			return getRuleContext(Button_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public ButtonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterButton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitButton(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitButton(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ButtonContext button() throws RecognitionException {
		ButtonContext _localctx = new ButtonContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_button);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(BUTTON);
			setState(427);
			match(BRACKET_OPEN);
			setState(428);
			button_attributes();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(429);
				match(COMMA);
				setState(430);
				extra_attributes();
				}
			}

			setState(433);
			match(BRACKET_CLOSE);
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

	public static class Button_attributesContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(LanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LanguageParser.STRING, i);
		}
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Button_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_button_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterButton_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitButton_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitButton_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Button_attributesContext button_attributes() throws RecognitionException {
		Button_attributesContext _localctx = new Button_attributesContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_button_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(STRING);
			setState(436);
			match(COMMA);
			setState(437);
			match(STRING);
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(LanguageParser.LIST, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public List_attributesContext list_attributes() {
			return getRuleContext(List_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public List<Body_optionsContext> body_options() {
			return getRuleContexts(Body_optionsContext.class);
		}
		public Body_optionsContext body_options(int i) {
			return getRuleContext(Body_optionsContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(LIST);
			setState(440);
			match(BRACKET_OPEN);
			setState(441);
			list_attributes();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(442);
				match(COMMA);
				setState(443);
				extra_attributes();
				}
			}

			setState(446);
			match(BRACKET_CLOSE);
			setState(447);
			match(CURLEY_BRACKET_OPEN);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << IMAGE) | (1L << LIST) | (1L << LINK))) != 0)) {
				{
				{
				setState(448);
				body_options();
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class List_attributesContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(LanguageParser.BOOLEAN, 0); }
		public List_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterList_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitList_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitList_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_attributesContext list_attributes() throws RecognitionException {
		List_attributesContext _localctx = new List_attributesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_list_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(BOOLEAN);
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

	public static class TableContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(LanguageParser.TABLE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public Table_bodyContext table_body() {
			return getRuleContext(Table_bodyContext.class,0);
		}
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public TableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableContext table() throws RecognitionException {
		TableContext _localctx = new TableContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(458);
			match(TABLE);
			setState(459);
			match(BRACKET_OPEN);
			setState(460);
			match(BRACKET_CLOSE);
			setState(461);
			match(CURLEY_BRACKET_OPEN);
			setState(462);
			table_body();
			setState(463);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(LanguageParser.LINK, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Link_attributesContext link_attributes() {
			return getRuleContext(Link_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public List<Body_optionsContext> body_options() {
			return getRuleContexts(Body_optionsContext.class);
		}
		public Body_optionsContext body_options(int i) {
			return getRuleContext(Body_optionsContext.class,i);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(LINK);
			setState(466);
			match(BRACKET_OPEN);
			setState(467);
			link_attributes();
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(468);
				match(COMMA);
				setState(469);
				extra_attributes();
				}
			}

			setState(472);
			match(BRACKET_CLOSE);
			setState(473);
			match(CURLEY_BRACKET_OPEN);
			setState(477);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << IMAGE) | (1L << LIST) | (1L << LINK))) != 0)) {
				{
				{
				setState(474);
				body_options();
				}
				}
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(480);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class Link_attributesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public Link_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLink_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLink_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLink_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Link_attributesContext link_attributes() throws RecognitionException {
		Link_attributesContext _localctx = new Link_attributesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_link_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(STRING);
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

	public static class Body_optionsContext extends ParserRuleContext {
		public TextContext text() {
			return getRuleContext(TextContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public Body_optionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body_options; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterBody_options(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitBody_options(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitBody_options(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Body_optionsContext body_options() throws RecognitionException {
		Body_optionsContext _localctx = new Body_optionsContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_body_options);
		try {
			setState(488);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(484);
				text();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(485);
				image();
				}
				break;
			case LINK:
				enterOuterAlt(_localctx, 3);
				{
				setState(486);
				link();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(487);
				list();
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

	public static class In_elementContext extends ParserRuleContext {
		public FormContext form() {
			return getRuleContext(FormContext.class,0);
		}
		public Text_fieldContext text_field() {
			return getRuleContext(Text_fieldContext.class,0);
		}
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public Check_boxContext check_box() {
			return getRuleContext(Check_boxContext.class,0);
		}
		public SelectionContext selection() {
			return getRuleContext(SelectionContext.class,0);
		}
		public RadioContext radio() {
			return getRuleContext(RadioContext.class,0);
		}
		public In_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterIn_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitIn_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitIn_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final In_elementContext in_element() throws RecognitionException {
		In_elementContext _localctx = new In_elementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_in_element);
		try {
			setState(496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FORM:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				form();
				}
				break;
			case TEXT_FIELD:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				text_field();
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				date();
				}
				break;
			case CHECKBOX:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				check_box();
				}
				break;
			case SELCTION:
				enterOuterAlt(_localctx, 5);
				{
				setState(494);
				selection();
				}
				break;
			case RADIO:
				enterOuterAlt(_localctx, 6);
				{
				setState(495);
				radio();
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

	public static class FormContext extends ParserRuleContext {
		public TerminalNode FORM() { return getToken(LanguageParser.FORM, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Form_attributesContext form_attributes() {
			return getRuleContext(Form_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public Form_bodyContext form_body() {
			return getRuleContext(Form_bodyContext.class,0);
		}
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public FormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormContext form() throws RecognitionException {
		FormContext _localctx = new FormContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_form);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(FORM);
			setState(499);
			match(BRACKET_OPEN);
			setState(500);
			form_attributes();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(501);
				match(COMMA);
				setState(502);
				extra_attributes();
				}
			}

			setState(505);
			match(BRACKET_CLOSE);
			setState(506);
			match(CURLEY_BRACKET_OPEN);
			setState(507);
			form_body();
			setState(508);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class Form_attributesContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(LanguageParser.METHOD, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public Form_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterForm_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitForm_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitForm_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_attributesContext form_attributes() throws RecognitionException {
		Form_attributesContext _localctx = new Form_attributesContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_form_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(METHOD);
			setState(511);
			match(COMMA);
			setState(512);
			match(STRING);
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

	public static class Form_bodyContext extends ParserRuleContext {
		public List<Body_elementContext> body_element() {
			return getRuleContexts(Body_elementContext.class);
		}
		public Body_elementContext body_element(int i) {
			return getRuleContext(Body_elementContext.class,i);
		}
		public Form_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_form_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterForm_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitForm_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitForm_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Form_bodyContext form_body() throws RecognitionException {
		Form_bodyContext _localctx = new Form_bodyContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_form_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (TEXT - 6)) | (1L << (IMAGE - 6)) | (1L << (LIST - 6)) | (1L << (TABLE - 6)) | (1L << (BUTTON - 6)) | (1L << (BOOLEAN - 6)) | (1L << (FORM - 6)) | (1L << (TEXT_FIELD - 6)) | (1L << (DATE - 6)) | (1L << (CHECKBOX - 6)) | (1L << (SELCTION - 6)) | (1L << (RADIO - 6)) | (1L << (SWITCH - 6)) | (1L << (LINK - 6)) | (1L << (AT_AUTH - 6)) | (1L << (AT_GUEST - 6)) | (1L << (AT_ROLE - 6)) | (1L << (AT_INVERSE_ROLE - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (AT_SECTION - 6)) | (1L << (AT_YIELD - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
				{
				{
				setState(514);
				body_element();
				}
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Text_fieldContext extends ParserRuleContext {
		public TerminalNode TEXT_FIELD() { return getToken(LanguageParser.TEXT_FIELD, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Text_field_attributesContext text_field_attributes() {
			return getRuleContext(Text_field_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public Text_fieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterText_field(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitText_field(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitText_field(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_fieldContext text_field() throws RecognitionException {
		Text_fieldContext _localctx = new Text_fieldContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_text_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(TEXT_FIELD);
			setState(521);
			match(BRACKET_OPEN);
			setState(522);
			text_field_attributes();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(523);
				match(COMMA);
				setState(524);
				extra_attributes();
				}
			}

			setState(527);
			match(BRACKET_CLOSE);
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

	public static class Text_field_attributesContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(LanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LanguageParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Text_field_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_field_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterText_field_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitText_field_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitText_field_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_field_attributesContext text_field_attributes() throws RecognitionException {
		Text_field_attributesContext _localctx = new Text_field_attributesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_text_field_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(STRING);
			setState(530);
			match(COMMA);
			setState(531);
			match(STRING);
			setState(532);
			match(COMMA);
			setState(533);
			expression(0);
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(LanguageParser.DATE, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Date_attributesContext date_attributes() {
			return getRuleContext(Date_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(DATE);
			setState(536);
			match(BRACKET_OPEN);
			setState(537);
			date_attributes();
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(538);
				match(COMMA);
				setState(539);
				extra_attributes();
				}
			}

			setState(542);
			match(BRACKET_CLOSE);
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

	public static class Date_attributesContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(LanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LanguageParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Date_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterDate_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitDate_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitDate_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Date_attributesContext date_attributes() throws RecognitionException {
		Date_attributesContext _localctx = new Date_attributesContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_date_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544);
			match(STRING);
			setState(545);
			match(COMMA);
			setState(546);
			match(STRING);
			setState(547);
			match(COMMA);
			setState(548);
			expression(0);
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

	public static class Check_boxContext extends ParserRuleContext {
		public TerminalNode CHECKBOX() { return getToken(LanguageParser.CHECKBOX, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Check_box_attributesContext check_box_attributes() {
			return getRuleContext(Check_box_attributesContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public Check_boxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_box; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCheck_box(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCheck_box(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCheck_box(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_boxContext check_box() throws RecognitionException {
		Check_boxContext _localctx = new Check_boxContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_check_box);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(CHECKBOX);
			setState(551);
			match(BRACKET_OPEN);
			setState(552);
			check_box_attributes();
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(553);
				match(COMMA);
				setState(554);
				extra_attributes();
				}
			}

			setState(557);
			match(BRACKET_CLOSE);
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

	public static class Check_box_attributesContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(LanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LanguageParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Check_box_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check_box_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterCheck_box_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitCheck_box_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitCheck_box_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Check_box_attributesContext check_box_attributes() throws RecognitionException {
		Check_box_attributesContext _localctx = new Check_box_attributesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_check_box_attributes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			match(STRING);
			setState(560);
			match(COMMA);
			setState(561);
			expression(0);
			setState(562);
			match(COMMA);
			setState(563);
			match(STRING);
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

	public static class SelectionContext extends ParserRuleContext {
		public TerminalNode SELCTION() { return getToken(LanguageParser.SELCTION, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public Selection_attributeContext selection_attribute() {
			return getRuleContext(Selection_attributeContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public Selection_bodyContext selection_body() {
			return getRuleContext(Selection_bodyContext.class,0);
		}
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public SelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionContext selection() throws RecognitionException {
		SelectionContext _localctx = new SelectionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_selection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			match(SELCTION);
			setState(566);
			match(BRACKET_OPEN);
			setState(567);
			selection_attribute();
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(568);
				match(COMMA);
				setState(569);
				extra_attributes();
				}
			}

			setState(572);
			match(BRACKET_CLOSE);
			setState(573);
			match(CURLEY_BRACKET_OPEN);
			setState(574);
			selection_body();
			setState(575);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class Selection_attributeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(LanguageParser.BOOLEAN, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public Selection_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSelection_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSelection_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSelection_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_attributeContext selection_attribute() throws RecognitionException {
		Selection_attributeContext _localctx = new Selection_attributeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_selection_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(BOOLEAN);
			setState(578);
			match(COMMA);
			setState(579);
			match(STRING);
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

	public static class Selection_bodyContext extends ParserRuleContext {
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(LanguageParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(LanguageParser.COLON, i);
		}
		public Selection_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selection_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSelection_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSelection_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSelection_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Selection_bodyContext selection_body() throws RecognitionException {
		Selection_bodyContext _localctx = new Selection_bodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_selection_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(581);
				option();
				}
			}

			setState(588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLON) {
				{
				{
				setState(584);
				match(COLON);
				setState(585);
				option();
				}
				}
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(STRING);
			setState(592);
			match(COMMA);
			setState(593);
			expression(0);
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

	public static class RadioContext extends ParserRuleContext {
		public TerminalNode RADIO() { return getToken(LanguageParser.RADIO, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public Selection_bodyContext selection_body() {
			return getRuleContext(Selection_bodyContext.class,0);
		}
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public Extra_attributesContext extra_attributes() {
			return getRuleContext(Extra_attributesContext.class,0);
		}
		public RadioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_radio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterRadio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitRadio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitRadio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RadioContext radio() throws RecognitionException {
		RadioContext _localctx = new RadioContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_radio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			match(RADIO);
			setState(596);
			match(ID);
			setState(597);
			match(BRACKET_OPEN);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SQUARE_OPEN) {
				{
				setState(598);
				extra_attributes();
				}
			}

			setState(601);
			match(BRACKET_CLOSE);
			setState(602);
			match(CURLEY_BRACKET_OPEN);
			setState(603);
			selection_body();
			setState(604);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class Extra_attributesContext extends ParserRuleContext {
		public TerminalNode SQUARE_OPEN() { return getToken(LanguageParser.SQUARE_OPEN, 0); }
		public List<Array_valueContext> array_value() {
			return getRuleContexts(Array_valueContext.class);
		}
		public Array_valueContext array_value(int i) {
			return getRuleContext(Array_valueContext.class,i);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LanguageParser.SQUARE_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public Extra_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extra_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterExtra_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitExtra_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitExtra_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extra_attributesContext extra_attributes() throws RecognitionException {
		Extra_attributesContext _localctx = new Extra_attributesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_extra_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(SQUARE_OPEN);
			setState(607);
			array_value();
			setState(612);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(608);
				match(COMMA);
				setState(609);
				array_value();
				}
				}
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(615);
			match(SQUARE_CLOSE);
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

	public static class Array_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public TerminalNode ARROW() { return getToken(LanguageParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterArray_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitArray_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitArray_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_valueContext array_value() throws RecognitionException {
		Array_valueContext _localctx = new Array_valueContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_array_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(STRING);
			setState(618);
			match(ARROW);
			setState(619);
			expression(0);
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

	public static class Table_bodyContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(LanguageParser.HEADER, 0); }
		public List<TerminalNode> COLON() { return getTokens(LanguageParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(LanguageParser.COLON, i);
		}
		public List<TerminalNode> CURLEY_BRACKET_OPEN() { return getTokens(LanguageParser.CURLEY_BRACKET_OPEN); }
		public TerminalNode CURLEY_BRACKET_OPEN(int i) {
			return getToken(LanguageParser.CURLEY_BRACKET_OPEN, i);
		}
		public Table_header_bodyContext table_header_body() {
			return getRuleContext(Table_header_bodyContext.class,0);
		}
		public List<TerminalNode> CURLEY_BRACKET_CLOSE() { return getTokens(LanguageParser.CURLEY_BRACKET_CLOSE); }
		public TerminalNode CURLEY_BRACKET_CLOSE(int i) {
			return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public TerminalNode BODY() { return getToken(LanguageParser.BODY, 0); }
		public List<Body_optionsContext> body_options() {
			return getRuleContexts(Body_optionsContext.class);
		}
		public Body_optionsContext body_options(int i) {
			return getRuleContext(Body_optionsContext.class,i);
		}
		public Table_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterTable_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitTable_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitTable_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_bodyContext table_body() throws RecognitionException {
		Table_bodyContext _localctx = new Table_bodyContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_table_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(HEADER);
			setState(622);
			match(COLON);
			setState(623);
			match(CURLEY_BRACKET_OPEN);
			setState(624);
			table_header_body();
			setState(625);
			match(CURLEY_BRACKET_CLOSE);
			setState(626);
			match(COMMA);
			setState(627);
			match(BODY);
			setState(628);
			match(COLON);
			setState(629);
			match(CURLEY_BRACKET_OPEN);
			setState(630);
			body_options();
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(631);
				match(COMMA);
				setState(632);
				body_options();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class Table_header_bodyContext extends ParserRuleContext {
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public Table_header_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_header_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterTable_header_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitTable_header_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitTable_header_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_header_bodyContext table_header_body() throws RecognitionException {
		Table_header_bodyContext _localctx = new Table_header_bodyContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_table_header_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			text();
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(641);
				match(COMMA);
				setState(642);
				text();
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ControllerContext extends ParserRuleContext {
		public TerminalNode CONTROLLER() { return getToken(LanguageParser.CONTROLLER, 0); }
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public TerminalNode CONTROLES() { return getToken(LanguageParser.CONTROLES, 0); }
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public List<Controller_body_elementContext> controller_body_element() {
			return getRuleContexts(Controller_body_elementContext.class);
		}
		public Controller_body_elementContext controller_body_element(int i) {
			return getRuleContext(Controller_body_elementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ControllerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controller; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterController(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitController(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitController(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControllerContext controller() throws RecognitionException {
		ControllerContext _localctx = new ControllerContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_controller);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(CONTROLLER);
			setState(649);
			match(ID);
			setState(650);
			match(CONTROLES);
			setState(651);
			match(ID);
			setState(652);
			match(CURLEY_BRACKET_OPEN);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 6)) & ~0x3f) == 0 && ((1L << (_la - 6)) & ((1L << (IF - 6)) | (1L << (CHECK_AUTH - 6)) | (1L << (CHECK_VALID - 6)) | (1L << (CHECK_ROLE - 6)) | (1L << (REDIRECT - 6)) | (1L << (BOOLEAN - 6)) | (1L << (SWITCH - 6)) | (1L << (AT_RAW_PHP - 6)) | (1L << (FOR - 6)) | (1L << (SHARED_DATA - 6)) | (1L << (FORM_DATA - 6)) | (1L << (BRACKET_OPEN - 6)) | (1L << (SQUARE_OPEN - 6)) | (1L << (CURLEY_BRACKET_OPEN - 6)) | (1L << (ONE_LOGICAL_OPERAND - 6)) | (1L << (ONE_VALUABLE_OPERAND - 6)) | (1L << (AT - 6)) | (1L << (DECIMAL - 6)) | (1L << (STRING - 6)) | (1L << (CHAR - 6)))) != 0)) {
				{
				setState(655);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REDIRECT:
					{
					setState(653);
					controller_body_element();
					}
					break;
				case IF:
				case CHECK_AUTH:
				case CHECK_VALID:
				case CHECK_ROLE:
				case BOOLEAN:
				case SWITCH:
				case AT_RAW_PHP:
				case FOR:
				case SHARED_DATA:
				case FORM_DATA:
				case BRACKET_OPEN:
				case SQUARE_OPEN:
				case CURLEY_BRACKET_OPEN:
				case ONE_LOGICAL_OPERAND:
				case ONE_VALUABLE_OPERAND:
				case AT:
				case DECIMAL:
				case STRING:
				case CHAR:
					{
					setState(654);
					statement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
			match(CURLEY_BRACKET_CLOSE);
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

	public static class Controller_body_elementContext extends ParserRuleContext {
		public TerminalNode REDIRECT() { return getToken(LanguageParser.REDIRECT, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public Controller_body_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controller_body_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterController_body_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitController_body_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitController_body_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Controller_body_elementContext controller_body_element() throws RecognitionException {
		Controller_body_elementContext _localctx = new Controller_body_elementContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_controller_body_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			match(REDIRECT);
			setState(663);
			match(ID);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode SQUARE_OPEN() { return getToken(LanguageParser.SQUARE_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQUARE_CLOSE() { return getToken(LanguageParser.SQUARE_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_array);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(SQUARE_OPEN);
			setState(671);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(666);
					expression(0);
					setState(667);
					match(COMMA);
					}
					} 
				}
				setState(673);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(674);
			expression(0);
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(675);
				match(COMMA);
				}
			}

			setState(678);
			match(SQUARE_CLOSE);
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

	public static class Map_valueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode COLON() { return getToken(LanguageParser.COLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Map_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterMap_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitMap_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitMap_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Map_valueContext map_value() throws RecognitionException {
		Map_valueContext _localctx = new Map_valueContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_map_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(ID);
			setState(681);
			match(COLON);
			setState(682);
			expression(0);
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

	public static class MapContext extends ParserRuleContext {
		public TerminalNode CURLEY_BRACKET_OPEN() { return getToken(LanguageParser.CURLEY_BRACKET_OPEN, 0); }
		public List<Map_valueContext> map_value() {
			return getRuleContexts(Map_valueContext.class);
		}
		public Map_valueContext map_value(int i) {
			return getRuleContext(Map_valueContext.class,i);
		}
		public TerminalNode CURLEY_BRACKET_CLOSE() { return getToken(LanguageParser.CURLEY_BRACKET_CLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LanguageParser.COMMA, i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_map);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			match(CURLEY_BRACKET_OPEN);
			setState(685);
			map_value();
			setState(690);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(686);
					match(COMMA);
					setState(687);
					map_value();
					}
					} 
				}
				setState(692);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(693);
				match(COMMA);
				}
			}

			setState(696);
			match(CURLEY_BRACKET_CLOSE);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalControllerFunctionCallContext extends ExpressionContext {
		public TerminalNode CHECK_AUTH() { return getToken(LanguageParser.CHECK_AUTH, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public TerminalNode CHECK_VALID() { return getToken(LanguageParser.CHECK_VALID, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(LanguageParser.COMMA, 0); }
		public TerminalNode CHECK_ROLE() { return getToken(LanguageParser.CHECK_ROLE, 0); }
		public LogicalControllerFunctionCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLogicalControllerFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLogicalControllerFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLogicalControllerFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralArrayExpressionContext extends ExpressionContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public LiteralArrayExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLiteralArrayExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLiteralArrayExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLiteralArrayExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TwoOperandsConditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OPERATOR_TWO_OPERAND() { return getToken(LanguageParser.OPERATOR_TWO_OPERAND, 0); }
		public TwoOperandsConditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterTwoOperandsConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitTwoOperandsConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitTwoOperandsConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SharedVariableNameExpressionContext extends ExpressionContext {
		public TerminalNode SHARED_DATA() { return getToken(LanguageParser.SHARED_DATA, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public SharedVariableNameExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterSharedVariableNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitSharedVariableNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitSharedVariableNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MathematicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MULTIPLICATIVE_OPERATOR() { return getToken(LanguageParser.MULTIPLICATIVE_OPERATOR, 0); }
		public TerminalNode ADDITIVE_OPERATOR() { return getToken(LanguageParser.ADDITIVE_OPERATOR, 0); }
		public MathematicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterMathematicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitMathematicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitMathematicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IndexedVariableExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SQUARE_OPEN() { return getToken(LanguageParser.SQUARE_OPEN, 0); }
		public TerminalNode SQUARE_CLOSE() { return getToken(LanguageParser.SQUARE_CLOSE, 0); }
		public IndexedVariableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterIndexedVariableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitIndexedVariableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitIndexedVariableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FormVariableNameExpressionContext extends ExpressionContext {
		public TerminalNode FORM_DATA() { return getToken(LanguageParser.FORM_DATA, 0); }
		public TerminalNode BRACKET_OPEN() { return getToken(LanguageParser.BRACKET_OPEN, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode BRACKET_CLOSE() { return getToken(LanguageParser.BRACKET_CLOSE, 0); }
		public FormVariableNameExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterFormVariableNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitFormVariableNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitFormVariableNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralBooleanExpressionContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(LanguageParser.BOOLEAN, 0); }
		public LiteralBooleanExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLiteralBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLiteralBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLiteralBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneOperandConditionExpressionContext extends ExpressionContext {
		public TerminalNode ONE_LOGICAL_OPERAND() { return getToken(LanguageParser.ONE_LOGICAL_OPERAND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OneOperandConditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterOneOperandConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitOneOperandConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitOneOperandConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralNumericExpressionContext extends ExpressionContext {
		public TerminalNode DECIMAL() { return getToken(LanguageParser.DECIMAL, 0); }
		public LiteralNumericExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLiteralNumericExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLiteralNumericExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLiteralNumericExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralObjectExpressionContext extends ExpressionContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public LiteralObjectExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLiteralObjectExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLiteralObjectExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLiteralObjectExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralStringExpressionContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public LiteralStringExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLiteralStringExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLiteralStringExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLiteralStringExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatConditionExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CONDITIONAL_CONCAT_OPERATOR() { return getToken(LanguageParser.CONDITIONAL_CONCAT_OPERATOR, 0); }
		public ConcatConditionExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterConcatConditionExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitConcatConditionExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitConcatConditionExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OneOperandValuableExpressionContext extends ExpressionContext {
		public TerminalNode ONE_VALUABLE_OPERAND() { return getToken(LanguageParser.ONE_VALUABLE_OPERAND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OneOperandValuableExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterOneOperandValuableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitOneOperandValuableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitOneOperandValuableExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableNameExpressionContext extends ExpressionContext {
		public TerminalNode AT() { return getToken(LanguageParser.AT, 0); }
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public VariableNameExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterVariableNameExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitVariableNameExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitVariableNameExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralCharExpressionContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(LanguageParser.CHAR, 0); }
		public LiteralCharExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).enterLiteralCharExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageParserListener ) ((LanguageParserListener)listener).exitLiteralCharExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageParserVisitor ) return ((LanguageParserVisitor<? extends T>)visitor).visitLiteralCharExpression(this);
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
		int _startState = 118;
		enterRecursionRule(_localctx, 118, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				{
				_localctx = new VariableNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(699);
				match(AT);
				setState(700);
				match(ID);
				}
				break;
			case SHARED_DATA:
				{
				_localctx = new SharedVariableNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(701);
				match(SHARED_DATA);
				setState(702);
				match(BRACKET_OPEN);
				setState(703);
				match(ID);
				setState(704);
				match(BRACKET_CLOSE);
				}
				break;
			case FORM_DATA:
				{
				_localctx = new FormVariableNameExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(705);
				match(FORM_DATA);
				setState(706);
				match(BRACKET_OPEN);
				setState(707);
				match(ID);
				setState(708);
				match(BRACKET_CLOSE);
				}
				break;
			case DECIMAL:
				{
				_localctx = new LiteralNumericExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(709);
				match(DECIMAL);
				}
				break;
			case CHAR:
				{
				_localctx = new LiteralCharExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(710);
				match(CHAR);
				}
				break;
			case STRING:
				{
				_localctx = new LiteralStringExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(711);
				match(STRING);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new LiteralBooleanExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(712);
				match(BOOLEAN);
				}
				break;
			case SQUARE_OPEN:
				{
				_localctx = new LiteralArrayExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(713);
				array();
				}
				break;
			case CURLEY_BRACKET_OPEN:
				{
				_localctx = new LiteralObjectExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(714);
				map();
				}
				break;
			case ONE_LOGICAL_OPERAND:
				{
				_localctx = new OneOperandConditionExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(715);
				match(ONE_LOGICAL_OPERAND);
				setState(716);
				expression(5);
				}
				break;
			case ONE_VALUABLE_OPERAND:
				{
				_localctx = new OneOperandValuableExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(717);
				match(ONE_VALUABLE_OPERAND);
				setState(718);
				expression(4);
				}
				break;
			case BRACKET_OPEN:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(719);
				match(BRACKET_OPEN);
				setState(720);
				expression(0);
				setState(721);
				match(BRACKET_CLOSE);
				}
				break;
			case CHECK_AUTH:
			case CHECK_VALID:
			case CHECK_ROLE:
				{
				_localctx = new LogicalControllerFunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(738);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHECK_AUTH:
					{
					setState(723);
					match(CHECK_AUTH);
					setState(724);
					match(BRACKET_OPEN);
					setState(725);
					match(BRACKET_CLOSE);
					}
					break;
				case CHECK_VALID:
					{
					setState(726);
					match(CHECK_VALID);
					setState(727);
					match(BRACKET_OPEN);
					setState(728);
					expression(0);
					setState(729);
					match(COMMA);
					setState(730);
					expression(0);
					setState(731);
					match(BRACKET_CLOSE);
					}
					break;
				case CHECK_ROLE:
					{
					setState(733);
					match(CHECK_ROLE);
					setState(734);
					match(BRACKET_OPEN);
					setState(735);
					expression(0);
					setState(736);
					match(BRACKET_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(761);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
					case 1:
						{
						_localctx = new TwoOperandsConditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(742);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(743);
						match(OPERATOR_TWO_OPERAND);
						setState(744);
						expression(20);
						}
						break;
					case 2:
						{
						_localctx = new ConcatConditionExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(745);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(746);
						match(CONDITIONAL_CONCAT_OPERATOR);
						setState(747);
						expression(19);
						}
						break;
					case 3:
						{
						_localctx = new MathematicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(748);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(749);
						match(MULTIPLICATIVE_OPERATOR);
						setState(750);
						expression(18);
						}
						break;
					case 4:
						{
						_localctx = new MathematicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(751);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(752);
						match(ADDITIVE_OPERATOR);
						setState(753);
						expression(17);
						}
						break;
					case 5:
						{
						_localctx = new IndexedVariableExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(754);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(755);
						match(SQUARE_OPEN);
						setState(756);
						expression(0);
						setState(757);
						match(SQUARE_CLOSE);
						}
						}
						break;
					case 6:
						{
						_localctx = new OneOperandValuableExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(759);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(760);
						match(ONE_VALUABLE_OPERAND);
						}
						break;
					}
					} 
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
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
		case 59:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3H\u0301\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\7\2\u0083\n\2\f\2\16\2\u0086"+
		"\13\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4\u008f\n\4\3\4\3\4\7\4\u0093\n\4"+
		"\f\4\16\4\u0096\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00a7\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b0\n\b\3\t"+
		"\3\t\3\t\5\t\u00b5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00bd\n\n\f\n\16\n"+
		"\u00c0\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c8\n\n\3\13\7\13\u00cb\n\13"+
		"\f\13\16\13\u00ce\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\7\r\u00d9"+
		"\n\r\f\r\16\r\u00dc\13\r\3\r\5\r\u00df\n\r\3\16\3\16\3\16\3\16\7\16\u00e5"+
		"\n\16\f\16\16\16\u00e8\13\16\3\16\3\16\3\17\3\17\3\17\7\17\u00ef\n\17"+
		"\f\17\16\17\u00f2\13\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u010a"+
		"\n\22\f\22\16\22\u010d\13\22\3\22\3\22\3\23\3\23\3\24\3\24\7\24\u0115"+
		"\n\24\f\24\16\24\u0118\13\24\3\24\3\24\7\24\u011c\n\24\f\24\16\24\u011f"+
		"\13\24\5\24\u0121\n\24\3\24\3\24\3\24\7\24\u0126\n\24\f\24\16\24\u0129"+
		"\13\24\3\24\3\24\7\24\u012d\n\24\f\24\16\24\u0130\13\24\5\24\u0132\n\24"+
		"\3\24\5\24\u0135\n\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u013d\n\25\f"+
		"\25\16\25\u0140\13\25\3\25\3\25\3\25\7\25\u0145\n\25\f\25\16\25\u0148"+
		"\13\25\3\25\3\25\7\25\u014c\n\25\f\25\16\25\u014f\13\25\5\25\u0151\n\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u015a\n\25\f\25\16\25\u015d\13"+
		"\25\3\25\3\25\3\25\7\25\u0162\n\25\f\25\16\25\u0165\13\25\3\25\3\25\7"+
		"\25\u0169\n\25\f\25\16\25\u016c\13\25\5\25\u016e\n\25\3\25\5\25\u0171"+
		"\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\7\27\u017b\n\27\f\27\16"+
		"\27\u017e\13\27\3\27\3\27\3\27\3\27\3\27\5\27\u0185\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u018d\n\30\3\31\3\31\3\31\3\31\3\31\5\31\u0194\n"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5"+
		"\33\u01a3\n\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01b2\n\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\5\37\u01bf\n\37\3\37\3\37\3\37\7\37\u01c4\n\37\f\37\16\37\u01c7"+
		"\13\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u01d9"+
		"\n\"\3\"\3\"\3\"\7\"\u01de\n\"\f\"\16\"\u01e1\13\"\3\"\3\"\3#\3#\3$\3"+
		"$\3$\3$\5$\u01eb\n$\3%\3%\3%\3%\3%\3%\5%\u01f3\n%\3&\3&\3&\3&\3&\5&\u01fa"+
		"\n&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3(\7(\u0206\n(\f(\16(\u0209\13(\3)"+
		"\3)\3)\3)\3)\5)\u0210\n)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\5+\u021f"+
		"\n+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\5-\u022e\n-\3-\3-\3.\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3/\5/\u023d\n/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60"+
		"\3\61\5\61\u0249\n\61\3\61\3\61\7\61\u024d\n\61\f\61\16\61\u0250\13\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u025a\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\64\3\64\3\64\3\64\7\64\u0265\n\64\f\64\16\64\u0268\13\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u027c\n\66\f\66\16\66\u027f\13\66\3\66\3\66"+
		"\3\67\3\67\3\67\7\67\u0286\n\67\f\67\16\67\u0289\13\67\38\38\38\38\38"+
		"\38\38\78\u0292\n8\f8\168\u0295\138\38\38\39\39\39\3:\3:\3:\3:\7:\u02a0"+
		"\n:\f:\16:\u02a3\13:\3:\3:\5:\u02a7\n:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\7"+
		"<\u02b3\n<\f<\16<\u02b6\13<\3<\5<\u02b9\n<\3<\3<\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02e5\n=\5=\u02e7\n=\3=\3=\3=\3=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\7=\u02fc\n=\f=\16=\u02ff\13"+
		"=\3=\2\3x>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\2\2\u0329\2z\3\2\2\2\4\u0087\3\2"+
		"\2\2\6\u0089\3\2\2\2\b\u0099\3\2\2\2\n\u009e\3\2\2\2\f\u00a6\3\2\2\2\16"+
		"\u00af\3\2\2\2\20\u00b4\3\2\2\2\22\u00b6\3\2\2\2\24\u00cc\3\2\2\2\26\u00cf"+
		"\3\2\2\2\30\u00da\3\2\2\2\32\u00e0\3\2\2\2\34\u00eb\3\2\2\2\36\u00f3\3"+
		"\2\2\2 \u00f8\3\2\2\2\"\u00ff\3\2\2\2$\u0110\3\2\2\2&\u0134\3\2\2\2(\u0170"+
		"\3\2\2\2*\u0172\3\2\2\2,\u0184\3\2\2\2.\u018c\3\2\2\2\60\u018e\3\2\2\2"+
		"\62\u0197\3\2\2\2\64\u019d\3\2\2\2\66\u01a6\3\2\2\28\u01ac\3\2\2\2:\u01b5"+
		"\3\2\2\2<\u01b9\3\2\2\2>\u01ca\3\2\2\2@\u01cc\3\2\2\2B\u01d3\3\2\2\2D"+
		"\u01e4\3\2\2\2F\u01ea\3\2\2\2H\u01f2\3\2\2\2J\u01f4\3\2\2\2L\u0200\3\2"+
		"\2\2N\u0207\3\2\2\2P\u020a\3\2\2\2R\u0213\3\2\2\2T\u0219\3\2\2\2V\u0222"+
		"\3\2\2\2X\u0228\3\2\2\2Z\u0231\3\2\2\2\\\u0237\3\2\2\2^\u0243\3\2\2\2"+
		"`\u0248\3\2\2\2b\u0251\3\2\2\2d\u0255\3\2\2\2f\u0260\3\2\2\2h\u026b\3"+
		"\2\2\2j\u026f\3\2\2\2l\u0282\3\2\2\2n\u028a\3\2\2\2p\u0298\3\2\2\2r\u029b"+
		"\3\2\2\2t\u02aa\3\2\2\2v\u02ae\3\2\2\2x\u02e6\3\2\2\2z~\5\4\3\2{}\5\6"+
		"\4\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0084\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u0083\5n8\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\3\3\2\2\2\u0086\u0084"+
		"\3\2\2\2\u0087\u0088\5\6\4\2\u0088\5\3\2\2\2\u0089\u008a\7\3\2\2\u008a"+
		"\u008b\7B\2\2\u008b\u008e\5\b\5\2\u008c\u008d\7\5\2\2\u008d\u008f\7B\2"+
		"\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094"+
		"\7\65\2\2\u0091\u0093\5\f\7\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094"+
		"\3\2\2\2\u0097\u0098\7\66\2\2\u0098\7\3\2\2\2\u0099\u009a\7\7\2\2\u009a"+
		"\u009b\7\61\2\2\u009b\u009c\5\n\6\2\u009c\u009d\7\62\2\2\u009d\t\3\2\2"+
		"\2\u009e\u009f\7F\2\2\u009f\13\3\2\2\2\u00a0\u00a7\5H%\2\u00a1\u00a7\5"+
		".\30\2\u00a2\u00a7\5\16\b\2\u00a3\u00a7\5&\24\2\u00a4\u00a7\5(\25\2\u00a5"+
		"\u00a7\5,\27\2\u00a6\u00a0\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2"+
		"\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7"+
		"\r\3\2\2\2\u00a8\u00b0\5\22\n\2\u00a9\u00b0\5\26\f\2\u00aa\u00b0\5\"\22"+
		"\2\u00ab\u00b0\5\36\20\2\u00ac\u00b0\5 \21\2\u00ad\u00b0\5x=\2\u00ae\u00b0"+
		"\5*\26\2\u00af\u00a8\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\17\3\2\2\2\u00b1\u00b5\5\16\b\2\u00b2\u00b5\5\f\7\2\u00b3\u00b5"+
		"\5p9\2\u00b4\u00b1\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\21\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\7\61\2\2\u00b8\u00b9\5x=\2"+
		"\u00b9\u00ba\7\62\2\2\u00ba\u00be\7\65\2\2\u00bb\u00bd\5\20\t\2\u00bc"+
		"\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c7\7\66\2\2\u00c2"+
		"\u00c3\7)\2\2\u00c3\u00c4\7\65\2\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\7"+
		"\66\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\23\3\2\2\2\u00c9\u00cb\5\20\t\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2"+
		"\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\25\3\2\2\2\u00ce\u00cc"+
		"\3\2\2\2\u00cf\u00d0\7\37\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\5x=\2\u00d2"+
		"\u00d3\7\62\2\2\u00d3\u00d4\7\65\2\2\u00d4\u00d5\5\30\r\2\u00d5\u00d6"+
		"\7\66\2\2\u00d6\27\3\2\2\2\u00d7\u00d9\5\32\16\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00de\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5\34\17\2\u00de\u00dd\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\31\3\2\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00e2\5x=\2"+
		"\u00e2\u00e6\78\2\2\u00e3\u00e5\5\20\t\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8"+
		"\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e9\u00ea\7\17\2\2\u00ea\33\3\2\2\2\u00eb\u00ec\7\30"+
		"\2\2\u00ec\u00f0\78\2\2\u00ed\u00ef\5\20\t\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\35\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7@\2\2\u00f4\u00f5\7B\2\2\u00f5\u00f6"+
		"\7?\2\2\u00f6\u00f7\5x=\2\u00f7\37\3\2\2\2\u00f8\u00f9\7/\2\2\u00f9\u00fa"+
		"\7\61\2\2\u00fa\u00fb\7B\2\2\u00fb\u00fc\7\62\2\2\u00fc\u00fd\7?\2\2\u00fd"+
		"\u00fe\5x=\2\u00fe!\3\2\2\2\u00ff\u0100\7(\2\2\u0100\u0101\7\61\2\2\u0101"+
		"\u0102\5$\23\2\u0102\u0103\7\17\2\2\u0103\u0104\5x=\2\u0104\u0105\7\17"+
		"\2\2\u0105\u0106\5x=\2\u0106\u0107\7\62\2\2\u0107\u010b\7\65\2\2\u0108"+
		"\u010a\5\20\t\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u010f\7\66\2\2\u010f#\3\2\2\2\u0110\u0111\5\36\20\2\u0111%\3\2\2\2\u0112"+
		"\u0116\7!\2\2\u0113\u0115\5\f\7\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2"+
		"\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0120\3\2\2\2\u0118"+
		"\u0116\3\2\2\2\u0119\u011d\7)\2\2\u011a\u011c\5\f\7\2\u011b\u011a\3\2"+
		"\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0119\3\2\2\2\u0120\u0121\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0135\7*\2\2\u0123\u0127\7\"\2\2\u0124"+
		"\u0126\5\f\7\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2"+
		"\2\2\u0127\u0128\3\2\2\2\u0128\u0131\3\2\2\2\u0129\u0127\3\2\2\2\u012a"+
		"\u012e\7)\2\2\u012b\u012d\5\f\7\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u012a\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2"+
		"\2\2\u0133\u0135\7+\2\2\u0134\u0112\3\2\2\2\u0134\u0123\3\2\2\2\u0135"+
		"\'\3\2\2\2\u0136\u0137\7#\2\2\u0137\u0138\7\61\2\2\u0138\u0139\7\63\2"+
		"\2\u0139\u013e\7F\2\2\u013a\u013b\7\67\2\2\u013b\u013d\7F\2\2\u013c\u013a"+
		"\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0142\7\64\2\2\u0142\u0146\7"+
		"\62\2\2\u0143\u0145\5\f\7\2\u0144\u0143\3\2\2\2\u0145\u0148\3\2\2\2\u0146"+
		"\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0150\3\2\2\2\u0148\u0146\3\2"+
		"\2\2\u0149\u014d\7)\2\2\u014a\u014c\5\f\7\2\u014b\u014a\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0151\3\2"+
		"\2\2\u014f\u014d\3\2\2\2\u0150\u0149\3\2\2\2\u0150\u0151\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0171\7,\2\2\u0153\u0154\7$\2\2\u0154\u0155\7\61"+
		"\2\2\u0155\u0156\7\63\2\2\u0156\u015b\7F\2\2\u0157\u0158\7\67\2\2\u0158"+
		"\u015a\7F\2\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u015f\7\64\2\2\u015f\u0163\7\62\2\2\u0160\u0162\5\f\7\2\u0161\u0160\3"+
		"\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u016d\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016a\7)\2\2\u0167\u0169\5\f"+
		"\7\2\u0168\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a"+
		"\u016b\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0166\3\2"+
		"\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\7-\2\2\u0170"+
		"\u0136\3\2\2\2\u0170\u0153\3\2\2\2\u0171)\3\2\2\2\u0172\u0173\7%\2\2\u0173"+
		"\u0174\7H\2\2\u0174+\3\2\2\2\u0175\u0176\7&\2\2\u0176\u0177\7\61\2\2\u0177"+
		"\u0178\7F\2\2\u0178\u017c\7\62\2\2\u0179\u017b\5\f\7\2\u017a\u0179\3\2"+
		"\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d"+
		"\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0185\7.\2\2\u0180\u0181\7\'"+
		"\2\2\u0181\u0182\7\61\2\2\u0182\u0183\7F\2\2\u0183\u0185\7\62\2\2\u0184"+
		"\u0175\3\2\2\2\u0184\u0180\3\2\2\2\u0185-\3\2\2\2\u0186\u018d\5\60\31"+
		"\2\u0187\u018d\5@!\2\u0188\u018d\58\35\2\u0189\u018d\5\64\33\2\u018a\u018d"+
		"\5<\37\2\u018b\u018d\5B\"\2\u018c\u0186\3\2\2\2\u018c\u0187\3\2\2\2\u018c"+
		"\u0188\3\2\2\2\u018c\u0189\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2"+
		"\2\2\u018d/\3\2\2\2\u018e\u018f\7\r\2\2\u018f\u0190\7\61\2\2\u0190\u0193"+
		"\5\62\32\2\u0191\u0192\7\67\2\2\u0192\u0194\5f\64\2\u0193\u0191\3\2\2"+
		"\2\u0193\u0194\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\7\62\2\2\u0196"+
		"\61\3\2\2\2\u0197\u0198\5x=\2\u0198\u0199\7\67\2\2\u0199\u019a\7D\2\2"+
		"\u019a\u019b\7\67\2\2\u019b\u019c\7E\2\2\u019c\63\3\2\2\2\u019d\u019e"+
		"\7\16\2\2\u019e\u019f\7\61\2\2\u019f\u01a2\5\66\34\2\u01a0\u01a1\7\67"+
		"\2\2\u01a1\u01a3\5f\64\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a5\7\62\2\2\u01a5\65\3\2\2\2\u01a6\u01a7\7F\2"+
		"\2\u01a7\u01a8\7\67\2\2\u01a8\u01a9\7D\2\2\u01a9\u01aa\7\67\2\2\u01aa"+
		"\u01ab\7D\2\2\u01ab\67\3\2\2\2\u01ac\u01ad\7\22\2\2\u01ad\u01ae\7\61\2"+
		"\2\u01ae\u01b1\5:\36\2\u01af\u01b0\7\67\2\2\u01b0\u01b2\5f\64\2\u01b1"+
		"\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\7\62"+
		"\2\2\u01b49\3\2\2\2\u01b5\u01b6\7F\2\2\u01b6\u01b7\7\67\2\2\u01b7\u01b8"+
		"\7F\2\2\u01b8;\3\2\2\2\u01b9\u01ba\7\20\2\2\u01ba\u01bb\7\61\2\2\u01bb"+
		"\u01be\5> \2\u01bc\u01bd\7\67\2\2\u01bd\u01bf\5f\64\2\u01be\u01bc\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7\62\2\2\u01c1"+
		"\u01c5\7\65\2\2\u01c2\u01c4\5F$\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2"+
		"\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01c9\7\66\2\2\u01c9=\3\2\2\2\u01ca\u01cb\7\25\2"+
		"\2\u01cb?\3\2\2\2\u01cc\u01cd\7\21\2\2\u01cd\u01ce\7\61\2\2\u01ce\u01cf"+
		"\7\62\2\2\u01cf\u01d0\7\65\2\2\u01d0\u01d1\5j\66\2\u01d1\u01d2\7\66\2"+
		"\2\u01d2A\3\2\2\2\u01d3\u01d4\7 \2\2\u01d4\u01d5\7\61\2\2\u01d5\u01d8"+
		"\5D#\2\u01d6\u01d7\7\67\2\2\u01d7\u01d9\5f\64\2\u01d8\u01d6\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\7\62\2\2\u01db\u01df\7"+
		"\65\2\2\u01dc\u01de\5F$\2\u01dd\u01dc\3\2\2\2\u01de\u01e1\3\2\2\2\u01df"+
		"\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e2\u01e3\7\66\2\2\u01e3C\3\2\2\2\u01e4\u01e5\7F\2\2\u01e5E\3\2"+
		"\2\2\u01e6\u01eb\5\60\31\2\u01e7\u01eb\5\64\33\2\u01e8\u01eb\5B\"\2\u01e9"+
		"\u01eb\5<\37\2\u01ea\u01e6\3\2\2\2\u01ea\u01e7\3\2\2\2\u01ea\u01e8\3\2"+
		"\2\2\u01ea\u01e9\3\2\2\2\u01ebG\3\2\2\2\u01ec\u01f3\5J&\2\u01ed\u01f3"+
		"\5P)\2\u01ee\u01f3\5T+\2\u01ef\u01f3\5X-\2\u01f0\u01f3\5\\/\2\u01f1\u01f3"+
		"\5d\63\2\u01f2\u01ec\3\2\2\2\u01f2\u01ed\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f2"+
		"\u01ef\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3I\3\2\2\2"+
		"\u01f4\u01f5\7\31\2\2\u01f5\u01f6\7\61\2\2\u01f6\u01f9\5L\'\2\u01f7\u01f8"+
		"\7\67\2\2\u01f8\u01fa\5f\64\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2"+
		"\u01fa\u01fb\3\2\2\2\u01fb\u01fc\7\62\2\2\u01fc\u01fd\7\65\2\2\u01fd\u01fe"+
		"\5N(\2\u01fe\u01ff\7\66\2\2\u01ffK\3\2\2\2\u0200\u0201\7\27\2\2\u0201"+
		"\u0202\7\67\2\2\u0202\u0203\7F\2\2\u0203M\3\2\2\2\u0204\u0206\5\f\7\2"+
		"\u0205\u0204\3\2\2\2\u0206\u0209\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208O\3\2\2\2\u0209\u0207\3\2\2\2\u020a\u020b\7\32\2\2\u020b"+
		"\u020c\7\61\2\2\u020c\u020f\5R*\2\u020d\u020e\7\67\2\2\u020e\u0210\5f"+
		"\64\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\u0212\7\62\2\2\u0212Q\3\2\2\2\u0213\u0214\7F\2\2\u0214\u0215\7\67\2\2"+
		"\u0215\u0216\7F\2\2\u0216\u0217\7\67\2\2\u0217\u0218\5x=\2\u0218S\3\2"+
		"\2\2\u0219\u021a\7\33\2\2\u021a\u021b\7\61\2\2\u021b\u021e\5V,\2\u021c"+
		"\u021d\7\67\2\2\u021d\u021f\5f\64\2\u021e\u021c\3\2\2\2\u021e\u021f\3"+
		"\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7\62\2\2\u0221U\3\2\2\2\u0222\u0223"+
		"\7F\2\2\u0223\u0224\7\67\2\2\u0224\u0225\7F\2\2\u0225\u0226\7\67\2\2\u0226"+
		"\u0227\5x=\2\u0227W\3\2\2\2\u0228\u0229\7\34\2\2\u0229\u022a\7\61\2\2"+
		"\u022a\u022d\5Z.\2\u022b\u022c\7\67\2\2\u022c\u022e\5f\64\2\u022d\u022b"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\7\62\2\2"+
		"\u0230Y\3\2\2\2\u0231\u0232\7F\2\2\u0232\u0233\7\67\2\2\u0233\u0234\5"+
		"x=\2\u0234\u0235\7\67\2\2\u0235\u0236\7F\2\2\u0236[\3\2\2\2\u0237\u0238"+
		"\7\35\2\2\u0238\u0239\7\61\2\2\u0239\u023c\5^\60\2\u023a\u023b\7\67\2"+
		"\2\u023b\u023d\5f\64\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e"+
		"\3\2\2\2\u023e\u023f\7\62\2\2\u023f\u0240\7\65\2\2\u0240\u0241\5`\61\2"+
		"\u0241\u0242\7\66\2\2\u0242]\3\2\2\2\u0243\u0244\7\25\2\2\u0244\u0245"+
		"\7\67\2\2\u0245\u0246\7F\2\2\u0246_\3\2\2\2\u0247\u0249\5b\62\2\u0248"+
		"\u0247\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024e\3\2\2\2\u024a\u024b\78"+
		"\2\2\u024b\u024d\5b\62\2\u024c\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e"+
		"\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024fa\3\2\2\2\u0250\u024e\3\2\2\2"+
		"\u0251\u0252\7F\2\2\u0252\u0253\7\67\2\2\u0253\u0254\5x=\2\u0254c\3\2"+
		"\2\2\u0255\u0256\7\36\2\2\u0256\u0257\7B\2\2\u0257\u0259\7\61\2\2\u0258"+
		"\u025a\5f\64\2\u0259\u0258\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\3\2"+
		"\2\2\u025b\u025c\7\62\2\2\u025c\u025d\7\65\2\2\u025d\u025e\5`\61\2\u025e"+
		"\u025f\7\66\2\2\u025fe\3\2\2\2\u0260\u0261\7\63\2\2\u0261\u0266\5h\65"+
		"\2\u0262\u0263\7\67\2\2\u0263\u0265\5h\65\2\u0264\u0262\3\2\2\2\u0265"+
		"\u0268\3\2\2\2\u0266\u0264\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u0269\3\2"+
		"\2\2\u0268\u0266\3\2\2\2\u0269\u026a\7\64\2\2\u026ag\3\2\2\2\u026b\u026c"+
		"\7F\2\2\u026c\u026d\7A\2\2\u026d\u026e\5x=\2\u026ei\3\2\2\2\u026f\u0270"+
		"\7\23\2\2\u0270\u0271\78\2\2\u0271\u0272\7\65\2\2\u0272\u0273\5l\67\2"+
		"\u0273\u0274\7\66\2\2\u0274\u0275\7\67\2\2\u0275\u0276\7\24\2\2\u0276"+
		"\u0277\78\2\2\u0277\u0278\7\65\2\2\u0278\u027d\5F$\2\u0279\u027a\7\67"+
		"\2\2\u027a\u027c\5F$\2\u027b\u0279\3\2\2\2\u027c\u027f\3\2\2\2\u027d\u027b"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u0280\3\2\2\2\u027f\u027d\3\2\2\2\u0280"+
		"\u0281\7\66\2\2\u0281k\3\2\2\2\u0282\u0287\5\60\31\2\u0283\u0284\7\67"+
		"\2\2\u0284\u0286\5\60\31\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0287\u0288\3\2\2\2\u0288m\3\2\2\2\u0289\u0287\3\2\2\2"+
		"\u028a\u028b\7\4\2\2\u028b\u028c\7B\2\2\u028c\u028d\7\6\2\2\u028d\u028e"+
		"\7B\2\2\u028e\u0293\7\65\2\2\u028f\u0292\5p9\2\u0290\u0292\5\16\b\2\u0291"+
		"\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296"+
		"\u0297\7\66\2\2\u0297o\3\2\2\2\u0298\u0299\7\f\2\2\u0299\u029a\7B\2\2"+
		"\u029aq\3\2\2\2\u029b\u02a1\7\63\2\2\u029c\u029d\5x=\2\u029d\u029e\7\67"+
		"\2\2\u029e\u02a0\3\2\2\2\u029f\u029c\3\2\2\2\u02a0\u02a3\3\2\2\2\u02a1"+
		"\u029f\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\3\2\2\2\u02a3\u02a1\3\2"+
		"\2\2\u02a4\u02a6\5x=\2\u02a5\u02a7\7\67\2\2\u02a6\u02a5\3\2\2\2\u02a6"+
		"\u02a7\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\7\64\2\2\u02a9s\3\2\2\2"+
		"\u02aa\u02ab\7B\2\2\u02ab\u02ac\78\2\2\u02ac\u02ad\5x=\2\u02adu\3\2\2"+
		"\2\u02ae\u02af\7\65\2\2\u02af\u02b4\5t;\2\u02b0\u02b1\7\67\2\2\u02b1\u02b3"+
		"\5t;\2\u02b2\u02b0\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4"+
		"\u02b5\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6\u02b4\3\2\2\2\u02b7\u02b9\7\67"+
		"\2\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba"+
		"\u02bb\7\66\2\2\u02bbw\3\2\2\2\u02bc\u02bd\b=\1\2\u02bd\u02be\7@\2\2\u02be"+
		"\u02e7\7B\2\2\u02bf\u02c0\7/\2\2\u02c0\u02c1\7\61\2\2\u02c1\u02c2\7B\2"+
		"\2\u02c2\u02e7\7\62\2\2\u02c3\u02c4\7\60\2\2\u02c4\u02c5\7\61\2\2\u02c5"+
		"\u02c6\7B\2\2\u02c6\u02e7\7\62\2\2\u02c7\u02e7\7D\2\2\u02c8\u02e7\7G\2"+
		"\2\u02c9\u02e7\7F\2\2\u02ca\u02e7\7\25\2\2\u02cb\u02e7\5r:\2\u02cc\u02e7"+
		"\5v<\2\u02cd\u02ce\7;\2\2\u02ce\u02e7\5x=\7\u02cf\u02d0\7<\2\2\u02d0\u02e7"+
		"\5x=\6\u02d1\u02d2\7\61\2\2\u02d2\u02d3\5x=\2\u02d3\u02d4\7\62\2\2\u02d4"+
		"\u02e7\3\2\2\2\u02d5\u02d6\7\t\2\2\u02d6\u02d7\7\61\2\2\u02d7\u02e5\7"+
		"\62\2\2\u02d8\u02d9\7\n\2\2\u02d9\u02da\7\61\2\2\u02da\u02db\5x=\2\u02db"+
		"\u02dc\7\67\2\2\u02dc\u02dd\5x=\2\u02dd\u02de\7\62\2\2\u02de\u02e5\3\2"+
		"\2\2\u02df\u02e0\7\13\2\2\u02e0\u02e1\7\61\2\2\u02e1\u02e2\5x=\2\u02e2"+
		"\u02e3\7\62\2\2\u02e3\u02e5\3\2\2\2\u02e4\u02d5\3\2\2\2\u02e4\u02d8\3"+
		"\2\2\2\u02e4\u02df\3\2\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02bc\3\2\2\2\u02e6"+
		"\u02bf\3\2\2\2\u02e6\u02c3\3\2\2\2\u02e6\u02c7\3\2\2\2\u02e6\u02c8\3\2"+
		"\2\2\u02e6\u02c9\3\2\2\2\u02e6\u02ca\3\2\2\2\u02e6\u02cb\3\2\2\2\u02e6"+
		"\u02cc\3\2\2\2\u02e6\u02cd\3\2\2\2\u02e6\u02cf\3\2\2\2\u02e6\u02d1\3\2"+
		"\2\2\u02e6\u02e4\3\2\2\2\u02e7\u02fd\3\2\2\2\u02e8\u02e9\f\25\2\2\u02e9"+
		"\u02ea\79\2\2\u02ea\u02fc\5x=\26\u02eb\u02ec\f\24\2\2\u02ec\u02ed\7:\2"+
		"\2\u02ed\u02fc\5x=\25\u02ee\u02ef\f\23\2\2\u02ef\u02f0\7>\2\2\u02f0\u02fc"+
		"\5x=\24\u02f1\u02f2\f\22\2\2\u02f2\u02f3\7=\2\2\u02f3\u02fc\5x=\23\u02f4"+
		"\u02f5\f\b\2\2\u02f5\u02f6\7\63\2\2\u02f6\u02f7\5x=\2\u02f7\u02f8\7\64"+
		"\2\2\u02f8\u02fc\3\2\2\2\u02f9\u02fa\f\5\2\2\u02fa\u02fc\7<\2\2\u02fb"+
		"\u02e8\3\2\2\2\u02fb\u02eb\3\2\2\2\u02fb\u02ee\3\2\2\2\u02fb\u02f1\3\2"+
		"\2\2\u02fb\u02f4\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fey\3\2\2\2\u02ff\u02fd\3\2\2\2"+
		"C~\u0084\u008e\u0094\u00a6\u00af\u00b4\u00be\u00c7\u00cc\u00da\u00de\u00e6"+
		"\u00f0\u010b\u0116\u011d\u0120\u0127\u012e\u0131\u0134\u013e\u0146\u014d"+
		"\u0150\u015b\u0163\u016a\u016d\u0170\u017c\u0184\u018c\u0193\u01a2\u01b1"+
		"\u01be\u01c5\u01d8\u01df\u01ea\u01f2\u01f9\u0207\u020f\u021e\u022d\u023c"+
		"\u0248\u024e\u0259\u0266\u027d\u0287\u0291\u0293\u02a1\u02a6\u02b4\u02b8"+
		"\u02e4\u02e6\u02fb\u02fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}