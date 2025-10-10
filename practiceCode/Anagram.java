package practiceCode;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static boolean checkAnagram(String s1, String s2) {

		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
//		if(Arrays.equals(a,b)){
//			System.out.println(s1 +"and"+"It is anagram");
//		}else {
//			System.out.println("not a anagram");
//		}
		return Arrays.equals(a, b);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println(checkAnagram(s1, s2) + " it is an anagram");

		sc.close();

	}

}
