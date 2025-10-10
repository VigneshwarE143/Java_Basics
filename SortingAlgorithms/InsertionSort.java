package SortingAlgorithms;

public class InsertionSort {
public static  void sort(int[] array){
	int n= array.length;
	for(int i=1;i<n;i++) {
		int current=array[i];
		int j=i-1;
		while( j>=0 && array[j]> current){
			array[j+1] =array[j];
			j--;
		}
		array[j+1]=current;
	}
}
public static void main(String[] args) {
	int [] arr= {6,7,9,1,13,14,6,5,4,3};
	sort(arr);
	for(int values:arr ) {
	System.out.print(" "+values);}
}
}

