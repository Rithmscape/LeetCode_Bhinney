class Solution {
    public int solution(String s) {
        int answer = s.length();

		for (int i = 1; i <= s.length() / 2; i++) {
			String target = s.substring(0, i); // 문자 패턴
			String now = "";
			int cnt = 1;
			StringBuilder sb = new StringBuilder();

			for (int start = i; start <= s.length(); start += i) {
				if (start + i >= s.length()) now = s.substring(start);
				else now = s.substring(start, start + i);

				if (now.equals(target)) cnt++;
				else if (cnt == 1) {
					sb.append(target);
					target = now;
				}
				else {
					sb.append(cnt).append(target);
					target = now;
					cnt = 1;
				}
			}

			if (i != target.length()) sb.append(target);
			answer = Math.min(answer, sb.toString().length());
		}
		return answer;
    }
}