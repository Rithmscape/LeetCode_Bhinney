class Solution {
    public int reverse(int x) {
        
        /* 반환할 result 선언 */
        int result = 0;
        
        /* 반복문 */
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