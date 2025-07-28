package Array;
import java.util.*;
//Write a program to implement binary search when the array is sorted in descending order
//Hint:- Time complexity:  (n/2*power*k=1)
//							n=2*power*k
//							apply log on B.S
//							log*base*2(n)=k log *base*2 (2)
//							[ K=log *base*2(n) ]

public class bimaryDescending {
	public static int b_search(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]== key) {
				return mid;
			}
			else if(key<arr[mid]) {
				low=mid-1;
			}
			else {
				high=mid-1;
				}
			}
	return-1;
}
public static void main(String[] args) {
	int key=40;
	int [] arr= {100,80,40,20,10};
	int res= b_search(arr, key);
	System.out.println("Linear Search");
	System.out.println(res);
}
}