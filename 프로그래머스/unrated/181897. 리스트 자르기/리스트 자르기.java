import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        switch (n) {
			case 1 -> {
				return Arrays.copyOfRange(num_list, 0, slicer[1] + 1);
			}
			case 2 -> {
				return Arrays.copyOfRange(num_list, slicer[0], num_list.length);
			}
			case 3 -> {
				return Arrays.copyOfRange(num_list, slicer[0], slicer[1] + 1);
			}
			default -> {
				ArrayList<Integer> ans = new ArrayList<>();
				for (int i = slicer[0]; i <= slicer[1]; i += slicer[2]) {
					ans.add(num_list[i]);
				}

				return ans.stream().mapToInt(i -> i).toArray();
			}
		}
    }
}