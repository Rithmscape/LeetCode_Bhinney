import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
   public static String solution(int[] numbers) {
		List<String> list = new ArrayList<>();

		for (int i : numbers) {
			list.add(String.valueOf(i));
		}

		Collections.sort(list, (n1, n2) -> (n2+n1).compareTo(n1+n2));

		StringBuilder sb = new StringBuilder();

		if (list.get(0).charAt(0) == '0') {
			return "0";
		}

		for (String str : list) {
			sb.append(str);
		}

		return sb.toString();
	}
}