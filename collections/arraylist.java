package collections;
import java.util.*;
public class arraylist {
public static void main(String[] args) {
ArrayList<Integer> list=new ArrayList<>();
list.add(8);
list.add(19);
list.add(8);
list.add(8);
list.add(8);
list.remove(1);
list.set(0,3);


System.out.println(list.get(2));
System.out.println(list);
}
}
