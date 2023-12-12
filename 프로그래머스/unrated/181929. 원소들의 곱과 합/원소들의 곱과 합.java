import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int multiply = IntStream.of(num_list).reduce((a, b) -> a * b).orElse(0);
		int sum = (int) Math.pow(IntStream.of(num_list).sum(), 2);

		return multiply < sum ? 1 : 0;
    }
}