package Numbers;

public class fibbonaciiUsingReccursion {
	// Note1: Every recursive code should starts with termination condition or end condition.
	// Note2:while calling the method inside the method we should send the parameter of next  itteration.
	// Note3: No need to initialize any variables within the method instead of declare those variables in main method & send as a parameter.

	public static void rec_fibo(int num, int a, int b) {
		if(num==0) {
			return;
		}
			System.out.println(a);		// To print in reverse manner shift S.o.p below rec_fibo. 
			rec_fibo(num-1, b, a+b);
}
	public static void main(String[] args) {
		int num=4;
		int a=0;
		int b=1;
		rec_fibo(num, a, b);
		//rec_fibo(4, 0, 1);
	}

}
