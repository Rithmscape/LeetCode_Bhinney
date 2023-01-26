import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
		HashSet<String> set = new HashSet<>();
		set.addAll(Arrays.asList(report));
		HashMap<String, Integer> reporting = new HashMap<>();
		for (String str : set) {
			String target = str.split(" ")[1];
			reporting.put(target, reporting.getOrDefault(target, 0) + 1);
		}

		HashMap<String, Integer> mail = new HashMap<>();
		for (String str : set) {
			String target = str.split(" ")[1];
			String reporter = str.split(" ")[0];
			if (reporting.containsKey(target) && reporting.get(target) >= k) {
				mail.put(reporter, mail.getOrDefault(reporter, 0) + 1);
			}
		}
		int[] result = new int[id_list.length];
		for (int i = 0; i < id_list.length; i++) {
			result[i] = mail.getOrDefault(id_list[i], 0);
		}

		return result;
	}
}