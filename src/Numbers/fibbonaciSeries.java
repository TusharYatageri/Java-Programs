package Numbers;

public class fibbonaciSeries {
	public static void main(String[] args) {
	int num=8;
	int a=0;
	int b=1;
	int i=1;
	
	while(i<=num) {
		System.out.println(a);
		int res=a+b;
		a=b;
		b=res;
		i++;
		}
	}
}
