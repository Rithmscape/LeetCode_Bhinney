import java.util.*;

class Solution {
    public String solution(int n, int t, int m, String[] timetable) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		int start = 540;
		int last = 0;

		for (String s : timetable) {
			String[] arr = s.split(":");
			int time = Integer.parseInt(arr[0]) * 60 + Integer.parseInt(arr[1]);

			pq.add(time);
		}

		int cnt = 0;
		for (int i = 0; i < n; i++) {
			cnt = 0;

			while (!pq.isEmpty()) {
				int cur = pq.peek();
				if (cur <= start && cnt < m) {
					pq.poll();
					cnt++;
				} else break;

				last = cur - 1;
			}
			start += t;
		}

		if (cnt < m) {
			last = start - t;
		}

		return String.format("%02d", last / 60) + ":" + String.format("%02d", last % 60);
	}
}