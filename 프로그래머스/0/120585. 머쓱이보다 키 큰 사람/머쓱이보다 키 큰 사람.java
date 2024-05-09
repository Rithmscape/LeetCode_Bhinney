import java.util.stream.IntStream;

class Solution {
    public int solution(int[] array, int height) {
        return IntStream.of(array).sorted().filter(i -> i > height).toArray().length;
    }
}