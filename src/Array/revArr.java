package Array;
//Write a program to reverse the array
import java.util.*; // Important command
public class revArr {
	public static void rev_arr(int[] arr) {
		int k=0;
		int [] res=new int [arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			res[k]=arr[i];
			k++;
		}
		System.out.println(Arrays.toString(res)); //Arrays.toString is required to convert Arrays to String.
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};	
			rev_arr (arr);
		}
}
