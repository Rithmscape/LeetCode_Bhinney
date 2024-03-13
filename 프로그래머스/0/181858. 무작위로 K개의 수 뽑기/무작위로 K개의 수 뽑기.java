import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] dis = IntStream.of(arr).distinct().toArray();
        int[] ans = new int[k];
        Arrays.fill(ans, -1);
        int len = Math.min(dis.length, ans.length);
        
        for (int i = 0; i < len; i++) {
            ans[i] = dis[i];
        }
        
        return ans;
    }
}