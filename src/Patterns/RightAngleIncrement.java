package Patterns;

public class RightAngleIncrement {
	public static void main(String[] args) {
		
		int rows=5;
		
		for(int i=1; i<=rows; i++) {
			for(int j=i; j<(i*2); j++) {
				System.out.print(j+" ");

			}
			System.out.println();
		}
	}

}