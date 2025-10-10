package practiceCode;
import java.io.File;
import java.util.*;
import java.io.IOException;
public class CreateFile {
	public static void main(String[] args) {
	File obj=new File("C:\\Users\\nithi\\Desktop\\java notes\\files.txt");
	try {
		if(obj.createNewFile()) {
			System.out.println("file is created");
			System.out.println("file name is:" +obj.getName());
		}else {
			System.out.println("file already created");
		}
	}
	catch(IOException e) {
		System.out.println("error occurred");
		e.printStackTrace();
		
	}

}}
