import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] items = new int[arr[0] + 1][2];

		for (int i = 1; i <= arr[0]; i++) {
			items[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}

		solution(items, arr[0], arr[1]);
	}

	private static void solution(int[][] items, int n, int k) {
		int[][] dp = new int[n + 1][k + 1];

		for (int j = 1; j <= k; j++) {
			for (int i = 1; i <= n; i++) {
				dp[i][j] = dp[i - 1][j];
				if (j - items[i][0] >= 0) {
					dp[i][j] = Math.max(dp[i - 1][j], items[i][1] + dp[i - 1][j - items[i][0]]);
				}
			}
		}

		System.out.println(dp[n][k]);
	}
}