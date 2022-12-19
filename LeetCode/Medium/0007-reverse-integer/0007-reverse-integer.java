class Solution {
    public int reverse(int x) {
        
        /* 반환할 result 선언 */
        int result = 0;
        
        /* 반복문 */
        while(x != 0) {
            
						/* 
						 * 결과 * 10 : 자리 수 올려주기
						 * x % 10 : 10으로 나누어 일의 자리수 나머지 더하기
						 */ 
            int check = result * 10 + x % 10;
            
						/*  검산 */             
            if ((check - x % 10) / 10 != result) {
                return 0;
            }
            
						/* 
						* x를 10으로 나누어 자리 수 줄이기
						* 이미 x의 일의 자리 숫자는 나머지 값으로 구하여 더해 줌.
						*/ 
            x /= 10;
            
            result = check;
        }
        
        return result;
    }
}