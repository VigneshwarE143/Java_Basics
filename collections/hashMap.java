package collections;
import java.util.*;
public class hashMap {
public static void main(String[] args) {
	HashMap<Integer,String> map=new HashMap<>();
	// not sorted unlike tree map
	Scanner sc=new Scanner(System.in);
	System.out.println("enter size:");
    int size =sc.nextInt();
	//takes up the entire line
	sc.nextLine();
	for(int i=1;i<=size;i++) {
		System.out.print("enter key:");
		int key=sc.nextInt();
		//takes up the entire line
		sc.nextLine();
		System.out.print("enter value for  "+key+" key :");
		String value=sc.nextLine();
		map.put(key,value);
		  
	}
	sc.close();
	System.out.println(map.get(1));
	System.out.println(map.keySet());
	System.out.println(map);
	System.out.println(map.values());
	
	
}
}
