class Solution {
    public int solution(int[] num_list) {
        int cnt = 0;
        for (int n : num_list) {
            while (n != 1) {
                cnt++;
                if (n % 2 == 0) n /= 2;
                else n = (n - 1)/2;
            }
        }
        
        return cnt;
    }
}