public class Ass2_Part2 {
	public static boolean contains(int[] a) {
		boolean sixtyfive = false;
		boolean seventyseven = false;
		boolean contents = false;
		for (int x : a) {
			if (x == 65) {
				sixtyfive = true; }
			if (x == 77) {
				seventyseven = true; }
				}
		if ((sixtyfive == true) && (seventyseven == true)) {
			contents = true;
			}
		return contents;
	}	
}
