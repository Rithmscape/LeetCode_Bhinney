import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		solution(n);
	}

	private static void solution(int n) {
		int cnt = 1;
		int prev = 0;
		int num = 0;

		while (true) {
			if (((prev % 10000) / 10) == 666 && prev % 10 != 6) {
				for (int i = 0; i < 1000; i++) {
					if (cnt == n) {
						System.out.println(prev * 1000 + num);
						return;
					}
					num++;
					cnt++;
				}
				prev++;
			} else if (prev % 1000 == 666) {
				num = 0;
				for (int i = 0; i < 1000; i++) {
					if (cnt == n) {
						System.out.println(prev * 1000 + num);
						return;
					}
					cnt++;
					num++;
				}
				prev++;
			} else if (prev % 100 == 66) {
				num = 600;
				for (int i = 0; i < 100; i++) {
					if (cnt == n) {
						System.out.println(prev * 1000 + num);
						return;
					}
					num++;
					cnt++;
				}
				prev++;
			} else if (prev % 10 == 6) {
				num = 660;
				for (int i = 0; i < 10; i++) {
					if (cnt == n) {
						System.out.println(prev * 1000 + num);
						return;
					}
					num++;
					cnt++;
				}
				prev++;
			} else {
				num = 666;
				if (cnt == n) {
					System.out.println(prev * 1000 + num);
					return;
				}
				cnt++;
				prev++;
			}
		}
	}
}