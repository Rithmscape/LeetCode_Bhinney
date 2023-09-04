import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] solution(String[] keymap, String[] targets) {

		/* 반환할 리턴 값 선언 */
		int[] ans = new int[targets.length];

		/* Map 자료 구조를 이용하여 문제 해결 */
		Map<Character, Integer> key = new HashMap<>();

		/* 반복문을 돌면서, Map 에 문자별로 가장 적은 인덱스를 넣어준다 -> 가장 적은 카운트를 세기 위함 */
		for (String k : keymap) {
			for (int i = 0; i < k.length(); i++) {
				char a = k.charAt(i);

				if (key.containsKey(a)) {
					int idx = key.get(a);
					key.put(a, Math.min(idx, i + 1));
				} else {
					key.put(a, i + 1);
				}
			}
		}

		/* 반복문을 돌면서, 해당 글자의 최소 키패드 입력 수를 계산해준다. 만약 할 수 없으면 -1을 반환 */
		for (int i = 0; i < targets.length; i++) {
			int cnt = 0;
			boolean check = true;

			for (char c : targets[i].toCharArray()){
				if (key.containsKey(c)) {
					cnt += key.get(c);
				} else {
					check = false;
					break;
				}
			}

			ans[i] = (check) ? cnt : -1;
		}

		return ans;
	}
}