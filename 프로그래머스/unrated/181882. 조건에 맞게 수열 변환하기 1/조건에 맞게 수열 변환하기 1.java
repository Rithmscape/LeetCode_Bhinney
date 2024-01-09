class Solution {
    public int[] solution(int[] arr) {
        int[] ans = new int[arr.length];
        
        for (int i = 0; i < ans.length; i++) {
            int num = arr[i];
            
            if (num >= 50 && num % 2 == 0) ans[i] = num / 2;
            else if (num < 50 && num % 2 != 0) ans[i] = num * 2;
            else ans[i] = num;
        }
        
        return ans;
    }
}