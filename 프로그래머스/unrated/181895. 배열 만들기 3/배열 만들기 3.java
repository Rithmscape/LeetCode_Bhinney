import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        return Arrays.stream(intervals).flatMapToInt(nums -> Arrays.stream(Arrays.copyOfRange(arr, nums[0], nums[1] + 1))).toArray();
    }
}