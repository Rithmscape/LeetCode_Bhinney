import java.util.stream.*;

class Solution {
    public int solution(int[] abs, boolean[] signs) {
        for (int i = 0; i < signs.length; i++) {
            if (!signs[i]) {
                abs[i] *= -1;
            }
        }
        
        return IntStream.of(abs).sum();
    }
}