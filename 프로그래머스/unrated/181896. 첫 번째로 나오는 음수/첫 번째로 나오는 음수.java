import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        int num =  IntStream.of(num_list).filter(n -> n < 0).findFirst().orElse(-1);
		 if (num == -1) return num;
		 return IntStream.of(num_list).boxed().collect(Collectors.toList()).indexOf(num);
    }
}