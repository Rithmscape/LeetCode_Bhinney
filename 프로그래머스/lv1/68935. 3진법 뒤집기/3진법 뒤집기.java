class Solution {
    public int solution(int n) {
        String three = new StringBuilder(Integer.toString(n, 3)).reverse().toString();
        String ten = String.valueOf(Integer.parseInt(three, 3));

        return Integer.parseInt(ten);
    }
}