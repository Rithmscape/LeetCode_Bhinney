class Solution {
    public long solution(long n) {
        
        Double num = Math.sqrt(n);
        
        return num == num.intValue() ? (long) Math.pow(num + 1, 2) : -1;
    }
}