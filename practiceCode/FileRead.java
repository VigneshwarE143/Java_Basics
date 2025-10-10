package practiceCode;
import java.util.*;
import java.io.*;
public class FileRead {
public static void main(String[] args) {
	try {
	File obj=new File("C:\\Users\\nithi\\Desktop\\java notes\\files.txt");
	Scanner MyReader=new Scanner(obj);
	while(MyReader.hasNextLine()){
		String data=MyReader.nextLine();
		System.out.println(data);
	}
	

	} catch (Exception e) {
		
		e.printStackTrace();
	}
	finally {
		System.out.println("program is executed successfully");
	}
	
}}