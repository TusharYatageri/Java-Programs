package Patterns;

public class Pattern {

	public static void main(String[] args) {

int rows=5;
int k=1;
	 for(int i=1; i<=rows; i++) {
		 for(int j=1; j<=i; j++) {
			 if (k%2==1) {
			 System.out.print((char)(k+64)+" ");
		 }
			 else {
				 System.out.print((char)(k+96)+" ");
			 }
			 k++;
		 }
		 System.out.println();
		 }
	 }
}