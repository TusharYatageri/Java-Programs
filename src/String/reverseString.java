package String;
//Write a program to reverse the string

public class reverseString {
	public static void main(String[] args) {
		String s="Pentagon";
		String res=" ";
		for(int i=s.length()-1; i>=0; i--) {
			res = res+s.charAt(i);
		}
	System.out.println(res);
	}
}
