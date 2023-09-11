import java.util.*;

class Solution {
    /*
	 * N : 스테이지 개수, 1이상 500이하의 자연수
	 * stages : 게임을 하는 사용자가 멈춰있는 스테이지, 1 이상 N + 1 이하의 자연수
	 * 실패율이 높은 스테이지부터 내림차순으로 정렬
	 */
	public int[] solution(int N, int[] stages) {
		/* 각 스테이지 별로 성공한 유저 카운팅 */
		double[] success = new double[N + 1];
		success[0] = stages.length;
		for (int now : stages) {
			for (int j = 1; j < now; j++) {
				success[j]++;
			}
		}

		/* 각 스테이지 별 실패율 담을 배열*/
		Map<Integer, Double> fail = new HashMap<>();
		for (int i = 1; i < success.length; i++) {
			if (success[i - 1] == 0) {
				fail.put(i, 0.0);
			} else {
				double d = (success[i - 1] - success[i])/ success[i - 1];
				fail.put(i, d);
			}
		}

		List<Integer> ans = new ArrayList<>(fail.keySet());
		ans.sort(((o1, o2) -> Double.compare(fail.get(o2), fail.get(o1))));

		return ans.stream().mapToInt(n -> n).toArray();
	}
}