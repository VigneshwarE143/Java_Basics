package practiceCode;

import java.util.*;

public class StringMethods {
	public static void main(String[] args) {
		String x = "hello world I am vigneshwar";
		String y = "  hello";
		String z = "in";
		// char [] a=x.toCharArray();
		String[] a = x.split("");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println();
		System.out.println(y.trim());
		System.out.println(x.replace("hello", "new"));
		System.out.println(x.toLowerCase());
		System.out.println(x.toUpperCase());
		System.out.println(x.contains("hello"));
		System.out.println(x.substring(2, 7));
		System.out.println(z.equals(a));

	}
}
