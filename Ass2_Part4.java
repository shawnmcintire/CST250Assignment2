
public class Ass2_Part4 {
	public static boolean unique(String a) {
		boolean uni = true;
		for (int i = 0; i < a.length(); i++) {
			for (int j = 1; j < a.length(); j++) {
				if (i != j) {
					if (a.charAt(i) == (a.charAt(j))) {
							uni = false;
					}
				}
			}
		}
		return uni;
	}	
}
