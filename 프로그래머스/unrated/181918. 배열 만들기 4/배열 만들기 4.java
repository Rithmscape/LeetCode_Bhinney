import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
		int i = 0;
		
		while (i < arr.length) {
			if (stk.isEmpty()) stk.add(arr[i++]);
			else if (stk.peek() < arr[i]) stk.add(arr[i++]);
			else stk.pop();
		}
		
		return stk.stream().mapToInt(n -> n).toArray();
    }
}