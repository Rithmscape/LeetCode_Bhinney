class Solution {
    public int[] solution(int n, long left, long right) {
        int len = (int) (right - left) + 1;
        int[] answer = new int[len];
        
        for(int i = 0; left <= right; i++, left++) {
            answer[i] = (int) Math.max(left / n, left % n) + 1;
        }
        
        return answer;
    }
}