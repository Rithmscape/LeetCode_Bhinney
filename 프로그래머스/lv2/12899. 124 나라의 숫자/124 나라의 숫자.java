class Solution {
    public String solution(int n) {
        String[] nums = {"4", "1", "2"};
        String answer = "";
        
        int num = n;
        while (num > 0) {
            int rem = num % 3;
            num /= 3;
            
            if (rem == 0) {
                num--;
            }
            
            answer = nums[rem] + answer;
        }
        return answer;
    }
}