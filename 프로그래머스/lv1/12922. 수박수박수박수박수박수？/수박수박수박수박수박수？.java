class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i < n + 1; i++) {
            sb.append(i % 2 != 0 ? "수" : "박");
        }
        
        return sb.toString();
    }
}