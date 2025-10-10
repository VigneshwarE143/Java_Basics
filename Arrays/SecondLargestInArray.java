package Arrays;
import java.util.*;
public class SecondLargestInArray {
	static int secondlargest(int[] array){
		int n=array.length;
		Arrays.sort(array);
		for(int i=n-2;i>=0;i--){
			//here array loop is closed by return statement %%%%%%%%%%%%%%%%
			if(array[i]!= array[n-1]) {
				return array[i];
			}
		}
		return -1;
				
	}
	public static void main(String[] args) {
		int[] array= {4,1,7,9,2,9,8};
		System.out.println("second largest element in the array "+secondlargest(array));
	}

}
