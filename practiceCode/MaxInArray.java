package practiceCode;

import java.util.Arrays;
import java.util.Scanner;

public class MaxInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);
		int a = array.length - 1;
		System.out.println("largest value in the array :" + array[a]);
		System.out.println("smallest value in the array:" + array[0]);
		sc.close();
	}
}
