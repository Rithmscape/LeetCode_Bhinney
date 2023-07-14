import java.util.*;

class Solution {
    Map<String, Integer> map;
    public String[] solution(String[] orders, int[] course) {
        List<String> ans = new ArrayList<>();
        
        for (int i = 0; i < orders.length; i++) {
            char[] arr = orders[i].toCharArray();
            Arrays.sort(arr);
            orders[i] = String.valueOf(arr);
        }
        
        for (int i = 0; i < course.length; i++) {
            map = new HashMap<>();
            int max = -1;
            
            for (String order : orders) {
                if (order.length() >= course[i]) {
                    combination(order, "", course[i]);
                }
            }
            
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                    max = Math.max(max,entry.getValue());
                   
            }
            
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                    if(max >= 2 && entry.getValue() == max)
                        ans.add(entry.getKey());
            }
        }
        
        
        return ans.stream().distinct().sorted().toArray(String[]::new);
    }
    
    private void combination(String order, String str, int len) {
        if (len == 0) {
            map.put(str, map.getOrDefault(str, 0) + 1);
            return;
        }
        
        for (int i = 0; i < order.length(); i++) {
            combination(order.substring(i + 1), str + order.charAt(i), len - 1);
        }
    }
}