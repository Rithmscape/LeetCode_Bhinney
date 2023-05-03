class Solution {
    public int solution(int [][]board) {
        int[][] dp = new int[board.length + 1][board[0].length + 1];
        int len = 0;
        
        for (int i = 1; i < board.length + 1; i++) {
            for (int j = 1; j < board[0].length + 1; j++) {
                if(board[i-1][j-1] != 0) {
                    int min = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                    dp[i][j] = min + 1;
                    len = Math.max(len, min + 1);
                }
            }
        }
        
        return len * len;
    }
}