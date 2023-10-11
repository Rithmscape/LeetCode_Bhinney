import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int ans = 0;

		Arrays.sort(score);

		for(int i = score.length; i >= m; i -= m){
			ans += score[i - m] * m;
		}

		return ans;
    }
}