import java.util.Arrays;

class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        int[] ans = new int[s.length()];
        StringBuilder sb = new StringBuilder(s).reverse();
        
        for (int i = 0; i < s.length(); i++) {
            ans[i] = Character.getNumericValue(sb.charAt(i));
        }
        
        return ans;
    }
}