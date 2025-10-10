package practiceCode;
import java.io.FileWriter;
import java.util.*;
import java.io.IOException;
public class FileWriting {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String text=sc.nextLine();
	try {
	FileWriter obj=new FileWriter("C:\\Users\\nithi\\Desktop\\java notes\\files.txt");
	obj.write(text);
	System.out.println("sucessfully written");

	obj.close();
	
}catch(IOException e) {
	e.printStackTrace();
}
	}
}
