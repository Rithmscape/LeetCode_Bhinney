class Solution {
    private static int[] result = {-1};
	private static int[] lion_info;
	private static int max = Integer.MIN_VALUE;
	public static int[] solution(int n, int[] info) {
		lion_info = new int[11];
		dfs(n, info, 0);
		return result;
	}

	private static void dfs(int n, int[] peach_info, int cnt) {

		/* 라이언이 쏜 화살의 개수 == n개가 되면 계산 */
		if (cnt == n) {
			int peach_total = 0;
			int lion_total = 0;

			for (int i = 0; i < 11; i++) {
				if (peach_info[i] != 0 || lion_info[i] != 0) {
					if (peach_info[i] >= lion_info[i])
						peach_total += 10 - i;
					else lion_total += 10 - i;
				}
			}
			if(peach_total < lion_total) {
				int target = lion_total - peach_total;
				if (target >= max) {
					result = lion_info.clone();
					max = target;
				}
			}
			return ;
		}

		/* 재귀 */
		for(int i = 0; i < 11 && lion_info[i] <= peach_info[i]; i++) {
			lion_info[i]++;
			dfs(n, peach_info, cnt + 1);
			lion_info[i]--;
		}
	}
}