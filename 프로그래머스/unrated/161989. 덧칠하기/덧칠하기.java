class Solution {
    public static int solution(int n, int m, int[] section) {
		/* 만약 붓질을 한 섹션만 할 수 있다면, 섹션의 길이만큼 해야함 */
		if (m == 1) {
			return section.length;
		}

		int ans = 1; /* 최소 한 번은 하고 시작할 테니 */
		int cur = section[0];

		for (int i = 1; i < section.length; i++) {
			if (section[i] - cur + 1 <= m) {
				continue;
			}

			ans++;
			cur = section[i];
		}

		return ans;
	}
}