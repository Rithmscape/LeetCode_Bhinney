import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
   public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] arr = new int[9][9];
		int max = 0;
		int x = 0, y = 0;

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if (max < arr[i][j]) {
					max = arr[i][j];
					x = i;
					y = j;
				}
			}
		}
		br.close();

		x += 1;
		y += 1;
		System.out.println(max);
		System.out.println(x + " " + y);
	}
}