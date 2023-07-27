import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        int idx = Arrays.asList(seoul).indexOf("Kim");
        
        return new StringBuilder().append("김서방은 ").append(idx).append("에 있다").toString();
    }
}