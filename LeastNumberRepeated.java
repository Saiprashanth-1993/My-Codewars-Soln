import java.util.Arrays;

public class LeastNumberRepeated {
	// finds the smallest number in arr[]
	// that is repeated k times
	static int findDuplicate(int arr[], int n) {
		// Sort the array
		Arrays.sort(arr);

		// Find the first element with exactly
		// k occurrences.
		int i = 0;
		while (i < n) {
			int j, count = 1;
			for (j = i + 1; j < n && arr[j] == arr[i]; j++) {
				count++;
				
			}
			if (count > 2) {
				return arr[i];
			}
			i = j;
		}

		return -1;
	}

	// Driver code
	public static void main(String[] args) {
		int arr[] = { 0, 0, 0, 2, 2, 2, 1, 1, 3, 1 };
		// int k = 2;
		int n = arr.length;
		System.out.println(findDuplicate(arr, n));
	}
}
