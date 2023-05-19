import java.util.Stack;

class Solution {
    public int solution(String s) {
        
        /* 문자열을 문자 배열로 변환 */
        char[] arr = s.toCharArray();
        
        /* 스택 생성 */
        Stack<Character> stack = new Stack<>();
        
        for (char target : arr) {      
            
            /* 스택이 비어있지 않고, 마지막 문자가 타겟과 같으면 스택에서 꺼내 제거 */
            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
            } else { /* 위의 조건이 아니면 스택에 넣기 */
                stack.push(target);
            }
        }
        
        /* 스택이 비어 있으면 제거가 가능한 것으로 1을 리턴, 아니면 0을 리턴 */
        return stack.isEmpty() ? 1 : 0;
    }
}