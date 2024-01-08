import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int num1 = IntStream.range(0, num_list.length).filter(idx -> idx % 2 == 0).map(idx -> num_list[idx]).sum();
		int num2 = IntStream.range(0, num_list.length).filter(idx -> idx % 2 != 0).map(idx -> num_list[idx]).sum();

		return Math.max(num1, num2);
    }
}