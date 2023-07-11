class Solution {
    public int[] solution(int[] seq, int k) {
        int sum = 0;
        int left = 0;
        int right = seq.length - 1;
        
        for (int l = 0, r = 0; l < seq.length; l++) {
            while (r < seq.length && sum < k) {
                sum += seq[r++];
            }
            
            if (sum == k && (right - left) > (r - l - 1)) {
                left = l;
                right = r - 1;
            }
            sum -= seq[l];
        }
        
        return new int[]{left, right};
    }
}