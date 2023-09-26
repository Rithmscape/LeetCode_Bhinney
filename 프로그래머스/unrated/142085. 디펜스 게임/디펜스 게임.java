import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int ans = enemy.length;

		/* 적의 수를 모두 더하였을 때 병사의 수와 같거나 무적권을 사용할 수 있는 라운드 수가 적의 배열의 길이 이상이면 모든 라운드를 막을 수 있음 */
		int sum = Arrays.stream(enemy).sum();
		if (sum == n || enemy.length <= k) {
			return ans;
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < enemy.length; i++) {
			n -= enemy[i];
			pq.add(enemy[i]);

			if (n < 0) {
				if (k > 0) {
					n += pq.poll();
					k--;
					continue;
				}

				ans = i;
				break;
			}
		}

		return ans;
    }
}