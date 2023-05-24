import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n];
        
        answer = bt(n, 0, arr);
        return answer;
    }
    
    private int bt(int n, int idx, int[] arr) {
        if (idx == n) {
            return 1;
        }
        
        int res = 0;
        for(int i = 0; i < n; i++) {
            arr[idx] = i;
            
            if(check(idx, arr)) {
                res += bt(n, idx + 1, arr);
            }
            arr[idx] = -1;
        }
        return res;
    }
    
    private boolean check (int idx, int[] arr) {
        
        for(int i = 0; i < idx; i++) {
            if(arr[idx] == arr[i]) {
                return false;
            }
            
            if(Math.abs(arr[idx] - arr[i]) == idx - i) {
                return false;
            }
        }
        
        return true;
    }
}