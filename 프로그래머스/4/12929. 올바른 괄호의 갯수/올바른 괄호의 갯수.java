class Solution {
    int ans;
    public int solution(int n) {
        ans = 0;
        dfs(0, 0, n);
        return ans;
    }
    
    private void dfs(int l, int r, int n) {
        if (l < r) return;
        if (l == n && r == n) {
            ans++;
            return;
        }
        if (l > n || r > n) return;
        dfs(l + 1, r, n);
        dfs(l, r + 1, n);
    }
}