package Array;

//Write a program to find sum of all the elements from the given array
public class sumArray {
	public static void find_sum (int[] arr) {
	int sum=arr[0];
	for(int i=0;i<arr.length; i++) {
			sum=sum+arr[i];
		}
	System.out.println(sum);
}
public static void main(String[] args) {
	int[] arr= {12,35,54,20,15,16};
	find_sum(arr);
	}
}