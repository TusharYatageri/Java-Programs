package Patterns;

public class BinaryTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=5;

for(int i=1; i<=rows; i++) {
	int k=i;
	for(int j=1; j<=i; j++) {
		System.out.print((k%2)+" ");
		k++;
	}
	System.out.println();
		}
	}
}