import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();
		solution(arr);
	}

	private static void solution(int[] arr) {
		int[] dp = new int[arr.length];
		Arrays.fill(dp, -1);

		for (int i = 0; i < arr.length; i++) {
			lis(i, arr, dp);
		}

		int max = IntStream.of(dp).max().orElse(0);
		System.out.println(max);
	}

	private static int lis(int n,int[] arr, int[] dp) {
		if (dp[n] == -1) {
			dp[n] = 1;

			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] < arr[n]) dp[n] = Math.max(dp[n], lis(i, arr, dp) + 1);
			}
		}

		return dp[n];
	}
}