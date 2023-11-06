import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {

		/* 문제에는 jobs 배열이 정렬되어있다고 나와있지 않음, 따라서 정렬해주기 */
		Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

		/* 처리 시간의 오름차순 큐 */
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

		int ans = 0;
		int end = 0;
		int cnt = 0;
		int idx = 0;

		while (cnt < jobs.length) {
			while (idx < jobs.length && jobs[idx][0] <= end) {
				pq.add(jobs[idx++]);
			}

			if (pq.isEmpty()) {
				end = jobs[idx][0];
			} else {
				int[] tmp = pq.poll();
				ans += tmp[1] + end - tmp[0];
				end += tmp[1];
				cnt++;
			}
		}

		return (int)Math.floor(ans / jobs.length);
	}
}