class Solution {
    public static int[] twoSum(int[] numbers, int target) {
		int start = 0;
		int end = numbers.length - 1;

		while (numbers[start] + numbers[end] != target) {
			int sum = numbers[start] + numbers[end];

			if (sum < target) start++;
			else if (sum > target) end--;
		}

		return new int[]{start + 1, end + 1};
	}
}