import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int l = Integer.parseInt(st.nextToken());
		br.close();

		boolean flag = true;
		while(l <= 100){
			long start = n / l - (l - 1) / 2;
			if(start < 0)
				break;

			if(n == (start * 2 + l - 1) * l / 2){
				for(long i = 0; i < l; i++)
					System.out.print(start + i + " ");
				flag = false;
				break;
			}

			l += 1;
		}

		if(flag)
			System.out.println(-1);
	}
}