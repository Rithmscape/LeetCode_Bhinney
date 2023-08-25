import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

class Solution {
    public static int[] solution(String[] gems) {
		int[] ans = new int[2];

		/*
		 * Set을 이용해서 종류 확인하기
		 * Set.size() == 종류 개수
		 */
		int cnt = new HashSet<>(List.of(gems)).size();

		/* 보석의 개수 확인하며, 반복문을 돌기 */
		Map<String, Integer> jewel = new HashMap<>();
		int start = 0;
		int len = Integer.MAX_VALUE;
		for (int i = 0; i < gems.length; i++) {
			jewel.put(gems[i], jewel.getOrDefault(gems[i], 0) + 1); /* 개수를 카운팅 */

			/*  시작점과 같은 보석이 들어갔을 경우, 시작점을 더해주고 보석의 개수를 빼준다.*/
			while (jewel.get(gems[start]) > 1) { 
				jewel.put(gems[start],jewel.get(gems[start]) - 1);
				start++;
			}

			if (jewel.size() == cnt && len > (i - start)) {
				len = i - start;
				ans[0] = start + 1;
				ans[1] = i + 1;
			}
		}

		return ans;
	}
}