import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	static int[] numbers, tree;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// arr[0](n) : n개의 정수, arr[1](m) : (a b) m개의 쌍
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		// n개의 정수를 배열에 담기
		numbers = new int[arr[0] + 1];
		numbers[0] = Integer.MAX_VALUE;
		for (int i = 1; i < numbers.length; i++)
			numbers[i] = Integer.parseInt(br.readLine());

		// 세그먼트 트리 생성 및 최솟값 저장
		tree = new int[arr[0] * 4];
		save(1, arr[0], 1);

		// 범위 안에서 최솟값 찾기
		for (int i = 0; i < arr[1]; i++) {

			// set[0](a) : 시작, set[1](b) : 끝
			int[] set = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int ans = find(1, arr[0], 1, set[0], set[1]);
			System.out.println(ans);
		}
	}

	private static int save(int start, int end, int node) {
		if (start == end) return tree[node] = numbers[start];

		int mid = (start + end) / 2;
		return tree[node] = Math.min(save(start, mid, node * 2), save(mid + 1, end, node * 2 + 1));
	}

	private static int find(int start, int end, int node, int left, int right) {
		if (right < start || left > end) return Integer.MAX_VALUE;

		if (left <= start && end <= right) return tree[node];

		int mid = (start + end) / 2;
		return Math.min(find(start, mid, node * 2, left, right), find(mid + 1, end, node * 2 + 1, left, right));
	}
}