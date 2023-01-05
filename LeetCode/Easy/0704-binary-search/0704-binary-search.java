class Solution {
   public static int search(int[] nums, int target) {
		int start = 0, end = nums.length;

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid;
			}
		}

		if (start > 0 && nums[start - 1] == target) {
			return start - 1;
		} else {
			return -1;
		}
	}
}