package collections;
import java.util.*;
public class stack {
public static void main(String[] args) {
Stack<Integer> stack=new Stack<>();
//	LinkedList<Integer> stack=new LinkedList<>();
stack.push(0);
stack.push(1);
stack.push(2);
stack.push(4);
stack.pop();
System.out.println(stack);
System.out.println(stack.peek());
System.out.println(stack.isEmpty());
//   "Stack.search(2)" doesn't work for stack created using linked list

System.out.println(stack.search(2));


}
}