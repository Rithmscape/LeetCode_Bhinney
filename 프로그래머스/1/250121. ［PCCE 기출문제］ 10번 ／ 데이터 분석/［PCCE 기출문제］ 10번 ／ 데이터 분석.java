import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
		int standard_info = findInfoNo(ext);
		int sort_info = findInfoNo(sort_by);

		List<int[]> ans = new ArrayList<>();
		for (int[] d : data) {
			if (d[standard_info] >= val_ext) continue;
			ans.add(d);
		}

		ans.sort(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[sort_info] - o2[sort_info];
			}
		});

		return ans.toArray(int[][]::new);
	}

	private int findInfoNo(String tmp) {
		return switch (tmp) {
			case "code" -> 0;
			case "date" -> 1;
			case "maximum" -> 2;
			case "remain" -> 3;
			default -> 0;
		};
	}
}