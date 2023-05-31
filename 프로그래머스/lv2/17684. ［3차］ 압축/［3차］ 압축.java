import java.util.*;

class Solution {
    HashMap<String, Integer> map = new HashMap<>();
    public int[] solution(String msg) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        init();
        
        int idx = 27;
        
        for (int i = 0; i < msg.length(); i++) {
            String str = msg.charAt(i) + "";
            
            while (map.containsKey(str)) {
                i++;
                if(i == msg.length()) {
                	break;
                } else {
                    str += msg.charAt(i);
                }
            }
            
            if (i == msg.length()) {
                arr.add(map.get(str));
                break;
            }
            
            arr.add(map.get(str.substring(0, str.length() - 1)));            
            map.put(str, idx++);

            i--;
        }
        
        int[] answer = new int[arr.size()];
        
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
    
    /* 알파벳 대문자 색인값 초기화 */
    private void init () {
        char a = 'A';
        for (int i = 1; i < 27; i++) {
            map.put(a + "", i);
            a += 1;
        }
    }
}