class Solution {
    public int solution(int[] abs, boolean[] signs) {
        int ans = 0;
        for (int i = 0; i < signs.length; i++) {
          ans += (signs[i]) ? abs[i] : -abs[i];
        }
        
        return ans;
    }
}