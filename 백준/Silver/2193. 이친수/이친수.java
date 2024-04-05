import java.util.Scanner;

public class Main {

	/*
	 * 이친수 조건
	 * 1. 0으로 시작하지 않는다.
	 * 2. 1이 연속으로 두 번 나타나지 않는다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		solution(n);
	}

	private static void solution(int n) {
		long[] dp = new long[n + 1];
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		System.out.println(dp[n]);
	}
}