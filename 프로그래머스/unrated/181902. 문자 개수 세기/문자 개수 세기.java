class Solution {
    public int[] solution(String my_string) {
        
        /*
         * 대문자 : ch - 65 -> 0 ~ 25
         * 소문자 : ch - 97 -> 26 ~ 51
         */
        int[] ans = new int[52];
        
        for (char ch : my_string.toCharArray()) {
            if (ch >= 65 && ch <= 90) {
                ans[ch - 65]++;
            } else if (ch >= 97 && ch <= 122) {
                ans[ch - 71]++;
            }
        }
        
        return ans;
    }
}