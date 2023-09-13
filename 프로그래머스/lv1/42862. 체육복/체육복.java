import java.util.*;

class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
		Arrays.sort(reserve);

		/* 체육복을 가져온 학생 수만큼 기본적으로 체육 수업을 들을 수 있음 */
		int ans = n - lost.length;

		boolean[] lend = new boolean[lost.length];
		Set<Integer> rSet = new LinkedHashSet<>();
		for (int i = reserve.length - 1; i >= 0; i--) {
			rSet.add(reserve[i]);
		}

		/* 여분의 체육복을 가져온 학생이 잃어버린 학생에 포함이 된다면, 수업을 들을 수 있는 학생수를 더해주고 해당 학생의 번호를 지우기 */
		for (int i = 0; i < lost.length; i++) {
			int l = lost[i];
			if (rSet.contains(l) && !lend[i]) {
				lend[i] = true;
				ans++;
				rSet.remove(l);
			}
		}

		for (int i = lost.length - 1; i >= 0; i--) {
			int l = lost[i];

			if (!lend[i] && rSet.contains(l + 1)) {
				ans++;
				lend[i] = true;
				rSet.remove(l + 1);
			} else if (!lend[i] && rSet.contains(l - 1)) {
				ans++;
				lend[i] = true;
				rSet.remove(l - 1);
			}
		}

		return ans;
	}
}