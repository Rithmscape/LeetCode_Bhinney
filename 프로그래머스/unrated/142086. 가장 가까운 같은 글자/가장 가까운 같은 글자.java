class Solution {
    public int[] solution(String s) {
        int[] ans = new int[s.length()];
        ans[0] = -1;
        
        for (int i = 1; i < ans.length; i++) {
            int n = s.lastIndexOf(s.substring(i, i + 1), i - 1);
            ans[i] = (n == -1) ? n : i - n;
        }

        return ans;
    }
}