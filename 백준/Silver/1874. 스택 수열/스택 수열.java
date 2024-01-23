import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int start = 0;
		Stack<Integer> stack = new Stack<>();
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if (start < num) {
				for (int j = start + 1; j <= num; j++ ) {
					stack.push(j);
					ans.append("+").append("\n");
				}

				start = num;
			} else if (stack.peek() != num) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			ans.append("-").append("\n");
		}

		System.out.println(ans);
	}
}