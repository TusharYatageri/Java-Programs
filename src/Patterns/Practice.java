package Patterns;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		int sum=0;
		for(int i=1; i<=rows; i++) {							//Odd Number with Upper Case with ASCII value 65
			sum=sum+i;								//Even Number with Lower Case with ASCII value 97
			int k=sum;
			for(int j=1; j<=i; j++) {
				if(k%2==1) {
					System.out.print((char)(k+64)+" ");
				}
				else {
					System.out.print((char)(k+96)+" ");
				}
			k--;
			}
			System.out.println();
		}

	}
}