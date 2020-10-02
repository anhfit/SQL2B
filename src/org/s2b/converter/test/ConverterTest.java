package org.s2b.converter.test;

import java.io.FileInputStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.misc.TestRig;
import org.s2b.analyzer.sqlite.*;
import org.s2b.converter.SQLiteExtractor;

public class ConverterTest {
	public static final String testFile = "./res/tests/test0.sql";

	public static void main(String[] args) throws Exception {
		ANTLRInputStream is;
		try (FileInputStream fis = new FileInputStream(testFile)) {
			is = new ANTLRInputStream(fis);
		} catch (Exception e) {
			System.out.println("File not found.");
			is = new ANTLRInputStream(System.in);
		}

		SQLiteLexer lexer = new SQLiteLexer(is);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SQLiteParser parser = new SQLiteParser(tokens);

		SQLiteExtractor extractor = new SQLiteExtractor();
		// ParseTree tree = parser.start_parsing_point(); // parse is start
		// state.
		ParseTreeWalker.DEFAULT.walk(extractor, parser.parsing_point());

		TestRig rig = new TestRig(new String[] {
				"org.s2b.analyzer.sqlite.SQLite", "parsing_point", "-gui",
				testFile });
		rig.process();

		extractor.getProject().save();
	}
}
