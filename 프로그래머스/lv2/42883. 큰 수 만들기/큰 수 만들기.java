class Solution {
    public String solution(String number, int k) {
        int len = number.length() - k;
        
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            int max = 0;
            
            for(int j = idx; j <= k + i; j++) {
                if(max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    idx = j + 1;
                }
            }
            sb.append(max);
        }
        
        return sb.toString();
    }
}