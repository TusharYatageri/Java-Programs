package Numbers;

public class problem6 {
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
		int num=24;
		int res=count_factor(num);
		System.out.print(res);
	}
}
