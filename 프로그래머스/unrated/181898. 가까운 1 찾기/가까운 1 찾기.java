import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] arr, int idx) {
		int num = IntStream.of(arr).boxed().collect(Collectors.toList()).subList(idx, arr.length).indexOf(1);

		return num == -1 ? -1 : num + idx;
    }
}