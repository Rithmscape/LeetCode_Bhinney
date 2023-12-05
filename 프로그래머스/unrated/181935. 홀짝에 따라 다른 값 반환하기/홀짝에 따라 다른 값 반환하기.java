class Solution {
    public int solution(int n) {
        int num1 = 0;
        int num2 = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) num2 += Math.pow(i, 2);
            else num1 += i;
        }
        
        return n % 2 == 0 ? num2 : num1;
    }
}