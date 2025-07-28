package String;
//Write a program to convert a string into character array.
import java.util.Arrays;

//NOTE:- sc.next(); will only take a single word if wee are giving multiple words in a single string we should go with next line.
public class stringToCharArr {
	public static void main(String[] args) {
	String s = "pentagon";
	char [] arr = new char [s.length()];
System.out.println(Arrays.toString(arr)); // Used to convert string into Array.
	for(int i=0; i<s.length(); i++) {
	arr[i]=s.charAt(i);
	}
System.out.println(Arrays.toString(arr));
	}
}