class Solution {
    public int solution(int[] arr) {
        int[] before = new int[arr.length];
		int ans = 0;
		int cnt = 0;

		while (cnt != before.length) {
			cnt = 0;
			before = arr.clone();

			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= 50 && arr[i] % 2 == 0) arr[i] /= 2;
				else if (arr[i] < 50 && arr[i] % 2 != 0) arr[i] = arr[i] * 2 + 1;

				if (arr[i] == before[i]) cnt++;
			}

			ans++;
		}

		return ans - 1;
    }
}