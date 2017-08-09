package TestSample;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TestDecToBase {

	@Test
	public void testDecToNBase() {
		Base b = new Base();
		b.decToNBase(5);
		List<Integer> list = b.r;
		String result = "";
		for(int s: list){
			result += s;
		}
		
		assertEquals("101", result);
		// test case runs with no errors

		//assertEquals("111", result);
		// test case fails
	}

}
