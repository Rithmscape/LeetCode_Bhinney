import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		br.close();
		solution(arr);
	}

	private static void solution(int[][] arr) {
		int[][] dp = new int[31][31];

		for (int i = 1; i <= 30; i++) {
			dp[i][1] = i;
		}

		for (int i = 2; i <= 30 ; i++) {
			for (int j = 2; j <= 30; j++) {
				dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
			}
		}

		for (int[] ints : arr) {
			System.out.println(dp[ints[1]][ints[0]]);
		}
	}
}