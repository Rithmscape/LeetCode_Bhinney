import java.util.stream.*;

public class Solution {
    public int solution(int n) {
        
        return new StringBuilder().append(n).chars().map(Character::getNumericValue).sum();
    }
}