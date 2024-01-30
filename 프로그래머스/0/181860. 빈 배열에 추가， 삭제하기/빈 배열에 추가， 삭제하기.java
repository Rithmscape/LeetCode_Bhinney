import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        StringBuilder ans = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			if (flag[i]) ans.append(String.valueOf(arr[i] + "&").repeat(arr[i] * 2));
			else ans.delete(ans.length() - arr[i] * 2, ans.length());
		}

		return Arrays.stream(ans.toString().split("&")).mapToInt(Integer::parseInt).toArray();
    }
}