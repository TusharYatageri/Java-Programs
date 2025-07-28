package Numbers;

public class problem7 {
	public static int count_factor(int num) {
		int count=0;
		for (int i=1; i<=num; i++) {
			if (num%i==0) {
				count++;
			}
		}
				return count;
	}
	public static void main(String[] args) {
		int num=2;
		int res=count_factor(num);
		System.out.println(res);
		if(res==2) {
			System.out.print("its a prime number");
	}
		else{
			System.out.print("it is not a prime number");
		}
	}

}
