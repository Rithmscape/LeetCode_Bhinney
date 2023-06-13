import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        List<String> list = new ArrayList<>();
        int[] answer = {0, 0};
        list.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String last = words[i - 1];
            String now = words[i];
            
            if (last.charAt(last.length() - 1) != now.charAt(0) || list.contains(now)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                
                break;
            }
            
            list.add(now);
        }
        
        return answer;
    }
}