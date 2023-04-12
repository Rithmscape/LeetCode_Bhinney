import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2; /* 고를 수 있는 폰켓몬 수 */
        HashSet<Integer> set = new HashSet<>();
        
        /* 중복 제거 */
        for(int num : nums) {
            set.add(num);
        }

        if(set.size() > max) {
            return max;
        } 
        
        return set.size();
    }
}