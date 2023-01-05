import java.util.HashMap;
import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
		HashMap<String, String> map = new HashMap<>();
		map.put("(", ")");
		map.put("[", "]");
		map.put("{", "}");

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			String target = String.valueOf(s.charAt(i));

			if (target.equals("(") || target.equals("[") || target.equals("{")) {
				stack.add(target);
			} 
			else if (target.equals(")") || target.equals("}") || target.equals("]") ) {
				if (stack.isEmpty()) {
					return false;
				}

				String tmp = stack.pop();

				if (!target.equals(map.get(tmp))) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}
}
