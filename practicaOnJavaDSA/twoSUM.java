package practicaOnJavaDSA;
import java.util.*;
public class twoSUM {

	public static int[] twoSum(int nums[],int target) {
		  Map<Integer,Integer> map=new HashMap<>();
		     for (int i=0;i<nums.length;i++){
		        int compliment = target-nums[i];
		        if(map.containsKey(compliment)){
		            return new int[]{map.get(compliment),i};

		        }
		        map.put(nums[i],i);
		     }    
		return new int[] {};
			
		}
		
	public static void main(String[] args) {
		int arr[] = { 2, 7, 11, 15 };
		int target = 9;
		int result[] = twoSum(arr, target);
		System.out.println(Arrays.toString(result));
	}
}
