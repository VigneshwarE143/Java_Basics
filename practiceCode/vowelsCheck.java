package practiceCode;

import java.util.Arrays;
import java.util.Scanner;

public class vowelsCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		// String s="string are Checked Here to either they have Vowles or not in there
		// words";
		char[] a = s.toLowerCase().toCharArray();
		String v = "aeiou";
		char[] b = v.toCharArray();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i] + " at the index " + i);
					count++;
					break;
				}
			}
		}
		System.out.println("Total count of vowels : " + count);
		sc.close();
	}
}
