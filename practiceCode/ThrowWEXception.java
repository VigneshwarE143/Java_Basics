package practiceCode;
import java.io.*;
public class ThrowWEXception {
	public static void dividedbyzero() {
		throw new ArithmeticException("trying to divide by zero");
	}
public static void main(String[] args) {
	dividedbyzero();
}
}
