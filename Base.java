package TestSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Base {
	int base;
	int q; // quotient
	List<Integer> r = new ArrayList<Integer>(); // remainder

	// default constructor
	Base() {
		base = 2;
	}

	// parameterized constructor
	Base(int n) {
		base = n;
	}

	// recursive loop
	public void decToNBase(int n) {
		q = n / base;
		if (q == 0) {
			r.add(n % base);
		} else {
			r.add(n % base);
			decToNBase(q);
		}
	}

	public List<Integer> revNBase() {
		Collections.reverse(r);
		return r;
	}

	public int convertToInt(List<Integer> list) {
		String res = "";
		for (int i = 0; i < list.size(); i++) {
			res += list.get(i);
		}
		res = res.trim(); // remove whitespaces
		int n = Integer.parseInt(res); // convert string to int
		return n;
	}
}