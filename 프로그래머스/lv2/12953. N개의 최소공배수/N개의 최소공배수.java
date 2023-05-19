class Solution {
    public int solution(int[] arr) {
        int answer = arr[0]; 
        
        if (arr.length == 1) {
            return answer;
        }
        
        for (int i = 1; i < arr.length; i++) {
            int gcd = getGcd(answer, arr[i]);
            
            answer = (answer * arr[i]) / gcd;
        }
        
        return answer;
    }
    
    private int getGcd(int x, int y) {
        int z = x % y;
        
        if(z == 0) {
            return y;
        } else {
            return getGcd(y, z);
        }
    }
}