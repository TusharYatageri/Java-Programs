package String;

public class palindromeReverseString {
 public static void main(String[] args) {
	 String s = "MADAM";
	 String res = "";
	 for(int i=s.length()-1; i>=0; i--) {
		 res = res + s.charAt(i);
	 }
	 System.out.println(res);
	 if(s.equals(res)) {
		 System.out.println("It's a palindrome");
	 }
	 else {
		 System.out.println("It's not");
	 	}
 	}
}
