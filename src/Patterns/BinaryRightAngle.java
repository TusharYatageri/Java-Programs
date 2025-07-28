package Patterns;

public class BinaryRightAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int rows=5;
		int k=1;
		
		//with if and else statement
		
		for(int i=1; i<=rows; i++) {
			for(int j=1; j<=i; j++) {
				if (k%2==0) {
				System.out.print(0+" ");
			}
			else {
				System.out.print(1+" ");
			}
			k++;
		}
			System.out.println();
		}
		System.out.println();
		
	//without if and else statement	
		
for(int i=1; i<=rows; i++) {
	for(int j=1; j<=i; j++) {
		System.out.print((k%2)+" ");
		k++;
	}
	System.out.println();
	}
}
}

