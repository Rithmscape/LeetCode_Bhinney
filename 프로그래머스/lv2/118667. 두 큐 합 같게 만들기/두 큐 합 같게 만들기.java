import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int solution(int[] queue1, int[] queue2) {
		int answer = 0;

		/* 큐 문제이니 큐를 생성 */
		Queue<Integer> q1 = new LinkedList<>();
		Queue<Integer> q2 = new LinkedList<>();

		/* 최초에 주어지는 길이가 같으므로 하나의 배열의 길이대로 반복문을 돌아도 됨 */
		for (int i = 0; i < queue1.length; i++) {
			q1.add(queue1[i]);
			q2.add(queue2[i]);
		}

		long sum1 = getSum(q1);
		long sum2 = getSum(q2);

		/* 각 큐의 값을 같게 만들 수 없다면 -1 리턴 */
		if ((sum1 + sum2) % 2 != 0) {
			return -1;
		}

		while (answer < (queue1.length + queue2.length) * 3) {

			/* 합이 같으면 반복문 종료 시키기 */
			if (sum1 == sum2) return answer;

			else if (sum1 > sum2) {
				Integer tmp = q1.poll();
				q2.add(tmp);

				sum1 -= tmp;
				sum2 += tmp;

				answer++;
			} else if (sum1 < sum2) {
				Integer tmp = q2.poll();
				q1.add(tmp);

				sum1 += tmp;
				sum2 -= tmp;

				answer++;
			}
		}

		return -1;
	}
	public static long getSum(Queue<Integer> queue) {
		int sum = 0;

		for (int n : queue) {
			sum += n;
		}

		return sum;
	}
}