package practiceCode;
import java.io.*;
public class ExceptionHandling {
public static void main(String[] args) {
	try {
		int a=2/0;
		System.out.println(a);
	}catch(Exception e) {
//		System.out.println(e);
//		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}
}
}
