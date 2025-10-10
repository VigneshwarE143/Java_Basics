package collections;
import java.util.*;
public class queue {
public static void main(String[] args) {
	Queue<String> queue=new LinkedList<>();
	queue.add("first5");	
	queue.offer("first2");
	queue.offer("first3");
	queue.add("first4");
	System.out.println(queue);
	//give first element
	System.out.println(queue.peek());
	//give first element and delete it
	System.out.println(queue.poll());
	System.out.println(queue.peek());
	

}
}

