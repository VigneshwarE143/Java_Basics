package practiceCode;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DeleteFile {
	public static void main(String[] args) {
		File obj=new File("C:\\Users\\nithi\\Desktop\\java notes\\files.txt");
		obj.delete();
//			if(obj.delete()) {
//				System.out.println("file is deleted");
//			}else {
//				System.err.println("already file is deleted");
//			}
//		
	}

}
