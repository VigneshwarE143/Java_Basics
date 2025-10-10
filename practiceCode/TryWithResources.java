package practiceCode;
import java.io.*;
import java.util.*;
public class TryWithResources {
	public static void main(String[] args)throws IOException{

try(Scanner Reader=new Scanner(new File("files.txt"));
	PrintWriter Writer= new PrintWriter(new File("Files2.txt")))
{
	while(Reader.hasNextLine()) {
		Writer.println(Reader.nextLine());
}
	System.out.println("executed successfully");
}
}
}