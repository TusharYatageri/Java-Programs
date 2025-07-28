package Array;
import java.util.*;
//Write a program to find maximum sum of separate of size 3.
public class sumOfSize3 {
public static int max_sum(int [] arr, int k) {
	int sum=0;
	for(int i=0; i<k; i++) {
		sum=sum+arr[i]; //sum+=arr[i];
	}
	int max=sum;
	for(int i=0; i<=arr.length-k; i++) {
		int res=0;
			for(int j=i; j<i+k; j++) {
				res=res+arr[j];
			}
			if(res>max) {
				max=sum;
			}
	}
	return max;
	
}
public static void main(String[] args) {
	int [] arr = {-9,8,-4,3,-2,7,5,-4};
	int max = max_sum(arr, 3);
	System.out.println(max);
	}
}
