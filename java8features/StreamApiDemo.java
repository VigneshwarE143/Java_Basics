package java8features;
import java.util.Arrays;
import java.util.List;
public class StreamApiDemo {
public static void main(String[] args) {
	List<Integer> nums=Arrays.asList(1,2,4,6,9,10,12);
	int sum=nums.stream().filter(n->n%2==0).mapToInt(n->n).sum();
	System.out.println("sum of even num : "+sum);
}
}
