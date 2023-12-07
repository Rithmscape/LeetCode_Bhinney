import java.util.stream.IntStream;

class Solution {
    public int solution(int n, int[][] results) {
        int[][] res = new int[n + 1][n + 1];

		for (int[] r : results) {
			res[r[0]][r[1]] = 1;
			res[r[1]][r[0]] = -1;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < n + 1; j++) {
				for (int k = 1; k < n + 1; k++) {
					if (res[i][k] == 1 && res[k][j] == 1) {
						res[i][j] = 1;
						res[j][i] = -1;
					}
                    if (res[i][k] == -1 && res[k][j] == -1) {
						res[j][i] = 1;
						res[i][j] = -1;
					}
				}
			}
		}

		int answer = 0;

		for (int[] r: res) {
			if (IntStream.of(r).filter(i -> i != 0).count() == n - 1) answer++;
		}

		return answer;
    }
}