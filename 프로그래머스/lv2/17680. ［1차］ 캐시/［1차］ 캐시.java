import java.util.*;

class Solution {
    public int solution(int size, String[] cities) {
        
        if (size == 0) {
            return cities.length * 5;
        }

        int ans = 0;
        Queue<String> cache = new LinkedList<>();
        
        for (String city : cities) {
            city = city.toLowerCase();
            
            if (cache.remove(city)) {
                ans += 1;
            } else {
                if(cache.size() >= size) {
                    cache.poll();
                }
                ans += 5;
            }
            
            cache.offer(city);
        }
        
        return ans;
    }
}