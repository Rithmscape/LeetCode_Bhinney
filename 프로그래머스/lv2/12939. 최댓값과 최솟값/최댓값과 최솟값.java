class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int n = Integer.parseInt(arr[i]);
            
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(min).append(" ").append(max);
        
        return sb.toString();
    }
}