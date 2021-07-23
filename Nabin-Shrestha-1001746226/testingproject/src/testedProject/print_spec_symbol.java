package testedProject;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class print_spec_symbol {

	ByteArrayOutputStream consolP = new ByteArrayOutputStream();
	PrintStream sout = System.out;
        
    @Before
	public void setUp() {
	    System.setOut(new PrintStream(consolP));
	   	}

	@After
	public void tearDown() {
	    System.setOut(sout);
	   	} 

	@Test 
	public void test1() {
		Printtokens.print_spec_symbol("(");
		assertEquals("lparen.\n", consolP.toString());
	}
	
	@Test 
	public void test2() {
		Printtokens.print_spec_symbol(")");
		assertEquals("rparen.\n", consolP.toString());
	}
	@Test 
	public void test3() {
		Printtokens.print_spec_symbol("[");
		assertEquals("lsquare.\n", consolP.toString());
	}
	
	@Test 
	public void test4() {
		Printtokens.print_spec_symbol("]");
		assertEquals("rsquare.\n", consolP.toString());
	}
	
	@Test 
	public void test5() {
		Printtokens.print_spec_symbol("'");
		assertEquals("quote.\n", consolP.toString());
	}
	@Test 
	public void test6() {
		Printtokens.print_spec_symbol("`");
		assertEquals("bquote.\n", consolP.toString());
	}	

}
