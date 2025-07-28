package Array;
import java.util.*;
//Write a program to implement merge sort 

public class mergeSort2 {
	public static int [] merge(int[]arr1, int[]arr2, int[]res) {
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			}
			else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			res[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			res[k] = arr2[j];
			j++;
			k++;
		}
		return res;	
	}
	// Method to divide array
		public static int [] divide(int [] arr) {
			if(arr.length==1) {
				return arr;
			}
			int mid = arr.length/2;
			int [] left = new int [mid];
			int [] right = new int [arr.length-mid];
			
		for (int i=0; i<mid; i++) {
			left[i]=arr[i];
		}
		for (int i=mid; i<arr.length; i++) {
			right[i-mid] = arr[i];
		}
		left = divide(left);
		right = divide(right);
		
		return merge(left, right, arr);
		}
public static void main(String[] args) {
	int [] arr = {1,4,2,6,3,5,7};
	int [] res = divide(arr);
	System.out.println(Arrays.toString(res));
}
}
