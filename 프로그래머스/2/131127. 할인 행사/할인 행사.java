import java.util.*;

class Solution {
    public static int solution(String[] want, int[] number, String[] discount) {
		int ans = 0;

		/* 각 물품 별로 원하는 개수를 맵에 담기? */
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < want.length; i++) {
			map.put(want[i], number[i]);
		}

		/* 만약에 디스카운트에 해당하는 물품이 없을 경우 0을 리턴 */
		List<String> list = new ArrayList<>(map.keySet());
		List<String> disList = new ArrayList<>(Arrays.asList(discount));
		for (String l : list) {
			if (!disList.contains(l)) {
				return ans;
			}
		}

		for (int i = 0; i <= discount.length - 10; i++) {
			List<String> dList = disList.subList(i, i + 10);
			boolean buy = true;
			for (String w : want) {
				int cnt = map.get(w);
				int disCnt = (int)dList.stream().filter(a -> a.equals(w)).count();

				if (cnt != disCnt) {
					buy = false;
					break;
				}
			}

			if (buy) ans++;
		}

		return ans;
	}
}