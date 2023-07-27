import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int ans = 0;
        
        for (int i = left; i <= right; i++) {
            ans += i % Math.sqrt(i) == 0 ? -i : i;
        }
        
        return ans;
    }
}