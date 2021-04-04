import java.util.ArrayList;
import java.util.List;

public class MissingElement {
	
	static List<Integer> missingElements(List<Integer> list) {
		
		List<Integer> missed = new ArrayList<Integer>();
		
		for (int i = 0; i < list.size(); i++) {
			int tempValue = Math.abs(list.get(i)) - 1;

			if (list.get(tempValue) > 0)
				list.set(tempValue, -list.get(tempValue));
			else
				list.set(tempValue, list.get(tempValue));
		}
		// lst[0] = 2, lst[2] = -3, lst[4] = -5
		for (int k = 0; k < list.size(); k++) {
			if ((int) list.get(k) > 0) {
				missed.add(k + 1);
			}
		}
		return missed;
	}

	public static void main(String[] args) {
		List<Integer> v = new ArrayList<Integer>();
		v.add(1);
		v.add(3);
		v.add(3);
		v.add(3);
		v.add(5);

		List<Integer> mElements = missingElements(v);
		for (int i = 0; i < mElements.size(); i++) {
			System.out.println(mElements.get(i) + " ");
		}
	}
}
