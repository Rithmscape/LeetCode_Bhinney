import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        int n = 1;
        while (n <= elements.length) {
            int sum = 0;

            for (int i = 0; i < n; i++) {
                sum += elements[i % elements.length];
                set.add(sum);
            }
            
            for (int i = 0; i < elements.length; i++) {
                sum -= elements[i % elements.length];
                sum += elements[(i + n) % elements.length];
                set.add(sum);
            }
            n++;
        }
        
        return set.size();
    }
}