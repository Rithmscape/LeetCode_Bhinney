import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		br.close();
		solution(s);
	}

	private static void solution(String s) {
		/*
		 * 3개의 단어로 나눌 지점을 정해야 함 -> a 지점과 b 지점
		 * s.substring(0, a) / s.substring(a, b) / s.substring(b, s.length())
		 */

		ArrayList<String> list = new ArrayList<>();

		for (int i = 1; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				String s1 = new StringBuilder(s.substring(0, i)).reverse().toString();
				String s2 = new StringBuilder(s.substring(i , j)).reverse().toString();
				String s3 = new StringBuilder(s.substring(j)).reverse().toString();

				list.add(s1 + s2 + s3);
			}
		}

		Collections.sort(list);

		System.out.println(list.get(0));
	}
}