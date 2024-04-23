import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = IntStream.of(d).sum();
		if (sum <= budget) return d.length;

		Arrays.sort(d);

		for (int i = d.length - 1; i >= 0; i--) {
			sum -= d[i];

			if (sum <= budget) return i;
		}

		return 0;
    }
}