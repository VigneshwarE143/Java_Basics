package java8features;
import java.util.Optional;
import java.io.*;

public class OptionalClass {
public static void main(String[] args) {
	try {
	String a=null;
	// in case of ******* "optional.of(throw exception);" ********
	Optional<String>name=Optional.ofNullable(a);
	System.out.println(name.orElse("Default name"));
}catch(Exception e) {
	e.printStackTrace();
}
	}
}