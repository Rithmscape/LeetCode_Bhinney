import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] command) {
        List<Integer> ans = new ArrayList<>();
        for (int[] c : command) {
			int start = c[0] - 1;
			int end = c[1] - 1;
			int idx = c[2] - 1;

			int[] arr = new int[end - start + 1];
			System.arraycopy(array, start, arr, 0, arr.length);
			Arrays.sort(arr);
			ans.add(arr[idx]);
		}

		return ans.stream().mapToInt(n -> n).toArray();
    }
}