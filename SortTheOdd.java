import java.util.Arrays;

public class SortTheOdd {
	public static int[] sortArray(final int[] array) {

		// Sort the odd numbers only
		final int[] sortedOdd = Arrays.stream(array).filter(e -> e % 2 == 1).sorted().toArray();
		// Then merge them back into original array
		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] % 2 == 1) {
				array[i] = sortedOdd[j++];
			}
		}
		return array;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArray(new int[]{ 5, 3, 2, 8, 1, 4 })));
		System.out.println(Arrays.toString(sortArray(new int[]{ 2, 22, 37, 11, 4, 1, 5, 0 })));
		System.out.println(Arrays.toString(sortArray(new int[]{ 1, 111, 11, 11, 2, 1, 5, 0 })));
	}
}
