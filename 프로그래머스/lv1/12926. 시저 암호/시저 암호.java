class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        
        char[] ch = s.toCharArray();
        
        for(char c : ch) {
            if(c == ' ') {
                sb.append(" ");
            }
            else {
                if(c <= 90) {
                    c += n;
                    if(c > 90) c -= 26;
                } else {
                    c += n;
                    if(c > 122) c -= 26;
                }
                
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}