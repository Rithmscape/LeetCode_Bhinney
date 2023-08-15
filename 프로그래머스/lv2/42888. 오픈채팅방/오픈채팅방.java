import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>(); /* 유저 아이디, 닉네임 */
        int change = 0;
        
        for (String r : record) {
            String[] arr = r.split(" ");
            
            if (arr[0].equals("Leave")) {
                continue;
            } 
            
            if (arr[0].equals("Enter")) {
                map.put(arr[1], arr[2]);
                continue;
            }
            
            if (arr[0].equals("Change")) {
                map.put(arr[1], arr[2]);
                change++;
                continue;
            }
        }
        
        String[] ans = new String[record.length - change];
        int idx = 0;
        
        for (String r : record) {
            String[] arr = r.split(" ");
            String name = map.get(arr[1]);
            
            if (arr[0].equals("Enter")) {
                ans[idx++] = name + "님이 들어왔습니다.";
                continue;
            }
            
            if (arr[0].equals("Leave")) {
                ans[idx++] = name + "님이 나갔습니다.";
                continue;
            }
        }
        return ans;
    }
}