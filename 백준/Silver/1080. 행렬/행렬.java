import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		char[][] A = new char[arr[0]][arr[1]];
		char[][] B = new char[arr[0]][arr[1]];

		for (int i = 0; i < arr[0]; i++) {
			A[i] = br.readLine().toCharArray();
		}
		for (int i = 0; i < arr[0]; i++) {
			B[i] = br.readLine().toCharArray();
		}
		br.close();
		solution(A, B);
	}

	private static void solution(char[][] A, char[][] B) {
		int ans = 0;

		for (int i = 0; i < A.length - 2; i++) {
			for (int j = 0; j < A[0].length - 2; j++) {
				if (A[i][j] == B[i][j]) continue;

				ans++;
				for (int a = i; a < i + 3; a++) {
					for (int b = j; b < j + 3; b++) {
						A[a][b] = A[a][b] == '1' ? '0' : '1';
					}
				}
			}
		}

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				if (A[i][j] != B[i][j]) {
					ans = -1;
					break;
				}
			}
		}

		System.out.println(ans);
	}
}
