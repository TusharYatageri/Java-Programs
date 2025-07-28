package Array;
import java.util.*;

public class sumOfSubArray {
	public static int max_sum_subarray(int [] arr) {
		int max = arr[0];
		for(int i=0; i<arr.length; i++) {
			int sum=0;
				for(int j=0; j<=3; j++) {
					sum = sum + arr[j];
					if(sum>max) {
						max=sum;
				}
			}
				// for steps paste S.o.p here!
		}	
		return max;
	}
public static void main(String[] args) {
	int [] arr = {10,7,-18,20,1,-2,4};
	int max = max_sum_subarray(arr);
	System.out.println(max);
	}
}
