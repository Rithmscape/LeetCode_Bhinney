class Solution {
    public boolean solution(String s) {
        
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        int cnt = s.chars().filter(ch -> !Character.isDigit(ch)).toArray().length;
        
		return cnt == 0;
    }
}