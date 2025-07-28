/**
 * 
 */
package Patterns;

/**
 *Ascii value of A = 65
 *Ascii value of a = 97
 */
public class AlphabetPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int rows=5;

for(int i=1; i<=rows; i++){
	
	for(int j=1; j<=rows; j++) {
		
		System.out.print((char)(j+96)+" ");
	}
			System.out.println();
		}
	}

}
