import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int s : tangerine) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        
        List<Integer> key = new ArrayList<>(map.keySet());
        key.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        for(int i : key) {
        	k -= map.get(i);
        	answer++;
        	if(k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}