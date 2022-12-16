import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        /*  반환할 최대 값 초기화 */
        int max = 0;
        HashSet<Character> set = new HashSet<>();
        int start = 0;
        int end = 0;
        
        while (end < s.length()) {
            if (start > end) {
                break;
            }
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                max = Math.max(max, end - start);
                continue;
            }
            set.remove(s.charAt(start++));
        }
        
        return max;
    }
}