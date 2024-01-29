import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> ans = new ArrayList<>();
		
		for (int n : arr) {
			for (int i = 0; i < n; i++) {
				ans.add(n);
			}
		}
		
		return ans.stream().mapToInt(i -> i).toArray();
    }
}