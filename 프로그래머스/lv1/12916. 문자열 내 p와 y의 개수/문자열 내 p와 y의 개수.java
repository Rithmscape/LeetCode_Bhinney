import java.util.stream.*;

class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        long p = s.chars().filter(ch -> ch == 'p').count();
        long y = s.chars().filter(ch -> ch == 'y').count();
        
        return p == y ? true : false;
    }
}