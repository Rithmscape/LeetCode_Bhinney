import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr = numbers.clone();
		br.close();
		solution(arr, numbers, n);
	}
	private static void solution(int[] arr, int[] numbers, int n) {
		Arrays.sort(arr);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (numbers[i] == arr[j]) {
					sb.append(j).append(" ");
					arr[j] = -1;
					break;
				}
			}
		}
		System.out.println(sb.toString());
	}
}