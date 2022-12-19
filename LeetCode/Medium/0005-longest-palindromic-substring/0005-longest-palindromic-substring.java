class Solution {
    public String longestPalindrome(String s) {
        
        /* 결과를 반환할 결과 값 선언 */
        String result = "";
        
        for (int i = 0; i < s.length(); i++) {
            int len = Math.max(findPalindrome(s,i,i), findPalindrome(s,i,i+1));
            if (result.length() < len) {
                result = s.substring(i - (len-1)/2, i + len/2 + 1);
            }
        }
        return result;
    }
    
    private static int findPalindrome(String s, int start, int end) {
        if (start < 0 || end >= s.length()) {
            return 0;
        }
        
        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        
        return end - start - 1;
    }
}