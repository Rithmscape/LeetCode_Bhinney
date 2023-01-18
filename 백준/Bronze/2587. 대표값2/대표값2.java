import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws Exception {
		new Main();
		solution();
	}
	private static void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			arr.add(Integer.parseInt(br.readLine()));
		}
		br.close();

		Collections.sort(arr);

		int avg = (int) arr.stream().mapToInt(Integer::intValue).average().getAsDouble();
		int mid = arr.get(2);

		System.out.println(avg);
		System.out.println(mid);
	}
}