package Array;

import java.util.Arrays;

public class anagram {
//	public static void main(String[] args) {
//		String s1 = "SILENT";
//		String s2 = "LISTEN";
//		char [] arr1 = s1.toCharArray();
//		char [] arr2 = s2.toCharArray();
//		
//		Arrays.sort(arr1);
//		Arrays.sort(arr2);
//		
//		
//		System.out.println(Arrays.toString(arr1));
//		System.out.println(Arrays.toString(arr2));
//		
//		if(Arrays.equals(arr1, arr2)) {
//			System.out.println("It's Anagram");
//		}
//	else{
//	System.out.println("It's not");
//		}
//	}
//}
	public static char [] conv_char(String s) {
		char [] arr = new char [s.length()];
		for (int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		return arr;
	}

	public static void sortarray(char [] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					char temp = arr[j];
					arr [j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static boolean compare(char arr1[], char arr2[]) {
		if(arr1.length!=arr2.length) {
			return false;
		}
		for(int i=0; i<arr1.length; i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
		String s1 = "SILENT";
		String s2 = "LISTEN";
		
		char [] arr1 =conv_char(s1);
		char [] arr2 = conv_char(s2);
	
		sortarray(arr1);
		sortarray(arr2);
		
		compare(arr1,arr2);
	
	
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		if(compare(arr1, arr2)==true) {
			System.out.println("It's Anagram");
		}
		else{
			System.out.println("It's not");
		}
	}
}