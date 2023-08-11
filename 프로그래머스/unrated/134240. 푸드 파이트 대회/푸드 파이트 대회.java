class Solution {
    public String solution(int[] food) {
        String ans = "";
        
        for (int i = 0; i < food.length; i++) {
            int rep = (food[i] - (food[i] % 2 == 0 ? 0 : 1) / 2) / 2;
            ans += String.valueOf(i).repeat(rep);
        }
        String rev = new StringBuilder(ans).reverse().toString();
        
        return ans + "0" + rev;
    }
}