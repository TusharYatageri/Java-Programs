package Patterns;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=5;
int sum=0;
for(int i=1; i<=rows; i++) {
	sum =sum+i;
	int k=sum;
		for(int j=1; j<=i; j++) {
			System.out.print(k+"  ");
		k--;
		}
		System.out.println();
}
	}

}
