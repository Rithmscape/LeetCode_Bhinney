import java.util.*;

class Solution {
    public int solution(int length, int weight, int[] truck) {
        int ans = 0;
        int w = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for (int t : truck) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(t);
                    w += t;
                    ans++;
                    break;
                } else if(q.size() == length) {
					w -= q.poll();
				} else {
                    if(w + t > weight) {
						q.offer(0);
						ans++;
					} else {
						q.offer(t);
						w += t;
						ans++;
						break;
					}
                }
            }
        }
        
        
        return ans + length;
    }
}