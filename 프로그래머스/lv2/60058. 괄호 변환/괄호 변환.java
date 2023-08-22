import java.util.*;

class Solution {
    public String solution(String p) {
        return func(p);
    }
    
    public String func(String w) {
        /* 빈 문자열일 경우, 빈 문자열을 반환 */
        if (w.length() == 0) return w;
        
        /* "균형잡힌 괄호 문자열" u, v로 분리 */
        String v = "", u = "";
        int left = 0, right = 0;
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == '(') left++;
            else right++;
            u += w.charAt(i);
            
            if (left == right) {
                v = w.substring(i + 1);
                break;
            }
        }
        
        /* 문자열 u가 "올바른 괄호 문자열" 이라면 문자열 v에 대해 1단계부터 다시 수행 */
        /* 수행한 결과 문자열을 u에 이어 붙인 후 반환 */
        if (isCorrect(u)) return u += func(v);
        else { /* 문자열 u가 "올바른 괄호 문자열"이 아니라면 아래 과정을 수행 */
            /* 빈 문자열에 첫 번째 문자로 '('를 붙임 */
            String tmp = "(";
                
            /* 문자열 v에 대해 1단계부터 재귀적으로 수행한 결과 문자열을 이어 붙임 */
            tmp += func(v);
                
            /* ')'를 다시 붙임 */
            tmp += ")";
                
            /* u의 첫 번째와 마지막 문자를 제거 */
            u = u.substring(1, u.length() - 1);
                
            /* 나머지 문자열의 괄호 방향을 뒤집어서 뒤에 붙임 */
            for (int i = 0; i < u.length(); i++) {
               tmp += u.charAt(i) == '(' ? ')' : '('; 
            }
                
            return tmp;
        }
    }
    
    public boolean isCorrect(String u) {
        Stack<Character> s = new Stack<>();
        
        for (int i = 0; i < u.length(); i++) {
            if (u.charAt(i) == '(') s.push('(');
            else if (s.isEmpty() || s.peek() == ')') return false;
            else s.pop();
        }
        
        return true;
    }
}