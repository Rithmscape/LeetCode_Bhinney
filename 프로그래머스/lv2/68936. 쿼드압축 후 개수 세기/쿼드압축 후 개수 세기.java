class Solution {
    int[] ans;
    public int[] solution(int[][] arr) {
        ans = new int[2];
        func(0, 0, arr.length, arr);
        return ans;
    }
    
    private void func(int x, int y, int len, int[][] arr) {
        if (check(x, y, len, arr)) {
            ans[arr[x][y]]++;
            return;
        }
        
        func(x, y, len / 2, arr);
        func(x + len / 2, y, len / 2, arr);
        func(x, y + len / 2, len / 2, arr);
        func(x + len / 2, y + len / 2, len / 2, arr);
    }
    
    private boolean check(int x, int y, int len, int[][] arr) {
        for (int i = x; i < x + len; i++) {
            for (int j = y; j < y + len; j++) {
                if (arr[i][j] != arr[x][y]) {
                    return false;
                }
            }
        }
        return true;
    }
}