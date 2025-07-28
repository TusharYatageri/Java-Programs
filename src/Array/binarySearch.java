package Array;
import java.util.Arrays;
public class binarySearch {
	public static int b_search(int[] arr, int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]== key) {
				return mid;
			}
			else if(key>arr[mid]) {
				low=mid-1;
			}
			else {
				high=mid-1;
				}
			}
	return-1;
}
public static void main(String[] args) {
	int key=50;
	int [] arr= {10,20,30,40,50,60,70,80,90,100};
	int res= b_search(arr, key);
	System.out.println("Binary Search");
	System.out.println(res);
}
}
