package hashMapSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class UniqueOcc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean uniqueOccurrences(int[] arr) {
		Map<Integer, Long> test= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(a -> a, HashMap::new, Collectors.counting()));
		return test.values().stream().distinct().count() == test.size();
    }

}
