import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] arr) {
        int num1 = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).min().orElse(-1);
		int num2 = IntStream.range(0, arr.length).filter(i -> arr[i] == 2).max().orElse(-1);

		return num1 != -1 ? Arrays.copyOfRange(arr, num1, num2 + 1) : new int[]{-1};
    }
}