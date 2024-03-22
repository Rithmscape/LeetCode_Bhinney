import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); // 길이

		/* b는 재배열 하지 말라고 하였으나, b의 특정 값을 찾지 않음으로 그냥 정렬 해주기 */
		int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
		int[] b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
		br.close();

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans += a[i] * b[n - i - 1];
		}

		System.out.println(ans);
	}
}