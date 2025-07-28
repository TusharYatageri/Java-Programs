package Array;
import java.util.*;
//Write a program to rotate array anti-clockwise 3800 times
public class rotateArr {
	public static void rotate_arr(int[] arr) {
	int temp=arr[0];
	for(int i=1; i<arr.length; i++){
	arr[i-1] = arr[i];
}
arr[arr.length-1]=temp;
}
	public static void main(String[] args) {
		int[]arr = {10,20,30,40,50,60};
		for(int i=1; i<=3800; i++){
		rotate_arr(arr);
	}
	System.out.print(Arrays.toString(arr));
	}
}