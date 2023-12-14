import java.util.HashSet;

class Solution {
    public int[] solution(int l, int r) {
        HashSet<Integer> set = new HashSet<>();

		for (int i = l; i <= r; i++) {
			String num = i + "";
			if (!num.contains("5")) continue;

			int cnt = 0;
			for (char n : num.toCharArray()) {
				if (n == 48 || n == 53) cnt++;
			}

			if (cnt == num.length()) set.add(i);
		}

		if (set.isEmpty()) set.add(-1);

		return set.stream().sorted().mapToInt(n -> n).toArray();
    }
}