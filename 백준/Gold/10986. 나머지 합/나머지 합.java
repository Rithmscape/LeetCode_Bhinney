import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();
		solution(arr[0], arr[1], numbers);
	}

	private static void solution(int n, int m, int[] numbers) {
		int sum = 0;
		long res = 0;
		int[] cnt = new int[1000];

		for (int i = 0; i < n; i++) {
			sum += numbers[i];
			sum %= m;
			res += cnt[sum];
			cnt[sum]++;
			if (sum == 0) res++;
		}

		System.out.println(res);
	}
}