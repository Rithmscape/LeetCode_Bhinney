import java.util.*;

class Solution {
    public int[] solution(String s) {
                
        /* 문자열에서 괄호를 제거해주고, 배열에 넣어 길이 순으로 정렬 */
        s = s.substring(2, s.length() - 2).replace("},{", "%");
        String[] str = s.split("%");
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String o1, String o2){
                return Integer.compare(o1.length(), o2.length());
            }
        });
        
        List<Integer> res = new ArrayList<>();
        for (String a : str) {
            String[] tmp = a.split(",");
            
            for (int i = 0; i < tmp.length; i++) {
                if (!res.contains(Integer.parseInt(tmp[i]))) {
                    res.add(Integer.parseInt(tmp[i]));
                }
            }
        }
        
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}