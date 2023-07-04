import java.util.*;

class Solution {
    public int solution(int[] scov, int K) {
        int ans = 0;
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i = 0; i < scov.length; i++) {
            q.offer(scov[i]);
        }
        
        while (q.peek() < K) {
            if (q.size() == 1) {
                return -1;
            }
            
            q.offer(q.poll() + q.poll() * 2);
            ans++;
        }
        return ans;
    }
}