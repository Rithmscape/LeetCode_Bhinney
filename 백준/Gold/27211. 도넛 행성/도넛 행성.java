import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static final int[] DR = {0,0,-1,1};
	private static final int[] DC = {-1,1,0,0};

	private void solution() throws Exception {
		StringTokenizer st = new StringTokenizer(br.readLine());
		int row = Integer.parseInt(st.nextToken());
		int column = Integer.parseInt(st.nextToken());

		boolean[][] arr = new boolean[row][column];

		for (int i = 0; i < row; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < column; j++) {
				if (Integer.parseInt(st.nextToken()) == 0) {
					arr[i][j] = true;
				}
			}
		}

		int answer = 0;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (!arr[i][j]) continue;
				answer++;
				Queue<int[]> q = new ArrayDeque<>();
				q.add(new int[]{i,j});
				arr[i][j] = false;

				while (!q.isEmpty()) {
					int cr = q.peek()[0];
					int cc = q.poll()[1];
					for (int d = 0; d < 4; d++) {
						int nr = cr + DR[d];
						int nc = cc + DC[d];
						if (nr < 0) nr += row;
						if (nc < 0) nc += column;
						nr %= row;
						nc %= column;

						if (!arr[nr][nc]) continue;
						arr[nr][nc] = false;
						q.add(new int[]{nr,nc});
					}
				}
			}
		}

		System.out.println(answer);
	}
	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}