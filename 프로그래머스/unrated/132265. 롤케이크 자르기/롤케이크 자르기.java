import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int ans = 0;
        Map<Integer, Integer> older = new HashMap<>();
        Map<Integer, Integer> younger = new HashMap<>();
        
        for (int t : topping) {
            younger.put(t, younger.getOrDefault(t, 0) + 1);
        }
        
        for (int t : topping) {
            older.put(t, older.getOrDefault(t, 0) + 1);
            
            if (younger.get(t) - 1 == 0) {
                younger.remove(t);
            } else {
                younger.put(t, younger.get(t) - 1);
            }
            
            if (older.size() == younger.size()) {
                ans++;
            }
        }
        
        return ans;
    }
}