package TestSample;

import java.util.List;

public class PaliBase {

	public static void main(String[] args) {
		int value; // int value of decimal converted to the specified base
		List<Integer> valueBase; // list value of decimal converted to the
									// specified base
		Pali p = new Pali();

		System.out.println("Decimal\t" + "Smallest Base for Palindrome");

		// loop to display the first 1000 positive decimal numbers
		// with the smallest base in which they are palindromes
		for (int i = 1; i <= 1000; i++) {
			System.out.print(i + "\t");
			for (int j = 2; j <= i + 2; j++) {
				Base b = new Base(j);

				// calculate the value of i in base j
				b.decToNBase(i);
				valueBase = b.revNBase();

				// convert list to int
				value = b.convertToInt(valueBase);

				// check for the smallest base which has a palindrome
				if (p.checkPali(value) == true) {
					System.out.println(j);
					break;
				}
			}
		}
	}
}