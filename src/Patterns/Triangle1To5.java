package Patterns;

public class Triangle1To5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=5;

	for(int i=1; i<=rows;  i++) {
		for(int j=1; j<=(rows-i); j++) {
			System.out.print(" "+" ");
		}
		for(int j=rows; j>=rows+1-i; j--) {
			System.out.print(j+" ");
		}
		for(int j=(rows+2-i); j<=rows; j++) {
		System.out.print(j+" ");
		}
		System.out.println();
		
			}
		}
	}
