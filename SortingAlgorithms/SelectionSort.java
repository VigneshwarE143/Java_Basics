package SortingAlgorithms;

public class SelectionSort {
	static void sort(int[] arr){
		 int n=arr.length;
		 for(int i=0;i<n-1;i++) {
			 int min=i;
			 for(int j=i+1;j<n-1;j++) {
				 if(arr[j] <arr[min]) {
					 min=j;
				 }
				 
			 }
			 int temp=arr[i];
			 arr[i]=arr[min];
			 arr[min]=temp;
		 }
	 }


public static void main(String[] args) {
	int [] arr= {6,7,9,1,13,14,6,5,4,3};
	sort(arr);
	for(int values:arr ) {
	System.out.print(" "+values);}
}
}