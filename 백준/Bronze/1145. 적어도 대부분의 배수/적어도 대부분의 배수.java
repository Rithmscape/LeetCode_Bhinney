import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();

		Arrays.sort(arr);
		int ret = arr[0];
		int cnt = 0;

		while (true) {
			cnt = 0;

			for (int i = 0; i < 5; i++) {
				if (ret % arr[i] == 0) cnt++;
			}
			
			if (cnt >= 3) break;
			else ret++;
		}

		System.out.println(ret);
	}
}