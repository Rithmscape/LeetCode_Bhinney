import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> que = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int n = 100 - progresses[i];
            int m = n / speeds[i] + (n % speeds[i] == 0 ? 0 : 1);
            
            que.offer(m);
        }
        
        int day = 1;
        int now = que.poll();
        List<Integer> list = new ArrayList<>();
        
        while (!que.isEmpty()) {
            int next = que.poll();
            
            if (now >= next) {
                day++;
            } else {
                list.add(day);
                now = next;
                day = 1;
            }
        }
        list.add(day);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}