import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 배열의 크기, N은 10의 5승보다 작거나 같은 자연수
		int k = sc.nextInt(); // min(10의 9승, N 제곱)보다 작거나 같은 자연수
		sc.close();

		int left = 1; 
		int right = k;
		int ans = 0;

		while (left <= right) {
			int mid = (left + right) / 2;
			long cnt = 0;

			for (int i = 1; i <= n; i++)
				cnt += Math.min(mid / i, n);

			if (cnt < k) left = mid + 1;
			else {
				right = mid - 1;
				ans = mid;
			}
		}

		System.out.println(ans);
	}
}