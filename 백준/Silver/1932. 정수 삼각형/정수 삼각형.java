import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] triangle = new int[n][n];
		for (int i = 0; i < n; i++) {
			triangle[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		br.readLine();
		solution(triangle);
	}

	private static void solution(int[][] triangle) {
		int[][] dp = new int[triangle.length][triangle.length];
		dp[0][0] = triangle[0][0];

		for (int i = 1; i < triangle.length; i++) {
			/* 왼쪽 */
			dp[i][0] = dp[i - 1][0] + triangle[i][0];

			/* 오른쪽 */
			dp[i][i] = dp[i - 1][i - 1] + triangle[i][i];

			/* 중앙 */
			for (int j = 1; j < i; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - 1]) + triangle[i][j];
			}
		}

		int ans = 0;
		for (int i = 0; i < triangle.length; i++) {
			ans = Math.max(ans, dp[triangle.length - 1][i]);
		}

		System.out.println(ans);
	}
}