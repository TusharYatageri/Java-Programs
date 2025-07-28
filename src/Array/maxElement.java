package Array;
// Write a program to find maximum element from given array
public class maxElement{
	public static void find_max (int[] arr) {
	int max=arr[0];
	for(int i=0;i<arr.length; i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
	System.out.println(max);
}
public static void main(String[] args) {
	int[] arr= {12,35,54,20,15,16};
	find_max(arr);
	}
}