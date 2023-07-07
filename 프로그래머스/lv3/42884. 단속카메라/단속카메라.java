import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int ans = 0;
        Arrays.sort(routes, new Comparator<int[]>(){
            public int compare(int[] r1, int[] r2) {
                return r1[1] - r2[1];
            }
        });
        
        int c = Integer.MIN_VALUE;
        
        for (int[] r : routes) {
            if (c < r[0]) {
                c = r[1];
                
                ans++;
            }
        }
        
        return ans;
    }
}