import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int d) {
        int[] ans = IntStream.of(arr).sorted().filter(n -> n % d == 0).toArray();
        
        return ans.length == 0 ? new int[]{-1} : ans;
    }
}