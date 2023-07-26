class Solution {
    public boolean solution(int x) {
        int h = 0;
        int a = x;
        while (a > 0) {
            h += a % 10;
            a /= 10;
        }
        
        return x % h == 0 ? true : false;
    }
}