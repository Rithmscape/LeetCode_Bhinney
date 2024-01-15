import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String[][] castle = new String[arr[0]][arr[1]];
		int row = 0;
		for (int i = 0; i < castle.length; i++) {
			String s = br.readLine();
			if (!s.contains("X")) row++;
			castle[i] = s.split("");
		}
		br.close();

		// 열 비교
		int colum = 0;
		for (int i = 0; i < arr[1]; i++){
			String r = "";
			for (int j = 0; j < arr[0]; j++) {
				r += castle[j][i];
			}

			if (!r.contains("X")) colum++;
		}

		System.out.println(Math.max(row, colum));
	}
}