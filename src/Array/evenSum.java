package Array;
//Write a program to find sum of all the elements which are present on even index

public class evenSum {
	public static void find_sum (int[] arr) {
	int sum=0;
	for(int i=0; i<arr.length; i++) {
		if(i%2==0) {
			sum=sum+arr[i];
			
		}
	}
	System.out.println(sum);
}
public static void main(String[] args) {
	int[]arr= {20,25,12,58,75};
//Even index= {0, 1, 2, 3, 4};
	find_sum(arr);
}
}
