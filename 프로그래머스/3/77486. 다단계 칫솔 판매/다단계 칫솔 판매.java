import java.util.HashMap;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {

		/* 멤버가 키가 되어 부모를 판별하자 */
		HashMap<String, String> parents = new HashMap<>();
		for (int i = 0;  i < enroll.length; i++) {
			parents.put(enroll[i], referral[i]);
		}

		/* 수익을 분배 해주자 */
		HashMap<String, Integer> revenues = new HashMap<>();
		for (int i = 0; i < seller.length; i++) {
			sharing(seller[i], amount[i] * 100, parents, revenues);
		}

		/* 리턴할 배열에 각 판매원별로의 수익을 담아주자 */
		int[] ans = new int[enroll.length];
		for (int i = 0; i < enroll.length; i++) {
			ans[i] = revenues.getOrDefault(enroll[i], 0);
		}

		return ans;
	}

	private void sharing(String member, int sales, HashMap<String, String> parents, HashMap<String, Integer> revenues) {
		int money = sales / 10;

		revenues.put(member, revenues.getOrDefault(member, 0) + sales - money);

		if (money > 0 && parents.containsKey(member)) {
			sharing(parents.get(member), money, parents, revenues);
		}
	}
}