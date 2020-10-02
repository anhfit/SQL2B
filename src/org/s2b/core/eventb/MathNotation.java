package org.s2b.core.eventb;

public class MathNotation {
	public static final MathNotation DEFAULT_INSTANCE = new MathNotation();

	// Identifiers
	public static final char SET_OF_NATURAL_NUMBERS = '\u2115';
	public static final String SET_OF_POSITIVE_NUMBERS = "\u2115\u0031";
	public static final char SET_OF_INTEGERS = '\u2124';
	public static final char POWERSET = '\u2119';
	public static final String SET_OF_NON_EMPTY_SUBSETS = "\u2119\u0031";

	/* Predicate symbols */

	// The tokens used in the pure predicate calculus are:
	public static final char LEFT_PARENTHESIS = '\u0028';
	public static final char RIGHT_PARENTHESIS = '\u0029';
	public static final char LOGICAL_EQUIVALENCE = '\u21D4';
	public static final char LOGICAL_IMPLICATION = '\u21D2';
	public static final char LOGICAL_AND = '\u2227';
	public static final char LOGICAL_OR = '\u2228';
	public static final char NOT_SIGN = '\u00AC';
	public static final char TRUE_PREDICATE = '\u22A4';
	public static final char FALSE_PREDICATE = '\u22A5';
	public static final char FOR_ALL = '\u2200';
	public static final char THERE_EXISTS = '\u2203';
	public static final char COMMA = '\u002C';
	public static final char MIDDLE_DOT = '\u00B7';

	// The symbolic tokens used to build predicates from expressions are:
	public static final char EQUALS_SIGN = '\u003D';
	public static final char NOT_EQUAL_TO = '\u2260';
	public static final char LESS_THAN_SIGN = '\u003C';
	public static final char LESS_THAN_OR_EQUAL_TO = '\u2264';
	public static final char GREATER_THAN_SIGN = '\u003E';
	public static final char GREATER_THAN_OR_EQUAL_TO = '\u2265';
	public static final char ELEMENT_OF = '\u2208';
	public static final char NOT_AN_ELEMENT_OF = '\u2209';
	public static final char SUBSET_OF = '\u2282';
	public static final char SUPERSET_OF = '\u2283'; // additional
	public static final char NOT_A_SUBSET_OF = '\u2284';
	public static final char NOT_A_SUPERSET_OF = '\u2285'; // additional
	public static final char SUBSET_OF_OR_EQUAL_TO = '\u2286';
	public static final char SUPERSET_OF_OR_EQUAL_TO = '\u2287'; // additional
	public static final char NEITHER_A_SUBSET_OF_NOR_EQUAL_TO = '\u2288';
	public static final char NEITHER_A_SUPERSET_OF_NOR_EQUAL_TO = '\u2289'; // additional

	/* Expression symbols */

	// Build sets of relations (or functions):
	public static final char RELATION = '\u2194';
	public static final char TOTAL_RELATION = '\uE100';
	public static final char SURJECTIVE_RELATION = '\uE101';
	public static final char TOTAL_SURJECTIVE_RELATION = '\uE102';
	public static final char PARTIAL_FUNCTION = '\u21F8';
	public static final char TOTAL_FUNCTION = '\u2192';
	public static final char PARTIAL_INJECTION = '\u2914';
	public static final char TOTAL_INJECTION = '\u21A3';
	public static final char PARTIAL_SURJECTION = '\u2900';
	public static final char TOTAL_SURJECTION = '\u21A0';
	public static final char BIJECTION = '\u2916';

	// Manipulating sets:
	public static final char LEFT_CURLY_BRACKET = '\u007B';
	public static final char RIGHT_CURLY_BRACKET = '\u007D';
	public static final char MAPLET = '\u21A6';
	public static final char EMPTY_SET = '\u2205';
	public static final char INTERSECTION = '\u2229';
	public static final char UNION = '\u222A';
	public static final char SET_MINUS = '\u2216';
	public static final char CARTESIAN_PRODUCT = '\u00D7'; // Multiplication

	// Manipulating relations and functions:
	public static final char LEFT_SQUARE_BRACKET = '\u005B';
	public static final char RIGHT_SQUARE_BRACKET = '\u005D';
	// maplet symbol also is in here
	public static final char RELATION_OVERRIDING = '\uE103';
	public static final char BACKWARD_COMPOSITION = '\u2218';
	public static final char FORWARD_COMPOSITION = '\u003B'; // Semicolon
	public static final char DIRECT_PRODUCT = '\u2297';
	public static final char PARALLEL_PRODUCT = '\u2225';
	public static final char TILDE_OPERATOR = '\u223C';
	public static final char DOMAIN_RESTRICTION = '\u25C1';
	public static final char DOMAIN_SUBTRACTION = '\u2A64';
	public static final char RANGE_RESTRICTION = '\u25B7';
	public static final char RANGE_SUBTRACTION = '\u2A65';

	// Quantified expressions:
	public static final char LAMBDA = '\u03BB';
	public static final char N_ARY_INTERSECTION = '\u22C2';
	public static final char N_ARY_UNION = '\u22C3';
	public static final char N_ARY_SUMMATION = '\u2211'; // additional
	public static final char N_ARY_PRODUCT = '\u220F'; // additional
	public static final char SUCH_THAT = '\u2223';

	// Arithmetic expressions:
	public static final char UPTO_OPERATOR = '\u2025';
	public static final char PLUS_SIGN = '\u002B';
	public static final char MINUS_SIGN = '\u2212';
	public static final char ASTERISK_OPERATOR = '\u2217';
	public static final char DIVISION_SIGN = '\u00F7';
	public static final char EXPONENTIATION_SIGN = '\u005E'; // Circumflex-Accent
	public static final char MULTIPLICATION_SIGN = '\u00D7'; // additional
	public static final char DIVISION_SLASH = '\u2215'; // additional
	public static final char FRACTION_SLASH = '\u2044'; // additional

	// Equal symbol:
	public static final char COLON_EQUALS = '\u2254';
	public static final String BECOMES_EQUAL = Character.toString(COLON_EQUALS);
	public static final String BECOMES_ELEMENT_OF = ":" + ELEMENT_OF;
	public static final String BECOMES_SUCH_THAT = ":|";

	// Additional
	public static final char VERTICAL_BAR = '\u007C';
	public static final char SOLIDUS = '\u002F';
	public static final char REVERSE_SOLIDUS = '\\';
	public static final char PLUS_MINUS_SIGN = '\u00B1';
	public static final char X = '\u0078';
}