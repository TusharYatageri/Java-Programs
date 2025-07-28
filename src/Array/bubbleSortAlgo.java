package Array;

import java.util.Arrays;

//write a program to implement bubble sort algorithm
public class bubbleSortAlgo {
	public static void bubble_sort(int [] arr) {
	for (int i=0; i<arr.length-1; i++) {
		for (int j=0; j<arr.length-1; j++) {
		if(arr[j]>arr[j+1]) {
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
			// Add S.o.p here to see how many steps it took to sort.
				}
			}
		}
	System.out.println(Arrays.toString(arr));
	}
public static void main(String[] args) {
	int [] arr= {100,72,29,12,40};
	bubble_sort(arr);
	}
}
