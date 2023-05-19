import java.util.Stack;

class Solution {
    public int solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            char target = arr[i];
            
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
            } else {
                stack.push(target);
            }
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
}