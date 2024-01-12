import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		br.close();

		int reX = Integer.parseInt(new StringBuilder(arr[0]).reverse().toString());
		int reY = Integer.parseInt(new StringBuilder(arr[1]).reverse().toString());

		String xy = String.valueOf(reX + reY);

		System.out.println(Integer.parseInt(new StringBuilder(xy).reverse().toString()));
	}
}