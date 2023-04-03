class Solution {
    public long solution(int cap, int n, int[] gives, int[] gets) {
        int get = 0, give = 0;
        long answer = 0;
        
        for (int i = n - 1; i >= 0; i--) {
            if (gives[i] != 0 || gets[i] != 0) {
                int cnt = 0;
                
                while (give < gives[i] || get< gets[i]) {
                    cnt += 1;
                    give += cap;
                    get += cap;
                }
                
                give -= gives[i];
                get -= gets[i];
                
                answer += (i + 1) * cnt * 2;
            }
            
        }

       
        return answer;
    }
}