package practiceCode;
import java.io.*;
class ListOfnummbera{
	public int[] arr=new int[10];
	public void WriteaList() {
		try {
			arr[10]=11;
		}
		catch(NumberFormatException e1){
			System.out.println("number format exception :"+e1.getMessage());
		}
		
		catch(IndexOutOfBoundsException e2){
			System.out.println("number format exception :"+e2.getMessage());
		}
		
	}
}

public class MultipleCatch {
	public static void main(String[] args) {
		
	
ListOfnummbera obj =new ListOfnummbera();
obj.WriteaList();
}
}