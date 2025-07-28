package String;
import java.util.*;
public class MoveHashToFront {
    public static void  main(String [] args) {
//SCANNER CLASS
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the string");
    	String s = sc.nextLine();
    	
       String non_hash = "";
       String hash = "";
       for(int i=0; i<s.length(); i++) {
    	   if(s.charAt(i) == '#') {
    		   hash += s.charAt(i);
    	   }
    	   else {
    		   non_hash += s.charAt(i);
    	   }
       }
       		String result = hash + non_hash;
       		System.out.println(result);
    }
}