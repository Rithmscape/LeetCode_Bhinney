import java.util.Arrays;

class Solution {
    public static boolean solution(int x) {
		String[] arr = String.valueOf(x).split("");
		int h = Arrays.stream(arr).mapToInt(Integer::parseInt).sum();
		return x % h == 0 ? true : false;
	}
}