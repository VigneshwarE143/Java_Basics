package java8features;
import java.util.*;
public class MethodReference {
public static void main(String[] args) {
	String[] names= {"one","two","three","four"};
Arrays.stream(names).forEach(System.out::println);	
}
}


