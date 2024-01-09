import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> ans = new ArrayList<>();

		for (int i = 0; i < todo_list.length; i++) {
			if (!finished[i]) ans.add(todo_list[i]);
		}

		return ans.toArray(new String[0]);
    }
}