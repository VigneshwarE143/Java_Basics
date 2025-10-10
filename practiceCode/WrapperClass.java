package practiceCode;

public class WrapperClass {
	public static void main(String[] args) {
		// Wrapper class contains a data type as "object"

		// auto-boxing: primitive data types to Wrapper class
		int a = 10;
		Integer b = a;
		System.out.println(b);
		// un-boxing : Wrapper class to primitive data
		Integer c = 11;
		int d = c;
		System.out.println(d);
	}

}
