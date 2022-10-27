public class Ass2_Part3 {
	public static String[] contains(String[] a) {
		String saved;
		for (int i = 0; i < a.length/2; i++) {
			saved = a[a.length-i-1];
			a[a.length-i-1] = a[i];
			a[i] = saved;
		}
		return a;
	}	
}
