
public class Ass2_Part5 {
	public static boolean palindrome(String a) {
		boolean pal = true;
		for (int i = 0; i < a.length()/2; i++) {
			if (a.charAt(i) != a.charAt(a.length()-i)) {
				pal = false;
			}
		}
	return pal;
	}
}
