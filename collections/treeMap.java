package collections;
import java.util.*;
public class treeMap {
public static void main(String[] args) {
	TreeMap<Integer,String> map=new TreeMap<>();
// sorted by keys
// sorted unlike hashmap
	map.put(1,"vickee");
	map.put(2,"sharath");
	map.put(3,"arun");
	map.put(4,"vikram");
	System.out.println(map.get(1));
	System.out.println(map.keySet());
	System.out.println(map);
	System.out.println(map.values());
	
	
}
}
