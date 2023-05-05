import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int i = 0; i < works.length; i++) {
            que.offer(works[i]);
        }

        while (n > 0) {
            int q = que.poll();
            
            if (q == 0) {
                break;
            }
            
            q -= 1;
            que.offer(q);
            n-= 1;
        }

        long answer = 0;
        for (int work : que) {
            answer += work * work;
        }
        return answer;
    }
}