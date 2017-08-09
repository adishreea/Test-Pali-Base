package TestSample;

import static org.junit.Assert.*;

public class TestPali {

	@org.junit.Test
	public void testCheckPali() {
		Pali p = new Pali();
		// check if 100 is a palindrome
		boolean result = p.checkPali(100);

		// 100 is not a palindrome
		// so the result should be false

		assertFalse(result);
		// test case runs with no errors

		// assertTrue(result);
		// test case fails
	}

}
