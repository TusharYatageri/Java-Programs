package Patterns;

public class HollowPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=9;

	for(int i=1; i<=rows; i++) {
			for(int j=1; j<=rows; j++) {
				
				
		if(i==rows || j==1 ||j==i) {
					System.out.print("*"+" ");
					}
				
		else {
			System.out.print(" "+" ");
			}
				}
		System.out.println();
				}
			}
	}