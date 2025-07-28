package Patterns;

public class HeartPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=6;
int cols=7;
	for(int i=0; i<rows; i++) {
		for(int j=0; j<cols; j++) {
			if((i==1 && j%3==0)||(i==0 && j%3!=0)||(i-j==2)||(i+j==8)) {
				System.out.print("*"+" ");
			}
			else if(i==2 && j==3){
				System.out.print("MI");
				
			}
				else {
					System.out.print(" "+" ");
					}
			}
		System.out.println();
		}
	for(int i=rows-1; i>=0; i--) {
		for(int j=0; j<=cols-1; j++) {
			if((i==1 && j%3==0)||(i==0 && j%3!=0)||(i-j==2)||(i+j==8)) {
				System.out.print("*"+" ");
			}
			else if(i==2 && j==3){
				System.out.print("RO");
				
			}
				else {
					System.out.print(" "+" ");
					}
			}
		System.out.println();
		}
	}
}
