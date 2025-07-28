package Numbers;

public class reversingNumberUsingRecursion {
	public static int rec_rev(int num, int res) {
		if(num==0) {
			return res;
		}
		return rec_rev( num/10, (res*10)+num%10);
	}
	public static void main(String[] args) {
		int num=123;
		int res=0;
		int rev = rec_rev(num, res);
		System.out.println(rev);
	}
}
