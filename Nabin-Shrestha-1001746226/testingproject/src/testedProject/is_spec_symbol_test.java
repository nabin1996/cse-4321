package testedProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class is_spec_symbol_test {

	@Test
	public void test1() {
		boolean boo = Printtokens.is_spec_symbol('(');
		assertEquals(true, boo);
	}
	
	@Test
	public void test2() {
		boolean boo = Printtokens.is_spec_symbol(')');
		assertEquals(true, boo);
	}
	
	@Test
	public void test3() {
		boolean boo = Printtokens.is_spec_symbol('[');
		assertEquals(true, boo);
	}
	
	@Test
	public void test4() {
		boolean boo = Printtokens.is_spec_symbol(']');
		assertEquals(true, boo);
	}
	
	@Test
	public void test5() {
		boolean boo = Printtokens.is_spec_symbol('/');
		assertEquals(false, boo);
	}
	
	@Test
	public void test6() {
		boolean boo = Printtokens.is_spec_symbol('`');
		assertEquals(true, boo);
	}
	
	@Test
	public void test7() {
		boolean boo = Printtokens.is_spec_symbol(',');
		assertEquals(true, boo);
	}
	
	@Test
	public void test8() {
		boolean boo = Printtokens.is_spec_symbol('?');
		assertEquals(false, boo);
	}
	

}
