import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();

		int idx = 0;
		int ans = 0;

		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= i; j++) {
				idx++;

				if (idx >= a && idx <= b) {
					ans += i;
				}
			}
		}

		System.out.println(ans);
	}
}