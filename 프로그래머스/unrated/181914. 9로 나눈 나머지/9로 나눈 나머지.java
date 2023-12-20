class Solution {
    public int solution(String number) {
        int num = 0;
        
        for (char ch : number.toCharArray()) {
            num += Character.getNumericValue(ch);
        }
        
        return num % 9;
    }
}