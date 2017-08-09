package TestSample;

import java.util.List;
import static org.junit.Assert.*;

public class TestRev {
	Base b = new Base();

	@org.junit.Before
	public void initialize() {
		b.r.add(1);
		b.r.add(3);
		b.r.add(0);
		//the arraylist contains [1,3,0]
	}

	@org.junit.Test
	public void testRevNBase() {
		List<Integer> list = b.revNBase();
		String result = "";
		for(int s: list){
			result += s;
		}

		//assertEquals("031", result);
		// test case runs with no errors

		assertEquals("0322", result);
		// test case fails
	}
}
