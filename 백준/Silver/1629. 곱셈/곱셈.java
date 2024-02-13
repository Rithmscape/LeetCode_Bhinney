import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		sc.close();
		System.out.println(solution(a, b, c));
	}

	private static long solution(int a, int b, int c) {
		if (b == 0) return 1;

		long num = solution(a, b / 2, c);

		if (b % 2 == 0) return num * num % c;
		else return (num * num % c) * a % c;
	}
}