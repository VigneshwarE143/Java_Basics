package practiceCode;

import java.util.*;

public class Palindrom {
	public static void CheckPolindrom(int num) {
		int org = num;
		int dig;
		int rev = 0;
		while (num > 0) {
			dig = num % 10;
			rev = rev * 10 + dig;
			num /= 10;
		}
		if (org == rev) {
			System.out.println("it is polinrom");
		} else {
			System.out.println("it is not");
		}

	}

	public static void main(String[] args) {

		CheckPolindrom(121);
	}

}
