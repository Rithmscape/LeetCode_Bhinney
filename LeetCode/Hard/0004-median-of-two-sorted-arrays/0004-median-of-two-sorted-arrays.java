class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
		int m = nums2.length;

		int[] arr = new int[(m + n) / 2 + 1];

		int one = 0;
		int two = 0;

		while (one + two < arr.length) {
			if (one == n) {
				arr[one + two] = nums2[two++];
			} else if (two == m) {
				arr[one + two] = nums1[one++];
			} else {
				arr[one + two] = nums1[one] < nums2[two] ?
					nums1[one++] : nums2[two++];
			}
		}

		return (arr[(n + m) / 2] + arr[(n + m - 1) / 2]) / 2.0;
    }
}