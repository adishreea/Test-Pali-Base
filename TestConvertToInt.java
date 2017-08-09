package TestSample;

import static org.junit.Assert.*;

public class TestConvertToInt {
	Base b = new Base();

	@org.junit.Before
	public void initialize() {
		b.r.add(1);
		b.r.add(3);
		b.r.add(0);
		// the arraylist contains [1,3,0]
	}

	@org.junit.Test
	public void testConvertToInt() {
		int result = b.convertToInt(b.r);
		// assertEquals(Integer.parseInt("130"), result);
		// test case runs with no errors

		assertEquals(Integer.parseInt("132"), result);
		// test case fails
	}
}
