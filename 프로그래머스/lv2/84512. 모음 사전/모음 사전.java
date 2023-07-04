class Solution {
    String[] arr = {"A", "E", "I", "O", "U"};
    int ans = 0;
    boolean fin = false;
    public int solution(String word) {
        dfs("", word);
        return ans;
    }
    
    private void dfs(String str, String word) {
        if (str.length() > 5) {
            return;
        }
        
        if (str.equals(word)) {
            fin = true;
            return;
        }
        
        ans++;
                
        for (int i = 0; i < 5 ; i++) {
            dfs(str + arr[i], word);
            if (fin) {
                return;
            }
        }
    }
}