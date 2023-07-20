import java.util.*;

class Solution {
    public int[] solution(int n, long k) {
        int[] ans = new int[n];
        List<Integer> list = new ArrayList<>();
        long fac = 1;
        
        for (int i = 1; i <= n; i++) {
            list.add(i);
            fac *= i;
        }
        
        k--;
        int idx = 0;
        while (idx < ans.length) {
            fac /= (n--);
            int num = (int) (k / fac);
            ans[idx++] = list.get(num);
            list.remove(num);
            k %= fac;
        }

        return ans;
    }
}