package String;

public class occuranceOfChar {
	public static void main(String[] args) {
		String s = "aabbbbeeeeffggg";
		int[]arr = new int [123];
		for (int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			arr[c] = arr [c]+1;
		}
		for (int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				String result = (char) i+""+ arr[i];
				System.out.print(result);
			}
		}
		
		{System.out.println();}
		
		String s1 = "a2b4e4f2g3";
		String res = "";
		for (int i=0; i<s1.length(); i+=2) { //i++
			char c1 = s1.charAt(i);
			int next  = Character.getNumericValue(s1.charAt(i+1));
			for(int j=1; j<=next; j++) {
				res += c1;
				
			}
			//i++;
		}
		System.out.print(res);
	}
}
