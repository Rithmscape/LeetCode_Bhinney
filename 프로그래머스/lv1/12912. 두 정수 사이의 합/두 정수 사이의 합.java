class Solution {
    public long solution(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        long sum = 0;

        for (int i = min; i <= max; i++) {
            sum += i;
        }

        return sum;
    }
}