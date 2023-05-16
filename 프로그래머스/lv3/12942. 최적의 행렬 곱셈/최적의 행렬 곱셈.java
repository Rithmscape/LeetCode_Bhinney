class Solution {
    public int solution(int[][] matrix) {
        int len = matrix.length;
        int[][] dp = new int[len][len];
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {
                int a = j;
                int b = j + i;
                
                if (a == b) {
                    dp[a][b] = 0;
                } else{
                    for(int k = a; k < b; k++){
                        dp[a][b] = min(dp[a][b], dp[a][k] + dp[k+1][b] + matrix[a][0] * matrix[k][1] * matrix[b][1]);
                    }
                }
            } 
        }
        
        return dp[0][len - 1];
    }
    
     private int min(int a, int b){
        return a < b ? a : b;
    }
}