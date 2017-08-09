package TestSample;

public class Pali {

	public boolean checkPali(int n) {
		int r; // remainder
		int rev = 0; // reverse
		int num = n; // original number

		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		} // quotient is iterated

		// compare the original number with the reverse
		if (num == rev)
			return true;
		else
			return false;
	}
}