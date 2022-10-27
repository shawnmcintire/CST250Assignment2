
public class Ass2_Part6 {
	public static String palindrome(String a) {
		char fUpper = Character.toUpperCase(a.charAt(0));
		a = fUpper + a.substring(1);
		for (int i = 0; i < a.length()-1; i++) {
			if (a.charAt(i) == '.') {
				char fSen = Character.toUpperCase(a.charAt(i + 2));
				// i + 2 is used to find the second char after the period.
				// For this to work the sentences passed must be correctly formatted.
				a = a.substring(0, i+1) + fSen + a.substring(i+3);
			}
		}
	return a;
	}
}
