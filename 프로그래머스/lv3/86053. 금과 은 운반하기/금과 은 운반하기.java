class Solution {
    public long solution(int a, int b, int[] g, int[] s, int[] w, int[] t) {
        long start = 0, end = (long) (10e9 * 2 * 10e5 * 2);
        long len = t.length;
        long answer = (long) (10e9 * 2 * 10e5 * 2);
        
        while (start <= end) {
            long mid = (start + end) / 2;
            long gold = 0, silver = 0, sum = 0;
            
            for (int i = 0; i < len; i++) {
                long n_gold = g[i];
                long n_silver = s[i];
                long n_weight = w[i];
                long n_time = t[i];
                
                long cnt = mid / (n_time * 2);
                if (mid % (n_time * 2) >= t[i]) {
                    cnt++;
                }
                
                gold += Math.min(n_gold, cnt * n_weight);
                silver += Math.min(n_silver, cnt * n_weight);
                sum += Math.min(n_gold + n_silver, cnt * n_weight);
            }
            
            if (a <= gold && b <= silver && a + b <= sum) {
                end = mid - 1;
                answer = Math.min(mid, answer);
                continue;
            }

            start = mid + 1;
        }
        
        return answer;
    }
}