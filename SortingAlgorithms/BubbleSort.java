package SortingAlgorithms;

public class BubbleSort {
 public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 3,1,354,234,15,54,9947,983478,678346343,473734378,3636346,3,4,33,3,13324,3};
	   for (int i = 0; i < arr.length - 1; i++) {
	      for (int j = 0; j < arr.length - 1 - i; j++) {
	      if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	      }}}

	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }
}