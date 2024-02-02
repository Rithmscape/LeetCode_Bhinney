import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		solution(n);
	}

	private static void solution(int n) {
		String[][] arr= new String[n][n];
		dfs(arr, 0, 0, n, false);

		for (int i = 0; i < n; i++) {
			System.out.println(String.join("", arr[i]));
		}
	}

	private static void dfs(String[][] arr, int x, int y, int n, boolean isBlank) {
		if (isBlank) {
			for (int i = x; i < x + n; i++) {
				for (int j = y; j < y + n; j++)
					arr[i][j] = " ";
			}
			return;
		}

		if (n == 1) {
			arr[x][y] = "*";
			return;
		}

		int len = n / 3;
		int cnt = 0;
		for (int i = x; i < x + n; i += len) {
			for (int j = y; j < y + n; j += len){
				cnt++;
				dfs(arr, i, j, len, cnt == 5);
			}
		}
	}
}