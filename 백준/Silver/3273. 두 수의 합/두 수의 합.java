import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 수열의 크기
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = Integer.parseInt(br.readLine()); // 합
		br.close();

		Arrays.sort(arr);
		int st = 0;
		int ed = n - 1;
		int ans = 0;

		while (st < ed) {
			int sum = arr[st] + arr[ed];

			if (sum == x) ans++;

			if (sum < x) st++;
			else ed--;
		}

		System.out.println(ans);
	}
}