import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); /* 학생 수 */
		int[][] classInfo = new int[n][5]; /* 반 정보 담을 이차원 배열 */
		for (int i = 0; i < n; i++) {
			classInfo[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		br.close();

		System.out.println(solution(n, classInfo));
	}

	public static int solution(int n, int[][] classInfo) {
		boolean[][] check = new boolean[n][n];
		for (int i = 0; i < 5; i++) { /* 1학년 ~ 5학년 */
			ArrayList<Integer>[] list = new ArrayList[10]; // 1반 ~ 9반 (인덱스 == 반)

			for (int j = 0; j < n; j++) { /* j번째 학생의 i학년*/
				if (list[classInfo[j][i]] == null) list[classInfo[j][i]] = new ArrayList<>();
				list[classInfo[j][i]].add(j);
			}

			for (int j = 0; j < n; j++) {
				int num = classInfo[j][i];
				ArrayList<Integer> same = list[num];
				for (Integer integer : same) {
					if (j == integer) continue;
					check[j][integer] = true;
				}
			}
		}

		int max = Integer.MIN_VALUE;
		int idx = 0;

		for (int i = 0; i < n; i++) {
			int num = 0;
			for (int j = 0; j < n; j++) {
				if (check[i][j]) num++;
			}
			if (max < num) {
				max = num;
				idx = i;
			}
		}

		return idx + 1;
	}
}