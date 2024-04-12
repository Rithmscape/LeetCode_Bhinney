import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		br.close();
		solution(arr[0], arr[1]);
	}

	private static void solution(int n, int k) {
		LinkedList<Integer> l = new LinkedList<>();
		for (int i = 1; i <= n; i++) l.offer(i);

		StringBuilder ans = new StringBuilder();
		ans.append("<");

		int idx = 0;
		while (l.size() > 1) {
			idx = (idx + (k - 1)) % l.size();
			ans.append(l.remove(idx)).append(", ");
		}

		ans.append(l.remove()).append(">");
		System.out.println(ans.toString());
	}
}