import java.util.*;

class Solution {
    public long solution(int[] weights) {
        Arrays.sort(weights);
		Map<Double, Integer> map = new HashMap<>();
		double[] divide = new double[]{1.0, 2.0 / 3, 1.0 / 2, 3.0 / 4};

		long answer = 0;
		for (int w : weights) {
			for (double d : divide) {
				if (map.containsKey(w * d)) answer += map.get(w * d);
			}
			map.put((double)w, map.getOrDefault((double)w, 0) + 1);
		}
		return answer;
    }
}