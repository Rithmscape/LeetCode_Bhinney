import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		int last = 0;

		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");

			switch (str[0]) {
				case "push" : {
					last = Integer.parseInt(str[1]);
					queue.offer(last); break;
				}
				case "pop" : {
					int n = !queue.isEmpty() ? queue.poll() : -1;
					System.out.println(n); break;
				}
				case "size" : {
					System.out.println(queue.size()); break;
				}
				case "empty" : {
					int n = queue.isEmpty() ? 1 : 0;
					System.out.println(n); break;
				}
				case "front" : {
					int n = !queue.isEmpty() ? queue.peek() : -1;
					System.out.println(n); break;
				}
				case "back" : {
					int n = !queue.isEmpty() ? last: -1;
					System.out.println(n); break;
				}
			}
		}

		br.close();
	}
}