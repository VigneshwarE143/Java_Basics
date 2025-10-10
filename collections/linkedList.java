package collections;
import java.util.*;
public class linkedList {
public static void main(String[] args) {
	LinkedList<String> list=new LinkedList<>();
	list.add("2");
	list.add("3");
	list.addFirst("1");
	list.addLast("0");
	list.add(3,"4");
	System.out.println(list);
	list.remove("1");
	System.out.println(list);
	list.removeLast();
	System.out.println(list);
	list.removeFirst();

	System.out.println(list);
	list.set(0,"100");
System.out.println(list);
}
}
