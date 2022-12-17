class Solution {
    public int reverse(int x) {
        int result = 0;
        while(x != 0) {
            int check = result * 10 + x % 10;
            
            if ((check - x % 10) / 10 != result) {
                return 0;
            }
            
            x /= 10;
            
            result = check;
        }
        
        return result;
    }
}