class Solution {
    public boolean isPalindrome(int x) { /* x == 121 */

        /* x가 0보다 작으면 거짓 */
        if(x < 0){
            return false;
        }
        
        int reverse = 0;
        int temp = x; /* temp == 121 */

        /* 반복문 */
        while(temp != 0){ 
            
            /* reverse에 10을 곱한 값 + 들어오는 값을 10으로 나눈 나머지*/
            reverse = reverse*10 + temp%10; /* reverse = 0 + 1 */
                                            /* reverse = 10 + 2 */
                                            /* reverse = 120 + 1 */
            /* temp 값 바꾸기 */
            temp /= 10; /* temp = 12 */
                        /* temp = 1 */
                        /* temp = 0 */
        }

        /* reverse = 120 + 1 = 121 == x */
        return reverse == x;
    }
}