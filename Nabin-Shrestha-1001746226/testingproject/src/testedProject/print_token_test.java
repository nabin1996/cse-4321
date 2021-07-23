package testedProject;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class print_token_test {

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
		String s = "112A" ;
		Printtokens test = new Printtokens();
		test.print_token(s);
		assertEquals("error,\"112A\".\n", consolP.toString());
	}
	
	@Test
	public void test2() {
		String s = "and" ;
		Printtokens test = new Printtokens();
		test.print_token(s);
		assertEquals("keyword,\"and\".\n", consolP.toString());		
	}
	@Test
	public void test3() {
		String s = "(" ;
		Printtokens test = new Printtokens();
		test.print_token(s);
		assertEquals("lparen.\n", consolP.toString());	
	}
	
	
	@Test
	public void test4() {
		String s = "a" ;
		Printtokens test = new Printtokens();
		test.print_token(s);
		assertEquals("identifier,\"a\".\n", consolP.toString());	
	}
	
	@Test
	public void test5() {
		String s = "1" ;
		Printtokens test = new Printtokens();
		test.print_token(s);
		assertEquals("numeric,1.\n", consolP.toString());	
	}
	
	@Test
	public void test6() {
		String s = "#a" ;
		Printtokens test = new Printtokens();
		test.print_token(s);
		assertEquals("character,\"a\".\n", consolP.toString());	
	}
	
	

}
