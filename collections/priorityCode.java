package collections;
import java.util.*;
public class priorityCode {
public static void main(String[] args) {
	PriorityQueue<Integer> queue=new PriorityQueue<>();
	//PriorityQueue by default stores smallest elements first (min-heap).
//poll() removes and returns the highest priority element (lowest value here).
	queue.add(7);	
	queue.offer(1);
	queue.offer(5);
	queue.add(4);
	System.out.println(queue);
	//give first element
	System.out.println(queue.peek());
	//give first element and delete it
	System.out.println(queue.poll());
	System.out.println(queue.peek());
	
	
}
}



