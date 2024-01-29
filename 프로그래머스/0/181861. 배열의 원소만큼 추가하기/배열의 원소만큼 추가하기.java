import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        StringBuilder ans = new StringBuilder();
		for (int i : arr) {
			ans.append(String.valueOf(i + ":").repeat(i));
		}
		
		return Arrays.stream(ans.toString().split(":")).mapToInt(Integer::parseInt).toArray();
    }
}