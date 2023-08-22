import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public static int solution(String[][] book_time) {
		int ans = 0;

		/* 큐에 시간을 넣을 때마다 정렬하도록 */
		PriorityQueue<Integer> pq = new PriorityQueue<>((Integer o1, Integer o2) -> (o1 - o2));

		/* 리스트에 담기 */
		List<int[]> list = new ArrayList<>();
		for (String[] bt : book_time) {
			int[] arr = new int[2];
			arr[0] = parseTime(bt[0]);
			arr[1] = parseTime(bt[1]);
			list.add(arr);
		}

		/* 오름차순으로 정렬 */
		list.sort((int[] o1, int[] o2) -> o1[0] - o2[0]);

		for (int[] l : list) {
			int start = l[0];
			int end = l[1];

			Integer p = pq.peek();

			if (p == null || p > start ) {
				pq.add(end + 10);
				ans++;
			} else if (p != null && p <= start) {
				pq.poll();
				pq.add(end + 10);
			}
		}

		return ans;
	}

	private static int parseTime(String bt) {
		String[] arr = bt.split(":");
		int time = Integer.parseInt(arr[0]) * 60;
		time += Integer.parseInt(arr[1]);

		return time;
	}
}