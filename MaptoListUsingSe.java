import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaptoListUsingSe {
	public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Saiprashanth");
        map.put(201, "Sathish");
        map.put(301, "Saiprashanth");
        map.put(401, "Chandra");
        map.put(501, "Abi");
        
        // split a map into 2 List
		
        List<Integer> resultSortedKey = new ArrayList<>(map.keySet());
        List<String> resultValues = map.values()
        	    					   .stream()
        	    					   .distinct()
        	    					   .collect(Collectors.toList());
        resultSortedKey.forEach(System.out::println);
		resultValues.forEach(System.out::println);

    }
}
