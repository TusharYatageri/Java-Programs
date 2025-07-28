package Array;
import java.util.Arrays;
public class linearAlgo {
	public static int linear_search (int [] arr, int key){
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==key) {
				return i;
		}
	}
	return-1;
}

	public static void main(String[] args) {
		int[] arr= {10,15,18,11,25,29};
		int key=18;
		int ind=linear_search(arr, key);
		System.out.println("Linear Search");
		System.out.println(ind);
	}
}