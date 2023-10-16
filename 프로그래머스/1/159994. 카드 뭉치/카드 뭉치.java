class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
		int one = 0;
		int two = 0;

		for (String g : goal) {
			if (one < cards1.length && g.equals(cards1[one])) {
				one++;
			} else if (two < cards2.length && g.equals(cards2[two])){
				two++;
			} else {
				return "No";
			}
		}
		return answer;
    }
}