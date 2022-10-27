import java.util.ArrayList;
import java.util.List;

public class Ass2_Part1 {
	public static List<Integer> common_elements(int[] a, int[] b) {
		List<Integer> ce = new ArrayList<Integer>();
		for (int x : a) {
			for (int y : b) {
				if (x == y) {
					ce.add(x);
				}
			}
		}
		return ce;
	}	
}
