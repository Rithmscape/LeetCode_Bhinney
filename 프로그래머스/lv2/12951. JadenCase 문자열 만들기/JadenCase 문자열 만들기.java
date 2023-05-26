class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            String now = arr[i];
            
            if (now.length() == 0) {
                sb.append(" ");
            } else {
                sb.append(now.substring(0, 1).toUpperCase()).append(now.substring(1, now.length()).toLowerCase()).append(" ");
            }
        }
        
        if(s.substring(s.length() -1, s.length()).equals(" ")) {
            return sb.toString();
        }
        
        return sb.toString().trim();
    }
}