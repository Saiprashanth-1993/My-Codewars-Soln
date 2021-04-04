/**
 * Question: 
 * 
 *Pat is an ordinary kid who works hard to be a great runner. As part of training, Pat must run sprints of different intervals on a straight trail. The trail has numbered markers that the coach uses as goals. Pat's coach provides a list of goals to reach in order. Each time Pat starts at, stops at, or passes a marker it is considered a visit. Determine the lowest numbered marker that is visited the most times during Pat's day of training. 
 *Example n = 5 sprints = [2,4, 1, 3] 
 *Example n = 5 sprints = [2,4, 1, 3] if the number of markers on the trail, n = 5, and assigned sprints = [2,4, 1, 3], 
 *Pat first sprints from position 2—4. 
 *The next sprint is from position 4— 1, and then 1→ 3.
 *A marker numbered position pis considered to be visited each time Pat either starts or ends a sprint there and each time it is passed while sprinting. 
 *The total number of visits to each position in the example is calculated like so: Total Visits Per Position 
 *Sprint = 1 2 3 4 5 2 4 4+ 1 1+ 3 Total Visit 2 3 3 2 0 u 
 *Pat has visited markers 2 and 3 a total of 3 times each. 
 *Since 2<3, the lowest numbered marker that is visited the most times during Pat's day of training is 2.
 *Complete the function getMostVisited in the editor below.
 *getMostVisited has the following parameter(s):
 *int n: an integer denoting the number of markers along the trail 
 *int sprints[m]: an array of integers denoting the sequence of markers to reach,
 *beginning at the marker shown in sprints[0]. 
 *Returns: int: an integer denoting Pat's most visited position on the trail after performing all m - 1 sprints. 
 
 *If there are multiple such answers, return the smallest one.
 
 *Constraints • 1 <n< 105 • 2 sm < 105 • 1 < sprints[i] = m (where 0 si < m) • sprints[i-1] + sprints[i(where 0 <i< m)
 *Input Format for Custom Testing 
 *Input from stdin will be processed as follows and passed to the function. 
 *The first line contains an integer n, the number of markers along the path. The second line contains an integer m, the number of markers in the list of goals. 
 *The next m lines each contain an element sprints[i] where 0 si < m.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class SprintTraining {
	public static void main(String[] args) {
		System.out.println(getMostVisited(4, Arrays.asList(1, 5, 10, 3)));
		System.out.println(getMostVisited(4, Arrays.asList(2, 4, 1, 3)));
	}
	
	public static int getMostVisited(int n, List<Integer> sprints) {
		HashMap<Integer, Integer> visitedSprintMap = new HashMap<>();
		int start = 0;
		int end = 0;

		for (int j = 1; j < sprints.size(); j++) {
			if (sprints.get(j - 1) > sprints.get(j)) {
				start = sprints.get(j);
				end = sprints.get(j - 1);
			} else {
				start = sprints.get(j - 1);
				end = sprints.get(j);
			}
			int k = start;
			while (k != end + 1) {
				visitedSprintMap.put(k, visitedSprintMap.get(k) == null ? 1 : visitedSprintMap.get(k) + 1);
				k++;
			 }
		}

		return mostVisitedSprint(visitedSprintMap);
	}

	private static int mostVisitedSprint(HashMap<Integer, Integer> result) {
		  int mostVisitedSprint = 1;
          int mostVisitedSprintValue = 0;
		  for (Entry<Integer, Integer> entry : result.entrySet()) { 
		  if (mostVisitedSprint >= entry.getKey() || mostVisitedSprintValue < entry.getValue()) { 
			  mostVisitedSprintValue = entry.getValue();
			  mostVisitedSprint = entry.getKey();
		  	}
		 }
		  return result.get(mostVisitedSprint);
	}
}


