package Numbers;

public class problem4 {

	public static void main(String[] args) {
		// Method 1
		
		int num=16;
		for(int i=1; i<=num; i++) {
			if(i%2!=0) {
				System.out.println(i+"  "+(i+1));
				
			}
		}
		
		// Method 2
		
		{
		System.out.println();
	}
		for(int i=1; i<=num; i++) {
		if(i%2!=0) {
			System.out.print(i+" ");
	}
		else {
			System.out.println(i);
			}

		}
	}
}