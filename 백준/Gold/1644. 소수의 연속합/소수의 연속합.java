import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * n = 20; {2, 3, 5, 7, 11, 13, 17, 19}
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean[] prime = new boolean[N+1];
		for (int i = 2; i <= N; i++) {
			if (prime[i]) continue;
			for (int j = i + i; j <=N; j += i) {
				prime[j] = true;
			}
		}
		Queue<Integer> queue = new LinkedList<>();
		int j = 2, result = 0, sum = 0;
		while (!queue.isEmpty() || j <= N) {
			if (sum < N && j <= N) {
				if (!prime[j]) {
					sum += j;
					queue.add(j);
				}
				j++;
			}
			else if (sum == N) {
				result++;
				sum -= queue.poll();

			} else {
				sum -= queue.poll();
			}
		}
		System.out.println(result);
	}
}