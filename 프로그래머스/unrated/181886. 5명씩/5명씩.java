import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        ArrayList<String> ans = new ArrayList<>();
        
        for (int i = 0; i < names.length; i += 5) {
            ans.add(names[i]);
        }
        
        return ans.toArray(new String[ans.size()]);
    }
}