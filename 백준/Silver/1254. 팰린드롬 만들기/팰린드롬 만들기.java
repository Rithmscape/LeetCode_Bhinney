import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		br.close();
		solution(str);
	}

	private static void solution(String str) {
		int cnt = str.length();
		for (int i = 0; i < str.length(); i++) {
			if (isPalindrome(str.substring(i))) break;
			cnt++;
		}

		System.out.println(cnt);
	}

	private static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;

		while (start <= end) {
			if (str.charAt(start) != str.charAt(end)) return false;
			start++;
			end--;
		}

		return true;
	}
}