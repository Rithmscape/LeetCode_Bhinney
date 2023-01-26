import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
		int[] result = new int[id_list.length];

		HashSet<String> set = new HashSet<>(report.length);
		set.addAll(Arrays.asList(report));
		HashMap<String, HashSet<String>> reporting = new HashMap<>();

		for (String str : set) {
			String reporter = str.split(" ")[0]; // 신고자
			String reported = str.split(" ")[1]; // 신고 당한 사람

			if (reporting.containsKey(reported)) {
				HashSet<String> value = reporting.get(reported);
				value.add(reporter);
				reporting.put(reported, value);
			} else {
				HashSet<String> value = new HashSet<>();
				value.add(reporter);
				reporting.put(reported, value);
			}
		}

		HashMap<String, Integer> mail = new HashMap<>();
		for (int i = 0; i < id_list.length; i++) {
			String key = id_list[i];
			if (reporting.containsKey(key) && reporting.get(key).size() >= k) {
				HashSet<String> value = reporting.get(key);
				for (String str : value) {
					mail.put(str, mail.getOrDefault(str, 0) + 1);
				}
			}
		}

		for (int i = 0; i < id_list.length; i++) {
			result[i] = mail.getOrDefault(id_list[i], 0);
		}

		return result;
	}
}