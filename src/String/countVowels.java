package String;
import java.util.*;
//Write a program to count number of vowels in present in a given string.

public class countVowels {
	public static void main(String[] args) {
	String s = "pentagon";
	int count =0;
	for(int i=0; i<s.length(); i++) {
		char ch = s.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			count++;
		}
	}
	System.out.println(count);	
	}
}