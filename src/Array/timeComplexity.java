package Array;

import java.util.Arrays;

public class timeComplexity {
		public static void rotate_arr(int[] arr) {
		int temp=arr[0];
		for(int i=1; i<arr.length; i++){
		arr[i-1] = arr[i];
	}
	arr[arr.length-1]=temp;
	//Put S.o.p here to check how many times the array have been rotated
	}
		public static void main(String[] args) {
			int[]arr = {10,20,30,40,50,60};
			for(int i=1; i<=8%arr.length; i++){
			rotate_arr(arr);
		}
			System.out.println(Arrays.toString(arr));	
		}
	}
