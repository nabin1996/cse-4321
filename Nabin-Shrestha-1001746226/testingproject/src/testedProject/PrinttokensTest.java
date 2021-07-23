package testedProject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;


class PrinttokensTest {

	@Test
	void testOpen_character_stream_1() {
		Printtokens ocs1 = new Printtokens();
		BufferedReader actual = ocs1.open_character_stream(null);
		assertNotNull(actual);
	}
	
	@Test
	void testOpen_character_stream_2() {
		Printtokens ocs2 = new Printtokens();
		BufferedReader actual = ocs2.open_character_stream("C:\\Users\\sopni\\eclipse-workspace\\testingproject\\test.txt");
		assertNotNull(actual);
	}
//..................
	@Test
	void testOpen_token_stream_1() {
		Printtokens ots1 = new Printtokens();
		BufferedReader actual = ots1.open_token_stream(null);
		assertNotNull(actual);
	}
	@Test
	void testOpen_token_stream_2() {
		Printtokens ots2 = new Printtokens();
		BufferedReader actual = ots2.open_token_stream("C:\\Users\\sopni\\eclipse-workspace\\testingproject\\test.txt");
		assertNotNull(actual);
	}
	//..................
	@Test
	void testIs_token_end_1() {
		boolean actual = Printtokens.is_token_end(0,60);
		assertFalse(actual);
	}
	@Test
	void testIs_token_end_2() {
		boolean actual = Printtokens.is_token_end(0,59);
		assertTrue(actual);
	}
	@Test
	void testIs_token_end_3() {
		boolean actual = Printtokens.is_token_end(0,44);
		assertTrue(actual);
	}
	@Test
	void testIs_token_end_4() {
		boolean actual = Printtokens.is_token_end(2,59);
		assertFalse(actual);
	}
	@Test
	void testIs_token_end_5() {
		boolean actual = Printtokens.is_token_end(2,10);
		assertTrue(actual);
	}
	//..................
	@Test
	void testToken_type_1() {
		int actual = Printtokens.token_type("$321xy");
		assertEquals(0,actual);
	}
	@Test
	void testToken_type_2() {
		int actual = Printtokens.token_type(";56xy");
		assertEquals(5,actual);
	}
	@Test
	void testToken_type_3() {
		int actual = Printtokens.token_type("#a");
		assertEquals(43,actual);
	}
	@Test
	void testToken_type_4() {
		int actual = Printtokens.token_type("\"azd\"");
		assertEquals(42,actual);
	}
	@Test
	void testToken_type_5() {
		int actual = Printtokens.token_type("$567");
		assertEquals(41,actual);
	}
	
//........................
	@Test
	void testIs_comment_1() {
		boolean actual = Printtokens.is_comment(";12ab");
		assertTrue(actual);
	}
	@Test
	void testIs_comment_2() {
		boolean actual = Printtokens.is_comment("12ab");
		assertFalse(actual);
	}
//...................................
	@Test
	void testIs_keyword_1() {
		boolean actual = Printtokens.is_keyword("=>");
		assertTrue(actual);
	}
	@Test
	void testIs_keyword_2() {
		boolean actual = Printtokens.is_keyword("not");
		assertFalse(actual);
	}
//..............................................
	@Test
	void testIs_char_constant_1() {
		boolean actual = Printtokens.is_char_constant("#a");
		assertTrue(actual);
	}
	@Test
	void testIs_char_constant_2() {
		boolean actual = Printtokens.is_char_constant("#ab");
		assertFalse(actual);
	}
	//...........................
	@Test
	void testIs_num_constant_1() {
		boolean actual = Printtokens.is_num_constant("5a5a");
		assertFalse(actual);
	}
	@Test
	void testIs_num_constant_2() {
		boolean actual = Printtokens.is_num_constant("567\0");
		assertTrue(actual);
	}
	@Test
	void testIs_num_constant_3() {
		boolean actual = Printtokens.is_num_constant("9");
		assertTrue(actual);
	} 
		
	@Test
	void testIs_num_constant_4() {
		boolean actual = Printtokens.is_num_constant("99a");
		assertFalse(actual); 
	}
			
	@Test
	void testIs_num_constant_5() {
		boolean actual = Printtokens.is_num_constant("a99");
		assertTrue(actual);  
		}
	//....................................
	@Test
	void testIs_str_constant_1() {
		boolean actual = Printtokens.is_str_constant("xy\0");
		assertFalse(actual);  	
	}
	
	@Test
	void testIs_str_constant_2() {
		boolean actual = Printtokens.is_str_constant("x");
		assertFalse(actual);  
	}
	@Test
	void testIs_str_constant_3() {	
		boolean actual = Printtokens.is_str_constant("xx");
		assertFalse(actual); 
	}
	

}
