import java.util.Arrays;

class Solution {
	public static int solution(int distance, int[] rocks, int n) {
		int answer = 0;
		Arrays.sort(rocks); /* 이분 탐색은 오름차순 정렬 */
		int left = 0; /* 출발 지점 */
		int right = distance; /* 도착 지점 */
		int mid;

		while (left <= right) {
			mid = left + (right - left) / 2;
			int remove = 0;
			int pre = 0;

			for (int rock : rocks) {
				if (rock - pre < mid) {
					remove++;
				} else {
					pre = rock;
				}
			}

			if (distance - pre < mid) {
				remove++;
			}
			if (remove <= n) {
				left = mid + 1;
				answer = Math.max(mid, answer);
			} else {
				right = mid - 1;
			}
		}
		return answer;
	}
}