import java.util.Scanner;

public class Main {
	static int cnt = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int[] arr = new int[n];
		solution(arr, 0);
		System.out.println(cnt);
	}

	private static void solution(int[] arr, int depth) {
		if (arr.length == depth) {
			cnt++;
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[depth] = i;
			if (possible(arr, depth)) solution(arr, depth + 1);
		}
	}

	private static boolean possible(int[] arr, int num) {
		for (int i = 0; i < num; i++) {
			if (arr[i] == arr[num]) return false;
			else if (Math.abs(num - i) == Math.abs(arr[num] - arr[i])) return false;
		}

		return true;
	}
}