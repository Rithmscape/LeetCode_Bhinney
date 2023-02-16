import java.util.ArrayList;

class Solution {
    static int[] discount = {10, 20, 30, 40};
	static ArrayList<int[]> result;
	public static int[] solution(int[][] users, int[] emoticons) {
		result = new ArrayList<>();
		result.add(new int[]{0,0});

		dfs(users, emoticons, new int[emoticons.length], 0);
		result.sort((a, b) -> b[0] - a[0] == 0 ? b[1] - a[1] : b[0] - a[0]);
		return result.get(0);
	}

	private static void dfs(int[][] users, int[] emoji, int[]dis_info, int idx) {

		/* 재귀 종료 조건 */
		if (idx == emoji.length) {
			int plus = 0;
			int price = 0;

			for (int[] user : users) {
				int sum = 0;
				for (int j = 0; j < emoji.length; j++) {
					if (dis_info[j] >= user[0]) {
						sum += emoji[j] / 100 * (100 - dis_info[j]);
					}
				}

				if (sum >= user[1]) {
					plus++;
				} else {
					price += sum;
				}
			}

			result.add(new int[]{plus, price});
		} else {
			for (int i = 0; i < 4; i++) {
				dis_info[idx] = discount[i];
				dfs(users, emoji, dis_info, idx + 1);
			}
		}
	}
}