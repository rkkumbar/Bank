package in.programming;


public class Demo3 {
	public static void main(String[] args) {
		String s = "dog";
		String s1 = "god";
		String s3 = "flase";

		if (s.length() != s1.length()) {
			System.out.println("not anagram");
		}

		int a[] = new int[255];

		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i)]++;	//a[100]=a[100]+1;
			
		}

		for (int i = 0; i < s1.length(); i++) {
			a[s.charAt(i)]--;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				s3 = "true";
			} else {
				s3 = "false";
			}
		}
		System.out.println(s3);
	}
}
