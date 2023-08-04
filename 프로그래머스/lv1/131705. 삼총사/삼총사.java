class Solution {
    public int solution(int[] num) {
        int cnt = 0;
        
        for (int i = 0; i < num.length - 2; i++) {
            for (int j = i + 1 ; j < num.length - 1; j++) {
                for (int k = j + 1 ; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0) {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
    }
}