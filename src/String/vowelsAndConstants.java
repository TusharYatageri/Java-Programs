package String;

public class vowelsAndConstants {
public static void main(String[] args) {
	String s = "pentagon space";
	int count_vow=0;
	int count_const=0;
	int count_space=0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch==32) {
				count_space++;
			}
			else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count_vow++;
			}
			else {
				count_const++;
			}
		}
	System.out.println("Vowels: "+count_vow);
	System.out.println("Constants: "+count_const);
	System.out.println("Spaces: "+count_space);
	}
}