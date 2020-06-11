import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode1282 {
	public static void main(String[] args) {

	}

	public static List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < groupSizes.length; i++) {
			if (!map.containsKey(groupSizes[i]))
				map.put(groupSizes[i], new ArrayList<Integer>());
			map.get(groupSizes[i]).add(i);
		}
		for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
			int groupSize = entry.getKey();
			int size = entry.getValue().size();
			if (size > groupSize) {
				for (int i = 0; i < size; i += groupSize) {
					result.add(new ArrayList<Integer>(entry.getValue().subList(i, Math.min(size, i + groupSize))));
				}
			}
			else {
				result.add(entry.getValue());
			}
		}
		return result;
	}
}
