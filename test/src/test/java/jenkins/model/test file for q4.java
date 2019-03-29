package jenkins.model;
import static org.junit.Assert.*;

import org.junit.Test;

public class mp3_q4Test {


	@Test 
	public void testidFromFilename()
	   {
		String Testin = "abdc5";
		IdStrategy.CaseSensitive TestObj = new IdStrategy.CaseSensitive();
		assertEquals(TestObj.idFromFilename(Testin), Testin);
	   }

	@Test
	public void testidFromFilenameToo(){

		String Testin = "abc$123";
		String Outcome = "abc";
		IdStrategy.CaseSensitive TestObj = new IdStrategy.CaseSensitive();
		assertEquals(TestObj.idFromFilename(Testin), Outcome); 

	}
}
