import java.util.Stack;

class Solution {
    public int solution(int[] order) {
		int ans = 0;
		/* 가장 마지막에 보조 컨테이너 벨트에 보관한 상자부터 꺼내게 됩니다 --> Stack 사용 */
		Stack<Integer> secondContainer = new Stack<>();

		int orderIdx = 0;
		int orderNum = 1;

		while (true) {
			if (!secondContainer.isEmpty() && order[orderIdx] == secondContainer.peek()) {
				ans++;

				orderIdx++;
				secondContainer.pop();

				continue;
			}

			if (orderNum > order.length) {
				break;
			}

			if (order[orderIdx] == orderNum) {
				ans++;
				
				orderNum++;
				orderIdx++;

				continue;
			}

			secondContainer.push(orderNum);
			orderNum++;
		}

		return ans;
	}
}