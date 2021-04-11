
import java.util.*;

class ArrayChallenge {

	public static boolean ArrayChallenge(int[] arr) {
		// code goes here
		Arrays.sort(arr);
		int size = arr.length;
		int largestVal = arr[size - 1];
		for (int i = 0; i < size - 1; i++) {
			int sum = 0;
			for (int j = 0; j < size - 1; j++) {
				if (i == j) {
					continue;
				}
				sum += arr[i] + arr[j];
				if (sum == largestVal) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// keep this function call here
		System.out.println(ArrayChallenge(new int[] {3,5,-1,12,8}));
		System.out.println(ArrayChallenge(new int[] {5,7,16,1,2}));
	}
}
