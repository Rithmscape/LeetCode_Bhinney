import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] num_list) {
		return Arrays.stream(num_list).sorted().boxed().collect(Collectors.toList()).subList(5, num_list.length).stream().mapToInt(n -> n).toArray();
    }
}