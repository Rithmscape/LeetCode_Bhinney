import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        ArrayList<String> ans = new ArrayList<>();

		for (int i = 0; i < my_string.length(); i++) {
			ans.add(my_string.substring(i));
		}

		return ans.stream().sorted().toArray(String[]::new);
    }
}