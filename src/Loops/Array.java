package Loops;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,22,33,44,55};
		for (int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
		System.out.println("For using each");
		for (int ele:arr) {
				System.out.println(ele);
		}
	}

}
