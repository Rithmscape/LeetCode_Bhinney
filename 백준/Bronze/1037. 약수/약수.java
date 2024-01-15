import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine()); // N의 약수의 개수
		int[] measure = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // N의 약수를 배열에 담기
		br.close();

		int max = IntStream.of(measure).max().orElse(1);
		int min = IntStream.of(measure).min().orElse(1);

		System.out.println(max * min);
	}
}
