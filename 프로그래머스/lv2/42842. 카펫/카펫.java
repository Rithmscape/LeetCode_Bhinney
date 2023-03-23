class Solution {
    public int[] solution(int brown, int yellow) {
        int[] arr = new int[2];
        int total = brown + yellow;
        
        for (int i = 3; i < total; i++) {
            if (total % i == 0 && total / i >= 3) {
                int x = Math.max(i, total / i);
                int y = Math.min(i, total / i);
                
                int mid = (x - 2) * (y - 2);
                
                if (mid == yellow) {
                    arr[0] = x;
                    arr[1] = y;
                }
            }
        }

        return arr;
    }
}