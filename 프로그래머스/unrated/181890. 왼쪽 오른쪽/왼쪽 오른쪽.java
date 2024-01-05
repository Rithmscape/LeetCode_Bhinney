import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        int idx = 0;
		boolean isL = true;

		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].equals("l")) {
				idx = i;
				isL = true;
				break;
			} else if (str_list[i].equals("r")) {
				idx = i;
				isL = false;
				break;
			} else continue;
		}

		return isL ? Arrays.copyOfRange(str_list, 0, idx) : Arrays.copyOfRange(str_list, idx + 1, str_list.length);
    }
}