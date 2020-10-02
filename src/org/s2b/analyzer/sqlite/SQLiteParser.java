// Generated from SQLite.g4 by ANTLR 4.4

package org.s2b.analyzer.sqlite;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class SQLiteParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
	public static final int SCOL = 1, DOT = 2, OPEN_PAR = 3, CLOSE_PAR = 4,
			COMMA = 5, ASSIGN = 6, STAR = 7, PLUS = 8, MINUS = 9, TILDE = 10,
			PIPE2 = 11, DIV = 12, MOD = 13, LT2 = 14, GT2 = 15, AMP = 16,
			PIPE = 17, LT = 18, LT_EQ = 19, GT = 20, GT_EQ = 21, EQ = 22,
			NOT_EQ1 = 23, NOT_EQ2 = 24, ABORT = 25, ACTION = 26, ADD = 27,
			AFTER = 28, ALL = 29, ALTER = 30, ANALYZE = 31, AND = 32, AS = 33,
			ASC = 34, ATTACH = 35, AUTOINCREMENT = 36, BEFORE = 37, BEGIN = 38,
			BETWEEN = 39, BY = 40, CASCADE = 41, CASE = 42, CAST = 43,
			CHECK = 44, COLLATE = 45, COLUMN = 46, COMMIT = 47, CONFLICT = 48,
			CONSTRAINT = 49, CREATE = 50, CROSS = 51, CURRENT_DATE = 52,
			CURRENT_TIME = 53, CURRENT_TIMESTAMP = 54, DATABASE = 55,
			DEFAULT = 56, DEFERRABLE = 57, DEFERRED = 58, DELETE = 59,
			DESC = 60, DETACH = 61, DISTINCT = 62, DROP = 63, EACH = 64,
			ELSE = 65, END = 66, ESCAPE = 67, EXCEPT = 68, EXCLUSIVE = 69,
			EXISTS = 70, EXPLAIN = 71, FAIL = 72, FOR = 73, FOREIGN = 74,
			FROM = 75, FULL = 76, GLOB = 77, GROUP = 78, HAVING = 79, IF = 80,
			IGNORE = 81, IMMEDIATE = 82, IN = 83, INDEX = 84, INDEXED = 85,
			INITIALLY = 86, INNER = 87, INSERT = 88, INSTEAD = 89,
			INTERSECT = 90, INTO = 91, IS = 92, ISNULL = 93, JOIN = 94,
			KEY = 95, LEFT = 96, LIKE = 97, LIMIT = 98, MATCH = 99,
			NATURAL = 100, NO = 101, NOT = 102, NOTNULL = 103, NULL = 104,
			OF = 105, OFFSET = 106, ON = 107, OR = 108, ORDER = 109,
			OUTER = 110, PLAN = 111, PRAGMA = 112, PRIMARY = 113, QUERY = 114,
			RAISE = 115, RECURSIVE = 116, REFERENCES = 117, REGEXP = 118,
			REINDEX = 119, RELEASE = 120, RENAME = 121, REPLACE = 122,
			RESTRICT = 123, RIGHT = 124, ROLLBACK = 125, ROW = 126,
			SAVEPOINT = 127, SELECT = 128, SET = 129, TABLE = 130, TEMP = 131,
			TEMPORARY = 132, THEN = 133, TO = 134, TRANSACTION = 135,
			TRIGGER = 136, UNION = 137, UNIQUE = 138, UPDATE = 139,
			USING = 140, VACUUM = 141, VALUES = 142, VIEW = 143, VIRTUAL = 144,
			WHEN = 145, WHERE = 146, WITH = 147, WITHOUT = 148,
			IDENTIFIER = 149, NUMERIC_LITERAL = 150, BIND_PARAMETER = 151,
			STRING_LITERAL = 152, BLOB_LITERAL = 153,
			SINGLE_LINE_COMMENT = 154, MULTILINE_COMMENT = 155, SPACES = 156,
			UNEXPECTED_CHAR = 157;
	public static final String[] tokenNames = { "<INVALID>", "';'", "'.'",
			"'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'",
			"'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'",
			"'>='", "'=='", "'!='", "'<>'", "ABORT", "ACTION", "ADD", "AFTER",
			"ALL", "ALTER", "ANALYZE", "AND", "AS", "ASC", "ATTACH",
			"AUTOINCREMENT", "BEFORE", "BEGIN", "BETWEEN", "BY", "CASCADE",
			"CASE", "CAST", "CHECK", "COLLATE", "COLUMN", "COMMIT", "CONFLICT",
			"CONSTRAINT", "CREATE", "CROSS", "CURRENT_DATE", "CURRENT_TIME",
			"CURRENT_TIMESTAMP", "DATABASE", "DEFAULT", "DEFERRABLE",
			"DEFERRED", "DELETE", "DESC", "DETACH", "DISTINCT", "DROP", "EACH",
			"ELSE", "END", "ESCAPE", "EXCEPT", "EXCLUSIVE", "EXISTS",
			"EXPLAIN", "FAIL", "FOR", "FOREIGN", "FROM", "FULL", "GLOB",
			"GROUP", "HAVING", "IF", "IGNORE", "IMMEDIATE", "IN", "INDEX",
			"INDEXED", "INITIALLY", "INNER", "INSERT", "INSTEAD", "INTERSECT",
			"INTO", "IS", "ISNULL", "JOIN", "KEY", "LEFT", "LIKE", "LIMIT",
			"MATCH", "NATURAL", "NO", "NOT", "NOTNULL", "NULL", "OF", "OFFSET",
			"ON", "OR", "ORDER", "OUTER", "PLAN", "PRAGMA", "PRIMARY", "QUERY",
			"RAISE", "RECURSIVE", "REFERENCES", "REGEXP", "REINDEX", "RELEASE",
			"RENAME", "REPLACE", "RESTRICT", "RIGHT", "ROLLBACK", "ROW",
			"SAVEPOINT", "SELECT", "SET", "TABLE", "TEMP", "TEMPORARY", "THEN",
			"TO", "TRANSACTION", "TRIGGER", "UNION", "UNIQUE", "UPDATE",
			"USING", "VACUUM", "VALUES", "VIEW", "VIRTUAL", "WHEN", "WHERE",
			"WITH", "WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL",
			"BIND_PARAMETER", "STRING_LITERAL", "BLOB_LITERAL",
			"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES",
			"UNEXPECTED_CHAR" };
	public static final int RULE_parsing_point = 0, RULE_error = 1,
			RULE_sql_stmt_list = 2, RULE_sql_stmt = 3,
			RULE_alter_table_stmt = 4, RULE_analyze_stmt = 5,
			RULE_attach_stmt = 6, RULE_begin_stmt = 7, RULE_commit_stmt = 8,
			RULE_compound_select_stmt = 9, RULE_create_index_stmt = 10,
			RULE_create_table_stmt = 11, RULE_create_trigger_stmt = 12,
			RULE_create_view_stmt = 13, RULE_create_virtual_table_stmt = 14,
			RULE_delete_stmt = 15, RULE_delete_stmt_limited = 16,
			RULE_detach_stmt = 17, RULE_drop_index_stmt = 18,
			RULE_drop_table_stmt = 19, RULE_drop_trigger_stmt = 20,
			RULE_drop_view_stmt = 21, RULE_factored_select_stmt = 22,
			RULE_insert_stmt = 23, RULE_pragma_stmt = 24,
			RULE_reindex_stmt = 25, RULE_release_stmt = 26,
			RULE_rollback_stmt = 27, RULE_savepoint_stmt = 28,
			RULE_simple_select_stmt = 29, RULE_select_stmt = 30,
			RULE_select_or_values = 31, RULE_update_stmt = 32,
			RULE_update_stmt_limited = 33, RULE_vacuum_stmt = 34,
			RULE_column_def = 35, RULE_type_name = 36,
			RULE_column_constraint = 37, RULE_conflict_clause = 38,
			RULE_expr = 39, RULE_foreign_key_clause = 40,
			RULE_raise_function = 41, RULE_indexed_column = 42,
			RULE_table_constraint = 43, RULE_with_clause = 44,
			RULE_qualified_table_name = 45, RULE_ordering_term = 46,
			RULE_pragma_value = 47, RULE_common_table_expression = 48,
			RULE_result_column = 49, RULE_table_or_subquery = 50,
			RULE_join_clause = 51, RULE_join_operator = 52,
			RULE_join_constraint = 53, RULE_select_core = 54,
			RULE_compound_operator = 55, RULE_cte_table_name = 56,
			RULE_signed_number = 57, RULE_literal_value = 58,
			RULE_unary_operator = 59, RULE_binary_operator = 60,
			RULE_error_message = 61, RULE_module_argument = 62,
			RULE_column_alias = 63, RULE_keyword = 64, RULE_function_name = 65,
			RULE_database_name = 66, RULE_table_name = 67,
			RULE_table_or_index_name = 68, RULE_new_table_name = 69,
			RULE_column_name = 70, RULE_collation_name = 71,
			RULE_foreign_table = 72, RULE_index_name = 73,
			RULE_trigger_name = 74, RULE_view_name = 75, RULE_module_name = 76,
			RULE_pragma_name = 77, RULE_savepoint_name = 78,
			RULE_table_alias = 79, RULE_transaction_name = 80, RULE_name = 81;
	public static final String[] ruleNames = { "parsing_point", "error",
			"sql_stmt_list", "sql_stmt", "alter_table_stmt", "analyze_stmt",
			"attach_stmt", "begin_stmt", "commit_stmt", "compound_select_stmt",
			"create_index_stmt", "create_table_stmt", "create_trigger_stmt",
			"create_view_stmt", "create_virtual_table_stmt", "delete_stmt",
			"delete_stmt_limited", "detach_stmt", "drop_index_stmt",
			"drop_table_stmt", "drop_trigger_stmt", "drop_view_stmt",
			"factored_select_stmt", "insert_stmt", "pragma_stmt",
			"reindex_stmt", "release_stmt", "rollback_stmt", "savepoint_stmt",
			"simple_select_stmt", "select_stmt", "select_or_values",
			"update_stmt", "update_stmt_limited", "vacuum_stmt", "column_def",
			"type_name", "column_constraint", "conflict_clause", "expr",
			"foreign_key_clause", "raise_function", "indexed_column",
			"table_constraint", "with_clause", "qualified_table_name",
			"ordering_term", "pragma_value", "common_table_expression",
			"result_column", "table_or_subquery", "join_clause",
			"join_operator", "join_constraint", "select_core",
			"compound_operator", "cte_table_name", "signed_number",
			"literal_value", "unary_operator", "binary_operator",
			"error_message", "module_argument", "column_alias", "keyword",
			"function_name", "database_name", "table_name",
			"table_or_index_name", "new_table_name", "column_name",
			"collation_name", "foreign_table", "index_name", "trigger_name",
			"view_name", "module_name", "pragma_name", "savepoint_name",
			"table_alias", "transaction_name", "name" };

	@Override
	public String getGrammarFileName() {
		return "SQLite.g4";
	}

	@Override
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public SQLiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA,
				_sharedContextCache);
	}

	public static class Parsing_pointContext extends ParserRuleContext {
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}

		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class, i);
		}

		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class, i);
		}

		public TerminalNode EOF() {
			return getToken(SQLiteParser.EOF, 0);
		}

		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}

		public Parsing_pointContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_parsing_point;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterParsing_point(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitParsing_point(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitParsing_point(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Parsing_pointContext parsing_point()
			throws RecognitionException {
		Parsing_pointContext _localctx = new Parsing_pointContext(_ctx,
				getState());
		enterRule(_localctx, 0, RULE_parsing_point);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL)
						| (1L << ALTER) | (1L << ANALYZE) | (1L << ATTACH)
						| (1L << BEGIN) | (1L << COMMIT) | (1L << CREATE)
						| (1L << DELETE) | (1L << DETACH) | (1L << DROP))) != 0)
						|| ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (END - 66))
								| (1L << (EXPLAIN - 66))
								| (1L << (INSERT - 66))
								| (1L << (PRAGMA - 66))
								| (1L << (REINDEX - 66))
								| (1L << (RELEASE - 66))
								| (1L << (REPLACE - 66))
								| (1L << (ROLLBACK - 66))
								| (1L << (SAVEPOINT - 66)) | (1L << (SELECT - 66)))) != 0)
						|| ((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & ((1L << (UPDATE - 139))
								| (1L << (VACUUM - 139))
								| (1L << (VALUES - 139)) | (1L << (WITH - 139)) | (1L << (UNEXPECTED_CHAR - 139)))) != 0)) {
					{
						setState(166);
						switch (_input.LA(1)) {
						case SCOL:
						case ALTER:
						case ANALYZE:
						case ATTACH:
						case BEGIN:
						case COMMIT:
						case CREATE:
						case DELETE:
						case DETACH:
						case DROP:
						case END:
						case EXPLAIN:
						case INSERT:
						case PRAGMA:
						case REINDEX:
						case RELEASE:
						case REPLACE:
						case ROLLBACK:
						case SAVEPOINT:
						case SELECT:
						case UPDATE:
						case VACUUM:
						case VALUES:
						case WITH: {
							setState(164);
							sql_stmt_list();
						}
							break;
						case UNEXPECTED_CHAR: {
							setState(165);
							error();
						}
							break;
						default:
							throw new NoViableAltException(this);
						}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(171);
				match(EOF);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;

		public TerminalNode UNEXPECTED_CHAR() {
			return getToken(SQLiteParser.UNEXPECTED_CHAR, 0);
		}

		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_error;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterError(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitError(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor).visitError(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(173);
				((ErrorContext) _localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

				throw new RuntimeException(
						"UNEXPECTED_CHAR="
								+ (((ErrorContext) _localctx).UNEXPECTED_CHAR != null ? ((ErrorContext) _localctx).UNEXPECTED_CHAR
										.getText() : null));

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}

		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class, i);
		}

		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_stmt_list;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSql_stmt_list(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSql_stmt_list(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSql_stmt_list(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list()
			throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx,
				getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == SCOL) {
					{
						{
							setState(176);
							match(SCOL);
						}
					}
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(182);
				sql_stmt();
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(184);
								_errHandler.sync(this);
								_la = _input.LA(1);
								do {
									{
										{
											setState(183);
											match(SCOL);
										}
									}
									setState(186);
									_errHandler.sync(this);
									_la = _input.LA(1);
								} while (_la == SCOL);
								setState(188);
								sql_stmt();
							}
						}
					}
					setState(193);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 4, _ctx);
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						{
							{
								setState(194);
								match(SCOL);
							}
						}
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Savepoint_stmtContext savepoint_stmt() {
			return getRuleContext(Savepoint_stmtContext.class, 0);
		}

		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class, 0);
		}

		public Attach_stmtContext attach_stmt() {
			return getRuleContext(Attach_stmtContext.class, 0);
		}

		public Vacuum_stmtContext vacuum_stmt() {
			return getRuleContext(Vacuum_stmtContext.class, 0);
		}

		public Commit_stmtContext commit_stmt() {
			return getRuleContext(Commit_stmtContext.class, 0);
		}

		public Create_index_stmtContext create_index_stmt() {
			return getRuleContext(Create_index_stmtContext.class, 0);
		}

		public Reindex_stmtContext reindex_stmt() {
			return getRuleContext(Reindex_stmtContext.class, 0);
		}

		public Detach_stmtContext detach_stmt() {
			return getRuleContext(Detach_stmtContext.class, 0);
		}

		public Begin_stmtContext begin_stmt() {
			return getRuleContext(Begin_stmtContext.class, 0);
		}

		public Create_trigger_stmtContext create_trigger_stmt() {
			return getRuleContext(Create_trigger_stmtContext.class, 0);
		}

		public Update_stmt_limitedContext update_stmt_limited() {
			return getRuleContext(Update_stmt_limitedContext.class, 0);
		}

		public Drop_view_stmtContext drop_view_stmt() {
			return getRuleContext(Drop_view_stmtContext.class, 0);
		}

		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class, 0);
		}

		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class, 0);
		}

		public Delete_stmt_limitedContext delete_stmt_limited() {
			return getRuleContext(Delete_stmt_limitedContext.class, 0);
		}

		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class, 0);
		}

		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class, 0);
		}

		public Release_stmtContext release_stmt() {
			return getRuleContext(Release_stmtContext.class, 0);
		}

		public Rollback_stmtContext rollback_stmt() {
			return getRuleContext(Rollback_stmtContext.class, 0);
		}

		public Drop_index_stmtContext drop_index_stmt() {
			return getRuleContext(Drop_index_stmtContext.class, 0);
		}

		public Drop_trigger_stmtContext drop_trigger_stmt() {
			return getRuleContext(Drop_trigger_stmtContext.class, 0);
		}

		public TerminalNode PLAN() {
			return getToken(SQLiteParser.PLAN, 0);
		}

		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class, 0);
		}

		public Analyze_stmtContext analyze_stmt() {
			return getRuleContext(Analyze_stmtContext.class, 0);
		}

		public Create_virtual_table_stmtContext create_virtual_table_stmt() {
			return getRuleContext(Create_virtual_table_stmtContext.class, 0);
		}

		public TerminalNode EXPLAIN() {
			return getToken(SQLiteParser.EXPLAIN, 0);
		}

		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class, 0);
		}

		public Pragma_stmtContext pragma_stmt() {
			return getRuleContext(Pragma_stmtContext.class, 0);
		}

		public Compound_select_stmtContext compound_select_stmt() {
			return getRuleContext(Compound_select_stmtContext.class, 0);
		}

		public TerminalNode QUERY() {
			return getToken(SQLiteParser.QUERY, 0);
		}

		public Simple_select_stmtContext simple_select_stmt() {
			return getRuleContext(Simple_select_stmtContext.class, 0);
		}

		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class, 0);
		}

		public Create_view_stmtContext create_view_stmt() {
			return getRuleContext(Create_view_stmtContext.class, 0);
		}

		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sql_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSql_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSql_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSql_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(205);
				_la = _input.LA(1);
				if (_la == EXPLAIN) {
					{
						setState(200);
						match(EXPLAIN);
						setState(203);
						_la = _input.LA(1);
						if (_la == QUERY) {
							{
								setState(201);
								match(QUERY);
								setState(202);
								match(PLAN);
							}
						}

					}
				}

				setState(237);
				switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
				case 1: {
					setState(207);
					alter_table_stmt();
				}
					break;
				case 2: {
					setState(208);
					analyze_stmt();
				}
					break;
				case 3: {
					setState(209);
					attach_stmt();
				}
					break;
				case 4: {
					setState(210);
					begin_stmt();
				}
					break;
				case 5: {
					setState(211);
					commit_stmt();
				}
					break;
				case 6: {
					setState(212);
					compound_select_stmt();
				}
					break;
				case 7: {
					setState(213);
					create_index_stmt();
				}
					break;
				case 8: {
					setState(214);
					create_table_stmt();
				}
					break;
				case 9: {
					setState(215);
					create_trigger_stmt();
				}
					break;
				case 10: {
					setState(216);
					create_view_stmt();
				}
					break;
				case 11: {
					setState(217);
					create_virtual_table_stmt();
				}
					break;
				case 12: {
					setState(218);
					delete_stmt();
				}
					break;
				case 13: {
					setState(219);
					delete_stmt_limited();
				}
					break;
				case 14: {
					setState(220);
					detach_stmt();
				}
					break;
				case 15: {
					setState(221);
					drop_index_stmt();
				}
					break;
				case 16: {
					setState(222);
					drop_table_stmt();
				}
					break;
				case 17: {
					setState(223);
					drop_trigger_stmt();
				}
					break;
				case 18: {
					setState(224);
					drop_view_stmt();
				}
					break;
				case 19: {
					setState(225);
					factored_select_stmt();
				}
					break;
				case 20: {
					setState(226);
					insert_stmt();
				}
					break;
				case 21: {
					setState(227);
					pragma_stmt();
				}
					break;
				case 22: {
					setState(228);
					reindex_stmt();
				}
					break;
				case 23: {
					setState(229);
					release_stmt();
				}
					break;
				case 24: {
					setState(230);
					rollback_stmt();
				}
					break;
				case 25: {
					setState(231);
					savepoint_stmt();
				}
					break;
				case 26: {
					setState(232);
					simple_select_stmt();
				}
					break;
				case 27: {
					setState(233);
					select_stmt();
				}
					break;
				case 28: {
					setState(234);
					update_stmt();
				}
					break;
				case 29: {
					setState(235);
					update_stmt_limited();
				}
					break;
				case 30: {
					setState(236);
					vacuum_stmt();
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode RENAME() {
			return getToken(SQLiteParser.RENAME, 0);
		}

		public TerminalNode COLUMN() {
			return getToken(SQLiteParser.COLUMN, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public TerminalNode ADD() {
			return getToken(SQLiteParser.ADD, 0);
		}

		public TerminalNode TO() {
			return getToken(SQLiteParser.TO, 0);
		}

		public TerminalNode ALTER() {
			return getToken(SQLiteParser.ALTER, 0);
		}

		public TerminalNode TABLE() {
			return getToken(SQLiteParser.TABLE, 0);
		}

		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class, 0);
		}

		public Alter_table_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_alter_table_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterAlter_table_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitAlter_table_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitAlter_table_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt()
			throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 8, RULE_alter_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(239);
				match(ALTER);
				setState(240);
				match(TABLE);
				setState(244);
				switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
				case 1: {
					setState(241);
					database_name();
					setState(242);
					match(DOT);
				}
					break;
				}
				setState(246);
				table_name();
				setState(255);
				switch (_input.LA(1)) {
				case RENAME: {
					setState(247);
					match(RENAME);
					setState(248);
					match(TO);
					setState(249);
					new_table_name();
				}
					break;
				case ADD: {
					setState(250);
					match(ADD);
					setState(252);
					switch (getInterpreter().adaptivePredict(_input, 10, _ctx)) {
					case 1: {
						setState(251);
						match(COLUMN);
					}
						break;
					}
					setState(254);
					column_def();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Analyze_stmtContext extends ParserRuleContext {
		public Table_or_index_nameContext table_or_index_name() {
			return getRuleContext(Table_or_index_nameContext.class, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public TerminalNode ANALYZE() {
			return getToken(SQLiteParser.ANALYZE, 0);
		}

		public Analyze_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_analyze_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterAnalyze_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitAnalyze_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitAnalyze_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Analyze_stmtContext analyze_stmt() throws RecognitionException {
		Analyze_stmtContext _localctx = new Analyze_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 10, RULE_analyze_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(257);
				match(ANALYZE);
				setState(264);
				switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
				case 1: {
					setState(258);
					database_name();
				}
					break;
				case 2: {
					setState(259);
					table_or_index_name();
				}
					break;
				case 3: {
					setState(260);
					database_name();
					setState(261);
					match(DOT);
					setState(262);
					table_or_index_name();
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attach_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode ATTACH() {
			return getToken(SQLiteParser.ATTACH, 0);
		}

		public TerminalNode DATABASE() {
			return getToken(SQLiteParser.DATABASE, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public TerminalNode AS() {
			return getToken(SQLiteParser.AS, 0);
		}

		public Attach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_attach_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterAttach_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitAttach_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitAttach_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Attach_stmtContext attach_stmt() throws RecognitionException {
		Attach_stmtContext _localctx = new Attach_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_attach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(266);
				match(ATTACH);
				setState(268);
				switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
				case 1: {
					setState(267);
					match(DATABASE);
				}
					break;
				}
				setState(270);
				expr(0);
				setState(271);
				match(AS);
				setState(272);
				database_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Begin_stmtContext extends ParserRuleContext {
		public TerminalNode DEFERRED() {
			return getToken(SQLiteParser.DEFERRED, 0);
		}

		public TerminalNode EXCLUSIVE() {
			return getToken(SQLiteParser.EXCLUSIVE, 0);
		}

		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class, 0);
		}

		public TerminalNode IMMEDIATE() {
			return getToken(SQLiteParser.IMMEDIATE, 0);
		}

		public TerminalNode BEGIN() {
			return getToken(SQLiteParser.BEGIN, 0);
		}

		public TerminalNode TRANSACTION() {
			return getToken(SQLiteParser.TRANSACTION, 0);
		}

		public Begin_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_begin_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterBegin_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitBegin_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitBegin_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Begin_stmtContext begin_stmt() throws RecognitionException {
		Begin_stmtContext _localctx = new Begin_stmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_begin_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(274);
				match(BEGIN);
				setState(276);
				_la = _input.LA(1);
				if (((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (DEFERRED - 58))
						| (1L << (EXCLUSIVE - 58)) | (1L << (IMMEDIATE - 58)))) != 0)) {
					{
						setState(275);
						_la = _input.LA(1);
						if (!(((((_la - 58)) & ~0x3f) == 0 && ((1L << (_la - 58)) & ((1L << (DEFERRED - 58))
								| (1L << (EXCLUSIVE - 58)) | (1L << (IMMEDIATE - 58)))) != 0))) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
				}

				setState(282);
				_la = _input.LA(1);
				if (_la == TRANSACTION) {
					{
						setState(278);
						match(TRANSACTION);
						setState(280);
						switch (getInterpreter().adaptivePredict(_input, 15,
								_ctx)) {
						case 1: {
							setState(279);
							transaction_name();
						}
							break;
						}
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Commit_stmtContext extends ParserRuleContext {
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class, 0);
		}

		public TerminalNode END() {
			return getToken(SQLiteParser.END, 0);
		}

		public TerminalNode TRANSACTION() {
			return getToken(SQLiteParser.TRANSACTION, 0);
		}

		public TerminalNode COMMIT() {
			return getToken(SQLiteParser.COMMIT, 0);
		}

		public Commit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_commit_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCommit_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCommit_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCommit_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Commit_stmtContext commit_stmt() throws RecognitionException {
		Commit_stmtContext _localctx = new Commit_stmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_commit_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(284);
				_la = _input.LA(1);
				if (!(_la == COMMIT || _la == END)) {
					_errHandler.recoverInline(this);
				}
				consume();
				setState(289);
				_la = _input.LA(1);
				if (_la == TRANSACTION) {
					{
						setState(285);
						match(TRANSACTION);
						setState(287);
						switch (getInterpreter().adaptivePredict(_input, 17,
								_ctx)) {
						case 1: {
							setState(286);
							transaction_name();
						}
							break;
						}
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_select_stmtContext extends ParserRuleContext {
		public List<TerminalNode> UNION() {
			return getTokens(SQLiteParser.UNION);
		}

		public TerminalNode INTERSECT(int i) {
			return getToken(SQLiteParser.INTERSECT, i);
		}

		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}

		public TerminalNode WITH() {
			return getToken(SQLiteParser.WITH, 0);
		}

		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}

		public TerminalNode LIMIT() {
			return getToken(SQLiteParser.LIMIT, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode ALL(int i) {
			return getToken(SQLiteParser.ALL, i);
		}

		public List<TerminalNode> EXCEPT() {
			return getTokens(SQLiteParser.EXCEPT);
		}

		public List<TerminalNode> ALL() {
			return getTokens(SQLiteParser.ALL);
		}

		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class, i);
		}

		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class, i);
		}

		public List<TerminalNode> INTERSECT() {
			return getTokens(SQLiteParser.INTERSECT);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode OFFSET() {
			return getToken(SQLiteParser.OFFSET, 0);
		}

		public TerminalNode ORDER() {
			return getToken(SQLiteParser.ORDER, 0);
		}

		public TerminalNode UNION(int i) {
			return getToken(SQLiteParser.UNION, i);
		}

		public TerminalNode EXCEPT(int i) {
			return getToken(SQLiteParser.EXCEPT, i);
		}

		public TerminalNode RECURSIVE() {
			return getToken(SQLiteParser.RECURSIVE, 0);
		}

		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class, i);
		}

		public Compound_select_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compound_select_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCompound_select_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCompound_select_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCompound_select_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Compound_select_stmtContext compound_select_stmt()
			throws RecognitionException {
		Compound_select_stmtContext _localctx = new Compound_select_stmtContext(
				_ctx, getState());
		enterRule(_localctx, 18, RULE_compound_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(303);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(291);
						match(WITH);
						setState(293);
						switch (getInterpreter().adaptivePredict(_input, 19,
								_ctx)) {
						case 1: {
							setState(292);
							match(RECURSIVE);
						}
							break;
						}
						setState(295);
						common_table_expression();
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(296);
									match(COMMA);
									setState(297);
									common_table_expression();
								}
							}
							setState(302);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(305);
				select_core();
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(312);
							switch (_input.LA(1)) {
							case UNION: {
								setState(306);
								match(UNION);
								setState(308);
								_la = _input.LA(1);
								if (_la == ALL) {
									{
										setState(307);
										match(ALL);
									}
								}

							}
								break;
							case INTERSECT: {
								setState(310);
								match(INTERSECT);
							}
								break;
							case EXCEPT: {
								setState(311);
								match(EXCEPT);
							}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(314);
							select_core();
						}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == EXCEPT || _la == INTERSECT || _la == UNION);
				setState(329);
				_la = _input.LA(1);
				if (_la == ORDER) {
					{
						setState(319);
						match(ORDER);
						setState(320);
						match(BY);
						setState(321);
						ordering_term();
						setState(326);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(322);
									match(COMMA);
									setState(323);
									ordering_term();
								}
							}
							setState(328);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(337);
				_la = _input.LA(1);
				if (_la == LIMIT) {
					{
						setState(331);
						match(LIMIT);
						setState(332);
						expr(0);
						setState(335);
						_la = _input.LA(1);
						if (_la == COMMA || _la == OFFSET) {
							{
								setState(333);
								_la = _input.LA(1);
								if (!(_la == COMMA || _la == OFFSET)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(334);
								expr(0);
							}
						}

					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_index_stmtContext extends ParserRuleContext {
		public TerminalNode ON() {
			return getToken(SQLiteParser.ON, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}

		public TerminalNode INDEX() {
			return getToken(SQLiteParser.INDEX, 0);
		}

		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class, i);
		}

		public TerminalNode UNIQUE() {
			return getToken(SQLiteParser.UNIQUE, 0);
		}

		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class, 0);
		}

		public TerminalNode WHERE() {
			return getToken(SQLiteParser.WHERE, 0);
		}

		public TerminalNode CREATE() {
			return getToken(SQLiteParser.CREATE, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Create_index_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_index_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCreate_index_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCreate_index_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCreate_index_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Create_index_stmtContext create_index_stmt()
			throws RecognitionException {
		Create_index_stmtContext _localctx = new Create_index_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 20, RULE_create_index_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(339);
				match(CREATE);
				setState(341);
				_la = _input.LA(1);
				if (_la == UNIQUE) {
					{
						setState(340);
						match(UNIQUE);
					}
				}

				setState(343);
				match(INDEX);
				setState(347);
				switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
				case 1: {
					setState(344);
					match(IF);
					setState(345);
					match(NOT);
					setState(346);
					match(EXISTS);
				}
					break;
				}
				setState(352);
				switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
				case 1: {
					setState(349);
					database_name();
					setState(350);
					match(DOT);
				}
					break;
				}
				setState(354);
				index_name();
				setState(355);
				match(ON);
				setState(356);
				table_name();
				setState(357);
				match(OPEN_PAR);
				setState(358);
				indexed_column();
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(359);
							match(COMMA);
							setState(360);
							indexed_column();
						}
					}
					setState(365);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(366);
				match(CLOSE_PAR);
				setState(369);
				_la = _input.LA(1);
				if (_la == WHERE) {
					{
						setState(367);
						match(WHERE);
						setState(368);
						expr(0);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public TerminalNode TEMPORARY() {
			return getToken(SQLiteParser.TEMPORARY, 0);
		}

		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class, i);
		}

		public TerminalNode TABLE() {
			return getToken(SQLiteParser.TABLE, 0);
		}

		public TerminalNode AS() {
			return getToken(SQLiteParser.AS, 0);
		}

		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public TerminalNode WITHOUT() {
			return getToken(SQLiteParser.WITHOUT, 0);
		}

		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}

		public TerminalNode CREATE() {
			return getToken(SQLiteParser.CREATE, 0);
		}

		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class, i);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(SQLiteParser.IDENTIFIER, 0);
		}

		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}

		public TerminalNode TEMP() {
			return getToken(SQLiteParser.TEMP, 0);
		}

		public Create_table_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_table_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCreate_table_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCreate_table_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCreate_table_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt()
			throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 22, RULE_create_table_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(371);
				match(CREATE);
				setState(373);
				_la = _input.LA(1);
				if (_la == TEMP || _la == TEMPORARY) {
					{
						setState(372);
						_la = _input.LA(1);
						if (!(_la == TEMP || _la == TEMPORARY)) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
				}

				setState(375);
				match(TABLE);
				setState(379);
				switch (getInterpreter().adaptivePredict(_input, 35, _ctx)) {
				case 1: {
					setState(376);
					match(IF);
					setState(377);
					match(NOT);
					setState(378);
					match(EXISTS);
				}
					break;
				}
				setState(384);
				switch (getInterpreter().adaptivePredict(_input, 36, _ctx)) {
				case 1: {
					setState(381);
					database_name();
					setState(382);
					match(DOT);
				}
					break;
				}
				setState(386);
				table_name();
				setState(410);
				switch (_input.LA(1)) {
				case OPEN_PAR: {
					setState(387);
					match(OPEN_PAR);
					setState(388);
					column_def();
					setState(393);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 37, _ctx);
					while (_alt != 2
							&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
						if (_alt == 1) {
							{
								{
									setState(389);
									match(COMMA);
									setState(390);
									column_def();
								}
							}
						}
						setState(395);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input, 37,
								_ctx);
					}
					setState(400);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(396);
								match(COMMA);
								setState(397);
								table_constraint();
							}
						}
						setState(402);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(403);
					match(CLOSE_PAR);
					setState(406);
					_la = _input.LA(1);
					if (_la == WITHOUT) {
						{
							setState(404);
							match(WITHOUT);
							setState(405);
							match(IDENTIFIER);
						}
					}

				}
					break;
				case AS: {
					setState(408);
					match(AS);
					setState(409);
					select_stmt();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode ROW() {
			return getToken(SQLiteParser.ROW, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public TerminalNode DELETE() {
			return getToken(SQLiteParser.DELETE, 0);
		}

		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class, 0);
		}

		public TerminalNode INSTEAD() {
			return getToken(SQLiteParser.INSTEAD, 0);
		}

		public Delete_stmtContext delete_stmt(int i) {
			return getRuleContext(Delete_stmtContext.class, i);
		}

		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public List<TerminalNode> OF() {
			return getTokens(SQLiteParser.OF);
		}

		public List<Insert_stmtContext> insert_stmt() {
			return getRuleContexts(Insert_stmtContext.class);
		}

		public Insert_stmtContext insert_stmt(int i) {
			return getRuleContext(Insert_stmtContext.class, i);
		}

		public TerminalNode BEGIN() {
			return getToken(SQLiteParser.BEGIN, 0);
		}

		public TerminalNode CREATE() {
			return getToken(SQLiteParser.CREATE, 0);
		}

		public List<Delete_stmtContext> delete_stmt() {
			return getRuleContexts(Delete_stmtContext.class);
		}

		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class, i);
		}

		public TerminalNode INSERT() {
			return getToken(SQLiteParser.INSERT, 0);
		}

		public TerminalNode AFTER() {
			return getToken(SQLiteParser.AFTER, 0);
		}

		public TerminalNode ON() {
			return getToken(SQLiteParser.ON, 0);
		}

		public TerminalNode TEMPORARY() {
			return getToken(SQLiteParser.TEMPORARY, 0);
		}

		public TerminalNode BEFORE() {
			return getToken(SQLiteParser.BEFORE, 0);
		}

		public TerminalNode OF(int i) {
			return getToken(SQLiteParser.OF, i);
		}

		public TerminalNode FOR() {
			return getToken(SQLiteParser.FOR, 0);
		}

		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class, i);
		}

		public TerminalNode EACH() {
			return getToken(SQLiteParser.EACH, 0);
		}

		public TerminalNode TRIGGER() {
			return getToken(SQLiteParser.TRIGGER, 0);
		}

		public Update_stmtContext update_stmt(int i) {
			return getRuleContext(Update_stmtContext.class, i);
		}

		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public List<Update_stmtContext> update_stmt() {
			return getRuleContexts(Update_stmtContext.class);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public TerminalNode UPDATE() {
			return getToken(SQLiteParser.UPDATE, 0);
		}

		public TerminalNode WHEN() {
			return getToken(SQLiteParser.WHEN, 0);
		}

		public TerminalNode END() {
			return getToken(SQLiteParser.END, 0);
		}

		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}

		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}

		public TerminalNode TEMP() {
			return getToken(SQLiteParser.TEMP, 0);
		}

		public Create_trigger_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_trigger_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCreate_trigger_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCreate_trigger_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCreate_trigger_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Create_trigger_stmtContext create_trigger_stmt()
			throws RecognitionException {
		Create_trigger_stmtContext _localctx = new Create_trigger_stmtContext(
				_ctx, getState());
		enterRule(_localctx, 24, RULE_create_trigger_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(412);
				match(CREATE);
				setState(414);
				_la = _input.LA(1);
				if (_la == TEMP || _la == TEMPORARY) {
					{
						setState(413);
						_la = _input.LA(1);
						if (!(_la == TEMP || _la == TEMPORARY)) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
				}

				setState(416);
				match(TRIGGER);
				setState(420);
				switch (getInterpreter().adaptivePredict(_input, 42, _ctx)) {
				case 1: {
					setState(417);
					match(IF);
					setState(418);
					match(NOT);
					setState(419);
					match(EXISTS);
				}
					break;
				}
				setState(425);
				switch (getInterpreter().adaptivePredict(_input, 43, _ctx)) {
				case 1: {
					setState(422);
					database_name();
					setState(423);
					match(DOT);
				}
					break;
				}
				setState(427);
				trigger_name();
				setState(432);
				switch (_input.LA(1)) {
				case BEFORE: {
					setState(428);
					match(BEFORE);
				}
					break;
				case AFTER: {
					setState(429);
					match(AFTER);
				}
					break;
				case INSTEAD: {
					setState(430);
					match(INSTEAD);
					setState(431);
					match(OF);
				}
					break;
				case DELETE:
				case INSERT:
				case UPDATE:
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(448);
				switch (_input.LA(1)) {
				case DELETE: {
					setState(434);
					match(DELETE);
				}
					break;
				case INSERT: {
					setState(435);
					match(INSERT);
				}
					break;
				case UPDATE: {
					setState(436);
					match(UPDATE);
					setState(446);
					_la = _input.LA(1);
					if (_la == OF) {
						{
							setState(437);
							match(OF);
							setState(438);
							column_name();
							setState(443);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == COMMA) {
								{
									{
										setState(439);
										match(COMMA);
										setState(440);
										column_name();
									}
								}
								setState(445);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
						}
					}

				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(450);
				match(ON);
				setState(454);
				switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
				case 1: {
					setState(451);
					database_name();
					setState(452);
					match(DOT);
				}
					break;
				}
				setState(456);
				table_name();
				setState(460);
				_la = _input.LA(1);
				if (_la == FOR) {
					{
						setState(457);
						match(FOR);
						setState(458);
						match(EACH);
						setState(459);
						match(ROW);
					}
				}

				setState(464);
				_la = _input.LA(1);
				if (_la == WHEN) {
					{
						setState(462);
						match(WHEN);
						setState(463);
						expr(0);
					}
				}

				setState(466);
				match(BEGIN);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
						{
							setState(471);
							switch (getInterpreter().adaptivePredict(_input,
									51, _ctx)) {
							case 1: {
								setState(467);
								update_stmt();
							}
								break;
							case 2: {
								setState(468);
								insert_stmt();
							}
								break;
							case 3: {
								setState(469);
								delete_stmt();
							}
								break;
							case 4: {
								setState(470);
								select_stmt();
							}
								break;
							}
							setState(473);
							match(SCOL);
						}
					}
					setState(477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while (_la == DELETE
						|| ((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (INSERT - 88))
								| (1L << (REPLACE - 88))
								| (1L << (SELECT - 88))
								| (1L << (UPDATE - 88))
								| (1L << (VALUES - 88)) | (1L << (WITH - 88)))) != 0));
				setState(479);
				match(END);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_view_stmtContext extends ParserRuleContext {
		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public TerminalNode TEMPORARY() {
			return getToken(SQLiteParser.TEMPORARY, 0);
		}

		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class, 0);
		}

		public TerminalNode VIEW() {
			return getToken(SQLiteParser.VIEW, 0);
		}

		public TerminalNode CREATE() {
			return getToken(SQLiteParser.CREATE, 0);
		}

		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public TerminalNode AS() {
			return getToken(SQLiteParser.AS, 0);
		}

		public TerminalNode TEMP() {
			return getToken(SQLiteParser.TEMP, 0);
		}

		public Create_view_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_view_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCreate_view_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCreate_view_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCreate_view_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Create_view_stmtContext create_view_stmt()
			throws RecognitionException {
		Create_view_stmtContext _localctx = new Create_view_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 26, RULE_create_view_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(481);
				match(CREATE);
				setState(483);
				_la = _input.LA(1);
				if (_la == TEMP || _la == TEMPORARY) {
					{
						setState(482);
						_la = _input.LA(1);
						if (!(_la == TEMP || _la == TEMPORARY)) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
				}

				setState(485);
				match(VIEW);
				setState(489);
				switch (getInterpreter().adaptivePredict(_input, 54, _ctx)) {
				case 1: {
					setState(486);
					match(IF);
					setState(487);
					match(NOT);
					setState(488);
					match(EXISTS);
				}
					break;
				}
				setState(494);
				switch (getInterpreter().adaptivePredict(_input, 55, _ctx)) {
				case 1: {
					setState(491);
					database_name();
					setState(492);
					match(DOT);
				}
					break;
				}
				setState(496);
				view_name();
				setState(497);
				match(AS);
				setState(498);
				select_stmt();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_virtual_table_stmtContext extends
			ParserRuleContext {
		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public TerminalNode VIRTUAL() {
			return getToken(SQLiteParser.VIRTUAL, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public Module_argumentContext module_argument(int i) {
			return getRuleContext(Module_argumentContext.class, i);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public List<Module_argumentContext> module_argument() {
			return getRuleContexts(Module_argumentContext.class);
		}

		public TerminalNode CREATE() {
			return getToken(SQLiteParser.CREATE, 0);
		}

		public TerminalNode USING() {
			return getToken(SQLiteParser.USING, 0);
		}

		public TerminalNode TABLE() {
			return getToken(SQLiteParser.TABLE, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Module_nameContext module_name() {
			return getRuleContext(Module_nameContext.class, 0);
		}

		public Create_virtual_table_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_create_virtual_table_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener)
						.enterCreate_virtual_table_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCreate_virtual_table_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCreate_virtual_table_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Create_virtual_table_stmtContext create_virtual_table_stmt()
			throws RecognitionException {
		Create_virtual_table_stmtContext _localctx = new Create_virtual_table_stmtContext(
				_ctx, getState());
		enterRule(_localctx, 28, RULE_create_virtual_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(500);
				match(CREATE);
				setState(501);
				match(VIRTUAL);
				setState(502);
				match(TABLE);
				setState(506);
				switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
				case 1: {
					setState(503);
					match(IF);
					setState(504);
					match(NOT);
					setState(505);
					match(EXISTS);
				}
					break;
				}
				setState(511);
				switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
				case 1: {
					setState(508);
					database_name();
					setState(509);
					match(DOT);
				}
					break;
				}
				setState(513);
				table_name();
				setState(514);
				match(USING);
				setState(515);
				module_name();
				setState(527);
				_la = _input.LA(1);
				if (_la == OPEN_PAR) {
					{
						setState(516);
						match(OPEN_PAR);
						setState(517);
						module_argument();
						setState(522);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(518);
									match(COMMA);
									setState(519);
									module_argument();
								}
							}
							setState(524);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(525);
						match(CLOSE_PAR);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public TerminalNode DELETE() {
			return getToken(SQLiteParser.DELETE, 0);
		}

		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class, 0);
		}

		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class, 0);
		}

		public TerminalNode WHERE() {
			return getToken(SQLiteParser.WHERE, 0);
		}

		public TerminalNode FROM() {
			return getToken(SQLiteParser.FROM, 0);
		}

		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_delete_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterDelete_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitDelete_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitDelete_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(530);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(529);
						with_clause();
					}
				}

				setState(532);
				match(DELETE);
				setState(533);
				match(FROM);
				setState(534);
				qualified_table_name();
				setState(537);
				_la = _input.LA(1);
				if (_la == WHERE) {
					{
						setState(535);
						match(WHERE);
						setState(536);
						expr(0);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmt_limitedContext extends ParserRuleContext {
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}

		public TerminalNode DELETE() {
			return getToken(SQLiteParser.DELETE, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode LIMIT() {
			return getToken(SQLiteParser.LIMIT, 0);
		}

		public TerminalNode FROM() {
			return getToken(SQLiteParser.FROM, 0);
		}

		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class, i);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode OFFSET() {
			return getToken(SQLiteParser.OFFSET, 0);
		}

		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class, 0);
		}

		public TerminalNode ORDER() {
			return getToken(SQLiteParser.ORDER, 0);
		}

		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class, 0);
		}

		public TerminalNode WHERE() {
			return getToken(SQLiteParser.WHERE, 0);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public Delete_stmt_limitedContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_delete_stmt_limited;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterDelete_stmt_limited(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitDelete_stmt_limited(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitDelete_stmt_limited(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Delete_stmt_limitedContext delete_stmt_limited()
			throws RecognitionException {
		Delete_stmt_limitedContext _localctx = new Delete_stmt_limitedContext(
				_ctx, getState());
		enterRule(_localctx, 32, RULE_delete_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(540);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(539);
						with_clause();
					}
				}

				setState(542);
				match(DELETE);
				setState(543);
				match(FROM);
				setState(544);
				qualified_table_name();
				setState(547);
				_la = _input.LA(1);
				if (_la == WHERE) {
					{
						setState(545);
						match(WHERE);
						setState(546);
						expr(0);
					}
				}

				setState(567);
				_la = _input.LA(1);
				if (_la == LIMIT || _la == ORDER) {
					{
						setState(559);
						_la = _input.LA(1);
						if (_la == ORDER) {
							{
								setState(549);
								match(ORDER);
								setState(550);
								match(BY);
								setState(551);
								ordering_term();
								setState(556);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(552);
											match(COMMA);
											setState(553);
											ordering_term();
										}
									}
									setState(558);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
							}
						}

						setState(561);
						match(LIMIT);
						setState(562);
						expr(0);
						setState(565);
						_la = _input.LA(1);
						if (_la == COMMA || _la == OFFSET) {
							{
								setState(563);
								_la = _input.LA(1);
								if (!(_la == COMMA || _la == OFFSET)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(564);
								expr(0);
							}
						}

					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Detach_stmtContext extends ParserRuleContext {
		public TerminalNode DATABASE() {
			return getToken(SQLiteParser.DATABASE, 0);
		}

		public TerminalNode DETACH() {
			return getToken(SQLiteParser.DETACH, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Detach_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_detach_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterDetach_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitDetach_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitDetach_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Detach_stmtContext detach_stmt() throws RecognitionException {
		Detach_stmtContext _localctx = new Detach_stmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_detach_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(569);
				match(DETACH);
				setState(571);
				switch (getInterpreter().adaptivePredict(_input, 68, _ctx)) {
				case 1: {
					setState(570);
					match(DATABASE);
				}
					break;
				}
				setState(573);
				database_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_index_stmtContext extends ParserRuleContext {
		public TerminalNode INDEX() {
			return getToken(SQLiteParser.INDEX, 0);
		}

		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class, 0);
		}

		public TerminalNode DROP() {
			return getToken(SQLiteParser.DROP, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Drop_index_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_drop_index_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterDrop_index_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitDrop_index_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitDrop_index_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Drop_index_stmtContext drop_index_stmt()
			throws RecognitionException {
		Drop_index_stmtContext _localctx = new Drop_index_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 36, RULE_drop_index_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(575);
				match(DROP);
				setState(576);
				match(INDEX);
				setState(579);
				switch (getInterpreter().adaptivePredict(_input, 69, _ctx)) {
				case 1: {
					setState(577);
					match(IF);
					setState(578);
					match(EXISTS);
				}
					break;
				}
				setState(584);
				switch (getInterpreter().adaptivePredict(_input, 70, _ctx)) {
				case 1: {
					setState(581);
					database_name();
					setState(582);
					match(DOT);
				}
					break;
				}
				setState(586);
				index_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public TerminalNode DROP() {
			return getToken(SQLiteParser.DROP, 0);
		}

		public TerminalNode TABLE() {
			return getToken(SQLiteParser.TABLE, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Drop_table_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_drop_table_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterDrop_table_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitDrop_table_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitDrop_table_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt()
			throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 38, RULE_drop_table_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(588);
				match(DROP);
				setState(589);
				match(TABLE);
				setState(592);
				switch (getInterpreter().adaptivePredict(_input, 71, _ctx)) {
				case 1: {
					setState(590);
					match(IF);
					setState(591);
					match(EXISTS);
				}
					break;
				}
				setState(597);
				switch (getInterpreter().adaptivePredict(_input, 72, _ctx)) {
				case 1: {
					setState(594);
					database_name();
					setState(595);
					match(DOT);
				}
					break;
				}
				setState(599);
				table_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_trigger_stmtContext extends ParserRuleContext {
		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class, 0);
		}

		public TerminalNode DROP() {
			return getToken(SQLiteParser.DROP, 0);
		}

		public TerminalNode TRIGGER() {
			return getToken(SQLiteParser.TRIGGER, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Drop_trigger_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_drop_trigger_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterDrop_trigger_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitDrop_trigger_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitDrop_trigger_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Drop_trigger_stmtContext drop_trigger_stmt()
			throws RecognitionException {
		Drop_trigger_stmtContext _localctx = new Drop_trigger_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 40, RULE_drop_trigger_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(601);
				match(DROP);
				setState(602);
				match(TRIGGER);
				setState(605);
				switch (getInterpreter().adaptivePredict(_input, 73, _ctx)) {
				case 1: {
					setState(603);
					match(IF);
					setState(604);
					match(EXISTS);
				}
					break;
				}
				setState(610);
				switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
				case 1: {
					setState(607);
					database_name();
					setState(608);
					match(DOT);
				}
					break;
				}
				setState(612);
				trigger_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_view_stmtContext extends ParserRuleContext {
		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public View_nameContext view_name() {
			return getRuleContext(View_nameContext.class, 0);
		}

		public TerminalNode DROP() {
			return getToken(SQLiteParser.DROP, 0);
		}

		public TerminalNode VIEW() {
			return getToken(SQLiteParser.VIEW, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Drop_view_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_drop_view_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterDrop_view_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitDrop_view_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitDrop_view_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Drop_view_stmtContext drop_view_stmt()
			throws RecognitionException {
		Drop_view_stmtContext _localctx = new Drop_view_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 42, RULE_drop_view_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(614);
				match(DROP);
				setState(615);
				match(VIEW);
				setState(618);
				switch (getInterpreter().adaptivePredict(_input, 75, _ctx)) {
				case 1: {
					setState(616);
					match(IF);
					setState(617);
					match(EXISTS);
				}
					break;
				}
				setState(623);
				switch (getInterpreter().adaptivePredict(_input, 76, _ctx)) {
				case 1: {
					setState(620);
					database_name();
					setState(621);
					match(DOT);
				}
					break;
				}
				setState(625);
				view_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}

		public TerminalNode WITH() {
			return getToken(SQLiteParser.WITH, 0);
		}

		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}

		public TerminalNode LIMIT() {
			return getToken(SQLiteParser.LIMIT, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class, i);
		}

		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class, i);
		}

		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class, i);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode OFFSET() {
			return getToken(SQLiteParser.OFFSET, 0);
		}

		public TerminalNode ORDER() {
			return getToken(SQLiteParser.ORDER, 0);
		}

		public TerminalNode RECURSIVE() {
			return getToken(SQLiteParser.RECURSIVE, 0);
		}

		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}

		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class, i);
		}

		public Factored_select_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_factored_select_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterFactored_select_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitFactored_select_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitFactored_select_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt()
			throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(
				_ctx, getState());
		enterRule(_localctx, 44, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(639);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(627);
						match(WITH);
						setState(629);
						switch (getInterpreter().adaptivePredict(_input, 77,
								_ctx)) {
						case 1: {
							setState(628);
							match(RECURSIVE);
						}
							break;
						}
						setState(631);
						common_table_expression();
						setState(636);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(632);
									match(COMMA);
									setState(633);
									common_table_expression();
								}
							}
							setState(638);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(641);
				select_core();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == EXCEPT || _la == INTERSECT || _la == UNION) {
					{
						{
							setState(642);
							compound_operator();
							setState(643);
							select_core();
						}
					}
					setState(649);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(660);
				_la = _input.LA(1);
				if (_la == ORDER) {
					{
						setState(650);
						match(ORDER);
						setState(651);
						match(BY);
						setState(652);
						ordering_term();
						setState(657);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(653);
									match(COMMA);
									setState(654);
									ordering_term();
								}
							}
							setState(659);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(668);
				_la = _input.LA(1);
				if (_la == LIMIT) {
					{
						setState(662);
						match(LIMIT);
						setState(663);
						expr(0);
						setState(666);
						_la = _input.LA(1);
						if (_la == COMMA || _la == OFFSET) {
							{
								setState(664);
								_la = _input.LA(1);
								if (!(_la == COMMA || _la == OFFSET)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(665);
								expr(0);
							}
						}

					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode IGNORE() {
			return getToken(SQLiteParser.IGNORE, 0);
		}

		public TerminalNode VALUES() {
			return getToken(SQLiteParser.VALUES, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode ABORT() {
			return getToken(SQLiteParser.ABORT, 0);
		}

		public TerminalNode OR() {
			return getToken(SQLiteParser.OR, 0);
		}

		public TerminalNode INTO() {
			return getToken(SQLiteParser.INTO, 0);
		}

		public TerminalNode FAIL() {
			return getToken(SQLiteParser.FAIL, 0);
		}

		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public TerminalNode REPLACE() {
			return getToken(SQLiteParser.REPLACE, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class, 0);
		}

		public TerminalNode DEFAULT() {
			return getToken(SQLiteParser.DEFAULT, 0);
		}

		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public TerminalNode INSERT() {
			return getToken(SQLiteParser.INSERT, 0);
		}

		public TerminalNode ROLLBACK() {
			return getToken(SQLiteParser.ROLLBACK, 0);
		}

		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_insert_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterInsert_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitInsert_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitInsert_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(671);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(670);
						with_clause();
					}
				}

				setState(690);
				switch (getInterpreter().adaptivePredict(_input, 86, _ctx)) {
				case 1: {
					setState(673);
					match(INSERT);
				}
					break;
				case 2: {
					setState(674);
					match(REPLACE);
				}
					break;
				case 3: {
					setState(675);
					match(INSERT);
					setState(676);
					match(OR);
					setState(677);
					match(REPLACE);
				}
					break;
				case 4: {
					setState(678);
					match(INSERT);
					setState(679);
					match(OR);
					setState(680);
					match(ROLLBACK);
				}
					break;
				case 5: {
					setState(681);
					match(INSERT);
					setState(682);
					match(OR);
					setState(683);
					match(ABORT);
				}
					break;
				case 6: {
					setState(684);
					match(INSERT);
					setState(685);
					match(OR);
					setState(686);
					match(FAIL);
				}
					break;
				case 7: {
					setState(687);
					match(INSERT);
					setState(688);
					match(OR);
					setState(689);
					match(IGNORE);
				}
					break;
				}
				setState(692);
				match(INTO);
				setState(696);
				switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
				case 1: {
					setState(693);
					database_name();
					setState(694);
					match(DOT);
				}
					break;
				}
				setState(698);
				table_name();
				setState(710);
				_la = _input.LA(1);
				if (_la == OPEN_PAR) {
					{
						setState(699);
						match(OPEN_PAR);
						setState(700);
						column_name();
						setState(705);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(701);
									match(COMMA);
									setState(702);
									column_name();
								}
							}
							setState(707);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(708);
						match(CLOSE_PAR);
					}
				}

				setState(743);
				switch (getInterpreter().adaptivePredict(_input, 93, _ctx)) {
				case 1: {
					setState(712);
					match(VALUES);
					setState(713);
					match(OPEN_PAR);
					setState(714);
					expr(0);
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(715);
								match(COMMA);
								setState(716);
								expr(0);
							}
						}
						setState(721);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(722);
					match(CLOSE_PAR);
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(723);
								match(COMMA);
								setState(724);
								match(OPEN_PAR);
								setState(725);
								expr(0);
								setState(730);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(726);
											match(COMMA);
											setState(727);
											expr(0);
										}
									}
									setState(732);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(733);
								match(CLOSE_PAR);
							}
						}
						setState(739);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
					break;
				case 2: {
					setState(740);
					select_stmt();
				}
					break;
				case 3: {
					setState(741);
					match(DEFAULT);
					setState(742);
					match(VALUES);
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_stmtContext extends ParserRuleContext {
		public Pragma_valueContext pragma_value() {
			return getRuleContext(Pragma_valueContext.class, 0);
		}

		public TerminalNode PRAGMA() {
			return getToken(SQLiteParser.PRAGMA, 0);
		}

		public Pragma_nameContext pragma_name() {
			return getRuleContext(Pragma_nameContext.class, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Pragma_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pragma_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterPragma_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitPragma_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitPragma_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Pragma_stmtContext pragma_stmt() throws RecognitionException {
		Pragma_stmtContext _localctx = new Pragma_stmtContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pragma_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(745);
				match(PRAGMA);
				setState(749);
				switch (getInterpreter().adaptivePredict(_input, 94, _ctx)) {
				case 1: {
					setState(746);
					database_name();
					setState(747);
					match(DOT);
				}
					break;
				}
				setState(751);
				pragma_name();
				setState(758);
				switch (_input.LA(1)) {
				case ASSIGN: {
					setState(752);
					match(ASSIGN);
					setState(753);
					pragma_value();
				}
					break;
				case OPEN_PAR: {
					setState(754);
					match(OPEN_PAR);
					setState(755);
					pragma_value();
					setState(756);
					match(CLOSE_PAR);
				}
					break;
				case EOF:
				case SCOL:
				case ALTER:
				case ANALYZE:
				case ATTACH:
				case BEGIN:
				case COMMIT:
				case CREATE:
				case DELETE:
				case DETACH:
				case DROP:
				case END:
				case EXPLAIN:
				case INSERT:
				case PRAGMA:
				case REINDEX:
				case RELEASE:
				case REPLACE:
				case ROLLBACK:
				case SAVEPOINT:
				case SELECT:
				case UPDATE:
				case VACUUM:
				case VALUES:
				case WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Reindex_stmtContext extends ParserRuleContext {
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class, 0);
		}

		public TerminalNode REINDEX() {
			return getToken(SQLiteParser.REINDEX, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Reindex_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_reindex_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterReindex_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitReindex_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitReindex_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Reindex_stmtContext reindex_stmt() throws RecognitionException {
		Reindex_stmtContext _localctx = new Reindex_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 50, RULE_reindex_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(760);
				match(REINDEX);
				setState(771);
				switch (getInterpreter().adaptivePredict(_input, 98, _ctx)) {
				case 1: {
					setState(761);
					collation_name();
				}
					break;
				case 2: {
					setState(765);
					switch (getInterpreter().adaptivePredict(_input, 96, _ctx)) {
					case 1: {
						setState(762);
						database_name();
						setState(763);
						match(DOT);
					}
						break;
					}
					setState(769);
					switch (getInterpreter().adaptivePredict(_input, 97, _ctx)) {
					case 1: {
						setState(767);
						table_name();
					}
						break;
					case 2: {
						setState(768);
						index_name();
					}
						break;
					}
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Release_stmtContext extends ParserRuleContext {
		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class, 0);
		}

		public TerminalNode SAVEPOINT() {
			return getToken(SQLiteParser.SAVEPOINT, 0);
		}

		public TerminalNode RELEASE() {
			return getToken(SQLiteParser.RELEASE, 0);
		}

		public Release_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_release_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterRelease_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitRelease_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitRelease_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Release_stmtContext release_stmt() throws RecognitionException {
		Release_stmtContext _localctx = new Release_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 52, RULE_release_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(773);
				match(RELEASE);
				setState(775);
				switch (getInterpreter().adaptivePredict(_input, 99, _ctx)) {
				case 1: {
					setState(774);
					match(SAVEPOINT);
				}
					break;
				}
				setState(777);
				savepoint_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rollback_stmtContext extends ParserRuleContext {
		public Transaction_nameContext transaction_name() {
			return getRuleContext(Transaction_nameContext.class, 0);
		}

		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class, 0);
		}

		public TerminalNode SAVEPOINT() {
			return getToken(SQLiteParser.SAVEPOINT, 0);
		}

		public TerminalNode TRANSACTION() {
			return getToken(SQLiteParser.TRANSACTION, 0);
		}

		public TerminalNode TO() {
			return getToken(SQLiteParser.TO, 0);
		}

		public TerminalNode ROLLBACK() {
			return getToken(SQLiteParser.ROLLBACK, 0);
		}

		public Rollback_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_rollback_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterRollback_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitRollback_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitRollback_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Rollback_stmtContext rollback_stmt()
			throws RecognitionException {
		Rollback_stmtContext _localctx = new Rollback_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 54, RULE_rollback_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(779);
				match(ROLLBACK);
				setState(784);
				_la = _input.LA(1);
				if (_la == TRANSACTION) {
					{
						setState(780);
						match(TRANSACTION);
						setState(782);
						switch (getInterpreter().adaptivePredict(_input, 100,
								_ctx)) {
						case 1: {
							setState(781);
							transaction_name();
						}
							break;
						}
					}
				}

				setState(791);
				_la = _input.LA(1);
				if (_la == TO) {
					{
						setState(786);
						match(TO);
						setState(788);
						switch (getInterpreter().adaptivePredict(_input, 102,
								_ctx)) {
						case 1: {
							setState(787);
							match(SAVEPOINT);
						}
							break;
						}
						setState(790);
						savepoint_name();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_stmtContext extends ParserRuleContext {
		public TerminalNode SAVEPOINT() {
			return getToken(SQLiteParser.SAVEPOINT, 0);
		}

		public Savepoint_nameContext savepoint_name() {
			return getRuleContext(Savepoint_nameContext.class, 0);
		}

		public Savepoint_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_savepoint_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSavepoint_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSavepoint_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSavepoint_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Savepoint_stmtContext savepoint_stmt()
			throws RecognitionException {
		Savepoint_stmtContext _localctx = new Savepoint_stmtContext(_ctx,
				getState());
		enterRule(_localctx, 56, RULE_savepoint_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(793);
				match(SAVEPOINT);
				setState(794);
				savepoint_name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class, 0);
		}

		public TerminalNode WITH() {
			return getToken(SQLiteParser.WITH, 0);
		}

		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}

		public TerminalNode LIMIT() {
			return getToken(SQLiteParser.LIMIT, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class, i);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode OFFSET() {
			return getToken(SQLiteParser.OFFSET, 0);
		}

		public TerminalNode ORDER() {
			return getToken(SQLiteParser.ORDER, 0);
		}

		public TerminalNode RECURSIVE() {
			return getToken(SQLiteParser.RECURSIVE, 0);
		}

		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class, i);
		}

		public Simple_select_stmtContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_simple_select_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSimple_select_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSimple_select_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSimple_select_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Simple_select_stmtContext simple_select_stmt()
			throws RecognitionException {
		Simple_select_stmtContext _localctx = new Simple_select_stmtContext(
				_ctx, getState());
		enterRule(_localctx, 58, RULE_simple_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(808);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(796);
						match(WITH);
						setState(798);
						switch (getInterpreter().adaptivePredict(_input, 104,
								_ctx)) {
						case 1: {
							setState(797);
							match(RECURSIVE);
						}
							break;
						}
						setState(800);
						common_table_expression();
						setState(805);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(801);
									match(COMMA);
									setState(802);
									common_table_expression();
								}
							}
							setState(807);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(810);
				select_core();
				setState(821);
				_la = _input.LA(1);
				if (_la == ORDER) {
					{
						setState(811);
						match(ORDER);
						setState(812);
						match(BY);
						setState(813);
						ordering_term();
						setState(818);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(814);
									match(COMMA);
									setState(815);
									ordering_term();
								}
							}
							setState(820);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(829);
				_la = _input.LA(1);
				if (_la == LIMIT) {
					{
						setState(823);
						match(LIMIT);
						setState(824);
						expr(0);
						setState(827);
						_la = _input.LA(1);
						if (_la == COMMA || _la == OFFSET) {
							{
								setState(825);
								_la = _input.LA(1);
								if (!(_la == COMMA || _la == OFFSET)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(826);
								expr(0);
							}
						}

					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values(int i) {
			return getRuleContext(Select_or_valuesContext.class, i);
		}

		public TerminalNode WITH() {
			return getToken(SQLiteParser.WITH, 0);
		}

		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}

		public TerminalNode LIMIT() {
			return getToken(SQLiteParser.LIMIT, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public Compound_operatorContext compound_operator(int i) {
			return getRuleContext(Compound_operatorContext.class, i);
		}

		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class, i);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode OFFSET() {
			return getToken(SQLiteParser.OFFSET, 0);
		}

		public TerminalNode ORDER() {
			return getToken(SQLiteParser.ORDER, 0);
		}

		public List<Select_or_valuesContext> select_or_values() {
			return getRuleContexts(Select_or_valuesContext.class);
		}

		public TerminalNode RECURSIVE() {
			return getToken(SQLiteParser.RECURSIVE, 0);
		}

		public List<Common_table_expressionContext> common_table_expression() {
			return getRuleContexts(Common_table_expressionContext.class);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public List<Compound_operatorContext> compound_operator() {
			return getRuleContexts(Compound_operatorContext.class);
		}

		public Common_table_expressionContext common_table_expression(int i) {
			return getRuleContext(Common_table_expressionContext.class, i);
		}

		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_select_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSelect_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSelect_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSelect_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(843);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(831);
						match(WITH);
						setState(833);
						switch (getInterpreter().adaptivePredict(_input, 111,
								_ctx)) {
						case 1: {
							setState(832);
							match(RECURSIVE);
						}
							break;
						}
						setState(835);
						common_table_expression();
						setState(840);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(836);
									match(COMMA);
									setState(837);
									common_table_expression();
								}
							}
							setState(842);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(845);
				select_or_values();
				setState(851);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == EXCEPT || _la == INTERSECT || _la == UNION) {
					{
						{
							setState(846);
							compound_operator();
							setState(847);
							select_or_values();
						}
					}
					setState(853);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(864);
				_la = _input.LA(1);
				if (_la == ORDER) {
					{
						setState(854);
						match(ORDER);
						setState(855);
						match(BY);
						setState(856);
						ordering_term();
						setState(861);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(857);
									match(COMMA);
									setState(858);
									ordering_term();
								}
							}
							setState(863);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
				}

				setState(872);
				_la = _input.LA(1);
				if (_la == LIMIT) {
					{
						setState(866);
						match(LIMIT);
						setState(867);
						expr(0);
						setState(870);
						_la = _input.LA(1);
						if (_la == COMMA || _la == OFFSET) {
							{
								setState(868);
								_la = _input.LA(1);
								if (!(_la == COMMA || _la == OFFSET)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(869);
								expr(0);
							}
						}

					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode VALUES() {
			return getToken(SQLiteParser.VALUES, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}

		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class, i);
		}

		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class, 0);
		}

		public TerminalNode FROM() {
			return getToken(SQLiteParser.FROM, 0);
		}

		public TerminalNode GROUP() {
			return getToken(SQLiteParser.GROUP, 0);
		}

		public TerminalNode ALL() {
			return getToken(SQLiteParser.ALL, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}

		public TerminalNode WHERE() {
			return getToken(SQLiteParser.WHERE, 0);
		}

		public TerminalNode SELECT() {
			return getToken(SQLiteParser.SELECT, 0);
		}

		public TerminalNode DISTINCT() {
			return getToken(SQLiteParser.DISTINCT, 0);
		}

		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class, i);
		}

		public TerminalNode HAVING() {
			return getToken(SQLiteParser.HAVING, 0);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public Select_or_valuesContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_select_or_values;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSelect_or_values(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSelect_or_values(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSelect_or_values(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values()
			throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx,
				getState());
		enterRule(_localctx, 62, RULE_select_or_values);
		int _la;
		try {
			setState(948);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
					setState(874);
					match(SELECT);
					setState(876);
					switch (getInterpreter().adaptivePredict(_input, 119, _ctx)) {
					case 1: {
						setState(875);
						_la = _input.LA(1);
						if (!(_la == ALL || _la == DISTINCT)) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
						break;
					}
					setState(878);
					result_column();
					setState(883);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(879);
								match(COMMA);
								setState(880);
								result_column();
							}
						}
						setState(885);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(898);
					_la = _input.LA(1);
					if (_la == FROM) {
						{
							setState(886);
							match(FROM);
							setState(896);
							switch (getInterpreter().adaptivePredict(_input,
									122, _ctx)) {
							case 1: {
								setState(887);
								table_or_subquery();
								setState(892);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(888);
											match(COMMA);
											setState(889);
											table_or_subquery();
										}
									}
									setState(894);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
							}
								break;
							case 2: {
								setState(895);
								join_clause();
							}
								break;
							}
						}
					}

					setState(902);
					_la = _input.LA(1);
					if (_la == WHERE) {
						{
							setState(900);
							match(WHERE);
							setState(901);
							expr(0);
						}
					}

					setState(918);
					_la = _input.LA(1);
					if (_la == GROUP) {
						{
							setState(904);
							match(GROUP);
							setState(905);
							match(BY);
							setState(906);
							expr(0);
							setState(911);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == COMMA) {
								{
									{
										setState(907);
										match(COMMA);
										setState(908);
										expr(0);
									}
								}
								setState(913);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(916);
							_la = _input.LA(1);
							if (_la == HAVING) {
								{
									setState(914);
									match(HAVING);
									setState(915);
									expr(0);
								}
							}

						}
					}

				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 2);
				{
					setState(920);
					match(VALUES);
					setState(921);
					match(OPEN_PAR);
					setState(922);
					expr(0);
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(923);
								match(COMMA);
								setState(924);
								expr(0);
							}
						}
						setState(929);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(930);
					match(CLOSE_PAR);
					setState(945);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(931);
								match(COMMA);
								setState(932);
								match(OPEN_PAR);
								setState(933);
								expr(0);
								setState(938);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(934);
											match(COMMA);
											setState(935);
											expr(0);
										}
									}
									setState(940);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(941);
								match(CLOSE_PAR);
							}
						}
						setState(947);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode IGNORE() {
			return getToken(SQLiteParser.IGNORE, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode ABORT() {
			return getToken(SQLiteParser.ABORT, 0);
		}

		public TerminalNode OR() {
			return getToken(SQLiteParser.OR, 0);
		}

		public TerminalNode FAIL() {
			return getToken(SQLiteParser.FAIL, 0);
		}

		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public TerminalNode REPLACE() {
			return getToken(SQLiteParser.REPLACE, 0);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode UPDATE() {
			return getToken(SQLiteParser.UPDATE, 0);
		}

		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class, 0);
		}

		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class, 0);
		}

		public TerminalNode WHERE() {
			return getToken(SQLiteParser.WHERE, 0);
		}

		public TerminalNode SET() {
			return getToken(SQLiteParser.SET, 0);
		}

		public TerminalNode ROLLBACK() {
			return getToken(SQLiteParser.ROLLBACK, 0);
		}

		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_update_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterUpdate_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitUpdate_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitUpdate_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(951);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(950);
						with_clause();
					}
				}

				setState(953);
				match(UPDATE);
				setState(964);
				switch (getInterpreter().adaptivePredict(_input, 133, _ctx)) {
				case 1: {
					setState(954);
					match(OR);
					setState(955);
					match(ROLLBACK);
				}
					break;
				case 2: {
					setState(956);
					match(OR);
					setState(957);
					match(ABORT);
				}
					break;
				case 3: {
					setState(958);
					match(OR);
					setState(959);
					match(REPLACE);
				}
					break;
				case 4: {
					setState(960);
					match(OR);
					setState(961);
					match(FAIL);
				}
					break;
				case 5: {
					setState(962);
					match(OR);
					setState(963);
					match(IGNORE);
				}
					break;
				}
				setState(966);
				qualified_table_name();
				setState(967);
				match(SET);
				setState(968);
				column_name();
				setState(969);
				match(ASSIGN);
				setState(970);
				expr(0);
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(971);
							match(COMMA);
							setState(972);
							column_name();
							setState(973);
							match(ASSIGN);
							setState(974);
							expr(0);
						}
					}
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(983);
				_la = _input.LA(1);
				if (_la == WHERE) {
					{
						setState(981);
						match(WHERE);
						setState(982);
						expr(0);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmt_limitedContext extends ParserRuleContext {
		public TerminalNode IGNORE() {
			return getToken(SQLiteParser.IGNORE, 0);
		}

		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode LIMIT() {
			return getToken(SQLiteParser.LIMIT, 0);
		}

		public TerminalNode ABORT() {
			return getToken(SQLiteParser.ABORT, 0);
		}

		public TerminalNode OR() {
			return getToken(SQLiteParser.OR, 0);
		}

		public TerminalNode FAIL() {
			return getToken(SQLiteParser.FAIL, 0);
		}

		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public TerminalNode REPLACE() {
			return getToken(SQLiteParser.REPLACE, 0);
		}

		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class, i);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public TerminalNode OFFSET() {
			return getToken(SQLiteParser.OFFSET, 0);
		}

		public TerminalNode UPDATE() {
			return getToken(SQLiteParser.UPDATE, 0);
		}

		public With_clauseContext with_clause() {
			return getRuleContext(With_clauseContext.class, 0);
		}

		public TerminalNode ORDER() {
			return getToken(SQLiteParser.ORDER, 0);
		}

		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class, 0);
		}

		public TerminalNode WHERE() {
			return getToken(SQLiteParser.WHERE, 0);
		}

		public TerminalNode SET() {
			return getToken(SQLiteParser.SET, 0);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public TerminalNode ROLLBACK() {
			return getToken(SQLiteParser.ROLLBACK, 0);
		}

		public Update_stmt_limitedContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_update_stmt_limited;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterUpdate_stmt_limited(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitUpdate_stmt_limited(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitUpdate_stmt_limited(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Update_stmt_limitedContext update_stmt_limited()
			throws RecognitionException {
		Update_stmt_limitedContext _localctx = new Update_stmt_limitedContext(
				_ctx, getState());
		enterRule(_localctx, 66, RULE_update_stmt_limited);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(986);
				_la = _input.LA(1);
				if (_la == WITH) {
					{
						setState(985);
						with_clause();
					}
				}

				setState(988);
				match(UPDATE);
				setState(999);
				switch (getInterpreter().adaptivePredict(_input, 137, _ctx)) {
				case 1: {
					setState(989);
					match(OR);
					setState(990);
					match(ROLLBACK);
				}
					break;
				case 2: {
					setState(991);
					match(OR);
					setState(992);
					match(ABORT);
				}
					break;
				case 3: {
					setState(993);
					match(OR);
					setState(994);
					match(REPLACE);
				}
					break;
				case 4: {
					setState(995);
					match(OR);
					setState(996);
					match(FAIL);
				}
					break;
				case 5: {
					setState(997);
					match(OR);
					setState(998);
					match(IGNORE);
				}
					break;
				}
				setState(1001);
				qualified_table_name();
				setState(1002);
				match(SET);
				setState(1003);
				column_name();
				setState(1004);
				match(ASSIGN);
				setState(1005);
				expr(0);
				setState(1013);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(1006);
							match(COMMA);
							setState(1007);
							column_name();
							setState(1008);
							match(ASSIGN);
							setState(1009);
							expr(0);
						}
					}
					setState(1015);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1018);
				_la = _input.LA(1);
				if (_la == WHERE) {
					{
						setState(1016);
						match(WHERE);
						setState(1017);
						expr(0);
					}
				}

				setState(1038);
				_la = _input.LA(1);
				if (_la == LIMIT || _la == ORDER) {
					{
						setState(1030);
						_la = _input.LA(1);
						if (_la == ORDER) {
							{
								setState(1020);
								match(ORDER);
								setState(1021);
								match(BY);
								setState(1022);
								ordering_term();
								setState(1027);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(1023);
											match(COMMA);
											setState(1024);
											ordering_term();
										}
									}
									setState(1029);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
							}
						}

						setState(1032);
						match(LIMIT);
						setState(1033);
						expr(0);
						setState(1036);
						_la = _input.LA(1);
						if (_la == COMMA || _la == OFFSET) {
							{
								setState(1034);
								_la = _input.LA(1);
								if (!(_la == COMMA || _la == OFFSET)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(1035);
								expr(0);
							}
						}

					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vacuum_stmtContext extends ParserRuleContext {
		public TerminalNode VACUUM() {
			return getToken(SQLiteParser.VACUUM, 0);
		}

		public Vacuum_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_vacuum_stmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterVacuum_stmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitVacuum_stmt(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitVacuum_stmt(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Vacuum_stmtContext vacuum_stmt() throws RecognitionException {
		Vacuum_stmtContext _localctx = new Vacuum_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_vacuum_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1040);
				match(VACUUM);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class, 0);
		}

		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class, 0);
		}

		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}

		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class, i);
		}

		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_column_def;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterColumn_def(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitColumn_def(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitColumn_def(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_column_def);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1042);
				column_name();
				setState(1044);
				switch (getInterpreter().adaptivePredict(_input, 144, _ctx)) {
				case 1: {
					setState(1043);
					type_name();
				}
					break;
				}
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHECK)
						| (1L << COLLATE) | (1L << CONSTRAINT) | (1L << DEFAULT))) != 0)
						|| ((((_la - 102)) & ~0x3f) == 0 && ((1L << (_la - 102)) & ((1L << (NOT - 102))
								| (1L << (NULL - 102))
								| (1L << (PRIMARY - 102))
								| (1L << (REFERENCES - 102)) | (1L << (UNIQUE - 102)))) != 0)) {
					{
						{
							setState(1046);
							column_constraint();
						}
					}
					setState(1051);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name(int i) {
			return getRuleContext(NameContext.class, i);
		}

		public Signed_numberContext signed_number(int i) {
			return getRuleContext(Signed_numberContext.class, i);
		}

		public List<Signed_numberContext> signed_number() {
			return getRuleContexts(Signed_numberContext.class);
		}

		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}

		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_type_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterType_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitType_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitType_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_type_name);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1053);
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1: {
						{
							setState(1052);
							name();
						}
					}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1055);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 146, _ctx);
				} while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
				setState(1067);
				switch (getInterpreter().adaptivePredict(_input, 147, _ctx)) {
				case 1: {
					setState(1057);
					match(OPEN_PAR);
					setState(1058);
					signed_number();
					setState(1059);
					match(CLOSE_PAR);
				}
					break;
				case 2: {
					setState(1061);
					match(OPEN_PAR);
					setState(1062);
					signed_number();
					setState(1063);
					match(COMMA);
					setState(1064);
					signed_number();
					setState(1065);
					match(CLOSE_PAR);
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public TerminalNode PRIMARY() {
			return getToken(SQLiteParser.PRIMARY, 0);
		}

		public TerminalNode CHECK() {
			return getToken(SQLiteParser.CHECK, 0);
		}

		public TerminalNode ASC() {
			return getToken(SQLiteParser.ASC, 0);
		}

		public TerminalNode COLLATE() {
			return getToken(SQLiteParser.COLLATE, 0);
		}

		public TerminalNode DESC() {
			return getToken(SQLiteParser.DESC, 0);
		}

		public TerminalNode KEY() {
			return getToken(SQLiteParser.KEY, 0);
		}

		public TerminalNode UNIQUE() {
			return getToken(SQLiteParser.UNIQUE, 0);
		}

		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode NULL() {
			return getToken(SQLiteParser.NULL, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class, 0);
		}

		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class, 0);
		}

		public TerminalNode AUTOINCREMENT() {
			return getToken(SQLiteParser.AUTOINCREMENT, 0);
		}

		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class, 0);
		}

		public TerminalNode CONSTRAINT() {
			return getToken(SQLiteParser.CONSTRAINT, 0);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class, 0);
		}

		public TerminalNode DEFAULT() {
			return getToken(SQLiteParser.DEFAULT, 0);
		}

		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class, 0);
		}

		public Column_constraintContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_column_constraint;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterColumn_constraint(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitColumn_constraint(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitColumn_constraint(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint()
			throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx,
				getState());
		enterRule(_localctx, 74, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1071);
				_la = _input.LA(1);
				if (_la == CONSTRAINT) {
					{
						setState(1069);
						match(CONSTRAINT);
						setState(1070);
						name();
					}
				}

				setState(1106);
				switch (_input.LA(1)) {
				case PRIMARY: {
					setState(1073);
					match(PRIMARY);
					setState(1074);
					match(KEY);
					setState(1076);
					_la = _input.LA(1);
					if (_la == ASC || _la == DESC) {
						{
							setState(1075);
							_la = _input.LA(1);
							if (!(_la == ASC || _la == DESC)) {
								_errHandler.recoverInline(this);
							}
							consume();
						}
					}

					setState(1078);
					conflict_clause();
					setState(1080);
					_la = _input.LA(1);
					if (_la == AUTOINCREMENT) {
						{
							setState(1079);
							match(AUTOINCREMENT);
						}
					}

				}
					break;
				case NOT:
				case NULL: {
					setState(1083);
					_la = _input.LA(1);
					if (_la == NOT) {
						{
							setState(1082);
							match(NOT);
						}
					}

					setState(1085);
					match(NULL);
					setState(1086);
					conflict_clause();
				}
					break;
				case UNIQUE: {
					setState(1087);
					match(UNIQUE);
					setState(1088);
					conflict_clause();
				}
					break;
				case CHECK: {
					setState(1089);
					match(CHECK);
					setState(1090);
					match(OPEN_PAR);
					setState(1091);
					expr(0);
					setState(1092);
					match(CLOSE_PAR);
				}
					break;
				case DEFAULT: {
					setState(1094);
					match(DEFAULT);
					setState(1101);
					switch (getInterpreter().adaptivePredict(_input, 152, _ctx)) {
					case 1: {
						setState(1095);
						signed_number();
					}
						break;
					case 2: {
						setState(1096);
						literal_value();
					}
						break;
					case 3: {
						setState(1097);
						match(OPEN_PAR);
						setState(1098);
						expr(0);
						setState(1099);
						match(CLOSE_PAR);
					}
						break;
					}
				}
					break;
				case COLLATE: {
					setState(1103);
					match(COLLATE);
					setState(1104);
					collation_name();
				}
					break;
				case REFERENCES: {
					setState(1105);
					foreign_key_clause();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Conflict_clauseContext extends ParserRuleContext {
		public TerminalNode CONFLICT() {
			return getToken(SQLiteParser.CONFLICT, 0);
		}

		public TerminalNode ON() {
			return getToken(SQLiteParser.ON, 0);
		}

		public TerminalNode IGNORE() {
			return getToken(SQLiteParser.IGNORE, 0);
		}

		public TerminalNode REPLACE() {
			return getToken(SQLiteParser.REPLACE, 0);
		}

		public TerminalNode ABORT() {
			return getToken(SQLiteParser.ABORT, 0);
		}

		public TerminalNode ROLLBACK() {
			return getToken(SQLiteParser.ROLLBACK, 0);
		}

		public TerminalNode FAIL() {
			return getToken(SQLiteParser.FAIL, 0);
		}

		public Conflict_clauseContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_conflict_clause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterConflict_clause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitConflict_clause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitConflict_clause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Conflict_clauseContext conflict_clause()
			throws RecognitionException {
		Conflict_clauseContext _localctx = new Conflict_clauseContext(_ctx,
				getState());
		enterRule(_localctx, 76, RULE_conflict_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1111);
				_la = _input.LA(1);
				if (_la == ON) {
					{
						setState(1108);
						match(ON);
						setState(1109);
						match(CONFLICT);
						setState(1110);
						_la = _input.LA(1);
						if (!(_la == ABORT || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (FAIL - 72))
								| (1L << (IGNORE - 72))
								| (1L << (REPLACE - 72)) | (1L << (ROLLBACK - 72)))) != 0))) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode CASE() {
			return getToken(SQLiteParser.CASE, 0);
		}

		public TerminalNode NOTNULL() {
			return getToken(SQLiteParser.NOTNULL, 0);
		}

		public TerminalNode ELSE() {
			return getToken(SQLiteParser.ELSE, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public TerminalNode BIND_PARAMETER() {
			return getToken(SQLiteParser.BIND_PARAMETER, 0);
		}

		public Type_nameContext type_name() {
			return getRuleContext(Type_nameContext.class, 0);
		}

		public TerminalNode AS() {
			return getToken(SQLiteParser.AS, 0);
		}

		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class, 0);
		}

		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode NULL() {
			return getToken(SQLiteParser.NULL, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public TerminalNode AND() {
			return getToken(SQLiteParser.AND, 0);
		}

		public TerminalNode CAST() {
			return getToken(SQLiteParser.CAST, 0);
		}

		public TerminalNode BETWEEN() {
			return getToken(SQLiteParser.BETWEEN, 0);
		}

		public TerminalNode MATCH() {
			return getToken(SQLiteParser.MATCH, 0);
		}

		public List<TerminalNode> THEN() {
			return getTokens(SQLiteParser.THEN);
		}

		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class, 0);
		}

		public TerminalNode COLLATE() {
			return getToken(SQLiteParser.COLLATE, 0);
		}

		public TerminalNode GLOB() {
			return getToken(SQLiteParser.GLOB, 0);
		}

		public TerminalNode ISNULL() {
			return getToken(SQLiteParser.ISNULL, 0);
		}

		public TerminalNode IN() {
			return getToken(SQLiteParser.IN, 0);
		}

		public Raise_functionContext raise_function() {
			return getRuleContext(Raise_functionContext.class, 0);
		}

		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public TerminalNode ESCAPE() {
			return getToken(SQLiteParser.ESCAPE, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class, 0);
		}

		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class, 0);
		}

		public TerminalNode IS() {
			return getToken(SQLiteParser.IS, 0);
		}

		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class, 0);
		}

		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class, 0);
		}

		public List<TerminalNode> WHEN() {
			return getTokens(SQLiteParser.WHEN);
		}

		public TerminalNode END() {
			return getToken(SQLiteParser.END, 0);
		}

		public TerminalNode DISTINCT() {
			return getToken(SQLiteParser.DISTINCT, 0);
		}

		public TerminalNode LIKE() {
			return getToken(SQLiteParser.LIKE, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class, 0);
		}

		public TerminalNode WHEN(int i) {
			return getToken(SQLiteParser.WHEN, i);
		}

		public TerminalNode THEN(int i) {
			return getToken(SQLiteParser.THEN, i);
		}

		public TerminalNode REGEXP() {
			return getToken(SQLiteParser.REGEXP, 0);
		}

		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_expr;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterExpr(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitExpr(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor).visitExpr(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
				setState(1189);
				switch (getInterpreter().adaptivePredict(_input, 165, _ctx)) {
				case 1: {
					setState(1114);
					unary_operator();
					setState(1115);
					expr(14);
				}
					break;
				case 2: {
					setState(1117);
					literal_value();
				}
					break;
				case 3: {
					setState(1118);
					match(BIND_PARAMETER);
				}
					break;
				case 4: {
					setState(1127);
					switch (getInterpreter().adaptivePredict(_input, 156, _ctx)) {
					case 1: {
						setState(1122);
						switch (getInterpreter().adaptivePredict(_input, 155,
								_ctx)) {
						case 1: {
							setState(1119);
							database_name();
							setState(1120);
							match(DOT);
						}
							break;
						}
						setState(1124);
						table_name();
						setState(1125);
						match(DOT);
					}
						break;
					}
					setState(1129);
					column_name();
				}
					break;
				case 5: {
					setState(1130);
					function_name();
					setState(1131);
					match(OPEN_PAR);
					setState(1144);
					switch (_input.LA(1)) {
					case OPEN_PAR:
					case PLUS:
					case MINUS:
					case TILDE:
					case ABORT:
					case ACTION:
					case ADD:
					case AFTER:
					case ALL:
					case ALTER:
					case ANALYZE:
					case AND:
					case AS:
					case ASC:
					case ATTACH:
					case AUTOINCREMENT:
					case BEFORE:
					case BEGIN:
					case BETWEEN:
					case BY:
					case CASCADE:
					case CASE:
					case CAST:
					case CHECK:
					case COLLATE:
					case COLUMN:
					case COMMIT:
					case CONFLICT:
					case CONSTRAINT:
					case CREATE:
					case CROSS:
					case CURRENT_DATE:
					case CURRENT_TIME:
					case CURRENT_TIMESTAMP:
					case DATABASE:
					case DEFAULT:
					case DEFERRABLE:
					case DEFERRED:
					case DELETE:
					case DESC:
					case DETACH:
					case DISTINCT:
					case DROP:
					case EACH:
					case ELSE:
					case END:
					case ESCAPE:
					case EXCEPT:
					case EXCLUSIVE:
					case EXISTS:
					case EXPLAIN:
					case FAIL:
					case FOR:
					case FOREIGN:
					case FROM:
					case FULL:
					case GLOB:
					case GROUP:
					case HAVING:
					case IF:
					case IGNORE:
					case IMMEDIATE:
					case IN:
					case INDEX:
					case INDEXED:
					case INITIALLY:
					case INNER:
					case INSERT:
					case INSTEAD:
					case INTERSECT:
					case INTO:
					case IS:
					case ISNULL:
					case JOIN:
					case KEY:
					case LEFT:
					case LIKE:
					case LIMIT:
					case MATCH:
					case NATURAL:
					case NO:
					case NOT:
					case NOTNULL:
					case NULL:
					case OF:
					case OFFSET:
					case ON:
					case OR:
					case ORDER:
					case OUTER:
					case PLAN:
					case PRAGMA:
					case PRIMARY:
					case QUERY:
					case RAISE:
					case RECURSIVE:
					case REFERENCES:
					case REGEXP:
					case REINDEX:
					case RELEASE:
					case RENAME:
					case REPLACE:
					case RESTRICT:
					case RIGHT:
					case ROLLBACK:
					case ROW:
					case SAVEPOINT:
					case SELECT:
					case SET:
					case TABLE:
					case TEMP:
					case TEMPORARY:
					case THEN:
					case TO:
					case TRANSACTION:
					case TRIGGER:
					case UNION:
					case UNIQUE:
					case UPDATE:
					case USING:
					case VACUUM:
					case VALUES:
					case VIEW:
					case VIRTUAL:
					case WHEN:
					case WHERE:
					case WITH:
					case WITHOUT:
					case IDENTIFIER:
					case NUMERIC_LITERAL:
					case BIND_PARAMETER:
					case STRING_LITERAL:
					case BLOB_LITERAL: {
						setState(1133);
						switch (getInterpreter().adaptivePredict(_input, 157,
								_ctx)) {
						case 1: {
							setState(1132);
							match(DISTINCT);
						}
							break;
						}
						setState(1135);
						expr(0);
						setState(1140);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(1136);
									match(COMMA);
									setState(1137);
									expr(0);
								}
							}
							setState(1142);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
						break;
					case STAR: {
						setState(1143);
						match(STAR);
					}
						break;
					case CLOSE_PAR:
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1146);
					match(CLOSE_PAR);
				}
					break;
				case 6: {
					setState(1148);
					match(OPEN_PAR);
					setState(1149);
					expr(0);
					setState(1150);
					match(CLOSE_PAR);
				}
					break;
				case 7: {
					setState(1152);
					match(CAST);
					setState(1153);
					match(OPEN_PAR);
					setState(1154);
					expr(0);
					setState(1155);
					match(AS);
					setState(1156);
					type_name();
					setState(1157);
					match(CLOSE_PAR);
				}
					break;
				case 8: {
					setState(1163);
					_la = _input.LA(1);
					if (_la == EXISTS || _la == NOT) {
						{
							setState(1160);
							_la = _input.LA(1);
							if (_la == NOT) {
								{
									setState(1159);
									match(NOT);
								}
							}

							setState(1162);
							match(EXISTS);
						}
					}

					setState(1165);
					match(OPEN_PAR);
					setState(1166);
					select_stmt();
					setState(1167);
					match(CLOSE_PAR);
				}
					break;
				case 9: {
					setState(1169);
					match(CASE);
					setState(1171);
					switch (getInterpreter().adaptivePredict(_input, 162, _ctx)) {
					case 1: {
						setState(1170);
						expr(0);
					}
						break;
					}
					setState(1178);
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
							{
								setState(1173);
								match(WHEN);
								setState(1174);
								expr(0);
								setState(1175);
								match(THEN);
								setState(1176);
								expr(0);
							}
						}
						setState(1180);
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while (_la == WHEN);
					setState(1184);
					_la = _input.LA(1);
					if (_la == ELSE) {
						{
							setState(1182);
							match(ELSE);
							setState(1183);
							expr(0);
						}
					}

					setState(1186);
					match(END);
				}
					break;
				case 10: {
					setState(1188);
					raise_function();
				}
					break;
				}
				_ctx.stop = _input.LT(-1);
				setState(1258);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input, 177, _ctx);
				while (_alt != 2
						&& _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
					if (_alt == 1) {
						if (_parseListeners != null)
							triggerExitRuleEvent();
						_prevctx = _localctx;
						{
							setState(1256);
							switch (getInterpreter().adaptivePredict(_input,
									176, _ctx)) {
							case 1: {
								_localctx = new ExprContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expr);
								setState(1191);
								if (!(precpred(_ctx, 13)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 13)");
								setState(1192);
								binary_operator();
								setState(1193);
								expr(14);
							}
								break;
							case 2: {
								_localctx = new ExprContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expr);
								setState(1195);
								if (!(precpred(_ctx, 6)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 6)");
								setState(1196);
								match(IS);
								setState(1198);
								switch (getInterpreter().adaptivePredict(
										_input, 166, _ctx)) {
								case 1: {
									setState(1197);
									match(NOT);
								}
									break;
								}
								setState(1200);
								expr(7);
							}
								break;
							case 3: {
								_localctx = new ExprContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expr);
								setState(1201);
								if (!(precpred(_ctx, 5)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 5)");
								setState(1203);
								_la = _input.LA(1);
								if (_la == NOT) {
									{
										setState(1202);
										match(NOT);
									}
								}

								setState(1205);
								match(BETWEEN);
								setState(1206);
								expr(0);
								setState(1207);
								match(AND);
								setState(1208);
								expr(6);
							}
								break;
							case 4: {
								_localctx = new ExprContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expr);
								setState(1210);
								if (!(precpred(_ctx, 9)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 9)");
								setState(1211);
								match(COLLATE);
								setState(1212);
								collation_name();
							}
								break;
							case 5: {
								_localctx = new ExprContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expr);
								setState(1213);
								if (!(precpred(_ctx, 8)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 8)");
								setState(1215);
								_la = _input.LA(1);
								if (_la == NOT) {
									{
										setState(1214);
										match(NOT);
									}
								}

								setState(1217);
								_la = _input.LA(1);
								if (!(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (GLOB - 77))
										| (1L << (LIKE - 77))
										| (1L << (MATCH - 77)) | (1L << (REGEXP - 77)))) != 0))) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(1218);
								expr(0);
								setState(1221);
								switch (getInterpreter().adaptivePredict(
										_input, 169, _ctx)) {
								case 1: {
									setState(1219);
									match(ESCAPE);
									setState(1220);
									expr(0);
								}
									break;
								}
							}
								break;
							case 6: {
								_localctx = new ExprContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expr);
								setState(1223);
								if (!(precpred(_ctx, 7)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 7)");
								setState(1228);
								switch (_input.LA(1)) {
								case ISNULL: {
									setState(1224);
									match(ISNULL);
								}
									break;
								case NOTNULL: {
									setState(1225);
									match(NOTNULL);
								}
									break;
								case NOT: {
									setState(1226);
									match(NOT);
									setState(1227);
									match(NULL);
								}
									break;
								default:
									throw new NoViableAltException(this);
								}
							}
								break;
							case 7: {
								_localctx = new ExprContext(_parentctx,
										_parentState);
								pushNewRecursionContext(_localctx, _startState,
										RULE_expr);
								setState(1230);
								if (!(precpred(_ctx, 4)))
									throw new FailedPredicateException(this,
											"precpred(_ctx, 4)");
								setState(1232);
								_la = _input.LA(1);
								if (_la == NOT) {
									{
										setState(1231);
										match(NOT);
									}
								}

								setState(1234);
								match(IN);
								setState(1254);
								switch (getInterpreter().adaptivePredict(
										_input, 175, _ctx)) {
								case 1: {
									setState(1235);
									match(OPEN_PAR);
									setState(1245);
									switch (getInterpreter().adaptivePredict(
											_input, 173, _ctx)) {
									case 1: {
										setState(1236);
										select_stmt();
									}
										break;
									case 2: {
										setState(1237);
										expr(0);
										setState(1242);
										_errHandler.sync(this);
										_la = _input.LA(1);
										while (_la == COMMA) {
											{
												{
													setState(1238);
													match(COMMA);
													setState(1239);
													expr(0);
												}
											}
											setState(1244);
											_errHandler.sync(this);
											_la = _input.LA(1);
										}
									}
										break;
									}
									setState(1247);
									match(CLOSE_PAR);
								}
									break;
								case 2: {
									setState(1251);
									switch (getInterpreter().adaptivePredict(
											_input, 174, _ctx)) {
									case 1: {
										setState(1248);
										database_name();
										setState(1249);
										match(DOT);
									}
										break;
									}
									setState(1253);
									table_name();
								}
									break;
								}
							}
								break;
							}
						}
					}
					setState(1260);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input, 177, _ctx);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public List<TerminalNode> CASCADE() {
			return getTokens(SQLiteParser.CASCADE);
		}

		public NameContext name(int i) {
			return getRuleContext(NameContext.class, i);
		}

		public List<TerminalNode> DELETE() {
			return getTokens(SQLiteParser.DELETE);
		}

		public TerminalNode ON(int i) {
			return getToken(SQLiteParser.ON, i);
		}

		public TerminalNode RESTRICT(int i) {
			return getToken(SQLiteParser.RESTRICT, i);
		}

		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public List<TerminalNode> NULL() {
			return getTokens(SQLiteParser.NULL);
		}

		public TerminalNode MATCH(int i) {
			return getToken(SQLiteParser.MATCH, i);
		}

		public TerminalNode DELETE(int i) {
			return getToken(SQLiteParser.DELETE, i);
		}

		public TerminalNode INITIALLY() {
			return getToken(SQLiteParser.INITIALLY, 0);
		}

		public List<TerminalNode> RESTRICT() {
			return getTokens(SQLiteParser.RESTRICT);
		}

		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}

		public List<TerminalNode> DEFAULT() {
			return getTokens(SQLiteParser.DEFAULT);
		}

		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class, 0);
		}

		public TerminalNode DEFERRED() {
			return getToken(SQLiteParser.DEFERRED, 0);
		}

		public List<TerminalNode> ON() {
			return getTokens(SQLiteParser.ON);
		}

		public List<TerminalNode> MATCH() {
			return getTokens(SQLiteParser.MATCH);
		}

		public TerminalNode DEFERRABLE() {
			return getToken(SQLiteParser.DEFERRABLE, 0);
		}

		public TerminalNode CASCADE(int i) {
			return getToken(SQLiteParser.CASCADE, i);
		}

		public List<TerminalNode> ACTION() {
			return getTokens(SQLiteParser.ACTION);
		}

		public TerminalNode ACTION(int i) {
			return getToken(SQLiteParser.ACTION, i);
		}

		public TerminalNode UPDATE(int i) {
			return getToken(SQLiteParser.UPDATE, i);
		}

		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public TerminalNode SET(int i) {
			return getToken(SQLiteParser.SET, i);
		}

		public TerminalNode NULL(int i) {
			return getToken(SQLiteParser.NULL, i);
		}

		public List<TerminalNode> NO() {
			return getTokens(SQLiteParser.NO);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public List<TerminalNode> UPDATE() {
			return getTokens(SQLiteParser.UPDATE);
		}

		public TerminalNode IMMEDIATE() {
			return getToken(SQLiteParser.IMMEDIATE, 0);
		}

		public TerminalNode REFERENCES() {
			return getToken(SQLiteParser.REFERENCES, 0);
		}

		public List<TerminalNode> SET() {
			return getTokens(SQLiteParser.SET);
		}

		public TerminalNode DEFAULT(int i) {
			return getToken(SQLiteParser.DEFAULT, i);
		}

		public TerminalNode NO(int i) {
			return getToken(SQLiteParser.NO, i);
		}

		public Foreign_key_clauseContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_foreign_key_clause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterForeign_key_clause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitForeign_key_clause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitForeign_key_clause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause()
			throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(
				_ctx, getState());
		enterRule(_localctx, 80, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1261);
				match(REFERENCES);
				setState(1262);
				foreign_table();
				setState(1274);
				_la = _input.LA(1);
				if (_la == OPEN_PAR) {
					{
						setState(1263);
						match(OPEN_PAR);
						setState(1264);
						column_name();
						setState(1269);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(1265);
									match(COMMA);
									setState(1266);
									column_name();
								}
							}
							setState(1271);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1272);
						match(CLOSE_PAR);
					}
				}

				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == MATCH || _la == ON) {
					{
						{
							setState(1290);
							switch (_input.LA(1)) {
							case ON: {
								setState(1276);
								match(ON);
								setState(1277);
								_la = _input.LA(1);
								if (!(_la == DELETE || _la == UPDATE)) {
									_errHandler.recoverInline(this);
								}
								consume();
								setState(1286);
								switch (getInterpreter().adaptivePredict(
										_input, 180, _ctx)) {
								case 1: {
									setState(1278);
									match(SET);
									setState(1279);
									match(NULL);
								}
									break;
								case 2: {
									setState(1280);
									match(SET);
									setState(1281);
									match(DEFAULT);
								}
									break;
								case 3: {
									setState(1282);
									match(CASCADE);
								}
									break;
								case 4: {
									setState(1283);
									match(RESTRICT);
								}
									break;
								case 5: {
									setState(1284);
									match(NO);
									setState(1285);
									match(ACTION);
								}
									break;
								}
							}
								break;
							case MATCH: {
								setState(1288);
								match(MATCH);
								setState(1289);
								name();
							}
								break;
							default:
								throw new NoViableAltException(this);
							}
						}
					}
					setState(1296);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1307);
				switch (getInterpreter().adaptivePredict(_input, 185, _ctx)) {
				case 1: {
					setState(1298);
					_la = _input.LA(1);
					if (_la == NOT) {
						{
							setState(1297);
							match(NOT);
						}
					}

					setState(1300);
					match(DEFERRABLE);
					setState(1305);
					switch (getInterpreter().adaptivePredict(_input, 184, _ctx)) {
					case 1: {
						setState(1301);
						match(INITIALLY);
						setState(1302);
						match(DEFERRED);
					}
						break;
					case 2: {
						setState(1303);
						match(INITIALLY);
						setState(1304);
						match(IMMEDIATE);
					}
						break;
					}
				}
					break;
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Raise_functionContext extends ParserRuleContext {
		public Error_messageContext error_message() {
			return getRuleContext(Error_messageContext.class, 0);
		}

		public TerminalNode IGNORE() {
			return getToken(SQLiteParser.IGNORE, 0);
		}

		public TerminalNode RAISE() {
			return getToken(SQLiteParser.RAISE, 0);
		}

		public TerminalNode ABORT() {
			return getToken(SQLiteParser.ABORT, 0);
		}

		public TerminalNode ROLLBACK() {
			return getToken(SQLiteParser.ROLLBACK, 0);
		}

		public TerminalNode FAIL() {
			return getToken(SQLiteParser.FAIL, 0);
		}

		public Raise_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_raise_function;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterRaise_function(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitRaise_function(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitRaise_function(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Raise_functionContext raise_function()
			throws RecognitionException {
		Raise_functionContext _localctx = new Raise_functionContext(_ctx,
				getState());
		enterRule(_localctx, 82, RULE_raise_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1309);
				match(RAISE);
				setState(1310);
				match(OPEN_PAR);
				setState(1315);
				switch (_input.LA(1)) {
				case IGNORE: {
					setState(1311);
					match(IGNORE);
				}
					break;
				case ABORT:
				case FAIL:
				case ROLLBACK: {
					setState(1312);
					_la = _input.LA(1);
					if (!(_la == ABORT || _la == FAIL || _la == ROLLBACK)) {
						_errHandler.recoverInline(this);
					}
					consume();
					setState(1313);
					match(COMMA);
					setState(1314);
					error_message();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1317);
				match(CLOSE_PAR);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public TerminalNode ASC() {
			return getToken(SQLiteParser.ASC, 0);
		}

		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class, 0);
		}

		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class, 0);
		}

		public TerminalNode COLLATE() {
			return getToken(SQLiteParser.COLLATE, 0);
		}

		public TerminalNode DESC() {
			return getToken(SQLiteParser.DESC, 0);
		}

		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_indexed_column;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterIndexed_column(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitIndexed_column(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitIndexed_column(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column()
			throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx,
				getState());
		enterRule(_localctx, 84, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1319);
				column_name();
				setState(1322);
				_la = _input.LA(1);
				if (_la == COLLATE) {
					{
						setState(1320);
						match(COLLATE);
						setState(1321);
						collation_name();
					}
				}

				setState(1325);
				_la = _input.LA(1);
				if (_la == ASC || _la == DESC) {
					{
						setState(1324);
						_la = _input.LA(1);
						if (!(_la == ASC || _la == DESC)) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public TerminalNode CHECK() {
			return getToken(SQLiteParser.CHECK, 0);
		}

		public TerminalNode PRIMARY() {
			return getToken(SQLiteParser.PRIMARY, 0);
		}

		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}

		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class, i);
		}

		public TerminalNode KEY() {
			return getToken(SQLiteParser.KEY, 0);
		}

		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public TerminalNode UNIQUE() {
			return getToken(SQLiteParser.UNIQUE, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public TerminalNode CONSTRAINT() {
			return getToken(SQLiteParser.CONSTRAINT, 0);
		}

		public TerminalNode FOREIGN() {
			return getToken(SQLiteParser.FOREIGN, 0);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Conflict_clauseContext conflict_clause() {
			return getRuleContext(Conflict_clauseContext.class, 0);
		}

		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class, 0);
		}

		public Table_constraintContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_table_constraint;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterTable_constraint(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitTable_constraint(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitTable_constraint(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint()
			throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx,
				getState());
		enterRule(_localctx, 86, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1329);
				_la = _input.LA(1);
				if (_la == CONSTRAINT) {
					{
						setState(1327);
						match(CONSTRAINT);
						setState(1328);
						name();
					}
				}

				setState(1367);
				switch (_input.LA(1)) {
				case PRIMARY:
				case UNIQUE: {
					setState(1334);
					switch (_input.LA(1)) {
					case PRIMARY: {
						setState(1331);
						match(PRIMARY);
						setState(1332);
						match(KEY);
					}
						break;
					case UNIQUE: {
						setState(1333);
						match(UNIQUE);
					}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1336);
					match(OPEN_PAR);
					setState(1337);
					indexed_column();
					setState(1342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(1338);
								match(COMMA);
								setState(1339);
								indexed_column();
							}
						}
						setState(1344);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1345);
					match(CLOSE_PAR);
					setState(1346);
					conflict_clause();
				}
					break;
				case CHECK: {
					setState(1348);
					match(CHECK);
					setState(1349);
					match(OPEN_PAR);
					setState(1350);
					expr(0);
					setState(1351);
					match(CLOSE_PAR);
				}
					break;
				case FOREIGN: {
					setState(1353);
					match(FOREIGN);
					setState(1354);
					match(KEY);
					setState(1355);
					match(OPEN_PAR);
					setState(1356);
					column_name();
					setState(1361);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(1357);
								match(COMMA);
								setState(1358);
								column_name();
							}
						}
						setState(1363);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1364);
					match(CLOSE_PAR);
					setState(1365);
					foreign_key_clause();
				}
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class With_clauseContext extends ParserRuleContext {
		public TerminalNode WITH() {
			return getToken(SQLiteParser.WITH, 0);
		}

		public TerminalNode AS(int i) {
			return getToken(SQLiteParser.AS, i);
		}

		public Select_stmtContext select_stmt(int i) {
			return getRuleContext(Select_stmtContext.class, i);
		}

		public Cte_table_nameContext cte_table_name(int i) {
			return getRuleContext(Cte_table_nameContext.class, i);
		}

		public TerminalNode RECURSIVE() {
			return getToken(SQLiteParser.RECURSIVE, 0);
		}

		public List<Cte_table_nameContext> cte_table_name() {
			return getRuleContexts(Cte_table_nameContext.class);
		}

		public List<Select_stmtContext> select_stmt() {
			return getRuleContexts(Select_stmtContext.class);
		}

		public List<TerminalNode> AS() {
			return getTokens(SQLiteParser.AS);
		}

		public With_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_with_clause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterWith_clause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitWith_clause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitWith_clause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final With_clauseContext with_clause() throws RecognitionException {
		With_clauseContext _localctx = new With_clauseContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_with_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1369);
				match(WITH);
				setState(1371);
				switch (getInterpreter().adaptivePredict(_input, 194, _ctx)) {
				case 1: {
					setState(1370);
					match(RECURSIVE);
				}
					break;
				}
				setState(1373);
				cte_table_name();
				setState(1374);
				match(AS);
				setState(1375);
				match(OPEN_PAR);
				setState(1376);
				select_stmt();
				setState(1377);
				match(CLOSE_PAR);
				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA) {
					{
						{
							setState(1378);
							match(COMMA);
							setState(1379);
							cte_table_name();
							setState(1380);
							match(AS);
							setState(1381);
							match(OPEN_PAR);
							setState(1382);
							select_stmt();
							setState(1383);
							match(CLOSE_PAR);
						}
					}
					setState(1389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode INDEXED() {
			return getToken(SQLiteParser.INDEXED, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public Qualified_table_nameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_qualified_table_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterQualified_table_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitQualified_table_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitQualified_table_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name()
			throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(
				_ctx, getState());
		enterRule(_localctx, 90, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1393);
				switch (getInterpreter().adaptivePredict(_input, 196, _ctx)) {
				case 1: {
					setState(1390);
					database_name();
					setState(1391);
					match(DOT);
				}
					break;
				}
				setState(1395);
				table_name();
				setState(1401);
				switch (_input.LA(1)) {
				case INDEXED: {
					setState(1396);
					match(INDEXED);
					setState(1397);
					match(BY);
					setState(1398);
					index_name();
				}
					break;
				case NOT: {
					setState(1399);
					match(NOT);
					setState(1400);
					match(INDEXED);
				}
					break;
				case EOF:
				case SCOL:
				case ALTER:
				case ANALYZE:
				case ATTACH:
				case BEGIN:
				case COMMIT:
				case CREATE:
				case DELETE:
				case DETACH:
				case DROP:
				case END:
				case EXPLAIN:
				case INSERT:
				case LIMIT:
				case ORDER:
				case PRAGMA:
				case REINDEX:
				case RELEASE:
				case REPLACE:
				case ROLLBACK:
				case SAVEPOINT:
				case SELECT:
				case SET:
				case UPDATE:
				case VACUUM:
				case VALUES:
				case WHERE:
				case WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public TerminalNode ASC() {
			return getToken(SQLiteParser.ASC, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class, 0);
		}

		public TerminalNode COLLATE() {
			return getToken(SQLiteParser.COLLATE, 0);
		}

		public TerminalNode DESC() {
			return getToken(SQLiteParser.DESC, 0);
		}

		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_ordering_term;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterOrdering_term(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitOrdering_term(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitOrdering_term(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term()
			throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx,
				getState());
		enterRule(_localctx, 92, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1403);
				expr(0);
				setState(1406);
				_la = _input.LA(1);
				if (_la == COLLATE) {
					{
						setState(1404);
						match(COLLATE);
						setState(1405);
						collation_name();
					}
				}

				setState(1409);
				_la = _input.LA(1);
				if (_la == ASC || _la == DESC) {
					{
						setState(1408);
						_la = _input.LA(1);
						if (!(_la == ASC || _la == DESC)) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class, 0);
		}

		public TerminalNode STRING_LITERAL() {
			return getToken(SQLiteParser.STRING_LITERAL, 0);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pragma_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterPragma_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitPragma_value(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitPragma_value(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx,
				getState());
		enterRule(_localctx, 94, RULE_pragma_value);
		try {
			setState(1414);
			switch (getInterpreter().adaptivePredict(_input, 200, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1411);
					signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1412);
					name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1413);
					match(STRING_LITERAL);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends
			ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class, 0);
		}

		public TerminalNode AS() {
			return getToken(SQLiteParser.AS, 0);
		}

		public Common_table_expressionContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_common_table_expression;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCommon_table_expression(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCommon_table_expression(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCommon_table_expression(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression()
			throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(
				_ctx, getState());
		enterRule(_localctx, 96, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1416);
				table_name();
				setState(1428);
				_la = _input.LA(1);
				if (_la == OPEN_PAR) {
					{
						setState(1417);
						match(OPEN_PAR);
						setState(1418);
						column_name();
						setState(1423);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(1419);
									match(COMMA);
									setState(1420);
									column_name();
								}
							}
							setState(1425);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1426);
						match(CLOSE_PAR);
					}
				}

				setState(1430);
				match(AS);
				setState(1431);
				match(OPEN_PAR);
				setState(1432);
				select_stmt();
				setState(1433);
				match(CLOSE_PAR);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class, 0);
		}

		public TerminalNode AS() {
			return getToken(SQLiteParser.AS, 0);
		}

		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_result_column;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterResult_column(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitResult_column(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitResult_column(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column()
			throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx,
				getState());
		enterRule(_localctx, 98, RULE_result_column);
		int _la;
		try {
			setState(1447);
			switch (getInterpreter().adaptivePredict(_input, 205, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1435);
					match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1436);
					table_name();
					setState(1437);
					match(DOT);
					setState(1438);
					match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1440);
					expr(0);
					setState(1445);
					_la = _input.LA(1);
					if (_la == AS || _la == IDENTIFIER || _la == STRING_LITERAL) {
						{
							setState(1442);
							_la = _input.LA(1);
							if (_la == AS) {
								{
									setState(1441);
									match(AS);
								}
							}

							setState(1444);
							column_alias();
						}
					}

				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode INDEXED() {
			return getToken(SQLiteParser.INDEXED, 0);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class, 0);
		}

		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}

		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class, 0);
		}

		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class, i);
		}

		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class, 0);
		}

		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class, 0);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class, 0);
		}

		public TerminalNode AS() {
			return getToken(SQLiteParser.AS, 0);
		}

		public Table_or_subqueryContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_table_or_subquery;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterTable_or_subquery(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitTable_or_subquery(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitTable_or_subquery(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery()
			throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx,
				getState());
		enterRule(_localctx, 100, RULE_table_or_subquery);
		int _la;
		try {
			setState(1496);
			switch (getInterpreter().adaptivePredict(_input, 216, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1452);
					switch (getInterpreter().adaptivePredict(_input, 206, _ctx)) {
					case 1: {
						setState(1449);
						database_name();
						setState(1450);
						match(DOT);
					}
						break;
					}
					setState(1454);
					table_name();
					setState(1459);
					switch (getInterpreter().adaptivePredict(_input, 208, _ctx)) {
					case 1: {
						setState(1456);
						switch (getInterpreter().adaptivePredict(_input, 207,
								_ctx)) {
						case 1: {
							setState(1455);
							match(AS);
						}
							break;
						}
						setState(1458);
						table_alias();
					}
						break;
					}
					setState(1466);
					switch (_input.LA(1)) {
					case INDEXED: {
						setState(1461);
						match(INDEXED);
						setState(1462);
						match(BY);
						setState(1463);
						index_name();
					}
						break;
					case NOT: {
						setState(1464);
						match(NOT);
						setState(1465);
						match(INDEXED);
					}
						break;
					case EOF:
					case SCOL:
					case CLOSE_PAR:
					case COMMA:
					case ALTER:
					case ANALYZE:
					case ATTACH:
					case BEGIN:
					case COMMIT:
					case CREATE:
					case CROSS:
					case DELETE:
					case DETACH:
					case DROP:
					case END:
					case EXCEPT:
					case EXPLAIN:
					case GROUP:
					case INNER:
					case INSERT:
					case INTERSECT:
					case JOIN:
					case LEFT:
					case LIMIT:
					case NATURAL:
					case ON:
					case ORDER:
					case PRAGMA:
					case REINDEX:
					case RELEASE:
					case REPLACE:
					case ROLLBACK:
					case SAVEPOINT:
					case SELECT:
					case UNION:
					case UPDATE:
					case USING:
					case VACUUM:
					case VALUES:
					case WHERE:
					case WITH:
					case UNEXPECTED_CHAR:
						break;
					default:
						throw new NoViableAltException(this);
					}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1468);
					match(OPEN_PAR);
					setState(1478);
					switch (getInterpreter().adaptivePredict(_input, 211, _ctx)) {
					case 1: {
						setState(1469);
						table_or_subquery();
						setState(1474);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(1470);
									match(COMMA);
									setState(1471);
									table_or_subquery();
								}
							}
							setState(1476);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
					}
						break;
					case 2: {
						setState(1477);
						join_clause();
					}
						break;
					}
					setState(1480);
					match(CLOSE_PAR);
					setState(1485);
					switch (getInterpreter().adaptivePredict(_input, 213, _ctx)) {
					case 1: {
						setState(1482);
						switch (getInterpreter().adaptivePredict(_input, 212,
								_ctx)) {
						case 1: {
							setState(1481);
							match(AS);
						}
							break;
						}
						setState(1484);
						table_alias();
					}
						break;
					}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1487);
					match(OPEN_PAR);
					setState(1488);
					select_stmt();
					setState(1489);
					match(CLOSE_PAR);
					setState(1494);
					switch (getInterpreter().adaptivePredict(_input, 215, _ctx)) {
					case 1: {
						setState(1491);
						switch (getInterpreter().adaptivePredict(_input, 214,
								_ctx)) {
						case 1: {
							setState(1490);
							match(AS);
						}
							break;
						}
						setState(1493);
						table_alias();
					}
						break;
					}
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}

		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class, i);
		}

		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class, i);
		}

		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}

		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class, i);
		}

		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}

		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_join_clause;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterJoin_clause(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitJoin_clause(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitJoin_clause(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1498);
				table_or_subquery();
				setState(1505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == COMMA
						|| _la == CROSS
						|| ((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (INNER - 87))
								| (1L << (JOIN - 87)) | (1L << (LEFT - 87)) | (1L << (NATURAL - 87)))) != 0)) {
					{
						{
							setState(1499);
							join_operator();
							setState(1500);
							table_or_subquery();
							setState(1501);
							join_constraint();
						}
					}
					setState(1507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode LEFT() {
			return getToken(SQLiteParser.LEFT, 0);
		}

		public TerminalNode INNER() {
			return getToken(SQLiteParser.INNER, 0);
		}

		public TerminalNode CROSS() {
			return getToken(SQLiteParser.CROSS, 0);
		}

		public TerminalNode OUTER() {
			return getToken(SQLiteParser.OUTER, 0);
		}

		public TerminalNode NATURAL() {
			return getToken(SQLiteParser.NATURAL, 0);
		}

		public TerminalNode JOIN() {
			return getToken(SQLiteParser.JOIN, 0);
		}

		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_join_operator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterJoin_operator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitJoin_operator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitJoin_operator(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator()
			throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx,
				getState());
		enterRule(_localctx, 104, RULE_join_operator);
		int _la;
		try {
			setState(1521);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
					setState(1508);
					match(COMMA);
				}
				break;
			case CROSS:
			case INNER:
			case JOIN:
			case LEFT:
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
					setState(1510);
					_la = _input.LA(1);
					if (_la == NATURAL) {
						{
							setState(1509);
							match(NATURAL);
						}
					}

					setState(1518);
					switch (_input.LA(1)) {
					case LEFT: {
						setState(1512);
						match(LEFT);
						setState(1514);
						_la = _input.LA(1);
						if (_la == OUTER) {
							{
								setState(1513);
								match(OUTER);
							}
						}

					}
						break;
					case INNER: {
						setState(1516);
						match(INNER);
					}
						break;
					case CROSS: {
						setState(1517);
						match(CROSS);
					}
						break;
					case JOIN:
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1520);
					match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public TerminalNode ON() {
			return getToken(SQLiteParser.ON, 0);
		}

		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public TerminalNode USING() {
			return getToken(SQLiteParser.USING, 0);
		}

		public Join_constraintContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_join_constraint;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterJoin_constraint(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitJoin_constraint(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitJoin_constraint(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint()
			throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx,
				getState());
		enterRule(_localctx, 106, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1537);
				switch (_input.LA(1)) {
				case ON: {
					setState(1523);
					match(ON);
					setState(1524);
					expr(0);
				}
					break;
				case USING: {
					setState(1525);
					match(USING);
					setState(1526);
					match(OPEN_PAR);
					setState(1527);
					column_name();
					setState(1532);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(1528);
								match(COMMA);
								setState(1529);
								column_name();
							}
						}
						setState(1534);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1535);
					match(CLOSE_PAR);
				}
					break;
				case EOF:
				case SCOL:
				case CLOSE_PAR:
				case COMMA:
				case ALTER:
				case ANALYZE:
				case ATTACH:
				case BEGIN:
				case COMMIT:
				case CREATE:
				case CROSS:
				case DELETE:
				case DETACH:
				case DROP:
				case END:
				case EXCEPT:
				case EXPLAIN:
				case GROUP:
				case INNER:
				case INSERT:
				case INTERSECT:
				case JOIN:
				case LEFT:
				case LIMIT:
				case NATURAL:
				case ORDER:
				case PRAGMA:
				case REINDEX:
				case RELEASE:
				case REPLACE:
				case ROLLBACK:
				case SAVEPOINT:
				case SELECT:
				case UNION:
				case UPDATE:
				case VACUUM:
				case VALUES:
				case WHERE:
				case WITH:
				case UNEXPECTED_CHAR:
					break;
				default:
					throw new NoViableAltException(this);
				}
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode VALUES() {
			return getToken(SQLiteParser.VALUES, 0);
		}

		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class, i);
		}

		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}

		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class, i);
		}

		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class, 0);
		}

		public TerminalNode FROM() {
			return getToken(SQLiteParser.FROM, 0);
		}

		public TerminalNode GROUP() {
			return getToken(SQLiteParser.GROUP, 0);
		}

		public TerminalNode ALL() {
			return getToken(SQLiteParser.ALL, 0);
		}

		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}

		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}

		public TerminalNode WHERE() {
			return getToken(SQLiteParser.WHERE, 0);
		}

		public TerminalNode SELECT() {
			return getToken(SQLiteParser.SELECT, 0);
		}

		public TerminalNode DISTINCT() {
			return getToken(SQLiteParser.DISTINCT, 0);
		}

		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class, i);
		}

		public TerminalNode HAVING() {
			return getToken(SQLiteParser.HAVING, 0);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_select_core;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSelect_core(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSelect_core(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSelect_core(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_select_core);
		int _la;
		try {
			setState(1613);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
					setState(1539);
					match(SELECT);
					setState(1541);
					switch (getInterpreter().adaptivePredict(_input, 224, _ctx)) {
					case 1: {
						setState(1540);
						_la = _input.LA(1);
						if (!(_la == ALL || _la == DISTINCT)) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
						break;
					}
					setState(1543);
					result_column();
					setState(1548);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(1544);
								match(COMMA);
								setState(1545);
								result_column();
							}
						}
						setState(1550);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1563);
					_la = _input.LA(1);
					if (_la == FROM) {
						{
							setState(1551);
							match(FROM);
							setState(1561);
							switch (getInterpreter().adaptivePredict(_input,
									227, _ctx)) {
							case 1: {
								setState(1552);
								table_or_subquery();
								setState(1557);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(1553);
											match(COMMA);
											setState(1554);
											table_or_subquery();
										}
									}
									setState(1559);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
							}
								break;
							case 2: {
								setState(1560);
								join_clause();
							}
								break;
							}
						}
					}

					setState(1567);
					_la = _input.LA(1);
					if (_la == WHERE) {
						{
							setState(1565);
							match(WHERE);
							setState(1566);
							expr(0);
						}
					}

					setState(1583);
					_la = _input.LA(1);
					if (_la == GROUP) {
						{
							setState(1569);
							match(GROUP);
							setState(1570);
							match(BY);
							setState(1571);
							expr(0);
							setState(1576);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la == COMMA) {
								{
									{
										setState(1572);
										match(COMMA);
										setState(1573);
										expr(0);
									}
								}
								setState(1578);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(1581);
							_la = _input.LA(1);
							if (_la == HAVING) {
								{
									setState(1579);
									match(HAVING);
									setState(1580);
									expr(0);
								}
							}

						}
					}

				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 2);
				{
					setState(1585);
					match(VALUES);
					setState(1586);
					match(OPEN_PAR);
					setState(1587);
					expr(0);
					setState(1592);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(1588);
								match(COMMA);
								setState(1589);
								expr(0);
							}
						}
						setState(1594);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1595);
					match(CLOSE_PAR);
					setState(1610);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == COMMA) {
						{
							{
								setState(1596);
								match(COMMA);
								setState(1597);
								match(OPEN_PAR);
								setState(1598);
								expr(0);
								setState(1603);
								_errHandler.sync(this);
								_la = _input.LA(1);
								while (_la == COMMA) {
									{
										{
											setState(1599);
											match(COMMA);
											setState(1600);
											expr(0);
										}
									}
									setState(1605);
									_errHandler.sync(this);
									_la = _input.LA(1);
								}
								setState(1606);
								match(CLOSE_PAR);
							}
						}
						setState(1612);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_operatorContext extends ParserRuleContext {
		public TerminalNode UNION() {
			return getToken(SQLiteParser.UNION, 0);
		}

		public TerminalNode INTERSECT() {
			return getToken(SQLiteParser.INTERSECT, 0);
		}

		public TerminalNode EXCEPT() {
			return getToken(SQLiteParser.EXCEPT, 0);
		}

		public TerminalNode ALL() {
			return getToken(SQLiteParser.ALL, 0);
		}

		public Compound_operatorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_compound_operator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCompound_operator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCompound_operator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCompound_operator(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Compound_operatorContext compound_operator()
			throws RecognitionException {
		Compound_operatorContext _localctx = new Compound_operatorContext(_ctx,
				getState());
		enterRule(_localctx, 110, RULE_compound_operator);
		try {
			setState(1620);
			switch (getInterpreter().adaptivePredict(_input, 237, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1615);
					match(UNION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1616);
					match(UNION);
					setState(1617);
					match(ALL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
					setState(1618);
					match(INTERSECT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
					setState(1619);
					match(EXCEPT);
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class, i);
		}

		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}

		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class, 0);
		}

		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_cte_table_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCte_table_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCte_table_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCte_table_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name()
			throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx,
				getState());
		enterRule(_localctx, 112, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1622);
				table_name();
				setState(1634);
				_la = _input.LA(1);
				if (_la == OPEN_PAR) {
					{
						setState(1623);
						match(OPEN_PAR);
						setState(1624);
						column_name();
						setState(1629);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == COMMA) {
							{
								{
									setState(1625);
									match(COMMA);
									setState(1626);
									column_name();
								}
							}
							setState(1631);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1632);
						match(CLOSE_PAR);
					}
				}

			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() {
			return getToken(SQLiteParser.NUMERIC_LITERAL, 0);
		}

		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_signed_number;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSigned_number(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSigned_number(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSigned_number(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number()
			throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx,
				getState());
		enterRule(_localctx, 114, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1637);
				_la = _input.LA(1);
				if (_la == PLUS || _la == MINUS) {
					{
						setState(1636);
						_la = _input.LA(1);
						if (!(_la == PLUS || _la == MINUS)) {
							_errHandler.recoverInline(this);
						}
						consume();
					}
				}

				setState(1639);
				match(NUMERIC_LITERAL);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NULL() {
			return getToken(SQLiteParser.NULL, 0);
		}

		public TerminalNode CURRENT_DATE() {
			return getToken(SQLiteParser.CURRENT_DATE, 0);
		}

		public TerminalNode CURRENT_TIMESTAMP() {
			return getToken(SQLiteParser.CURRENT_TIMESTAMP, 0);
		}

		public TerminalNode CURRENT_TIME() {
			return getToken(SQLiteParser.CURRENT_TIME, 0);
		}

		public TerminalNode NUMERIC_LITERAL() {
			return getToken(SQLiteParser.NUMERIC_LITERAL, 0);
		}

		public TerminalNode STRING_LITERAL() {
			return getToken(SQLiteParser.STRING_LITERAL, 0);
		}

		public TerminalNode BLOB_LITERAL() {
			return getToken(SQLiteParser.BLOB_LITERAL, 0);
		}

		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_literal_value;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterLiteral_value(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitLiteral_value(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitLiteral_value(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value()
			throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx,
				getState());
		enterRule(_localctx, 116, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1641);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURRENT_DATE)
						| (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (NULL - 104))
						| (1L << (NUMERIC_LITERAL - 104))
						| (1L << (STRING_LITERAL - 104)) | (1L << (BLOB_LITERAL - 104)))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_unary_operator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterUnary_operator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitUnary_operator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitUnary_operator(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator()
			throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx,
				getState());
		enterRule(_localctx, 118, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1643);
				_la = _input.LA(1);
				if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS)
						| (1L << MINUS) | (1L << TILDE))) != 0) || _la == NOT)) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Binary_operatorContext extends ParserRuleContext {
		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode IS() {
			return getToken(SQLiteParser.IS, 0);
		}

		public TerminalNode MATCH() {
			return getToken(SQLiteParser.MATCH, 0);
		}

		public TerminalNode AND() {
			return getToken(SQLiteParser.AND, 0);
		}

		public TerminalNode LIKE() {
			return getToken(SQLiteParser.LIKE, 0);
		}

		public TerminalNode GLOB() {
			return getToken(SQLiteParser.GLOB, 0);
		}

		public TerminalNode OR() {
			return getToken(SQLiteParser.OR, 0);
		}

		public TerminalNode IN() {
			return getToken(SQLiteParser.IN, 0);
		}

		public TerminalNode REGEXP() {
			return getToken(SQLiteParser.REGEXP, 0);
		}

		public Binary_operatorContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_binary_operator;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterBinary_operator(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitBinary_operator(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitBinary_operator(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator()
			throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx,
				getState());
		enterRule(_localctx, 120, RULE_binary_operator);
		int _la;
		try {
			setState(1666);
			switch (_input.LA(1)) {
			case PIPE2:
				enterOuterAlt(_localctx, 1);
				{
					setState(1645);
					match(PIPE2);
				}
				break;
			case STAR:
			case DIV:
			case MOD:
				enterOuterAlt(_localctx, 2);
				{
					setState(1646);
					_la = _input.LA(1);
					if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR)
							| (1L << DIV) | (1L << MOD))) != 0))) {
						_errHandler.recoverInline(this);
					}
					consume();
				}
				break;
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 3);
				{
					setState(1647);
					_la = _input.LA(1);
					if (!(_la == PLUS || _la == MINUS)) {
						_errHandler.recoverInline(this);
					}
					consume();
				}
				break;
			case LT2:
			case GT2:
			case AMP:
			case PIPE:
				enterOuterAlt(_localctx, 4);
				{
					setState(1648);
					_la = _input.LA(1);
					if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2)
							| (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0))) {
						_errHandler.recoverInline(this);
					}
					consume();
				}
				break;
			case LT:
			case LT_EQ:
			case GT:
			case GT_EQ:
				enterOuterAlt(_localctx, 5);
				{
					setState(1649);
					_la = _input.LA(1);
					if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT)
							| (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0))) {
						_errHandler.recoverInline(this);
					}
					consume();
				}
				break;
			case ASSIGN:
			case EQ:
			case NOT_EQ1:
			case NOT_EQ2:
			case GLOB:
			case IN:
			case IS:
			case LIKE:
			case MATCH:
			case REGEXP:
				enterOuterAlt(_localctx, 6);
				{
					setState(1662);
					switch (getInterpreter().adaptivePredict(_input, 241, _ctx)) {
					case 1: {
						setState(1650);
						match(ASSIGN);
					}
						break;
					case 2: {
						setState(1651);
						match(EQ);
					}
						break;
					case 3: {
						setState(1652);
						match(NOT_EQ1);
					}
						break;
					case 4: {
						setState(1653);
						match(NOT_EQ2);
					}
						break;
					case 5: {
						setState(1654);
						match(IS);
					}
						break;
					case 6: {
						setState(1655);
						match(IS);
						setState(1656);
						match(NOT);
					}
						break;
					case 7: {
						setState(1657);
						match(IN);
					}
						break;
					case 8: {
						setState(1658);
						match(LIKE);
					}
						break;
					case 9: {
						setState(1659);
						match(GLOB);
					}
						break;
					case 10: {
						setState(1660);
						match(MATCH);
					}
						break;
					case 11: {
						setState(1661);
						match(REGEXP);
					}
						break;
					}
				}
				break;
			case AND:
				enterOuterAlt(_localctx, 7);
				{
					setState(1664);
					match(AND);
				}
				break;
			case OR:
				enterOuterAlt(_localctx, 8);
				{
					setState(1665);
					match(OR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() {
			return getToken(SQLiteParser.STRING_LITERAL, 0);
		}

		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_error_message;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterError_message(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitError_message(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitError_message(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message()
			throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx,
				getState());
		enterRule(_localctx, 122, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1668);
				match(STRING_LITERAL);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class, 0);
		}

		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class, 0);
		}

		public Module_argumentContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_module_argument;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterModule_argument(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitModule_argument(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitModule_argument(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument()
			throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx,
				getState());
		enterRule(_localctx, 124, RULE_module_argument);
		try {
			setState(1672);
			switch (getInterpreter().adaptivePredict(_input, 243, _ctx)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
					setState(1670);
					expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
					setState(1671);
					column_def();
				}
				break;
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() {
			return getToken(SQLiteParser.STRING_LITERAL, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(SQLiteParser.IDENTIFIER, 0);
		}

		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_column_alias;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterColumn_alias(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitColumn_alias(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitColumn_alias(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx,
				getState());
		enterRule(_localctx, 126, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1674);
				_la = _input.LA(1);
				if (!(_la == IDENTIFIER || _la == STRING_LITERAL)) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode CASE() {
			return getToken(SQLiteParser.CASE, 0);
		}

		public TerminalNode ELSE() {
			return getToken(SQLiteParser.ELSE, 0);
		}

		public TerminalNode IF() {
			return getToken(SQLiteParser.IF, 0);
		}

		public TerminalNode INDEXED() {
			return getToken(SQLiteParser.INDEXED, 0);
		}

		public TerminalNode NATURAL() {
			return getToken(SQLiteParser.NATURAL, 0);
		}

		public TerminalNode INSTEAD() {
			return getToken(SQLiteParser.INSTEAD, 0);
		}

		public TerminalNode REPLACE() {
			return getToken(SQLiteParser.REPLACE, 0);
		}

		public TerminalNode OF() {
			return getToken(SQLiteParser.OF, 0);
		}

		public TerminalNode AFTER() {
			return getToken(SQLiteParser.AFTER, 0);
		}

		public TerminalNode CHECK() {
			return getToken(SQLiteParser.CHECK, 0);
		}

		public TerminalNode IGNORE() {
			return getToken(SQLiteParser.IGNORE, 0);
		}

		public TerminalNode BETWEEN() {
			return getToken(SQLiteParser.BETWEEN, 0);
		}

		public TerminalNode MATCH() {
			return getToken(SQLiteParser.MATCH, 0);
		}

		public TerminalNode LIMIT() {
			return getToken(SQLiteParser.LIMIT, 0);
		}

		public TerminalNode ACTION() {
			return getToken(SQLiteParser.ACTION, 0);
		}

		public TerminalNode FOR() {
			return getToken(SQLiteParser.FOR, 0);
		}

		public TerminalNode GLOB() {
			return getToken(SQLiteParser.GLOB, 0);
		}

		public TerminalNode GROUP() {
			return getToken(SQLiteParser.GROUP, 0);
		}

		public TerminalNode OR() {
			return getToken(SQLiteParser.OR, 0);
		}

		public TerminalNode IN() {
			return getToken(SQLiteParser.IN, 0);
		}

		public TerminalNode FAIL() {
			return getToken(SQLiteParser.FAIL, 0);
		}

		public TerminalNode INTO() {
			return getToken(SQLiteParser.INTO, 0);
		}

		public TerminalNode KEY() {
			return getToken(SQLiteParser.KEY, 0);
		}

		public TerminalNode CURRENT_DATE() {
			return getToken(SQLiteParser.CURRENT_DATE, 0);
		}

		public TerminalNode AUTOINCREMENT() {
			return getToken(SQLiteParser.AUTOINCREMENT, 0);
		}

		public TerminalNode ORDER() {
			return getToken(SQLiteParser.ORDER, 0);
		}

		public TerminalNode WHEN() {
			return getToken(SQLiteParser.WHEN, 0);
		}

		public TerminalNode RAISE() {
			return getToken(SQLiteParser.RAISE, 0);
		}

		public TerminalNode REFERENCES() {
			return getToken(SQLiteParser.REFERENCES, 0);
		}

		public TerminalNode DETACH() {
			return getToken(SQLiteParser.DETACH, 0);
		}

		public TerminalNode COLUMN() {
			return getToken(SQLiteParser.COLUMN, 0);
		}

		public TerminalNode EXCEPT() {
			return getToken(SQLiteParser.EXCEPT, 0);
		}

		public TerminalNode AS() {
			return getToken(SQLiteParser.AS, 0);
		}

		public TerminalNode COMMIT() {
			return getToken(SQLiteParser.COMMIT, 0);
		}

		public TerminalNode FULL() {
			return getToken(SQLiteParser.FULL, 0);
		}

		public TerminalNode RELEASE() {
			return getToken(SQLiteParser.RELEASE, 0);
		}

		public TerminalNode NOT() {
			return getToken(SQLiteParser.NOT, 0);
		}

		public TerminalNode OFFSET() {
			return getToken(SQLiteParser.OFFSET, 0);
		}

		public TerminalNode CROSS() {
			return getToken(SQLiteParser.CROSS, 0);
		}

		public TerminalNode INITIALLY() {
			return getToken(SQLiteParser.INITIALLY, 0);
		}

		public TerminalNode CONSTRAINT() {
			return getToken(SQLiteParser.CONSTRAINT, 0);
		}

		public TerminalNode PRAGMA() {
			return getToken(SQLiteParser.PRAGMA, 0);
		}

		public TerminalNode DEFAULT() {
			return getToken(SQLiteParser.DEFAULT, 0);
		}

		public TerminalNode INSERT() {
			return getToken(SQLiteParser.INSERT, 0);
		}

		public TerminalNode LEFT() {
			return getToken(SQLiteParser.LEFT, 0);
		}

		public TerminalNode BEFORE() {
			return getToken(SQLiteParser.BEFORE, 0);
		}

		public TerminalNode DROP() {
			return getToken(SQLiteParser.DROP, 0);
		}

		public TerminalNode ISNULL() {
			return getToken(SQLiteParser.ISNULL, 0);
		}

		public TerminalNode EXPLAIN() {
			return getToken(SQLiteParser.EXPLAIN, 0);
		}

		public TerminalNode ESCAPE() {
			return getToken(SQLiteParser.ESCAPE, 0);
		}

		public TerminalNode EXISTS() {
			return getToken(SQLiteParser.EXISTS, 0);
		}

		public TerminalNode RENAME() {
			return getToken(SQLiteParser.RENAME, 0);
		}

		public TerminalNode IMMEDIATE() {
			return getToken(SQLiteParser.IMMEDIATE, 0);
		}

		public TerminalNode INNER() {
			return getToken(SQLiteParser.INNER, 0);
		}

		public TerminalNode VACUUM() {
			return getToken(SQLiteParser.VACUUM, 0);
		}

		public TerminalNode DISTINCT() {
			return getToken(SQLiteParser.DISTINCT, 0);
		}

		public TerminalNode SELECT() {
			return getToken(SQLiteParser.SELECT, 0);
		}

		public TerminalNode SET() {
			return getToken(SQLiteParser.SET, 0);
		}

		public TerminalNode CASCADE() {
			return getToken(SQLiteParser.CASCADE, 0);
		}

		public TerminalNode NOTNULL() {
			return getToken(SQLiteParser.NOTNULL, 0);
		}

		public TerminalNode UNION() {
			return getToken(SQLiteParser.UNION, 0);
		}

		public TerminalNode ASC() {
			return getToken(SQLiteParser.ASC, 0);
		}

		public TerminalNode ROW() {
			return getToken(SQLiteParser.ROW, 0);
		}

		public TerminalNode REINDEX() {
			return getToken(SQLiteParser.REINDEX, 0);
		}

		public TerminalNode RIGHT() {
			return getToken(SQLiteParser.RIGHT, 0);
		}

		public TerminalNode ANALYZE() {
			return getToken(SQLiteParser.ANALYZE, 0);
		}

		public TerminalNode INDEX() {
			return getToken(SQLiteParser.INDEX, 0);
		}

		public TerminalNode NULL() {
			return getToken(SQLiteParser.NULL, 0);
		}

		public TerminalNode BEGIN() {
			return getToken(SQLiteParser.BEGIN, 0);
		}

		public TerminalNode FOREIGN() {
			return getToken(SQLiteParser.FOREIGN, 0);
		}

		public TerminalNode CAST() {
			return getToken(SQLiteParser.CAST, 0);
		}

		public TerminalNode JOIN() {
			return getToken(SQLiteParser.JOIN, 0);
		}

		public TerminalNode CONFLICT() {
			return getToken(SQLiteParser.CONFLICT, 0);
		}

		public TerminalNode DEFERRABLE() {
			return getToken(SQLiteParser.DEFERRABLE, 0);
		}

		public TerminalNode OUTER() {
			return getToken(SQLiteParser.OUTER, 0);
		}

		public TerminalNode THEN() {
			return getToken(SQLiteParser.THEN, 0);
		}

		public TerminalNode DATABASE() {
			return getToken(SQLiteParser.DATABASE, 0);
		}

		public TerminalNode PLAN() {
			return getToken(SQLiteParser.PLAN, 0);
		}

		public TerminalNode COLLATE() {
			return getToken(SQLiteParser.COLLATE, 0);
		}

		public TerminalNode USING() {
			return getToken(SQLiteParser.USING, 0);
		}

		public TerminalNode TABLE() {
			return getToken(SQLiteParser.TABLE, 0);
		}

		public TerminalNode TRIGGER() {
			return getToken(SQLiteParser.TRIGGER, 0);
		}

		public TerminalNode EXCLUSIVE() {
			return getToken(SQLiteParser.EXCLUSIVE, 0);
		}

		public TerminalNode NO() {
			return getToken(SQLiteParser.NO, 0);
		}

		public TerminalNode IS() {
			return getToken(SQLiteParser.IS, 0);
		}

		public TerminalNode CURRENT_TIME() {
			return getToken(SQLiteParser.CURRENT_TIME, 0);
		}

		public TerminalNode ALTER() {
			return getToken(SQLiteParser.ALTER, 0);
		}

		public TerminalNode REGEXP() {
			return getToken(SQLiteParser.REGEXP, 0);
		}

		public TerminalNode ROLLBACK() {
			return getToken(SQLiteParser.ROLLBACK, 0);
		}

		public TerminalNode PRIMARY() {
			return getToken(SQLiteParser.PRIMARY, 0);
		}

		public TerminalNode DELETE() {
			return getToken(SQLiteParser.DELETE, 0);
		}

		public TerminalNode ABORT() {
			return getToken(SQLiteParser.ABORT, 0);
		}

		public TerminalNode TRANSACTION() {
			return getToken(SQLiteParser.TRANSACTION, 0);
		}

		public TerminalNode VIEW() {
			return getToken(SQLiteParser.VIEW, 0);
		}

		public TerminalNode TO() {
			return getToken(SQLiteParser.TO, 0);
		}

		public TerminalNode ALL() {
			return getToken(SQLiteParser.ALL, 0);
		}

		public TerminalNode INTERSECT() {
			return getToken(SQLiteParser.INTERSECT, 0);
		}

		public TerminalNode ADD() {
			return getToken(SQLiteParser.ADD, 0);
		}

		public TerminalNode AND() {
			return getToken(SQLiteParser.AND, 0);
		}

		public TerminalNode RESTRICT() {
			return getToken(SQLiteParser.RESTRICT, 0);
		}

		public TerminalNode CREATE() {
			return getToken(SQLiteParser.CREATE, 0);
		}

		public TerminalNode HAVING() {
			return getToken(SQLiteParser.HAVING, 0);
		}

		public TerminalNode BY() {
			return getToken(SQLiteParser.BY, 0);
		}

		public TerminalNode DEFERRED() {
			return getToken(SQLiteParser.DEFERRED, 0);
		}

		public TerminalNode VIRTUAL() {
			return getToken(SQLiteParser.VIRTUAL, 0);
		}

		public TerminalNode ON() {
			return getToken(SQLiteParser.ON, 0);
		}

		public TerminalNode WITH() {
			return getToken(SQLiteParser.WITH, 0);
		}

		public TerminalNode CURRENT_TIMESTAMP() {
			return getToken(SQLiteParser.CURRENT_TIMESTAMP, 0);
		}

		public TerminalNode ATTACH() {
			return getToken(SQLiteParser.ATTACH, 0);
		}

		public TerminalNode VALUES() {
			return getToken(SQLiteParser.VALUES, 0);
		}

		public TerminalNode TEMPORARY() {
			return getToken(SQLiteParser.TEMPORARY, 0);
		}

		public TerminalNode FROM() {
			return getToken(SQLiteParser.FROM, 0);
		}

		public TerminalNode DESC() {
			return getToken(SQLiteParser.DESC, 0);
		}

		public TerminalNode EACH() {
			return getToken(SQLiteParser.EACH, 0);
		}

		public TerminalNode UNIQUE() {
			return getToken(SQLiteParser.UNIQUE, 0);
		}

		public TerminalNode UPDATE() {
			return getToken(SQLiteParser.UPDATE, 0);
		}

		public TerminalNode WITHOUT() {
			return getToken(SQLiteParser.WITHOUT, 0);
		}

		public TerminalNode SAVEPOINT() {
			return getToken(SQLiteParser.SAVEPOINT, 0);
		}

		public TerminalNode QUERY() {
			return getToken(SQLiteParser.QUERY, 0);
		}

		public TerminalNode END() {
			return getToken(SQLiteParser.END, 0);
		}

		public TerminalNode WHERE() {
			return getToken(SQLiteParser.WHERE, 0);
		}

		public TerminalNode RECURSIVE() {
			return getToken(SQLiteParser.RECURSIVE, 0);
		}

		public TerminalNode LIKE() {
			return getToken(SQLiteParser.LIKE, 0);
		}

		public TerminalNode TEMP() {
			return getToken(SQLiteParser.TEMP, 0);
		}

		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_keyword;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterKeyword(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitKeyword(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitKeyword(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1676);
				_la = _input.LA(1);
				if (!(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (ABORT - 25))
						| (1L << (ACTION - 25))
						| (1L << (ADD - 25))
						| (1L << (AFTER - 25))
						| (1L << (ALL - 25))
						| (1L << (ALTER - 25))
						| (1L << (ANALYZE - 25))
						| (1L << (AND - 25))
						| (1L << (AS - 25))
						| (1L << (ASC - 25))
						| (1L << (ATTACH - 25))
						| (1L << (AUTOINCREMENT - 25))
						| (1L << (BEFORE - 25))
						| (1L << (BEGIN - 25))
						| (1L << (BETWEEN - 25))
						| (1L << (BY - 25))
						| (1L << (CASCADE - 25))
						| (1L << (CASE - 25))
						| (1L << (CAST - 25))
						| (1L << (CHECK - 25))
						| (1L << (COLLATE - 25))
						| (1L << (COLUMN - 25))
						| (1L << (COMMIT - 25))
						| (1L << (CONFLICT - 25))
						| (1L << (CONSTRAINT - 25))
						| (1L << (CREATE - 25))
						| (1L << (CROSS - 25))
						| (1L << (CURRENT_DATE - 25))
						| (1L << (CURRENT_TIME - 25))
						| (1L << (CURRENT_TIMESTAMP - 25))
						| (1L << (DATABASE - 25))
						| (1L << (DEFAULT - 25))
						| (1L << (DEFERRABLE - 25))
						| (1L << (DEFERRED - 25))
						| (1L << (DELETE - 25))
						| (1L << (DESC - 25))
						| (1L << (DETACH - 25))
						| (1L << (DISTINCT - 25))
						| (1L << (DROP - 25))
						| (1L << (EACH - 25))
						| (1L << (ELSE - 25))
						| (1L << (END - 25))
						| (1L << (ESCAPE - 25))
						| (1L << (EXCEPT - 25))
						| (1L << (EXCLUSIVE - 25))
						| (1L << (EXISTS - 25))
						| (1L << (EXPLAIN - 25))
						| (1L << (FAIL - 25))
						| (1L << (FOR - 25))
						| (1L << (FOREIGN - 25))
						| (1L << (FROM - 25))
						| (1L << (FULL - 25))
						| (1L << (GLOB - 25))
						| (1L << (GROUP - 25))
						| (1L << (HAVING - 25))
						| (1L << (IF - 25))
						| (1L << (IGNORE - 25))
						| (1L << (IMMEDIATE - 25))
						| (1L << (IN - 25))
						| (1L << (INDEX - 25))
						| (1L << (INDEXED - 25))
						| (1L << (INITIALLY - 25))
						| (1L << (INNER - 25)) | (1L << (INSERT - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (INSTEAD - 89))
						| (1L << (INTERSECT - 89))
						| (1L << (INTO - 89))
						| (1L << (IS - 89))
						| (1L << (ISNULL - 89))
						| (1L << (JOIN - 89))
						| (1L << (KEY - 89))
						| (1L << (LEFT - 89))
						| (1L << (LIKE - 89))
						| (1L << (LIMIT - 89))
						| (1L << (MATCH - 89))
						| (1L << (NATURAL - 89))
						| (1L << (NO - 89))
						| (1L << (NOT - 89))
						| (1L << (NOTNULL - 89))
						| (1L << (NULL - 89))
						| (1L << (OF - 89))
						| (1L << (OFFSET - 89))
						| (1L << (ON - 89))
						| (1L << (OR - 89))
						| (1L << (ORDER - 89))
						| (1L << (OUTER - 89))
						| (1L << (PLAN - 89))
						| (1L << (PRAGMA - 89))
						| (1L << (PRIMARY - 89))
						| (1L << (QUERY - 89))
						| (1L << (RAISE - 89))
						| (1L << (RECURSIVE - 89))
						| (1L << (REFERENCES - 89))
						| (1L << (REGEXP - 89))
						| (1L << (REINDEX - 89))
						| (1L << (RELEASE - 89))
						| (1L << (RENAME - 89))
						| (1L << (REPLACE - 89))
						| (1L << (RESTRICT - 89))
						| (1L << (RIGHT - 89))
						| (1L << (ROLLBACK - 89))
						| (1L << (ROW - 89))
						| (1L << (SAVEPOINT - 89))
						| (1L << (SELECT - 89))
						| (1L << (SET - 89))
						| (1L << (TABLE - 89))
						| (1L << (TEMP - 89))
						| (1L << (TEMPORARY - 89))
						| (1L << (THEN - 89))
						| (1L << (TO - 89))
						| (1L << (TRANSACTION - 89))
						| (1L << (TRIGGER - 89))
						| (1L << (UNION - 89))
						| (1L << (UNIQUE - 89))
						| (1L << (UPDATE - 89))
						| (1L << (USING - 89))
						| (1L << (VACUUM - 89))
						| (1L << (VALUES - 89))
						| (1L << (VIEW - 89))
						| (1L << (VIRTUAL - 89))
						| (1L << (WHEN - 89))
						| (1L << (WHERE - 89)) | (1L << (WITH - 89)) | (1L << (WITHOUT - 89)))) != 0))) {
					_errHandler.recoverInline(this);
				}
				consume();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_function_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterFunction_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitFunction_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitFunction_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name()
			throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx,
				getState());
		enterRule(_localctx, 130, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1678);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_database_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterDatabase_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitDatabase_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitDatabase_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name()
			throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx,
				getState());
		enterRule(_localctx, 132, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1680);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_table_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterTable_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitTable_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitTable_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1682);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Table_or_index_nameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_table_or_index_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterTable_or_index_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitTable_or_index_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitTable_or_index_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name()
			throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(
				_ctx, getState());
		enterRule(_localctx, 136, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1684);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_new_table_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterNew_table_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitNew_table_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitNew_table_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name()
			throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx,
				getState());
		enterRule(_localctx, 138, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1686);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_column_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterColumn_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitColumn_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitColumn_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1688);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_collation_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterCollation_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitCollation_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitCollation_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name()
			throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx,
				getState());
		enterRule(_localctx, 142, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1690);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_foreign_table;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterForeign_table(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitForeign_table(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitForeign_table(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table()
			throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx,
				getState());
		enterRule(_localctx, 144, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1692);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_index_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterIndex_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitIndex_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitIndex_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1694);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_trigger_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterTrigger_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitTrigger_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitTrigger_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx,
				getState());
		enterRule(_localctx, 148, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1696);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_view_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterView_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitView_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitView_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1698);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_module_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterModule_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitModule_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitModule_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1700);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_pragma_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterPragma_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitPragma_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitPragma_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1702);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_savepoint_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterSavepoint_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitSavepoint_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitSavepoint_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name()
			throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx,
				getState());
		enterRule(_localctx, 156, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1704);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_table_alias;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterTable_alias(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitTable_alias(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitTable_alias(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1706);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public Transaction_nameContext(ParserRuleContext parent,
				int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_transaction_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterTransaction_name(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitTransaction_name(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor)
						.visitTransaction_name(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name()
			throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx,
				getState());
		enterRule(_localctx, 160, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(1708);
				name();
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class, 0);
		}

		public TerminalNode STRING_LITERAL() {
			return getToken(SQLiteParser.STRING_LITERAL, 0);
		}

		public NameContext name() {
			return getRuleContext(NameContext.class, 0);
		}

		public TerminalNode IDENTIFIER() {
			return getToken(SQLiteParser.IDENTIFIER, 0);
		}

		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_name;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).enterName(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SQLiteListener)
				((SQLiteListener) listener).exitName(this);
		}

		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if (visitor instanceof SQLiteVisitor)
				return ((SQLiteVisitor<? extends T>) visitor).visitName(this);
			else
				return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_name);
		try {
			setState(1717);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
					setState(1710);
					match(IDENTIFIER);
				}
				break;
			case ABORT:
			case ACTION:
			case ADD:
			case AFTER:
			case ALL:
			case ALTER:
			case ANALYZE:
			case AND:
			case AS:
			case ASC:
			case ATTACH:
			case AUTOINCREMENT:
			case BEFORE:
			case BEGIN:
			case BETWEEN:
			case BY:
			case CASCADE:
			case CASE:
			case CAST:
			case CHECK:
			case COLLATE:
			case COLUMN:
			case COMMIT:
			case CONFLICT:
			case CONSTRAINT:
			case CREATE:
			case CROSS:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case DATABASE:
			case DEFAULT:
			case DEFERRABLE:
			case DEFERRED:
			case DELETE:
			case DESC:
			case DETACH:
			case DISTINCT:
			case DROP:
			case EACH:
			case ELSE:
			case END:
			case ESCAPE:
			case EXCEPT:
			case EXCLUSIVE:
			case EXISTS:
			case EXPLAIN:
			case FAIL:
			case FOR:
			case FOREIGN:
			case FROM:
			case FULL:
			case GLOB:
			case GROUP:
			case HAVING:
			case IF:
			case IGNORE:
			case IMMEDIATE:
			case IN:
			case INDEX:
			case INDEXED:
			case INITIALLY:
			case INNER:
			case INSERT:
			case INSTEAD:
			case INTERSECT:
			case INTO:
			case IS:
			case ISNULL:
			case JOIN:
			case KEY:
			case LEFT:
			case LIKE:
			case LIMIT:
			case MATCH:
			case NATURAL:
			case NO:
			case NOT:
			case NOTNULL:
			case NULL:
			case OF:
			case OFFSET:
			case ON:
			case OR:
			case ORDER:
			case OUTER:
			case PLAN:
			case PRAGMA:
			case PRIMARY:
			case QUERY:
			case RAISE:
			case RECURSIVE:
			case REFERENCES:
			case REGEXP:
			case REINDEX:
			case RELEASE:
			case RENAME:
			case REPLACE:
			case RESTRICT:
			case RIGHT:
			case ROLLBACK:
			case ROW:
			case SAVEPOINT:
			case SELECT:
			case SET:
			case TABLE:
			case TEMP:
			case TEMPORARY:
			case THEN:
			case TO:
			case TRANSACTION:
			case TRIGGER:
			case UNION:
			case UNIQUE:
			case UPDATE:
			case USING:
			case VACUUM:
			case VALUES:
			case VIEW:
			case VIRTUAL:
			case WHEN:
			case WHERE:
			case WITH:
			case WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
					setState(1711);
					keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
					setState(1712);
					match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
					setState(1713);
					match(OPEN_PAR);
					setState(1714);
					name();
					setState(1715);
					match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 39:
			return expr_sempred((ExprContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN = "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009f\u06ba\4\2\t"
			+ "\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"
			+ "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
			+ "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"
			+ "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
			+ "\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"
			+ ",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"
			+ "\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="
			+ "\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"
			+ "\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"
			+ "\2\7\2\u00a9\n\2\f\2\16\2\u00ac\13\2\3\2\3\2\3\3\3\3\3\3\3\4\7\4\u00b4"
			+ "\n\4\f\4\16\4\u00b7\13\4\3\4\3\4\6\4\u00bb\n\4\r\4\16\4\u00bc\3\4\7\4"
			+ "\u00c0\n\4\f\4\16\4\u00c3\13\4\3\4\7\4\u00c6\n\4\f\4\16\4\u00c9\13\4\3"
			+ "\5\3\5\3\5\5\5\u00ce\n\5\5\5\u00d0\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"
			+ "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"
			+ "\5\3\5\3\5\3\5\3\5\5\5\u00f0\n\5\3\6\3\6\3\6\3\6\3\6\5\6\u00f7\n\6\3\6"
			+ "\3\6\3\6\3\6\3\6\3\6\5\6\u00ff\n\6\3\6\5\6\u0102\n\6\3\7\3\7\3\7\3\7\3"
			+ "\7\3\7\3\7\5\7\u010b\n\7\3\b\3\b\5\b\u010f\n\b\3\b\3\b\3\b\3\b\3\t\3\t"
			+ "\5\t\u0117\n\t\3\t\3\t\5\t\u011b\n\t\5\t\u011d\n\t\3\n\3\n\3\n\5\n\u0122"
			+ "\n\n\5\n\u0124\n\n\3\13\3\13\5\13\u0128\n\13\3\13\3\13\3\13\7\13\u012d"
			+ "\n\13\f\13\16\13\u0130\13\13\5\13\u0132\n\13\3\13\3\13\3\13\5\13\u0137"
			+ "\n\13\3\13\3\13\5\13\u013b\n\13\3\13\6\13\u013e\n\13\r\13\16\13\u013f"
			+ "\3\13\3\13\3\13\3\13\3\13\7\13\u0147\n\13\f\13\16\13\u014a\13\13\5\13"
			+ "\u014c\n\13\3\13\3\13\3\13\3\13\5\13\u0152\n\13\5\13\u0154\n\13\3\f\3"
			+ "\f\5\f\u0158\n\f\3\f\3\f\3\f\3\f\5\f\u015e\n\f\3\f\3\f\3\f\5\f\u0163\n"
			+ "\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u016c\n\f\f\f\16\f\u016f\13\f\3\f\3"
			+ "\f\3\f\5\f\u0174\n\f\3\r\3\r\5\r\u0178\n\r\3\r\3\r\3\r\3\r\5\r\u017e\n"
			+ "\r\3\r\3\r\3\r\5\r\u0183\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u018a\n\r\f\r\16"
			+ "\r\u018d\13\r\3\r\3\r\7\r\u0191\n\r\f\r\16\r\u0194\13\r\3\r\3\r\3\r\5"
			+ "\r\u0199\n\r\3\r\3\r\5\r\u019d\n\r\3\16\3\16\5\16\u01a1\n\16\3\16\3\16"
			+ "\3\16\3\16\5\16\u01a7\n\16\3\16\3\16\3\16\5\16\u01ac\n\16\3\16\3\16\3"
			+ "\16\3\16\3\16\5\16\u01b3\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"
			+ "\u01bc\n\16\f\16\16\16\u01bf\13\16\5\16\u01c1\n\16\5\16\u01c3\n\16\3\16"
			+ "\3\16\3\16\3\16\5\16\u01c9\n\16\3\16\3\16\3\16\3\16\5\16\u01cf\n\16\3"
			+ "\16\3\16\5\16\u01d3\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u01da\n\16\3\16"
			+ "\3\16\6\16\u01de\n\16\r\16\16\16\u01df\3\16\3\16\3\17\3\17\5\17\u01e6"
			+ "\n\17\3\17\3\17\3\17\3\17\5\17\u01ec\n\17\3\17\3\17\3\17\5\17\u01f1\n"
			+ "\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01fd\n\20"
			+ "\3\20\3\20\3\20\5\20\u0202\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"
			+ "\u020b\n\20\f\20\16\20\u020e\13\20\3\20\3\20\5\20\u0212\n\20\3\21\5\21"
			+ "\u0215\n\21\3\21\3\21\3\21\3\21\3\21\5\21\u021c\n\21\3\22\5\22\u021f\n"
			+ "\22\3\22\3\22\3\22\3\22\3\22\5\22\u0226\n\22\3\22\3\22\3\22\3\22\3\22"
			+ "\7\22\u022d\n\22\f\22\16\22\u0230\13\22\5\22\u0232\n\22\3\22\3\22\3\22"
			+ "\3\22\5\22\u0238\n\22\5\22\u023a\n\22\3\23\3\23\5\23\u023e\n\23\3\23\3"
			+ "\23\3\24\3\24\3\24\3\24\5\24\u0246\n\24\3\24\3\24\3\24\5\24\u024b\n\24"
			+ "\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u0253\n\25\3\25\3\25\3\25\5\25\u0258"
			+ "\n\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u0260\n\26\3\26\3\26\3\26\5\26"
			+ "\u0265\n\26\3\26\3\26\3\27\3\27\3\27\3\27\5\27\u026d\n\27\3\27\3\27\3"
			+ "\27\5\27\u0272\n\27\3\27\3\27\3\30\3\30\5\30\u0278\n\30\3\30\3\30\3\30"
			+ "\7\30\u027d\n\30\f\30\16\30\u0280\13\30\5\30\u0282\n\30\3\30\3\30\3\30"
			+ "\3\30\7\30\u0288\n\30\f\30\16\30\u028b\13\30\3\30\3\30\3\30\3\30\3\30"
			+ "\7\30\u0292\n\30\f\30\16\30\u0295\13\30\5\30\u0297\n\30\3\30\3\30\3\30"
			+ "\3\30\5\30\u029d\n\30\5\30\u029f\n\30\3\31\5\31\u02a2\n\31\3\31\3\31\3"
			+ "\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"
			+ "\31\5\31\u02b5\n\31\3\31\3\31\3\31\3\31\5\31\u02bb\n\31\3\31\3\31\3\31"
			+ "\3\31\3\31\7\31\u02c2\n\31\f\31\16\31\u02c5\13\31\3\31\3\31\5\31\u02c9"
			+ "\n\31\3\31\3\31\3\31\3\31\3\31\7\31\u02d0\n\31\f\31\16\31\u02d3\13\31"
			+ "\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u02db\n\31\f\31\16\31\u02de\13\31"
			+ "\3\31\3\31\7\31\u02e2\n\31\f\31\16\31\u02e5\13\31\3\31\3\31\3\31\5\31"
			+ "\u02ea\n\31\3\32\3\32\3\32\3\32\5\32\u02f0\n\32\3\32\3\32\3\32\3\32\3"
			+ "\32\3\32\3\32\5\32\u02f9\n\32\3\33\3\33\3\33\3\33\3\33\5\33\u0300\n\33"
			+ "\3\33\3\33\5\33\u0304\n\33\5\33\u0306\n\33\3\34\3\34\5\34\u030a\n\34\3"
			+ "\34\3\34\3\35\3\35\3\35\5\35\u0311\n\35\5\35\u0313\n\35\3\35\3\35\5\35"
			+ "\u0317\n\35\3\35\5\35\u031a\n\35\3\36\3\36\3\36\3\37\3\37\5\37\u0321\n"
			+ "\37\3\37\3\37\3\37\7\37\u0326\n\37\f\37\16\37\u0329\13\37\5\37\u032b\n"
			+ "\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u0333\n\37\f\37\16\37\u0336\13"
			+ "\37\5\37\u0338\n\37\3\37\3\37\3\37\3\37\5\37\u033e\n\37\5\37\u0340\n\37"
			+ "\3 \3 \5 \u0344\n \3 \3 \3 \7 \u0349\n \f \16 \u034c\13 \5 \u034e\n \3"
			+ " \3 \3 \3 \7 \u0354\n \f \16 \u0357\13 \3 \3 \3 \3 \3 \7 \u035e\n \f "
			+ "\16 \u0361\13 \5 \u0363\n \3 \3 \3 \3 \5 \u0369\n \5 \u036b\n \3!\3!\5"
			+ "!\u036f\n!\3!\3!\3!\7!\u0374\n!\f!\16!\u0377\13!\3!\3!\3!\3!\7!\u037d"
			+ "\n!\f!\16!\u0380\13!\3!\5!\u0383\n!\5!\u0385\n!\3!\3!\5!\u0389\n!\3!\3"
			+ "!\3!\3!\3!\7!\u0390\n!\f!\16!\u0393\13!\3!\3!\5!\u0397\n!\5!\u0399\n!"
			+ "\3!\3!\3!\3!\3!\7!\u03a0\n!\f!\16!\u03a3\13!\3!\3!\3!\3!\3!\3!\7!\u03ab"
			+ "\n!\f!\16!\u03ae\13!\3!\3!\7!\u03b2\n!\f!\16!\u03b5\13!\5!\u03b7\n!\3"
			+ "\"\5\"\u03ba\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u03c7"
			+ "\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u03d3\n\"\f\"\16\"\u03d6"
			+ "\13\"\3\"\3\"\5\"\u03da\n\"\3#\5#\u03dd\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#"
			+ "\3#\3#\5#\u03ea\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u03f6\n#\f#\16#\u03f9"
			+ "\13#\3#\3#\5#\u03fd\n#\3#\3#\3#\3#\3#\7#\u0404\n#\f#\16#\u0407\13#\5#"
			+ "\u0409\n#\3#\3#\3#\3#\5#\u040f\n#\5#\u0411\n#\3$\3$\3%\3%\5%\u0417\n%"
			+ "\3%\7%\u041a\n%\f%\16%\u041d\13%\3&\6&\u0420\n&\r&\16&\u0421\3&\3&\3&"
			+ "\3&\3&\3&\3&\3&\3&\3&\5&\u042e\n&\3\'\3\'\5\'\u0432\n\'\3\'\3\'\3\'\5"
			+ "\'\u0437\n\'\3\'\3\'\5\'\u043b\n\'\3\'\5\'\u043e\n\'\3\'\3\'\3\'\3\'\3"
			+ "\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0450\n\'\3\'\3\'\3"
			+ "\'\5\'\u0455\n\'\3(\3(\3(\5(\u045a\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0465"
			+ "\n)\3)\3)\3)\5)\u046a\n)\3)\3)\3)\3)\5)\u0470\n)\3)\3)\3)\7)\u0475\n)"
			+ "\f)\16)\u0478\13)\3)\5)\u047b\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"
			+ ")\3)\5)\u048b\n)\3)\5)\u048e\n)\3)\3)\3)\3)\3)\3)\5)\u0496\n)\3)\3)\3"
			+ ")\3)\3)\6)\u049d\n)\r)\16)\u049e\3)\3)\5)\u04a3\n)\3)\3)\3)\5)\u04a8\n"
			+ ")\3)\3)\3)\3)\3)\3)\3)\5)\u04b1\n)\3)\3)\3)\5)\u04b6\n)\3)\3)\3)\3)\3"
			+ ")\3)\3)\3)\3)\3)\5)\u04c2\n)\3)\3)\3)\3)\5)\u04c8\n)\3)\3)\3)\3)\3)\5"
			+ ")\u04cf\n)\3)\3)\5)\u04d3\n)\3)\3)\3)\3)\3)\3)\7)\u04db\n)\f)\16)\u04de"
			+ "\13)\5)\u04e0\n)\3)\3)\3)\3)\5)\u04e6\n)\3)\5)\u04e9\n)\7)\u04eb\n)\f"
			+ ")\16)\u04ee\13)\3*\3*\3*\3*\3*\3*\7*\u04f6\n*\f*\16*\u04f9\13*\3*\3*\5"
			+ "*\u04fd\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0509\n*\3*\3*\5*\u050d\n"
			+ "*\7*\u050f\n*\f*\16*\u0512\13*\3*\5*\u0515\n*\3*\3*\3*\3*\3*\5*\u051c"
			+ "\n*\5*\u051e\n*\3+\3+\3+\3+\3+\3+\5+\u0526\n+\3+\3+\3,\3,\3,\5,\u052d"
			+ "\n,\3,\5,\u0530\n,\3-\3-\5-\u0534\n-\3-\3-\3-\5-\u0539\n-\3-\3-\3-\3-"
			+ "\7-\u053f\n-\f-\16-\u0542\13-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"
			+ "-\7-\u0552\n-\f-\16-\u0555\13-\3-\3-\3-\5-\u055a\n-\3.\3.\5.\u055e\n."
			+ "\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u056c\n.\f.\16.\u056f\13.\3/\3"
			+ "/\3/\5/\u0574\n/\3/\3/\3/\3/\3/\3/\5/\u057c\n/\3\60\3\60\3\60\5\60\u0581"
			+ "\n\60\3\60\5\60\u0584\n\60\3\61\3\61\3\61\5\61\u0589\n\61\3\62\3\62\3"
			+ "\62\3\62\3\62\7\62\u0590\n\62\f\62\16\62\u0593\13\62\3\62\3\62\5\62\u0597"
			+ "\n\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"
			+ "\u05a5\n\63\3\63\5\63\u05a8\n\63\5\63\u05aa\n\63\3\64\3\64\3\64\5\64\u05af"
			+ "\n\64\3\64\3\64\5\64\u05b3\n\64\3\64\5\64\u05b6\n\64\3\64\3\64\3\64\3"
			+ "\64\3\64\5\64\u05bd\n\64\3\64\3\64\3\64\3\64\7\64\u05c3\n\64\f\64\16\64"
			+ "\u05c6\13\64\3\64\5\64\u05c9\n\64\3\64\3\64\5\64\u05cd\n\64\3\64\5\64"
			+ "\u05d0\n\64\3\64\3\64\3\64\3\64\5\64\u05d6\n\64\3\64\5\64\u05d9\n\64\5"
			+ "\64\u05db\n\64\3\65\3\65\3\65\3\65\3\65\7\65\u05e2\n\65\f\65\16\65\u05e5"
			+ "\13\65\3\66\3\66\5\66\u05e9\n\66\3\66\3\66\5\66\u05ed\n\66\3\66\3\66\5"
			+ "\66\u05f1\n\66\3\66\5\66\u05f4\n\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"
			+ "\7\67\u05fd\n\67\f\67\16\67\u0600\13\67\3\67\3\67\5\67\u0604\n\67\38\3"
			+ "8\58\u0608\n8\38\38\38\78\u060d\n8\f8\168\u0610\138\38\38\38\38\78\u0616"
			+ "\n8\f8\168\u0619\138\38\58\u061c\n8\58\u061e\n8\38\38\58\u0622\n8\38\3"
			+ "8\38\38\38\78\u0629\n8\f8\168\u062c\138\38\38\58\u0630\n8\58\u0632\n8"
			+ "\38\38\38\38\38\78\u0639\n8\f8\168\u063c\138\38\38\38\38\38\38\78\u0644"
			+ "\n8\f8\168\u0647\138\38\38\78\u064b\n8\f8\168\u064e\138\58\u0650\n8\3"
			+ "9\39\39\39\39\59\u0657\n9\3:\3:\3:\3:\3:\7:\u065e\n:\f:\16:\u0661\13:"
			+ "\3:\3:\5:\u0665\n:\3;\5;\u0668\n;\3;\3;\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>"
			+ "\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u0681\n>\3>\3>\5>\u0685\n>\3?\3?"
			+ "\3@\3@\5@\u068b\n@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I"
			+ "\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3S\3S"
			+ "\3S\3S\3S\5S\u06b8\nS\3S\2\3PT\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"
			+ " \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"
			+ "\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"
			+ "\u009c\u009e\u00a0\u00a2\u00a4\2\24\5\2<<GGTT\4\2\61\61DD\4\2\7\7ll\3"
			+ "\2\u0085\u0086\4\2\37\37@@\4\2$$>>\7\2\33\33JJSS||\177\177\6\2OOcceex"
			+ "x\4\2==\u008d\u008d\5\2\33\33JJ\177\177\3\2\n\13\6\2\668jj\u0098\u0098"
			+ "\u009a\u009b\4\2\n\fhh\4\2\t\t\16\17\3\2\20\23\3\2\24\27\4\2\u0097\u0097"
			+ "\u009a\u009a\3\2\33\u0096\u07c7\2\u00aa\3\2\2\2\4\u00af\3\2\2\2\6\u00b5"
			+ "\3\2\2\2\b\u00cf\3\2\2\2\n\u00f1\3\2\2\2\f\u0103\3\2\2\2\16\u010c\3\2"
			+ "\2\2\20\u0114\3\2\2\2\22\u011e\3\2\2\2\24\u0131\3\2\2\2\26\u0155\3\2\2"
			+ "\2\30\u0175\3\2\2\2\32\u019e\3\2\2\2\34\u01e3\3\2\2\2\36\u01f6\3\2\2\2"
			+ " \u0214\3\2\2\2\"\u021e\3\2\2\2$\u023b\3\2\2\2&\u0241\3\2\2\2(\u024e\3"
			+ "\2\2\2*\u025b\3\2\2\2,\u0268\3\2\2\2.\u0281\3\2\2\2\60\u02a1\3\2\2\2\62"
			+ "\u02eb\3\2\2\2\64\u02fa\3\2\2\2\66\u0307\3\2\2\28\u030d\3\2\2\2:\u031b"
			+ "\3\2\2\2<\u032a\3\2\2\2>\u034d\3\2\2\2@\u03b6\3\2\2\2B\u03b9\3\2\2\2D"
			+ "\u03dc\3\2\2\2F\u0412\3\2\2\2H\u0414\3\2\2\2J\u041f\3\2\2\2L\u0431\3\2"
			+ "\2\2N\u0459\3\2\2\2P\u04a7\3\2\2\2R\u04ef\3\2\2\2T\u051f\3\2\2\2V\u0529"
			+ "\3\2\2\2X\u0533\3\2\2\2Z\u055b\3\2\2\2\\\u0573\3\2\2\2^\u057d\3\2\2\2"
			+ "`\u0588\3\2\2\2b\u058a\3\2\2\2d\u05a9\3\2\2\2f\u05da\3\2\2\2h\u05dc\3"
			+ "\2\2\2j\u05f3\3\2\2\2l\u0603\3\2\2\2n\u064f\3\2\2\2p\u0656\3\2\2\2r\u0658"
			+ "\3\2\2\2t\u0667\3\2\2\2v\u066b\3\2\2\2x\u066d\3\2\2\2z\u0684\3\2\2\2|"
			+ "\u0686\3\2\2\2~\u068a\3\2\2\2\u0080\u068c\3\2\2\2\u0082\u068e\3\2\2\2"
			+ "\u0084\u0690\3\2\2\2\u0086\u0692\3\2\2\2\u0088\u0694\3\2\2\2\u008a\u0696"
			+ "\3\2\2\2\u008c\u0698\3\2\2\2\u008e\u069a\3\2\2\2\u0090\u069c\3\2\2\2\u0092"
			+ "\u069e\3\2\2\2\u0094\u06a0\3\2\2\2\u0096\u06a2\3\2\2\2\u0098\u06a4\3\2"
			+ "\2\2\u009a\u06a6\3\2\2\2\u009c\u06a8\3\2\2\2\u009e\u06aa\3\2\2\2\u00a0"
			+ "\u06ac\3\2\2\2\u00a2\u06ae\3\2\2\2\u00a4\u06b7\3\2\2\2\u00a6\u00a9\5\6"
			+ "\4\2\u00a7\u00a9\5\4\3\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9"
			+ "\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"
			+ "\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\7\2\2\3\u00ae\3\3\2\2\2\u00af\u00b0"
			+ "\7\u009f\2\2\u00b0\u00b1\b\3\1\2\u00b1\5\3\2\2\2\u00b2\u00b4\7\3\2\2\u00b3"
			+ "\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2"
			+ "\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00c1\5\b\5\2\u00b9"
			+ "\u00bb\7\3\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2"
			+ "\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\5\b\5\2\u00bf"
			+ "\u00ba\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"
			+ "\2\2\u00c2\u00c7\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\7\3\2\2\u00c5"
			+ "\u00c4\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"
			+ "\2\2\u00c8\7\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\7I\2\2\u00cb\u00cc"
			+ "\7t\2\2\u00cc\u00ce\7q\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce"
			+ "\u00d0\3\2\2\2\u00cf\u00ca\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ef\3\2"
			+ "\2\2\u00d1\u00f0\5\n\6\2\u00d2\u00f0\5\f\7\2\u00d3\u00f0\5\16\b\2\u00d4"
			+ "\u00f0\5\20\t\2\u00d5\u00f0\5\22\n\2\u00d6\u00f0\5\24\13\2\u00d7\u00f0"
			+ "\5\26\f\2\u00d8\u00f0\5\30\r\2\u00d9\u00f0\5\32\16\2\u00da\u00f0\5\34"
			+ "\17\2\u00db\u00f0\5\36\20\2\u00dc\u00f0\5 \21\2\u00dd\u00f0\5\"\22\2\u00de"
			+ "\u00f0\5$\23\2\u00df\u00f0\5&\24\2\u00e0\u00f0\5(\25\2\u00e1\u00f0\5*"
			+ "\26\2\u00e2\u00f0\5,\27\2\u00e3\u00f0\5.\30\2\u00e4\u00f0\5\60\31\2\u00e5"
			+ "\u00f0\5\62\32\2\u00e6\u00f0\5\64\33\2\u00e7\u00f0\5\66\34\2\u00e8\u00f0"
			+ "\58\35\2\u00e9\u00f0\5:\36\2\u00ea\u00f0\5<\37\2\u00eb\u00f0\5> \2\u00ec"
			+ "\u00f0\5B\"\2\u00ed\u00f0\5D#\2\u00ee\u00f0\5F$\2\u00ef\u00d1\3\2\2\2"
			+ "\u00ef\u00d2\3\2\2\2\u00ef\u00d3\3\2\2\2\u00ef\u00d4\3\2\2\2\u00ef\u00d5"
			+ "\3\2\2\2\u00ef\u00d6\3\2\2\2\u00ef\u00d7\3\2\2\2\u00ef\u00d8\3\2\2\2\u00ef"
			+ "\u00d9\3\2\2\2\u00ef\u00da\3\2\2\2\u00ef\u00db\3\2\2\2\u00ef\u00dc\3\2"
			+ "\2\2\u00ef\u00dd\3\2\2\2\u00ef\u00de\3\2\2\2\u00ef\u00df\3\2\2\2\u00ef"
			+ "\u00e0\3\2\2\2\u00ef\u00e1\3\2\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e3\3\2"
			+ "\2\2\u00ef\u00e4\3\2\2\2\u00ef\u00e5\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef"
			+ "\u00e7\3\2\2\2\u00ef\u00e8\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef\u00ea\3\2"
			+ "\2\2\u00ef\u00eb\3\2\2\2\u00ef\u00ec\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef"
			+ "\u00ee\3\2\2\2\u00f0\t\3\2\2\2\u00f1\u00f2\7 \2\2\u00f2\u00f6\7\u0084"
			+ "\2\2\u00f3\u00f4\5\u0086D\2\u00f4\u00f5\7\4\2\2\u00f5\u00f7\3\2\2\2\u00f6"
			+ "\u00f3\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0101\5\u0088"
			+ "E\2\u00f9\u00fa\7{\2\2\u00fa\u00fb\7\u0088\2\2\u00fb\u0102\5\u008cG\2"
			+ "\u00fc\u00fe\7\35\2\2\u00fd\u00ff\7\60\2\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff"
			+ "\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\5H%\2\u0101\u00f9\3\2\2\2\u0101"
			+ "\u00fc\3\2\2\2\u0102\13\3\2\2\2\u0103\u010a\7!\2\2\u0104\u010b\5\u0086"
			+ "D\2\u0105\u010b\5\u008aF\2\u0106\u0107\5\u0086D\2\u0107\u0108\7\4\2\2"
			+ "\u0108\u0109\5\u008aF\2\u0109\u010b\3\2\2\2\u010a\u0104\3\2\2\2\u010a"
			+ "\u0105\3\2\2\2\u010a\u0106\3\2\2\2\u010a\u010b\3\2\2\2\u010b\r\3\2\2\2"
			+ "\u010c\u010e\7%\2\2\u010d\u010f\79\2\2\u010e\u010d\3\2\2\2\u010e\u010f"
			+ "\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5P)\2\u0111\u0112\7#\2\2\u0112"
			+ "\u0113\5\u0086D\2\u0113\17\3\2\2\2\u0114\u0116\7(\2\2\u0115\u0117\t\2"
			+ "\2\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u011c\3\2\2\2\u0118"
			+ "\u011a\7\u0089\2\2\u0119\u011b\5\u00a2R\2\u011a\u0119\3\2\2\2\u011a\u011b"
			+ "\3\2\2\2\u011b\u011d\3\2\2\2\u011c\u0118\3\2\2\2\u011c\u011d\3\2\2\2\u011d"
			+ "\21\3\2\2\2\u011e\u0123\t\3\2\2\u011f\u0121\7\u0089\2\2\u0120\u0122\5"
			+ "\u00a2R\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2"
			+ "\u0123\u011f\3\2\2\2\u0123\u0124\3\2\2\2\u0124\23\3\2\2\2\u0125\u0127"
			+ "\7\u0095\2\2\u0126\u0128\7v\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2"
			+ "\2\u0128\u0129\3\2\2\2\u0129\u012e\5b\62\2\u012a\u012b\7\7\2\2\u012b\u012d"
			+ "\5b\62\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"
			+ "\u012f\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0125\3\2"
			+ "\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u013d\5n8\2\u0134\u0136"
			+ "\7\u008b\2\2\u0135\u0137\7\37\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2"
			+ "\2\2\u0137\u013b\3\2\2\2\u0138\u013b\7\\\2\2\u0139\u013b\7F\2\2\u013a"
			+ "\u0134\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013c\3\2"
			+ "\2\2\u013c\u013e\5n8\2\u013d\u013a\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d"
			+ "\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u014b\3\2\2\2\u0141\u0142\7o\2\2\u0142"
			+ "\u0143\7*\2\2\u0143\u0148\5^\60\2\u0144\u0145\7\7\2\2\u0145\u0147\5^\60"
			+ "\2\u0146\u0144\3\2\2\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149"
			+ "\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u0141\3\2\2\2\u014b"
			+ "\u014c\3\2\2\2\u014c\u0153\3\2\2\2\u014d\u014e\7d\2\2\u014e\u0151\5P)"
			+ "\2\u014f\u0150\t\4\2\2\u0150\u0152\5P)\2\u0151\u014f\3\2\2\2\u0151\u0152"
			+ "\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u014d\3\2\2\2\u0153\u0154\3\2\2\2\u0154"
			+ "\25\3\2\2\2\u0155\u0157\7\64\2\2\u0156\u0158\7\u008c\2\2\u0157\u0156\3"
			+ "\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\3\2\2\2\u0159\u015d\7V\2\2\u015a"
			+ "\u015b\7R\2\2\u015b\u015c\7h\2\2\u015c\u015e\7H\2\2\u015d\u015a\3\2\2"
			+ "\2\u015d\u015e\3\2\2\2\u015e\u0162\3\2\2\2\u015f\u0160\5\u0086D\2\u0160"
			+ "\u0161\7\4\2\2\u0161\u0163\3\2\2\2\u0162\u015f\3\2\2\2\u0162\u0163\3\2"
			+ "\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5\u0094K\2\u0165\u0166\7m\2\2\u0166"
			+ "\u0167\5\u0088E\2\u0167\u0168\7\5\2\2\u0168\u016d\5V,\2\u0169\u016a\7"
			+ "\7\2\2\u016a\u016c\5V,\2\u016b\u0169\3\2\2\2\u016c\u016f\3\2\2\2\u016d"
			+ "\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u0170\3\2\2\2\u016f\u016d\3\2"
			+ "\2\2\u0170\u0173\7\6\2\2\u0171\u0172\7\u0094\2\2\u0172\u0174\5P)\2\u0173"
			+ "\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\27\3\2\2\2\u0175\u0177\7\64\2"
			+ "\2\u0176\u0178\t\5\2\2\u0177\u0176\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179"
			+ "\3\2\2\2\u0179\u017d\7\u0084\2\2\u017a\u017b\7R\2\2\u017b\u017c\7h\2\2"
			+ "\u017c\u017e\7H\2\2\u017d\u017a\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0182"
			+ "\3\2\2\2\u017f\u0180\5\u0086D\2\u0180\u0181\7\4\2\2\u0181\u0183\3\2\2"
			+ "\2\u0182\u017f\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u019c"
			+ "\5\u0088E\2\u0185\u0186\7\5\2\2\u0186\u018b\5H%\2\u0187\u0188\7\7\2\2"
			+ "\u0188\u018a\5H%\2\u0189\u0187\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189"
			+ "\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u0192\3\2\2\2\u018d\u018b\3\2\2\2\u018e"
			+ "\u018f\7\7\2\2\u018f\u0191\5X-\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2"
			+ "\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192"
			+ "\3\2\2\2\u0195\u0198\7\6\2\2\u0196\u0197\7\u0096\2\2\u0197\u0199\7\u0097"
			+ "\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019d\3\2\2\2\u019a"
			+ "\u019b\7#\2\2\u019b\u019d\5> \2\u019c\u0185\3\2\2\2\u019c\u019a\3\2\2"
			+ "\2\u019d\31\3\2\2\2\u019e\u01a0\7\64\2\2\u019f\u01a1\t\5\2\2\u01a0\u019f"
			+ "\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a6\7\u008a\2"
			+ "\2\u01a3\u01a4\7R\2\2\u01a4\u01a5\7h\2\2\u01a5\u01a7\7H\2\2\u01a6\u01a3"
			+ "\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ab\3\2\2\2\u01a8\u01a9\5\u0086D"
			+ "\2\u01a9\u01aa\7\4\2\2\u01aa\u01ac\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01ac"
			+ "\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01b2\5\u0096L\2\u01ae\u01b3\7\'\2"
			+ "\2\u01af\u01b3\7\36\2\2\u01b0\u01b1\7[\2\2\u01b1\u01b3\7k\2\2\u01b2\u01ae"
			+ "\3\2\2\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3"
			+ "\u01c2\3\2\2\2\u01b4\u01c3\7=\2\2\u01b5\u01c3\7Z\2\2\u01b6\u01c0\7\u008d"
			+ "\2\2\u01b7\u01b8\7k\2\2\u01b8\u01bd\5\u008eH\2\u01b9\u01ba\7\7\2\2\u01ba"
			+ "\u01bc\5\u008eH\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb"
			+ "\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0"
			+ "\u01b7\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01b4\3\2"
			+ "\2\2\u01c2\u01b5\3\2\2\2\u01c2\u01b6\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4"
			+ "\u01c8\7m\2\2\u01c5\u01c6\5\u0086D\2\u01c6\u01c7\7\4\2\2\u01c7\u01c9\3"
			+ "\2\2\2\u01c8\u01c5\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca"
			+ "\u01ce\5\u0088E\2\u01cb\u01cc\7K\2\2\u01cc\u01cd\7B\2\2\u01cd\u01cf\7"
			+ "\u0080\2\2\u01ce\u01cb\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d2\3\2\2\2"
			+ "\u01d0\u01d1\7\u0093\2\2\u01d1\u01d3\5P)\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3"
			+ "\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01dd\7(\2\2\u01d5\u01da\5B\"\2\u01d6"
			+ "\u01da\5\60\31\2\u01d7\u01da\5 \21\2\u01d8\u01da\5> \2\u01d9\u01d5\3\2"
			+ "\2\2\u01d9\u01d6\3\2\2\2\u01d9\u01d7\3\2\2\2\u01d9\u01d8\3\2\2\2\u01da"
			+ "\u01db\3\2\2\2\u01db\u01dc\7\3\2\2\u01dc\u01de\3\2\2\2\u01dd\u01d9\3\2"
			+ "\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"
			+ "\u01e1\3\2\2\2\u01e1\u01e2\7D\2\2\u01e2\33\3\2\2\2\u01e3\u01e5\7\64\2"
			+ "\2\u01e4\u01e6\t\5\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7"
			+ "\3\2\2\2\u01e7\u01eb\7\u0091\2\2\u01e8\u01e9\7R\2\2\u01e9\u01ea\7h\2\2"
			+ "\u01ea\u01ec\7H\2\2\u01eb\u01e8\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01f0"
			+ "\3\2\2\2\u01ed\u01ee\5\u0086D\2\u01ee\u01ef\7\4\2\2\u01ef\u01f1\3\2\2"
			+ "\2\u01f0\u01ed\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"
			+ "\5\u0098M\2\u01f3\u01f4\7#\2\2\u01f4\u01f5\5> \2\u01f5\35\3\2\2\2\u01f6"
			+ "\u01f7\7\64\2\2\u01f7\u01f8\7\u0092\2\2\u01f8\u01fc\7\u0084\2\2\u01f9"
			+ "\u01fa\7R\2\2\u01fa\u01fb\7h\2\2\u01fb\u01fd\7H\2\2\u01fc\u01f9\3\2\2"
			+ "\2\u01fc\u01fd\3\2\2\2\u01fd\u0201\3\2\2\2\u01fe\u01ff\5\u0086D\2\u01ff"
			+ "\u0200\7\4\2\2\u0200\u0202\3\2\2\2\u0201\u01fe\3\2\2\2\u0201\u0202\3\2"
			+ "\2\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u0088E\2\u0204\u0205\7\u008e\2"
			+ "\2\u0205\u0211\5\u009aN\2\u0206\u0207\7\5\2\2\u0207\u020c\5~@\2\u0208"
			+ "\u0209\7\7\2\2\u0209\u020b\5~@\2\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2"
			+ "\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u020c"
			+ "\3\2\2\2\u020f\u0210\7\6\2\2\u0210\u0212\3\2\2\2\u0211\u0206\3\2\2\2\u0211"
			+ "\u0212\3\2\2\2\u0212\37\3\2\2\2\u0213\u0215\5Z.\2\u0214\u0213\3\2\2\2"
			+ "\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7=\2\2\u0217\u0218"
			+ "\7M\2\2\u0218\u021b\5\\/\2\u0219\u021a\7\u0094\2\2\u021a\u021c\5P)\2\u021b"
			+ "\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c!\3\2\2\2\u021d\u021f\5Z.\2\u021e"
			+ "\u021d\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\7="
			+ "\2\2\u0221\u0222\7M\2\2\u0222\u0225\5\\/\2\u0223\u0224\7\u0094\2\2\u0224"
			+ "\u0226\5P)\2\u0225\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0239\3\2\2"
			+ "\2\u0227\u0228\7o\2\2\u0228\u0229\7*\2\2\u0229\u022e\5^\60\2\u022a\u022b"
			+ "\7\7\2\2\u022b\u022d\5^\60\2\u022c\u022a\3\2\2\2\u022d\u0230\3\2\2\2\u022e"
			+ "\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"
			+ "\2\2\u0231\u0227\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233"
			+ "\u0234\7d\2\2\u0234\u0237\5P)\2\u0235\u0236\t\4\2\2\u0236\u0238\5P)\2"
			+ "\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2\2\2\u0239\u0231"
			+ "\3\2\2\2\u0239\u023a\3\2\2\2\u023a#\3\2\2\2\u023b\u023d\7?\2\2\u023c\u023e"
			+ "\79\2\2\u023d\u023c\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f"
			+ "\u0240\5\u0086D\2\u0240%\3\2\2\2\u0241\u0242\7A\2\2\u0242\u0245\7V\2\2"
			+ "\u0243\u0244\7R\2\2\u0244\u0246\7H\2\2\u0245\u0243\3\2\2\2\u0245\u0246"
			+ "\3\2\2\2\u0246\u024a\3\2\2\2\u0247\u0248\5\u0086D\2\u0248\u0249\7\4\2"
			+ "\2\u0249\u024b\3\2\2\2\u024a\u0247\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c"
			+ "\3\2\2\2\u024c\u024d\5\u0094K\2\u024d\'\3\2\2\2\u024e\u024f\7A\2\2\u024f"
			+ "\u0252\7\u0084\2\2\u0250\u0251\7R\2\2\u0251\u0253\7H\2\2\u0252\u0250\3"
			+ "\2\2\2\u0252\u0253\3\2\2\2\u0253\u0257\3\2\2\2\u0254\u0255\5\u0086D\2"
			+ "\u0255\u0256\7\4\2\2\u0256\u0258\3\2\2\2\u0257\u0254\3\2\2\2\u0257\u0258"
			+ "\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\5\u0088E\2\u025a)\3\2\2\2\u025b"
			+ "\u025c\7A\2\2\u025c\u025f\7\u008a\2\2\u025d\u025e\7R\2\2\u025e\u0260\7"
			+ "H\2\2\u025f\u025d\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0264\3\2\2\2\u0261"
			+ "\u0262\5\u0086D\2\u0262\u0263\7\4\2\2\u0263\u0265\3\2\2\2\u0264\u0261"
			+ "\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\5\u0096L"
			+ "\2\u0267+\3\2\2\2\u0268\u0269\7A\2\2\u0269\u026c\7\u0091\2\2\u026a\u026b"
			+ "\7R\2\2\u026b\u026d\7H\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"
			+ "\u0271\3\2\2\2\u026e\u026f\5\u0086D\2\u026f\u0270\7\4\2\2\u0270\u0272"
			+ "\3\2\2\2\u0271\u026e\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"
			+ "\u0274\5\u0098M\2\u0274-\3\2\2\2\u0275\u0277\7\u0095\2\2\u0276\u0278\7"
			+ "v\2\2\u0277\u0276\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279"
			+ "\u027e\5b\62\2\u027a\u027b\7\7\2\2\u027b\u027d\5b\62\2\u027c\u027a\3\2"
			+ "\2\2\u027d\u0280\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"
			+ "\u0282\3\2\2\2\u0280\u027e\3\2\2\2\u0281\u0275\3\2\2\2\u0281\u0282\3\2"
			+ "\2\2\u0282\u0283\3\2\2\2\u0283\u0289\5n8\2\u0284\u0285\5p9\2\u0285\u0286"
			+ "\5n8\2\u0286\u0288\3\2\2\2\u0287\u0284\3\2\2\2\u0288\u028b\3\2\2\2\u0289"
			+ "\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u0296\3\2\2\2\u028b\u0289\3\2"
			+ "\2\2\u028c\u028d\7o\2\2\u028d\u028e\7*\2\2\u028e\u0293\5^\60\2\u028f\u0290"
			+ "\7\7\2\2\u0290\u0292\5^\60\2\u0291\u028f\3\2\2\2\u0292\u0295\3\2\2\2\u0293"
			+ "\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2"
			+ "\2\2\u0296\u028c\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u029e\3\2\2\2\u0298"
			+ "\u0299\7d\2\2\u0299\u029c\5P)\2\u029a\u029b\t\4\2\2\u029b\u029d\5P)\2"
			+ "\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u0298"
			+ "\3\2\2\2\u029e\u029f\3\2\2\2\u029f/\3\2\2\2\u02a0\u02a2\5Z.\2\u02a1\u02a0"
			+ "\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02b4\3\2\2\2\u02a3\u02b5\7Z\2\2\u02a4"
			+ "\u02b5\7|\2\2\u02a5\u02a6\7Z\2\2\u02a6\u02a7\7n\2\2\u02a7\u02b5\7|\2\2"
			+ "\u02a8\u02a9\7Z\2\2\u02a9\u02aa\7n\2\2\u02aa\u02b5\7\177\2\2\u02ab\u02ac"
			+ "\7Z\2\2\u02ac\u02ad\7n\2\2\u02ad\u02b5\7\33\2\2\u02ae\u02af\7Z\2\2\u02af"
			+ "\u02b0\7n\2\2\u02b0\u02b5\7J\2\2\u02b1\u02b2\7Z\2\2\u02b2\u02b3\7n\2\2"
			+ "\u02b3\u02b5\7S\2\2\u02b4\u02a3\3\2\2\2\u02b4\u02a4\3\2\2\2\u02b4\u02a5"
			+ "\3\2\2\2\u02b4\u02a8\3\2\2\2\u02b4\u02ab\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4"
			+ "\u02b1\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02ba\7]\2\2\u02b7\u02b8\5\u0086"
			+ "D\2\u02b8\u02b9\7\4\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b7\3\2\2\2\u02ba"
			+ "\u02bb\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02c8\5\u0088E\2\u02bd\u02be"
			+ "\7\5\2\2\u02be\u02c3\5\u008eH\2\u02bf\u02c0\7\7\2\2\u02c0\u02c2\5\u008e"
			+ "H\2\u02c1\u02bf\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3"
			+ "\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6\u02c7\7\6"
			+ "\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02bd\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"
			+ "\u02e9\3\2\2\2\u02ca\u02cb\7\u0090\2\2\u02cb\u02cc\7\5\2\2\u02cc\u02d1"
			+ "\5P)\2\u02cd\u02ce\7\7\2\2\u02ce\u02d0\5P)\2\u02cf\u02cd\3\2\2\2\u02d0"
			+ "\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4\3\2"
			+ "\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02e3\7\6\2\2\u02d5\u02d6\7\7\2\2\u02d6"
			+ "\u02d7\7\5\2\2\u02d7\u02dc\5P)\2\u02d8\u02d9\7\7\2\2\u02d9\u02db\5P)\2"
			+ "\u02da\u02d8\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd"
			+ "\3\2\2\2\u02dd\u02df\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\7\6\2\2\u02e0"
			+ "\u02e2\3\2\2\2\u02e1\u02d5\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2"
			+ "\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02ea\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6"
			+ "\u02ea\5> \2\u02e7\u02e8\7:\2\2\u02e8\u02ea\7\u0090\2\2\u02e9\u02ca\3"
			+ "\2\2\2\u02e9\u02e6\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\61\3\2\2\2\u02eb"
			+ "\u02ef\7r\2\2\u02ec\u02ed\5\u0086D\2\u02ed\u02ee\7\4\2\2\u02ee\u02f0\3"
			+ "\2\2\2\u02ef\u02ec\3\2\2\2\u02ef\u02f0\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1"
			+ "\u02f8\5\u009cO\2\u02f2\u02f3\7\b\2\2\u02f3\u02f9\5`\61\2\u02f4\u02f5"
			+ "\7\5\2\2\u02f5\u02f6\5`\61\2\u02f6\u02f7\7\6\2\2\u02f7\u02f9\3\2\2\2\u02f8"
			+ "\u02f2\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\63\3\2\2"
			+ "\2\u02fa\u0305\7y\2\2\u02fb\u0306\5\u0090I\2\u02fc\u02fd\5\u0086D\2\u02fd"
			+ "\u02fe\7\4\2\2\u02fe\u0300\3\2\2\2\u02ff\u02fc\3\2\2\2\u02ff\u0300\3\2"
			+ "\2\2\u0300\u0303\3\2\2\2\u0301\u0304\5\u0088E\2\u0302\u0304\5\u0094K\2"
			+ "\u0303\u0301\3\2\2\2\u0303\u0302\3\2\2\2\u0304\u0306\3\2\2\2\u0305\u02fb"
			+ "\3\2\2\2\u0305\u02ff\3\2\2\2\u0305\u0306\3\2\2\2\u0306\65\3\2\2\2\u0307"
			+ "\u0309\7z\2\2\u0308\u030a\7\u0081\2\2\u0309\u0308\3\2\2\2\u0309\u030a"
			+ "\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\5\u009eP\2\u030c\67\3\2\2\2\u030d"
			+ "\u0312\7\177\2\2\u030e\u0310\7\u0089\2\2\u030f\u0311\5\u00a2R\2\u0310"
			+ "\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u030e\3\2"
			+ "\2\2\u0312\u0313\3\2\2\2\u0313\u0319\3\2\2\2\u0314\u0316\7\u0088\2\2\u0315"
			+ "\u0317\7\u0081\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318"
			+ "\3\2\2\2\u0318\u031a\5\u009eP\2\u0319\u0314\3\2\2\2\u0319\u031a\3\2\2"
			+ "\2\u031a9\3\2\2\2\u031b\u031c\7\u0081\2\2\u031c\u031d\5\u009eP\2\u031d"
			+ ";\3\2\2\2\u031e\u0320\7\u0095\2\2\u031f\u0321\7v\2\2\u0320\u031f\3\2\2"
			+ "\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0327\5b\62\2\u0323\u0324"
			+ "\7\7\2\2\u0324\u0326\5b\62\2\u0325\u0323\3\2\2\2\u0326\u0329\3\2\2\2\u0327"
			+ "\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327\3\2"
			+ "\2\2\u032a\u031e\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u032c\3\2\2\2\u032c"
			+ "\u0337\5n8\2\u032d\u032e\7o\2\2\u032e\u032f\7*\2\2\u032f\u0334\5^\60\2"
			+ "\u0330\u0331\7\7\2\2\u0331\u0333\5^\60\2\u0332\u0330\3\2\2\2\u0333\u0336"
			+ "\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0338\3\2\2\2\u0336"
			+ "\u0334\3\2\2\2\u0337\u032d\3\2\2\2\u0337\u0338\3\2\2\2\u0338\u033f\3\2"
			+ "\2\2\u0339\u033a\7d\2\2\u033a\u033d\5P)\2\u033b\u033c\t\4\2\2\u033c\u033e"
			+ "\5P)\2\u033d\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f"
			+ "\u0339\3\2\2\2\u033f\u0340\3\2\2\2\u0340=\3\2\2\2\u0341\u0343\7\u0095"
			+ "\2\2\u0342\u0344\7v\2\2\u0343\u0342\3\2\2\2\u0343\u0344\3\2\2\2\u0344"
			+ "\u0345\3\2\2\2\u0345\u034a\5b\62\2\u0346\u0347\7\7\2\2\u0347\u0349\5b"
			+ "\62\2\u0348\u0346\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a"
			+ "\u034b\3\2\2\2\u034b\u034e\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u0341\3\2"
			+ "\2\2\u034d\u034e\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0355\5@!\2\u0350\u0351"
			+ "\5p9\2\u0351\u0352\5@!\2\u0352\u0354\3\2\2\2\u0353\u0350\3\2\2\2\u0354"
			+ "\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0362\3\2"
			+ "\2\2\u0357\u0355\3\2\2\2\u0358\u0359\7o\2\2\u0359\u035a\7*\2\2\u035a\u035f"
			+ "\5^\60\2\u035b\u035c\7\7\2\2\u035c\u035e\5^\60\2\u035d\u035b\3\2\2\2\u035e"
			+ "\u0361\3\2\2\2\u035f\u035d\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0363\3\2"
			+ "\2\2\u0361\u035f\3\2\2\2\u0362\u0358\3\2\2\2\u0362\u0363\3\2\2\2\u0363"
			+ "\u036a\3\2\2\2\u0364\u0365\7d\2\2\u0365\u0368\5P)\2\u0366\u0367\t\4\2"
			+ "\2\u0367\u0369\5P)\2\u0368\u0366\3\2\2\2\u0368\u0369\3\2\2\2\u0369\u036b"
			+ "\3\2\2\2\u036a\u0364\3\2\2\2\u036a\u036b\3\2\2\2\u036b?\3\2\2\2\u036c"
			+ "\u036e\7\u0082\2\2\u036d\u036f\t\6\2\2\u036e\u036d\3\2\2\2\u036e\u036f"
			+ "\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0375\5d\63\2\u0371\u0372\7\7\2\2\u0372"
			+ "\u0374\5d\63\2\u0373\u0371\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2"
			+ "\2\2\u0375\u0376\3\2\2\2\u0376\u0384\3\2\2\2\u0377\u0375\3\2\2\2\u0378"
			+ "\u0382\7M\2\2\u0379\u037e\5f\64\2\u037a\u037b\7\7\2\2\u037b\u037d\5f\64"
			+ "\2\u037c\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f"
			+ "\3\2\2\2\u037f\u0383\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0383\5h\65\2\u0382"
			+ "\u0379\3\2\2\2\u0382\u0381\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0378\3\2"
			+ "\2\2\u0384\u0385\3\2\2\2\u0385\u0388\3\2\2\2\u0386\u0387\7\u0094\2\2\u0387"
			+ "\u0389\5P)\2\u0388\u0386\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u0398\3\2\2"
			+ "\2\u038a\u038b\7P\2\2\u038b\u038c\7*\2\2\u038c\u0391\5P)\2\u038d\u038e"
			+ "\7\7\2\2\u038e\u0390\5P)\2\u038f\u038d\3\2\2\2\u0390\u0393\3\2\2\2\u0391"
			+ "\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0396\3\2\2\2\u0393\u0391\3\2"
			+ "\2\2\u0394\u0395\7Q\2\2\u0395\u0397\5P)\2\u0396\u0394\3\2\2\2\u0396\u0397"
			+ "\3\2\2\2\u0397\u0399\3\2\2\2\u0398\u038a\3\2\2\2\u0398\u0399\3\2\2\2\u0399"
			+ "\u03b7\3\2\2\2\u039a\u039b\7\u0090\2\2\u039b\u039c\7\5\2\2\u039c\u03a1"
			+ "\5P)\2\u039d\u039e\7\7\2\2\u039e\u03a0\5P)\2\u039f\u039d\3\2\2\2\u03a0"
			+ "\u03a3\3\2\2\2\u03a1\u039f\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2\u03a4\3\2"
			+ "\2\2\u03a3\u03a1\3\2\2\2\u03a4\u03b3\7\6\2\2\u03a5\u03a6\7\7\2\2\u03a6"
			+ "\u03a7\7\5\2\2\u03a7\u03ac\5P)\2\u03a8\u03a9\7\7\2\2\u03a9\u03ab\5P)\2"
			+ "\u03aa\u03a8\3\2\2\2\u03ab\u03ae\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad"
			+ "\3\2\2\2\u03ad\u03af\3\2\2\2\u03ae\u03ac\3\2\2\2\u03af\u03b0\7\6\2\2\u03b0"
			+ "\u03b2\3\2\2\2\u03b1\u03a5\3\2\2\2\u03b2\u03b5\3\2\2\2\u03b3\u03b1\3\2"
			+ "\2\2\u03b3\u03b4\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b6"
			+ "\u036c\3\2\2\2\u03b6\u039a\3\2\2\2\u03b7A\3\2\2\2\u03b8\u03ba\5Z.\2\u03b9"
			+ "\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03c6\7\u008d"
			+ "\2\2\u03bc\u03bd\7n\2\2\u03bd\u03c7\7\177\2\2\u03be\u03bf\7n\2\2\u03bf"
			+ "\u03c7\7\33\2\2\u03c0\u03c1\7n\2\2\u03c1\u03c7\7|\2\2\u03c2\u03c3\7n\2"
			+ "\2\u03c3\u03c7\7J\2\2\u03c4\u03c5\7n\2\2\u03c5\u03c7\7S\2\2\u03c6\u03bc"
			+ "\3\2\2\2\u03c6\u03be\3\2\2\2\u03c6\u03c0\3\2\2\2\u03c6\u03c2\3\2\2\2\u03c6"
			+ "\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03c9\5\\"
			+ "/\2\u03c9\u03ca\7\u0083\2\2\u03ca\u03cb\5\u008eH\2\u03cb\u03cc\7\b\2\2"
			+ "\u03cc\u03d4\5P)\2\u03cd\u03ce\7\7\2\2\u03ce\u03cf\5\u008eH\2\u03cf\u03d0"
			+ "\7\b\2\2\u03d0\u03d1\5P)\2\u03d1\u03d3\3\2\2\2\u03d2\u03cd\3\2\2\2\u03d3"
			+ "\u03d6\3\2\2\2\u03d4\u03d2\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d9\3\2"
			+ "\2\2\u03d6\u03d4\3\2\2\2\u03d7\u03d8\7\u0094\2\2\u03d8\u03da\5P)\2\u03d9"
			+ "\u03d7\3\2\2\2\u03d9\u03da\3\2\2\2\u03daC\3\2\2\2\u03db\u03dd\5Z.\2\u03dc"
			+ "\u03db\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e9\7\u008d"
			+ "\2\2\u03df\u03e0\7n\2\2\u03e0\u03ea\7\177\2\2\u03e1\u03e2\7n\2\2\u03e2"
			+ "\u03ea\7\33\2\2\u03e3\u03e4\7n\2\2\u03e4\u03ea\7|\2\2\u03e5\u03e6\7n\2"
			+ "\2\u03e6\u03ea\7J\2\2\u03e7\u03e8\7n\2\2\u03e8\u03ea\7S\2\2\u03e9\u03df"
			+ "\3\2\2\2\u03e9\u03e1\3\2\2\2\u03e9\u03e3\3\2\2\2\u03e9\u03e5\3\2\2\2\u03e9"
			+ "\u03e7\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u03ec\5\\"
			+ "/\2\u03ec\u03ed\7\u0083\2\2\u03ed\u03ee\5\u008eH\2\u03ee\u03ef\7\b\2\2"
			+ "\u03ef\u03f7\5P)\2\u03f0\u03f1\7\7\2\2\u03f1\u03f2\5\u008eH\2\u03f2\u03f3"
			+ "\7\b\2\2\u03f3\u03f4\5P)\2\u03f4\u03f6\3\2\2\2\u03f5\u03f0\3\2\2\2\u03f6"
			+ "\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03fc\3\2"
			+ "\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fb\7\u0094\2\2\u03fb\u03fd\5P)\2\u03fc"
			+ "\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u0410\3\2\2\2\u03fe\u03ff\7o"
			+ "\2\2\u03ff\u0400\7*\2\2\u0400\u0405\5^\60\2\u0401\u0402\7\7\2\2\u0402"
			+ "\u0404\5^\60\2\u0403\u0401\3\2\2\2\u0404\u0407\3\2\2\2\u0405\u0403\3\2"
			+ "\2\2\u0405\u0406\3\2\2\2\u0406\u0409\3\2\2\2\u0407\u0405\3\2\2\2\u0408"
			+ "\u03fe\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\3\2\2\2\u040a\u040b\7d"
			+ "\2\2\u040b\u040e\5P)\2\u040c\u040d\t\4\2\2\u040d\u040f\5P)\2\u040e\u040c"
			+ "\3\2\2\2\u040e\u040f\3\2\2\2\u040f\u0411\3\2\2\2\u0410\u0408\3\2\2\2\u0410"
			+ "\u0411\3\2\2\2\u0411E\3\2\2\2\u0412\u0413\7\u008f\2\2\u0413G\3\2\2\2\u0414"
			+ "\u0416\5\u008eH\2\u0415\u0417\5J&\2\u0416\u0415\3\2\2\2\u0416\u0417\3"
			+ "\2\2\2\u0417\u041b\3\2\2\2\u0418\u041a\5L\'\2\u0419\u0418\3\2\2\2\u041a"
			+ "\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041cI\3\2\2\2"
			+ "\u041d\u041b\3\2\2\2\u041e\u0420\5\u00a4S\2\u041f\u041e\3\2\2\2\u0420"
			+ "\u0421\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u042d\3\2"
			+ "\2\2\u0423\u0424\7\5\2\2\u0424\u0425\5t;\2\u0425\u0426\7\6\2\2\u0426\u042e"
			+ "\3\2\2\2\u0427\u0428\7\5\2\2\u0428\u0429\5t;\2\u0429\u042a\7\7\2\2\u042a"
			+ "\u042b\5t;\2\u042b\u042c\7\6\2\2\u042c\u042e\3\2\2\2\u042d\u0423\3\2\2"
			+ "\2\u042d\u0427\3\2\2\2\u042d\u042e\3\2\2\2\u042eK\3\2\2\2\u042f\u0430"
			+ "\7\63\2\2\u0430\u0432\5\u00a4S\2\u0431\u042f\3\2\2\2\u0431\u0432\3\2\2"
			+ "\2\u0432\u0454\3\2\2\2\u0433\u0434\7s\2\2\u0434\u0436\7a\2\2\u0435\u0437"
			+ "\t\7\2\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0438\3\2\2\2\u0438"
			+ "\u043a\5N(\2\u0439\u043b\7&\2\2\u043a\u0439\3\2\2\2\u043a\u043b\3\2\2"
			+ "\2\u043b\u0455\3\2\2\2\u043c\u043e\7h\2\2\u043d\u043c\3\2\2\2\u043d\u043e"
			+ "\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\7j\2\2\u0440\u0455\5N(\2\u0441"
			+ "\u0442\7\u008c\2\2\u0442\u0455\5N(\2\u0443\u0444\7.\2\2\u0444\u0445\7"
			+ "\5\2\2\u0445\u0446\5P)\2\u0446\u0447\7\6\2\2\u0447\u0455\3\2\2\2\u0448"
			+ "\u044f\7:\2\2\u0449\u0450\5t;\2\u044a\u0450\5v<\2\u044b\u044c\7\5\2\2"
			+ "\u044c\u044d\5P)\2\u044d\u044e\7\6\2\2\u044e\u0450\3\2\2\2\u044f\u0449"
			+ "\3\2\2\2\u044f\u044a\3\2\2\2\u044f\u044b\3\2\2\2\u0450\u0455\3\2\2\2\u0451"
			+ "\u0452\7/\2\2\u0452\u0455\5\u0090I\2\u0453\u0455\5R*\2\u0454\u0433\3\2"
			+ "\2\2\u0454\u043d\3\2\2\2\u0454\u0441\3\2\2\2\u0454\u0443\3\2\2\2\u0454"
			+ "\u0448\3\2\2\2\u0454\u0451\3\2\2\2\u0454\u0453\3\2\2\2\u0455M\3\2\2\2"
			+ "\u0456\u0457\7m\2\2\u0457\u0458\7\62\2\2\u0458\u045a\t\b\2\2\u0459\u0456"
			+ "\3\2\2\2\u0459\u045a\3\2\2\2\u045aO\3\2\2\2\u045b\u045c\b)\1\2\u045c\u045d"
			+ "\5x=\2\u045d\u045e\5P)\20\u045e\u04a8\3\2\2\2\u045f\u04a8\5v<\2\u0460"
			+ "\u04a8\7\u0099\2\2\u0461\u0462\5\u0086D\2\u0462\u0463\7\4\2\2\u0463\u0465"
			+ "\3\2\2\2\u0464\u0461\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466"
			+ "\u0467\5\u0088E\2\u0467\u0468\7\4\2\2\u0468\u046a\3\2\2\2\u0469\u0464"
			+ "\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u04a8\5\u008eH"
			+ "\2\u046c\u046d\5\u0084C\2\u046d\u047a\7\5\2\2\u046e\u0470\7@\2\2\u046f"
			+ "\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0476\5P"
			+ ")\2\u0472\u0473\7\7\2\2\u0473\u0475\5P)\2\u0474\u0472\3\2\2\2\u0475\u0478"
			+ "\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u047b\3\2\2\2\u0478"
			+ "\u0476\3\2\2\2\u0479\u047b\7\t\2\2\u047a\u046f\3\2\2\2\u047a\u0479\3\2"
			+ "\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\7\6\2\2\u047d"
			+ "\u04a8\3\2\2\2\u047e\u047f\7\5\2\2\u047f\u0480\5P)\2\u0480\u0481\7\6\2"
			+ "\2\u0481\u04a8\3\2\2\2\u0482\u0483\7-\2\2\u0483\u0484\7\5\2\2\u0484\u0485"
			+ "\5P)\2\u0485\u0486\7#\2\2\u0486\u0487\5J&\2\u0487\u0488\7\6\2\2\u0488"
			+ "\u04a8\3\2\2\2\u0489\u048b\7h\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2"
			+ "\2\2\u048b\u048c\3\2\2\2\u048c\u048e\7H\2\2\u048d\u048a\3\2\2\2\u048d"
			+ "\u048e\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u0490\7\5\2\2\u0490\u0491\5>"
			+ " \2\u0491\u0492\7\6\2\2\u0492\u04a8\3\2\2\2\u0493\u0495\7,\2\2\u0494\u0496"
			+ "\5P)\2\u0495\u0494\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u049c\3\2\2\2\u0497"
			+ "\u0498\7\u0093\2\2\u0498\u0499\5P)\2\u0499\u049a\7\u0087\2\2\u049a\u049b"
			+ "\5P)\2\u049b\u049d\3\2\2\2\u049c\u0497\3\2\2\2\u049d\u049e\3\2\2\2\u049e"
			+ "\u049c\3\2\2\2\u049e\u049f\3\2\2\2\u049f\u04a2\3\2\2\2\u04a0\u04a1\7C"
			+ "\2\2\u04a1\u04a3\5P)\2\u04a2\u04a0\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4"
			+ "\3\2\2\2\u04a4\u04a5\7D\2\2\u04a5\u04a8\3\2\2\2\u04a6\u04a8\5T+\2\u04a7"
			+ "\u045b\3\2\2\2\u04a7\u045f\3\2\2\2\u04a7\u0460\3\2\2\2\u04a7\u0469\3\2"
			+ "\2\2\u04a7\u046c\3\2\2\2\u04a7\u047e\3\2\2\2\u04a7\u0482\3\2\2\2\u04a7"
			+ "\u048d\3\2\2\2\u04a7\u0493\3\2\2\2\u04a7\u04a6\3\2\2\2\u04a8\u04ec\3\2"
			+ "\2\2\u04a9\u04aa\f\17\2\2\u04aa\u04ab\5z>\2\u04ab\u04ac\5P)\20\u04ac\u04eb"
			+ "\3\2\2\2\u04ad\u04ae\f\b\2\2\u04ae\u04b0\7^\2\2\u04af\u04b1\7h\2\2\u04b0"
			+ "\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b2\3\2\2\2\u04b2\u04eb\5P"
			+ ")\t\u04b3\u04b5\f\7\2\2\u04b4\u04b6\7h\2\2\u04b5\u04b4\3\2\2\2\u04b5\u04b6"
			+ "\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b8\7)\2\2\u04b8\u04b9\5P)\2\u04b9"
			+ "\u04ba\7\"\2\2\u04ba\u04bb\5P)\b\u04bb\u04eb\3\2\2\2\u04bc\u04bd\f\13"
			+ "\2\2\u04bd\u04be\7/\2\2\u04be\u04eb\5\u0090I\2\u04bf\u04c1\f\n\2\2\u04c0"
			+ "\u04c2\7h\2\2\u04c1\u04c0\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\3\2"
			+ "\2\2\u04c3\u04c4\t\t\2\2\u04c4\u04c7\5P)\2\u04c5\u04c6\7E\2\2\u04c6\u04c8"
			+ "\5P)\2\u04c7\u04c5\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04eb\3\2\2\2\u04c9"
			+ "\u04ce\f\t\2\2\u04ca\u04cf\7_\2\2\u04cb\u04cf\7i\2\2\u04cc\u04cd\7h\2"
			+ "\2\u04cd\u04cf\7j\2\2\u04ce\u04ca\3\2\2\2\u04ce\u04cb\3\2\2\2\u04ce\u04cc"
			+ "\3\2\2\2\u04cf\u04eb\3\2\2\2\u04d0\u04d2\f\6\2\2\u04d1\u04d3\7h\2\2\u04d2"
			+ "\u04d1\3\2\2\2\u04d2\u04d3\3\2\2\2\u04d3\u04d4\3\2\2\2\u04d4\u04e8\7U"
			+ "\2\2\u04d5\u04df\7\5\2\2\u04d6\u04e0\5> \2\u04d7\u04dc\5P)\2\u04d8\u04d9"
			+ "\7\7\2\2\u04d9\u04db\5P)\2\u04da\u04d8\3\2\2\2\u04db\u04de\3\2\2\2\u04dc"
			+ "\u04da\3\2\2\2\u04dc\u04dd\3\2\2\2\u04dd\u04e0\3\2\2\2\u04de\u04dc\3\2"
			+ "\2\2\u04df\u04d6\3\2\2\2\u04df\u04d7\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0"
			+ "\u04e1\3\2\2\2\u04e1\u04e9\7\6\2\2\u04e2\u04e3\5\u0086D\2\u04e3\u04e4"
			+ "\7\4\2\2\u04e4\u04e6\3\2\2\2\u04e5\u04e2\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6"
			+ "\u04e7\3\2\2\2\u04e7\u04e9\5\u0088E\2\u04e8\u04d5\3\2\2\2\u04e8\u04e5"
			+ "\3\2\2\2\u04e9\u04eb\3\2\2\2\u04ea\u04a9\3\2\2\2\u04ea\u04ad\3\2\2\2\u04ea"
			+ "\u04b3\3\2\2\2\u04ea\u04bc\3\2\2\2\u04ea\u04bf\3\2\2\2\u04ea\u04c9\3\2"
			+ "\2\2\u04ea\u04d0\3\2\2\2\u04eb\u04ee\3\2\2\2\u04ec\u04ea\3\2\2\2\u04ec"
			+ "\u04ed\3\2\2\2\u04edQ\3\2\2\2\u04ee\u04ec\3\2\2\2\u04ef\u04f0\7w\2\2\u04f0"
			+ "\u04fc\5\u0092J\2\u04f1\u04f2\7\5\2\2\u04f2\u04f7\5\u008eH\2\u04f3\u04f4"
			+ "\7\7\2\2\u04f4\u04f6\5\u008eH\2\u04f5\u04f3\3\2\2\2\u04f6\u04f9\3\2\2"
			+ "\2\u04f7\u04f5\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04fa\3\2\2\2\u04f9\u04f7"
			+ "\3\2\2\2\u04fa\u04fb\7\6\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04f1\3\2\2\2\u04fc"
			+ "\u04fd\3\2\2\2\u04fd\u0510\3\2\2\2\u04fe\u04ff\7m\2\2\u04ff\u0508\t\n"
			+ "\2\2\u0500\u0501\7\u0083\2\2\u0501\u0509\7j\2\2\u0502\u0503\7\u0083\2"
			+ "\2\u0503\u0509\7:\2\2\u0504\u0509\7+\2\2\u0505\u0509\7}\2\2\u0506\u0507"
			+ "\7g\2\2\u0507\u0509\7\34\2\2\u0508\u0500\3\2\2\2\u0508\u0502\3\2\2\2\u0508"
			+ "\u0504\3\2\2\2\u0508\u0505\3\2\2\2\u0508\u0506\3\2\2\2\u0509\u050d\3\2"
			+ "\2\2\u050a\u050b\7e\2\2\u050b\u050d\5\u00a4S\2\u050c\u04fe\3\2\2\2\u050c"
			+ "\u050a\3\2\2\2\u050d\u050f\3\2\2\2\u050e\u050c\3\2\2\2\u050f\u0512\3\2"
			+ "\2\2\u0510\u050e\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u051d\3\2\2\2\u0512"
			+ "\u0510\3\2\2\2\u0513\u0515\7h\2\2\u0514\u0513\3\2\2\2\u0514\u0515\3\2"
			+ "\2\2\u0515\u0516\3\2\2\2\u0516\u051b\7;\2\2\u0517\u0518\7X\2\2\u0518\u051c"
			+ "\7<\2\2\u0519\u051a\7X\2\2\u051a\u051c\7T\2\2\u051b\u0517\3\2\2\2\u051b"
			+ "\u0519\3\2\2\2\u051b\u051c\3\2\2\2\u051c\u051e\3\2\2\2\u051d\u0514\3\2"
			+ "\2\2\u051d\u051e\3\2\2\2\u051eS\3\2\2\2\u051f\u0520\7u\2\2\u0520\u0525"
			+ "\7\5\2\2\u0521\u0526\7S\2\2\u0522\u0523\t\13\2\2\u0523\u0524\7\7\2\2\u0524"
			+ "\u0526\5|?\2\u0525\u0521\3\2\2\2\u0525\u0522\3\2\2\2\u0526\u0527\3\2\2"
			+ "\2\u0527\u0528\7\6\2\2\u0528U\3\2\2\2\u0529\u052c\5\u008eH\2\u052a\u052b"
			+ "\7/\2\2\u052b\u052d\5\u0090I\2\u052c\u052a\3\2\2\2\u052c\u052d\3\2\2\2"
			+ "\u052d\u052f\3\2\2\2\u052e\u0530\t\7\2\2\u052f\u052e\3\2\2\2\u052f\u0530"
			+ "\3\2\2\2\u0530W\3\2\2\2\u0531\u0532\7\63\2\2\u0532\u0534\5\u00a4S\2\u0533"
			+ "\u0531\3\2\2\2\u0533\u0534\3\2\2\2\u0534\u0559\3\2\2\2\u0535\u0536\7s"
			+ "\2\2\u0536\u0539\7a\2\2\u0537\u0539\7\u008c\2\2\u0538\u0535\3\2\2\2\u0538"
			+ "\u0537\3\2\2\2\u0539\u053a\3\2\2\2\u053a\u053b\7\5\2\2\u053b\u0540\5V"
			+ ",\2\u053c\u053d\7\7\2\2\u053d\u053f\5V,\2\u053e\u053c\3\2\2\2\u053f\u0542"
			+ "\3\2\2\2\u0540\u053e\3\2\2\2\u0540\u0541\3\2\2\2\u0541\u0543\3\2\2\2\u0542"
			+ "\u0540\3\2\2\2\u0543\u0544\7\6\2\2\u0544\u0545\5N(\2\u0545\u055a\3\2\2"
			+ "\2\u0546\u0547\7.\2\2\u0547\u0548\7\5\2\2\u0548\u0549\5P)\2\u0549\u054a"
			+ "\7\6\2\2\u054a\u055a\3\2\2\2\u054b\u054c\7L\2\2\u054c\u054d\7a\2\2\u054d"
			+ "\u054e\7\5\2\2\u054e\u0553\5\u008eH\2\u054f\u0550\7\7\2\2\u0550\u0552"
			+ "\5\u008eH\2\u0551\u054f\3\2\2\2\u0552\u0555\3\2\2\2\u0553\u0551\3\2\2"
			+ "\2\u0553\u0554\3\2\2\2\u0554\u0556\3\2\2\2\u0555\u0553\3\2\2\2\u0556\u0557"
			+ "\7\6\2\2\u0557\u0558\5R*\2\u0558\u055a\3\2\2\2\u0559\u0538\3\2\2\2\u0559"
			+ "\u0546\3\2\2\2\u0559\u054b\3\2\2\2\u055aY\3\2\2\2\u055b\u055d\7\u0095"
			+ "\2\2\u055c\u055e\7v\2\2\u055d\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e"
			+ "\u055f\3\2\2\2\u055f\u0560\5r:\2\u0560\u0561\7#\2\2\u0561\u0562\7\5\2"
			+ "\2\u0562\u0563\5> \2\u0563\u056d\7\6\2\2\u0564\u0565\7\7\2\2\u0565\u0566"
			+ "\5r:\2\u0566\u0567\7#\2\2\u0567\u0568\7\5\2\2\u0568\u0569\5> \2\u0569"
			+ "\u056a\7\6\2\2\u056a\u056c\3\2\2\2\u056b\u0564\3\2\2\2\u056c\u056f\3\2"
			+ "\2\2\u056d\u056b\3\2\2\2\u056d\u056e\3\2\2\2\u056e[\3\2\2\2\u056f\u056d"
			+ "\3\2\2\2\u0570\u0571\5\u0086D\2\u0571\u0572\7\4\2\2\u0572\u0574\3\2\2"
			+ "\2\u0573\u0570\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0575\3\2\2\2\u0575\u057b"
			+ "\5\u0088E\2\u0576\u0577\7W\2\2\u0577\u0578\7*\2\2\u0578\u057c\5\u0094"
			+ "K\2\u0579\u057a\7h\2\2\u057a\u057c\7W\2\2\u057b\u0576\3\2\2\2\u057b\u0579"
			+ "\3\2\2\2\u057b\u057c\3\2\2\2\u057c]\3\2\2\2\u057d\u0580\5P)\2\u057e\u057f"
			+ "\7/\2\2\u057f\u0581\5\u0090I\2\u0580\u057e\3\2\2\2\u0580\u0581\3\2\2\2"
			+ "\u0581\u0583\3\2\2\2\u0582\u0584\t\7\2\2\u0583\u0582\3\2\2\2\u0583\u0584"
			+ "\3\2\2\2\u0584_\3\2\2\2\u0585\u0589\5t;\2\u0586\u0589\5\u00a4S\2\u0587"
			+ "\u0589\7\u009a\2\2\u0588\u0585\3\2\2\2\u0588\u0586\3\2\2\2\u0588\u0587"
			+ "\3\2\2\2\u0589a\3\2\2\2\u058a\u0596\5\u0088E\2\u058b\u058c\7\5\2\2\u058c"
			+ "\u0591\5\u008eH\2\u058d\u058e\7\7\2\2\u058e\u0590\5\u008eH\2\u058f\u058d"
			+ "\3\2\2\2\u0590\u0593\3\2\2\2\u0591\u058f\3\2\2\2\u0591\u0592\3\2\2\2\u0592"
			+ "\u0594\3\2\2\2\u0593\u0591\3\2\2\2\u0594\u0595\7\6\2\2\u0595\u0597\3\2"
			+ "\2\2\u0596\u058b\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u0598\3\2\2\2\u0598"
			+ "\u0599\7#\2\2\u0599\u059a\7\5\2\2\u059a\u059b\5> \2\u059b\u059c\7\6\2"
			+ "\2\u059cc\3\2\2\2\u059d\u05aa\7\t\2\2\u059e\u059f\5\u0088E\2\u059f\u05a0"
			+ "\7\4\2\2\u05a0\u05a1\7\t\2\2\u05a1\u05aa\3\2\2\2\u05a2\u05a7\5P)\2\u05a3"
			+ "\u05a5\7#\2\2\u05a4\u05a3\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\3\2"
			+ "\2\2\u05a6\u05a8\5\u0080A\2\u05a7\u05a4\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8"
			+ "\u05aa\3\2\2\2\u05a9\u059d\3\2\2\2\u05a9\u059e\3\2\2\2\u05a9\u05a2\3\2"
			+ "\2\2\u05aae\3\2\2\2\u05ab\u05ac\5\u0086D\2\u05ac\u05ad\7\4\2\2\u05ad\u05af"
			+ "\3\2\2\2\u05ae\u05ab\3\2\2\2\u05ae\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0"
			+ "\u05b5\5\u0088E\2\u05b1\u05b3\7#\2\2\u05b2\u05b1\3\2\2\2\u05b2\u05b3\3"
			+ "\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b6\5\u00a0Q\2\u05b5\u05b2\3\2\2\2"
			+ "\u05b5\u05b6\3\2\2\2\u05b6\u05bc\3\2\2\2\u05b7\u05b8\7W\2\2\u05b8\u05b9"
			+ "\7*\2\2\u05b9\u05bd\5\u0094K\2\u05ba\u05bb\7h\2\2\u05bb\u05bd\7W\2\2\u05bc"
			+ "\u05b7\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bc\u05bd\3\2\2\2\u05bd\u05db\3\2"
			+ "\2\2\u05be\u05c8\7\5\2\2\u05bf\u05c4\5f\64\2\u05c0\u05c1\7\7\2\2\u05c1"
			+ "\u05c3\5f\64\2\u05c2\u05c0\3\2\2\2\u05c3\u05c6\3\2\2\2\u05c4\u05c2\3\2"
			+ "\2\2\u05c4\u05c5\3\2\2\2\u05c5\u05c9\3\2\2\2\u05c6\u05c4\3\2\2\2\u05c7"
			+ "\u05c9\5h\65\2\u05c8\u05bf\3\2\2\2\u05c8\u05c7\3\2\2\2\u05c9\u05ca\3\2"
			+ "\2\2\u05ca\u05cf\7\6\2\2\u05cb\u05cd\7#\2\2\u05cc\u05cb\3\2\2\2\u05cc"
			+ "\u05cd\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\5\u00a0Q\2\u05cf\u05cc"
			+ "\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05db\3\2\2\2\u05d1\u05d2\7\5\2\2\u05d2"
			+ "\u05d3\5> \2\u05d3\u05d8\7\6\2\2\u05d4\u05d6\7#\2\2\u05d5\u05d4\3\2\2"
			+ "\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d9\5\u00a0Q\2\u05d8"
			+ "\u05d5\3\2\2\2\u05d8\u05d9\3\2\2\2\u05d9\u05db\3\2\2\2\u05da\u05ae\3\2"
			+ "\2\2\u05da\u05be\3\2\2\2\u05da\u05d1\3\2\2\2\u05dbg\3\2\2\2\u05dc\u05e3"
			+ "\5f\64\2\u05dd\u05de\5j\66\2\u05de\u05df\5f\64\2\u05df\u05e0\5l\67\2\u05e0"
			+ "\u05e2\3\2\2\2\u05e1\u05dd\3\2\2\2\u05e2\u05e5\3\2\2\2\u05e3\u05e1\3\2"
			+ "\2\2\u05e3\u05e4\3\2\2\2\u05e4i\3\2\2\2\u05e5\u05e3\3\2\2\2\u05e6\u05f4"
			+ "\7\7\2\2\u05e7\u05e9\7f\2\2\u05e8\u05e7\3\2\2\2\u05e8\u05e9\3\2\2\2\u05e9"
			+ "\u05f0\3\2\2\2\u05ea\u05ec\7b\2\2\u05eb\u05ed\7p\2\2\u05ec\u05eb\3\2\2"
			+ "\2\u05ec\u05ed\3\2\2\2\u05ed\u05f1\3\2\2\2\u05ee\u05f1\7Y\2\2\u05ef\u05f1"
			+ "\7\65\2\2\u05f0\u05ea\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f0\u05ef\3\2\2\2"
			+ "\u05f0\u05f1\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f4\7`\2\2\u05f3\u05e6"
			+ "\3\2\2\2\u05f3\u05e8\3\2\2\2\u05f4k\3\2\2\2\u05f5\u05f6\7m\2\2\u05f6\u0604"
			+ "\5P)\2\u05f7\u05f8\7\u008e\2\2\u05f8\u05f9\7\5\2\2\u05f9\u05fe\5\u008e"
			+ "H\2\u05fa\u05fb\7\7\2\2\u05fb\u05fd\5\u008eH\2\u05fc\u05fa\3\2\2\2\u05fd"
			+ "\u0600\3\2\2\2\u05fe\u05fc\3\2\2\2\u05fe\u05ff\3\2\2\2\u05ff\u0601\3\2"
			+ "\2\2\u0600\u05fe\3\2\2\2\u0601\u0602\7\6\2\2\u0602\u0604\3\2\2\2\u0603"
			+ "\u05f5\3\2\2\2\u0603\u05f7\3\2\2\2\u0603\u0604\3\2\2\2\u0604m\3\2\2\2"
			+ "\u0605\u0607\7\u0082\2\2\u0606\u0608\t\6\2\2\u0607\u0606\3\2\2\2\u0607"
			+ "\u0608\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060e\5d\63\2\u060a\u060b\7\7"
			+ "\2\2\u060b\u060d\5d\63\2\u060c\u060a\3\2\2\2\u060d\u0610\3\2\2\2\u060e"
			+ "\u060c\3\2\2\2\u060e\u060f\3\2\2\2\u060f\u061d\3\2\2\2\u0610\u060e\3\2"
			+ "\2\2\u0611\u061b\7M\2\2\u0612\u0617\5f\64\2\u0613\u0614\7\7\2\2\u0614"
			+ "\u0616\5f\64\2\u0615\u0613\3\2\2\2\u0616\u0619\3\2\2\2\u0617\u0615\3\2"
			+ "\2\2\u0617\u0618\3\2\2\2\u0618\u061c\3\2\2\2\u0619\u0617\3\2\2\2\u061a"
			+ "\u061c\5h\65\2\u061b\u0612\3\2\2\2\u061b\u061a\3\2\2\2\u061c\u061e\3\2"
			+ "\2\2\u061d\u0611\3\2\2\2\u061d\u061e\3\2\2\2\u061e\u0621\3\2\2\2\u061f"
			+ "\u0620\7\u0094\2\2\u0620\u0622\5P)\2\u0621\u061f\3\2\2\2\u0621\u0622\3"
			+ "\2\2\2\u0622\u0631\3\2\2\2\u0623\u0624\7P\2\2\u0624\u0625\7*\2\2\u0625"
			+ "\u062a\5P)\2\u0626\u0627\7\7\2\2\u0627\u0629\5P)\2\u0628\u0626\3\2\2\2"
			+ "\u0629\u062c\3\2\2\2\u062a\u0628\3\2\2\2\u062a\u062b\3\2\2\2\u062b\u062f"
			+ "\3\2\2\2\u062c\u062a\3\2\2\2\u062d\u062e\7Q\2\2\u062e\u0630\5P)\2\u062f"
			+ "\u062d\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\3\2\2\2\u0631\u0623\3\2"
			+ "\2\2\u0631\u0632\3\2\2\2\u0632\u0650\3\2\2\2\u0633\u0634\7\u0090\2\2\u0634"
			+ "\u0635\7\5\2\2\u0635\u063a\5P)\2\u0636\u0637\7\7\2\2\u0637\u0639\5P)\2"
			+ "\u0638\u0636\3\2\2\2\u0639\u063c\3\2\2\2\u063a\u0638\3\2\2\2\u063a\u063b"
			+ "\3\2\2\2\u063b\u063d\3\2\2\2\u063c\u063a\3\2\2\2\u063d\u064c\7\6\2\2\u063e"
			+ "\u063f\7\7\2\2\u063f\u0640\7\5\2\2\u0640\u0645\5P)\2\u0641\u0642\7\7\2"
			+ "\2\u0642\u0644\5P)\2\u0643\u0641\3\2\2\2\u0644\u0647\3\2\2\2\u0645\u0643"
			+ "\3\2\2\2\u0645\u0646\3\2\2\2\u0646\u0648\3\2\2\2\u0647\u0645\3\2\2\2\u0648"
			+ "\u0649\7\6\2\2\u0649\u064b\3\2\2\2\u064a\u063e\3\2\2\2\u064b\u064e\3\2"
			+ "\2\2\u064c\u064a\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u0650\3\2\2\2\u064e"
			+ "\u064c\3\2\2\2\u064f\u0605\3\2\2\2\u064f\u0633\3\2\2\2\u0650o\3\2\2\2"
			+ "\u0651\u0657\7\u008b\2\2\u0652\u0653\7\u008b\2\2\u0653\u0657\7\37\2\2"
			+ "\u0654\u0657\7\\\2\2\u0655\u0657\7F\2\2\u0656\u0651\3\2\2\2\u0656\u0652"
			+ "\3\2\2\2\u0656\u0654\3\2\2\2\u0656\u0655\3\2\2\2\u0657q\3\2\2\2\u0658"
			+ "\u0664\5\u0088E\2\u0659\u065a\7\5\2\2\u065a\u065f\5\u008eH\2\u065b\u065c"
			+ "\7\7\2\2\u065c\u065e\5\u008eH\2\u065d\u065b\3\2\2\2\u065e\u0661\3\2\2"
			+ "\2\u065f\u065d\3\2\2\2\u065f\u0660\3\2\2\2\u0660\u0662\3\2\2\2\u0661\u065f"
			+ "\3\2\2\2\u0662\u0663\7\6\2\2\u0663\u0665\3\2\2\2\u0664\u0659\3\2\2\2\u0664"
			+ "\u0665\3\2\2\2\u0665s\3\2\2\2\u0666\u0668\t\f\2\2\u0667\u0666\3\2\2\2"
			+ "\u0667\u0668\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066a\7\u0098\2\2\u066a"
			+ "u\3\2\2\2\u066b\u066c\t\r\2\2\u066cw\3\2\2\2\u066d\u066e\t\16\2\2\u066e"
			+ "y\3\2\2\2\u066f\u0685\7\r\2\2\u0670\u0685\t\17\2\2\u0671\u0685\t\f\2\2"
			+ "\u0672\u0685\t\20\2\2\u0673\u0685\t\21\2\2\u0674\u0681\7\b\2\2\u0675\u0681"
			+ "\7\30\2\2\u0676\u0681\7\31\2\2\u0677\u0681\7\32\2\2\u0678\u0681\7^\2\2"
			+ "\u0679\u067a\7^\2\2\u067a\u0681\7h\2\2\u067b\u0681\7U\2\2\u067c\u0681"
			+ "\7c\2\2\u067d\u0681\7O\2\2\u067e\u0681\7e\2\2\u067f\u0681\7x\2\2\u0680"
			+ "\u0674\3\2\2\2\u0680\u0675\3\2\2\2\u0680\u0676\3\2\2\2\u0680\u0677\3\2"
			+ "\2\2\u0680\u0678\3\2\2\2\u0680\u0679\3\2\2\2\u0680\u067b\3\2\2\2\u0680"
			+ "\u067c\3\2\2\2\u0680\u067d\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u067f\3\2"
			+ "\2\2\u0681\u0685\3\2\2\2\u0682\u0685\7\"\2\2\u0683\u0685\7n\2\2\u0684"
			+ "\u066f\3\2\2\2\u0684\u0670\3\2\2\2\u0684\u0671\3\2\2\2\u0684\u0672\3\2"
			+ "\2\2\u0684\u0673\3\2\2\2\u0684\u0680\3\2\2\2\u0684\u0682\3\2\2\2\u0684"
			+ "\u0683\3\2\2\2\u0685{\3\2\2\2\u0686\u0687\7\u009a\2\2\u0687}\3\2\2\2\u0688"
			+ "\u068b\5P)\2\u0689\u068b\5H%\2\u068a\u0688\3\2\2\2\u068a\u0689\3\2\2\2"
			+ "\u068b\177\3\2\2\2\u068c\u068d\t\22\2\2\u068d\u0081\3\2\2\2\u068e\u068f"
			+ "\t\23\2\2\u068f\u0083\3\2\2\2\u0690\u0691\5\u00a4S\2\u0691\u0085\3\2\2"
			+ "\2\u0692\u0693\5\u00a4S\2\u0693\u0087\3\2\2\2\u0694\u0695\5\u00a4S\2\u0695"
			+ "\u0089\3\2\2\2\u0696\u0697\5\u00a4S\2\u0697\u008b\3\2\2\2\u0698\u0699"
			+ "\5\u00a4S\2\u0699\u008d\3\2\2\2\u069a\u069b\5\u00a4S\2\u069b\u008f\3\2"
			+ "\2\2\u069c\u069d\5\u00a4S\2\u069d\u0091\3\2\2\2\u069e\u069f\5\u00a4S\2"
			+ "\u069f\u0093\3\2\2\2\u06a0\u06a1\5\u00a4S\2\u06a1\u0095\3\2\2\2\u06a2"
			+ "\u06a3\5\u00a4S\2\u06a3\u0097\3\2\2\2\u06a4\u06a5\5\u00a4S\2\u06a5\u0099"
			+ "\3\2\2\2\u06a6\u06a7\5\u00a4S\2\u06a7\u009b\3\2\2\2\u06a8\u06a9\5\u00a4"
			+ "S\2\u06a9\u009d\3\2\2\2\u06aa\u06ab\5\u00a4S\2\u06ab\u009f\3\2\2\2\u06ac"
			+ "\u06ad\5\u00a4S\2\u06ad\u00a1\3\2\2\2\u06ae\u06af\5\u00a4S\2\u06af\u00a3"
			+ "\3\2\2\2\u06b0\u06b8\7\u0097\2\2\u06b1\u06b8\5\u0082B\2\u06b2\u06b8\7"
			+ "\u009a\2\2\u06b3\u06b4\7\5\2\2\u06b4\u06b5\5\u00a4S\2\u06b5\u06b6\7\6"
			+ "\2\2\u06b6\u06b8\3\2\2\2\u06b7\u06b0\3\2\2\2\u06b7\u06b1\3\2\2\2\u06b7"
			+ "\u06b2\3\2\2\2\u06b7\u06b3\3\2\2\2\u06b8\u00a5\3\2\2\2\u00f7\u00a8\u00aa"
			+ "\u00b5\u00bc\u00c1\u00c7\u00cd\u00cf\u00ef\u00f6\u00fe\u0101\u010a\u010e"
			+ "\u0116\u011a\u011c\u0121\u0123\u0127\u012e\u0131\u0136\u013a\u013f\u0148"
			+ "\u014b\u0151\u0153\u0157\u015d\u0162\u016d\u0173\u0177\u017d\u0182\u018b"
			+ "\u0192\u0198\u019c\u01a0\u01a6\u01ab\u01b2\u01bd\u01c0\u01c2\u01c8\u01ce"
			+ "\u01d2\u01d9\u01df\u01e5\u01eb\u01f0\u01fc\u0201\u020c\u0211\u0214\u021b"
			+ "\u021e\u0225\u022e\u0231\u0237\u0239\u023d\u0245\u024a\u0252\u0257\u025f"
			+ "\u0264\u026c\u0271\u0277\u027e\u0281\u0289\u0293\u0296\u029c\u029e\u02a1"
			+ "\u02b4\u02ba\u02c3\u02c8\u02d1\u02dc\u02e3\u02e9\u02ef\u02f8\u02ff\u0303"
			+ "\u0305\u0309\u0310\u0312\u0316\u0319\u0320\u0327\u032a\u0334\u0337\u033d"
			+ "\u033f\u0343\u034a\u034d\u0355\u035f\u0362\u0368\u036a\u036e\u0375\u037e"
			+ "\u0382\u0384\u0388\u0391\u0396\u0398\u03a1\u03ac\u03b3\u03b6\u03b9\u03c6"
			+ "\u03d4\u03d9\u03dc\u03e9\u03f7\u03fc\u0405\u0408\u040e\u0410\u0416\u041b"
			+ "\u0421\u042d\u0431\u0436\u043a\u043d\u044f\u0454\u0459\u0464\u0469\u046f"
			+ "\u0476\u047a\u048a\u048d\u0495\u049e\u04a2\u04a7\u04b0\u04b5\u04c1\u04c7"
			+ "\u04ce\u04d2\u04dc\u04df\u04e5\u04e8\u04ea\u04ec\u04f7\u04fc\u0508\u050c"
			+ "\u0510\u0514\u051b\u051d\u0525\u052c\u052f\u0533\u0538\u0540\u0553\u0559"
			+ "\u055d\u056d\u0573\u057b\u0580\u0583\u0588\u0591\u0596\u05a4\u05a7\u05a9"
			+ "\u05ae\u05b2\u05b5\u05bc\u05c4\u05c8\u05cc\u05cf\u05d5\u05d8\u05da\u05e3"
			+ "\u05e8\u05ec\u05f0\u05f3\u05fe\u0603\u0607\u060e\u0617\u061b\u061d\u0621"
			+ "\u062a\u062f\u0631\u063a\u0645\u064c\u064f\u0656\u065f\u0664\u0667\u0680"
			+ "\u0684\u068a\u06b7";
	public static final ATN _ATN = new ATNDeserializer()
			.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}