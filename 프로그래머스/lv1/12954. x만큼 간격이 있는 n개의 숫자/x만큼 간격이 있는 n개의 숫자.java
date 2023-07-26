import java.util.stream.*;

class Solution {
    public long[] solution(int x, int n) {
        
        return LongStream.iterate(x, num -> num + x).limit(n).toArray();
    }
}