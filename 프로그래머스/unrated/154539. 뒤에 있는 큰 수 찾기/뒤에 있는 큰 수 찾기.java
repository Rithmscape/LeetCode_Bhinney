import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
		int[] res = new int[numbers.length];
        stack.push(0);
		
		for(int i = 1 ; i < numbers.length ; i++) {
			while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
				res[stack.pop()] = numbers[i];
            }
			stack.push(i);

		}
		while(!stack.isEmpty()) {
			res[stack.pop()] = -1;
		}
		return res;
    }
}