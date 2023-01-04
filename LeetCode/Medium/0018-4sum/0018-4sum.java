import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Solution {
    private static List<List<Integer>> ans = new ArrayList<>();
	private static HashSet<List<Integer>> set = new HashSet<>();

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		ans = new ArrayList<>();
		set = new HashSet<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length; i++) {
			threeSum(nums, i, target - nums[i]);
		}

		ans.addAll(set);

		return ans;
	}

	public static List<List<Integer>> threeSum(int[] nums, int st, long t) {

		for (int i = st + 1; i < nums.length - 2; i++) {
			long target = t + (nums[i] * -1);

			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				int sum = nums[l] + nums[r];

				if (sum < target) {
					l = leftSkipDupValue(nums, l, r) + 1;
				} else if (sum == target) {
					set.add(Arrays.asList(nums[st], nums[i], nums[l], nums[r]));
					l = leftSkipDupValue(nums, l, r) + 1;
					r = rightSkipDupValue(nums, l, r) - 1;
				} else {
					r = rightSkipDupValue(nums, l, r) - 1;
				}
			}
			i = leftSkipDupValue(nums, i, nums.length - 1);
		}
		return ans;
	}

	private static int leftSkipDupValue(int[] nums, int st, int end) {
		while (st < end) {
			if (nums[st] == nums[st + 1]) {
				st++;
			} else {
				break;
			}
		}
		return st;
	}

	private static int rightSkipDupValue(int[] nums, int st, int end) {
		while (st < end) {
			if (nums[end] == nums[end - 1]) {
				end--;
			} else {
				break;
			}
		}
		return end;
	}
}