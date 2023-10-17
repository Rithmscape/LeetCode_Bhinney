import java.util.PriorityQueue;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

		int[] answer = new int[score.length];
		for (int i = 0; i < score.length; i++) {
			if (pq.size() < k) {
				pq.add(score[i]);
			} else {
				if (pq.peek() <= score[i]) {
					pq.poll();
					pq.add(score[i]);
				}
			}

			if (pq.size() == 0) {
				answer[i] = 0;
			} else {
				answer[i] = pq.peek();
			}
		}

		return answer;
    }
}