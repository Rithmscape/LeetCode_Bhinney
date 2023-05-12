class Solution {
    public int solution(int n) {
        int answer = 0;
        int cntN = Integer.bitCount(n);
        int cnt = 0;
        while(true){
            n++;
            cnt = Integer.bitCount(n);
            if(cntN == cnt){
                answer = n;
                break;
            }            
        }
                
        return answer;
    }
}