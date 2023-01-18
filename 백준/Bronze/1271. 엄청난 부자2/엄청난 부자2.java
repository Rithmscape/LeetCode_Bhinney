import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Main {
	private static void solution() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		BigInteger n = new BigInteger(st.nextToken()); /* 조교가 가진 돈 */
		BigInteger m = new BigInteger(st.nextToken()); /* 돈을 받으러온 명수 */
		br.close();

		System.out.println(n.divide(m));
		System.out.println(n.remainder(m));
	}
	public static void main(String[] args) throws IOException {
		new Main().solution();
	}
}
