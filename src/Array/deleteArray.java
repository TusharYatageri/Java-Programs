package Array;
import java.util.*; 
 class deleteArray {
	private static int[] delete_element(int[] arr, int index) {
        int[] res=new int[arr.length-1];
        for(int i=0;i<index;i++){
            res[i]=arr[i];
        }
        for (int i=index+1;i<arr.length;i++){
            res[i-1]=arr[i];
        }
        return res;
	
 }
	{
System.out.print(res);
}
public static void main(String[] args) {
	int[]arr= {20,25,12,58,75};
	delete_element(arr, 5);
}
}