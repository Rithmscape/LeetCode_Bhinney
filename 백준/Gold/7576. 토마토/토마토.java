import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<int[]> queue = new LinkedList<>();

		// arr[1] : 상자의 세로 칸 수, arr[0] : 상자의 가로 칸 수
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		// 주어진 박스에 값 담기
		int[][] boxes = new int[arr[1]][arr[0]];
		for (int i = 0; i < boxes.length; i++) {
			boxes[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			for (int j = 0; j < boxes[i].length; j++)
				if (boxes[i][j] == 1) queue.add(new int[]{i, j});
		}
		br.close();

		solution(arr, boxes, queue);
	}

	private static void solution(int[] arr, int[][] boxes, Queue<int[]> queue) {
		int[] dx = {-1, 1, 0, 0};
		int[] dy = {0, 0, -1, 1};

		// 1 : 익은 토마토, 0 : 익지 않은 토마토, -1 : 토마토 없음
		while (!queue.isEmpty()) {
			int[] box = queue.poll();

			for (int i = 0; i < 4; i++) {
				int nx = box[0] + dx[i];
				int ny = box[1] + dy[i];

				if (nx < 0 || ny < 0 || nx >= arr[1] || ny >= arr[0]) continue;

				if (boxes[nx][ny] == 0) { // 익히기
					boxes[nx][ny] = boxes[box[0]][box[1]] + 1;
					queue.add(new int[]{nx, ny});
				}
			}
		}

		int max = Integer.MIN_VALUE;
		if (check(boxes)) {
			max = 0;
		} else {
			for (int i = 0; i < arr[1]; i++)
				for (int j = 0; j < arr[0]; j++)
					max = Math.max(max, boxes[i][j]);
		}

		System.out.println(max - 1);
	}

	private static boolean check(int[][] boxes) {
		for (int[] box : boxes)
			for (int b : box)
				if (b == 0)
					return true;

		return false;
	}
}