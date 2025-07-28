package Numbers;
// given an integer N, returns the smallest integer greater than N,
// the sum whose digit is twice as big as the sum of digits of N.
// For example: Given N=14. the function should return 19.
// The sum of digits of 19 (1+9=10) is twice as big as sum of digits of 14(1+4=5).
public class deloitQ {
	
	public static int d_sum(int num) {
int sum=0;
while(num!=0) {
	int rem = num%10;
	sum= sum +rem;
	num/=10;
}
return sum;
}
	public static void main(String[] args) {
	
		int num= 17;
		int num1=num+1;
		while (d_sum(num)*2 != d_sum(num1)) {
			num1++;
		}
		System.out.println(num1);
	}

}
