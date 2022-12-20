class Solution {
    public int solution(String s) {
        
        char target = s.charAt(0);
		int count = 0;
		int next = 0;
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			if (count == next) {
				answer++;
				target = s.charAt(i);
			}
			if (target == s.charAt(i)) {
				count++;
			} else {
				next++;
			}
		}
		return answer;
    }
}