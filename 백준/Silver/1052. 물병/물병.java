import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();
		solution(arr[0], arr[1]);
	}

	private static void solution(int N, int K) {
		int ans = 0;

		while (Integer.bitCount(N) > K) {
			ans += N & (-N);
			N += N & (-N);
		}

		System.out.println(ans);
	}
}