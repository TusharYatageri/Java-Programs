package Array;
import java.util.Arrays;

public class clockwiseRotate {
	public static void rotate_arr(int [] arr) {
	int temp =arr[arr.length-1];
	for(int i=arr.length-2; i>=0; i--) {
		arr[i+1]=arr[i];
	}
	arr[0]=temp;
	}
	public static void main(String [] args) {
		int [] arr = {10,20,30,40,50,60};
		for(int i=1; i<=7%arr.length; i++){
			rotate_arr(arr);
		}
		System.out.println(Arrays.toString(arr));
		}
}
