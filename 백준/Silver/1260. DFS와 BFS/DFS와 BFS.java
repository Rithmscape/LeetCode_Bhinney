import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * [N, M, V]
		 * N : 정점의 개수
		 * M : 간선의 개수
		 * V : 탐색을 시작할 정점의 번호
		 */
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] matrix = new int[arr[0] + 1][arr[0] + 1];
		for (int i = 0; i < arr[1]; i++) {
			int[] tmp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			matrix[tmp[0]][tmp[1]] = 1;
			matrix[tmp[1]][tmp[0]] = 1;
		}
		br.close();

		boolean[] visited = new boolean[arr[0] + 1];
		visited[0] = true;
		dfs(matrix, arr[2], visited);
		System.out.println();
		visited = new boolean[arr[0] + 1];
		bfs(matrix, arr[2], visited);
	}

	private static void dfs(int[][] matrix, int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");

		for (int i = 1; i < visited.length; i++) {
			if (matrix[v][i] != 0 && !visited[i])
				dfs(matrix, i, visited);
		}
	}

	private static void bfs(int[][] matrix ,int v, boolean[] visited) {
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(v);
		visited[v] = true;
		StringBuilder ans = new StringBuilder(v + " ");

		while (!queue.isEmpty()) {
			int now = queue.poll();

			for (int i = 1; i < matrix.length; i++) {
				if (matrix[now][i] != 0 && !visited[i]) {
					visited[i] = true;
					ans.append(i).append(" ");
					queue.offer(i);
				}
			}
		}

		System.out.println(ans);
	}
}