package Numbers;
	
public class armstrongNumber {
	
	public static int c_digit(int num) {
		int digit = 0;
		while (num!=0) {
		num/=10;
		digit++;
	}
	return digit;
}
	
public static int c_arms (int num) {
	int digit = c_digit(num);
	int res=0;
	while (num!=0) {
		res = (int)Math.pow(res, digit)+res;
		num = num/10;
	}
	return res;
}

	public static void main (String[] args) {
		int num = 153;
		int res = c_arms(num);
		if (res==num) {
			System.out.println("its arm");
		}
		else {
			System.out.println("its not");
		}
	}
}
