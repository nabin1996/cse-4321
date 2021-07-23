package testedProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class is_identifier_test {

	@Test
	public void test1() {
		boolean boo = Printtokens.is_identifier("1a");
		assertEquals(false, boo);
	}
	@Test
	public void test2() {
		boolean boo = Printtokens.is_identifier("a1#");
		assertEquals(false, boo);
	}
	@Test
	public void test3() {
		boolean boo = Printtokens.is_identifier("aa1");
		assertEquals(true, boo);
	}

}
