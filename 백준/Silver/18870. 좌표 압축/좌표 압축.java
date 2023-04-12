import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] origin = new int[n];
		int[] sorting = new int[n];

		Map<Integer, Integer> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			sorting[i] = origin[i] = Integer.parseInt(st.nextToken());
		}
		br.close();

		Arrays.sort(sorting);

		int tmp = 0;
		for (int num : sorting) {
			if (!map.containsKey(num)) {
				map.put(num, tmp);
				tmp++;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int num : origin) {
			int rank = map.get(num);
			sb.append(rank).append(' ');
		}

		System.out.println(sb.toString());
	}
}