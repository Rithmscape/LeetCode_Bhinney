class Solution {
    public static int threeSumClosest(int[] nums, int target) {

		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[2];

		for (int i = 0; i < nums.length - 2; i++) {

			if (i > 0 && nums[i] == nums[i-1]) continue;

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[left] + nums[right] + nums[i];

				if (sum == target) {
					return sum;
				}

				if (sum > target) {
					right--;
				} else {
					left++;
				}

				if (Math.abs(target - sum) < Math.abs(target - result)) {
					result = sum;
				}
			}
		}
		
		return result;
	}
}