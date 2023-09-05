import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String solution(String s, String skip, int index) {
		String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < skip.length(); i++) {
			alphabet = alphabet.replace(String.valueOf(skip.charAt(i)), "");
		}

		List<Character> list = new ArrayList<>();
		for (char a : alphabet.toCharArray()) {
			list.add(a);
		}


		for (int i = 0; i < s.length(); i++) {
			int now = list.indexOf(s.charAt(i));
			ans.append(list.get(now + index));
		}

		return ans.toString();
	}
}