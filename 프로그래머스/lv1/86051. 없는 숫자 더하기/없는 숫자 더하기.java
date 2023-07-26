import java.util.stream.*;

class Solution {
    public int solution(int[] numbers) {
        
        return IntStream.range(0, 10).filter(
            i -> IntStream.of(numbers).noneMatch(n -> i == n)
        ).sum();
    }
}