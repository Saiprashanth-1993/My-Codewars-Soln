package main.java.morgan.stanley;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SlotMachine2O {

	public static void main(String[] args) {

		System.out.println(totalStops(Arrays.asList("712", "246", "365", "312"))); 		// output: 7+5+3 = 15
		System.out.println(totalStops(Arrays.asList("137", "364", "115", "724"))); 		// output: 7+4+3 = 14
		System.out.println(totalStops(Arrays.asList("1112", "1111", "1211", "1111"))); 	// output: 2+1+1+1 = 5
	}

	private static int totalStops(List<String> spins) {
		int digits = spins.get(0).length();
		int total = 0;

		// Iterate by digits
		while (digits > 0) {
			
			int finalMax = 0;
			// Iterate each elements in the list
			for (int i = 0; i < spins.size(); i++) {

				// find the max of an elements
				OptionalInt currMax = Arrays.stream(spins.get(i).split("")).mapToInt(Integer::parseInt).max();

				if (finalMax < currMax.getAsInt()) {
					finalMax = currMax.getAsInt();
				}
				// remove currMax value from an element
				spins.set(i, spins.get(i).replaceFirst(String.valueOf(currMax.getAsInt()), ""));
			}
			total += finalMax;
			digits--;
		}
		return total;
	}
}
