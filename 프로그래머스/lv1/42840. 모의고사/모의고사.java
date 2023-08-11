import java.util.*;

class Solution {
    int[] one = {1,2,3,4,5};
    int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    public int[] solution(int[] answers) {
        int[] cnt = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == one[i % 5]) cnt[0]++;
            if (answers[i] == two[i % 8]) cnt[1]++;
            if (answers[i] == three[i % 10]) cnt[2]++;
        }
        
        int max = Math.max(cnt[0], Math.max(cnt[1], cnt[2]));
        
        List<Integer> ans = new ArrayList<>();
        
        for (int i = 0; i < cnt.length; i++) {
            if (max == cnt[i]) {
                ans.add(i + 1);
            }
        }
        
        return ans.stream().mapToInt(n -> n).toArray();
    }
}