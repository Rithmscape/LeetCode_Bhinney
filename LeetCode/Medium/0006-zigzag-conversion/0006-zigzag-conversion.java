import java.util.ArrayList;


class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
			return s;
		}

		ArrayList<String>[] arr = new ArrayList[numRows];

		int curRow = 0;
		int curStringIdx = 0;

		for (int i = 0; i < numRows; i++) {
			arr[i] = new ArrayList<>();
		}

		while(curStringIdx < s.length()) {
			while (curRow < numRows && curStringIdx < s.length()) {
				arr[curRow].add(String.valueOf(s.charAt(curStringIdx)));
				curRow++;
				curStringIdx++;
			}

			curRow -= 2;

			while (curRow > 0 && curStringIdx < s.length()) {
				arr[curRow].add(String.valueOf(s.charAt(curStringIdx)));
				curRow--;
				curStringIdx++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			for (int j = 0 ; j < arr[i].size(); j++) {
				sb.append(arr[i].get(j));
			}
		}

		return sb.toString();
    }
}