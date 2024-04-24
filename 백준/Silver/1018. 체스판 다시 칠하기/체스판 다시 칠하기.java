import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static boolean[][] chess;
	static int min = 64;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		chess = new boolean[arr[0]][arr[1]];
		for (int i = 0; i < arr[0]; i++) {
			char[] tmp = br.readLine().toCharArray();
			for (int j = 0; j < tmp.length; j++)
				chess[i][j] = tmp[j] == 'W';
		}
		br.close();
		solution(arr[0], arr[1]);
	}

	private static void solution(int n, int m) {
		int n_row = n - 7;
		int m_row = m - 7;

		for (int i = 0; i < n_row; i++)
			for (int j = 0; j < m_row; j++)
				find(i, j);

		System.out.println(min);
	}

	private static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int cnt = 0;

		boolean tf = chess[x][y];

		for (int i = x; i < end_x; i++) {
			for (int j = y; j < end_y; j++) {
				if (chess[i][j] != tf) cnt++;
				tf = (!tf);
			}

			tf = !tf;
		}

		cnt = Math.min(cnt, 64 - cnt);
		min = Math.min(min, cnt);
	}
}