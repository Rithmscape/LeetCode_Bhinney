import java.util.Stack;

class Solution {
    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> delete = new Stack<>();
		int size = n;

		for (String s : cmd) {
			char ch = s.charAt(0);

			switch (ch) {
				case 'U' -> k -= Integer.parseInt(s.substring(2));
				case 'D' -> k += Integer.parseInt(s.substring(2));
				case 'C' -> {
					delete.push(k);
					size--;
					if (k == size) k--;
				}
				case 'Z' -> {
					if (delete.pop() <= k) k++;
					size++;
				}
			}
            
            if (k < 0) k = 0;
		}

		StringBuilder ans = new StringBuilder();
		ans.append("O".repeat(Math.max(0, size)));
		while (!delete.isEmpty()) ans.insert(delete.pop(), "X");
		return ans.toString();
    }
}