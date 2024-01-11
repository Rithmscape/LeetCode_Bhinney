import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		br.close();

		boolean[] check = new boolean[arr[0].length()];
		char[] tmp = arr[0].toCharArray();

		for (int i = 1; i < n; i++) {
			char[] ch = arr[i].toCharArray();

			for (int j = 0; j < ch.length; j++){
				if (ch[j] != tmp[j]) check[j] = true;
			}
		}

		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < check.length; i++) {
			if (!check[i]) ans.append(tmp[i]);
			else ans.append("?");
		}

		System.out.println(ans);
	}
}
