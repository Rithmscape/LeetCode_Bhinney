import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('R',0);
        map.put('T',0);
        map.put('C',0);
        map.put('F',0);
        map.put('J',0);
        map.put('M',0);
        map.put('A',0);
        map.put('N',0);
        
        for (int i = 0; i < survey.length; i++) {
            int val = choices[i];
            char key;
            
            if (val > 0 && val < 4) {
                key = survey[i].charAt(0);
                int value = map.get(key);
                map.put(key, value + 4 - val);
            } else if (val > 4) {
                key = survey[i].charAt(1);
                int value = map.get(key);
                map.put(key, value + val - 4);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(map.get('R') >= map.get('T') ? 'R' : 'T');
        sb.append(map.get('C') >= map.get('F') ? 'C' : 'F');
        sb.append(map.get('J') >= map.get('M') ? 'J' : 'M');
        sb.append(map.get('A') >= map.get('N') ? 'A' : 'N');
        
        return sb.toString();
    }
}