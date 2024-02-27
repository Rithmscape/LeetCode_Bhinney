import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		List<Integer> ans = new ArrayList<>();
		ans.add(arr[0]);
		for (int i = 1; i < n; i++) {
			int value = arr[i];

			if (ans.get(ans.size() - 1) < value) ans.add(value);
			else {
				int min = 0, max = ans.size() - 1;
				while (min < max) {
					int mid = (max + min) / 2;
					if (ans.get(mid) >= value) max = mid;
					else min = mid + 1;
				}
				ans.set(max, value);
			}
		}

		System.out.println(ans.size());
	}
}