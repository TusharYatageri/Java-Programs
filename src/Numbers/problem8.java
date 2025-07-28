package Numbers;

public class problem8 {
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
	for(int i=1; i<=1000; i++) {
		int num=i;
		int res=count_factor(num);
		if(res==2) {
			System.out.println(num);
			}
		}
	}
}