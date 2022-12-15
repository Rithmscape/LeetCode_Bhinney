import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        /* Map을 이용하여 구현 */
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            }

            map.put(target - nums[i], i);
        }

        /* 없을 경우, 빈 배열을 리턴 */
        return new int[]{};
    }
}