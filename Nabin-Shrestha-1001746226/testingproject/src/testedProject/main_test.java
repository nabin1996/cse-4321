package testedProject;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class main_test {
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
	public void test1() throws IOException{
		String args[] = {"C:\\Users\\sopni\\eclipse-workspace\\testingproject/test.txt"};
		Printtokens.main(args);
		assertEquals("keyword,\"and\".\nidentifier,\"j\".\nbquote.\nerror,\"112A\".\n", consolP.toString());		
	}
	

}
