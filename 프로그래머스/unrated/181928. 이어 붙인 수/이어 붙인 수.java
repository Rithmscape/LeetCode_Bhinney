import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] num_list) {
        return Integer.parseInt(IntStream.of(num_list).filter( n -> n % 2 != 0).mapToObj(Objects::toString).collect(Collectors.joining())) + Integer.parseInt(IntStream.of(num_list).filter( n -> n % 2 == 0).mapToObj(Objects::toString).collect(Collectors.joining()));

    }
}