package Patterns;

public class ContinouesAlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int rows=5;
		int k=1;
		
		for(int i=1; i<=rows; i++) {
			for (int j=1; j<=rows; j++) {
				System.out.print((char)(k+64)+" ");
						k++;
			}
			{
			System.out.println();
			}
		}
	}
}
