class Solution {
    public int solution(int[] numbers, int n) {
        int ans = 0;
        for (int num : numbers) {
            ans += num;
            
            if (ans > n) break;
        }

        return ans;
    }
}