import java.util.*;

class Solution {
    List<int[]> ans;
    public int[][] solution(int n) {
        ans = new ArrayList<>();
        dfs(n, 1, 3, 2);
        
        int[][] answer = new int[ans.size()][2];
        for(int i = 0 ; i < ans.size() ; ++i){
            int[] arr = ans.get(i);
            answer[i][0] = arr[0];
            answer[i][1] = arr[1];  
        }
        
        return answer;
    }
    
    private void dfs(int n, int from, int to, int num) {
        int[] arr = {from, to};
        
        if (n == 1) {
            ans.add(arr);
        } else {
            dfs(n - 1, from, num, to);
            ans.add(arr);
            dfs(n - 1, num, to, from);
        }
    }
}