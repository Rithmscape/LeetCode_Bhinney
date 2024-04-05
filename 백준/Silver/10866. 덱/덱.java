import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			String[] arr = br.readLine().split(" ");

			switch (arr[0]) {
				case "push_front" : {
					dq.addFirst(Integer.parseInt(arr[1]));
					break;
				}
				case "push_back" : {
					dq.addLast(Integer.parseInt(arr[1]));
					break;
				}
				case "pop_front" : {
					if (dq.isEmpty())
						System.out.println(-1);
					else
						System.out.println(dq.pollFirst());
					break;
				}
				case "pop_back" : {
					if (dq.isEmpty())
						System.out.println(-1);
					else
						System.out.println(dq.pollLast());
					break;
				}
				case "size" : {
					System.out.println(dq.size());
					break;
				}
				case "empty" : {
					if (dq.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				}
				case "front" : {
					if (dq.isEmpty())
						System.out.println(-1);
					else
						System.out.println(dq.peekFirst());
					break;
				}
				case "back" : {
					if (dq.isEmpty())
						System.out.println(-1);
					else
						System.out.println(dq.peekLast());
					break;
				}
			}
		}
	}
}