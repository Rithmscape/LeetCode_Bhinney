class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zero = 0;
        String str = s;

        while (!s.equals("1")) {
            cnt++;
            str = s.replaceAll("0", "");
            zero += s.length() - str.length();
            s = Integer.toBinaryString(str.length());
        }
        
        int[] answer = new int[2];
        
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
}