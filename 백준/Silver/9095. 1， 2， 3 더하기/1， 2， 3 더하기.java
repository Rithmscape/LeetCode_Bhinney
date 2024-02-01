import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] numbers = scannerFunc();
		int[] dp = dpFunc();

		for (int num : numbers) {
			System.out.println(dp[num]);
		}
	}

	private static int[] scannerFunc() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		return numbers;
	}

	private static int[] dpFunc() {
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;

		for (int i = 4; i <= 10; i++) {
			dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
		}

		return dp;
	}
}