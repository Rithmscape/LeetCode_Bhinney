import java.util.Arrays;

class Solution {
    public static int solution(int[][] size) {
		int width = 0;
		int length = 0;
		for (int[] arr : size) {
			Arrays.sort(arr);
			width = Math.max(width, arr[0]);
			length = Math.max(length, arr[1]);
		}

		return width * length;
	}
}