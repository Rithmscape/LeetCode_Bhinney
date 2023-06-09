import java.util.*;

class Solution {
    public boolean solution(String[] phone) {
        Set<String> set = new HashSet<>(Arrays.asList(phone));
        
        for (String s : phone) {
            for (int i = 1; i < s.length(); i++) {
                if (set.contains(s.substring(0, i))) {
                    return false;
                }
            }
        }
        
        return true;
    }
}