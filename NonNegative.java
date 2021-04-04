import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
//Given a list of non-negative integers nums, arrange them such that they form the largest number.
public class NonNegative {
	static void printLargest(List<String> arr) {
		Collections.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				String A = o1 + o2;
				String B = o2 + o1;
				return A.compareTo(B) > 0 ? -1 : 1;
			}
		});
		Iterator<String> it = arr.iterator();
		while (it.hasNext()) {
			System.out.print(it.next());
		}
	}
	// Input: nums = [3,30,34,5,9]
	// Output: "9534330"
	public static void main(String[] args) {
		List<String> arr = new ArrayList<String>();
		arr.add("3");
		arr.add("30");
		arr.add("34");
		arr.add("5");
		arr.add("9");
		printLargest(arr);
	}
}

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//Input: nums = [3,0,1]
//Output: 2
//
//Input: nums = [0,1]
//Output: 2
//
//Input: nums = [9,6,4,2,3,5,7,0,1]
//Output: 8