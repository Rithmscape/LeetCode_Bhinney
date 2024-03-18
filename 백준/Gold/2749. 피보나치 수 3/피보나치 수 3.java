import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong() % 1500000;
		sc.close();

		long[] arr = new long[1500001];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i < 1500001; i++)
			arr[i] = (arr[i - 2] + arr[i - 1]) % 1000000;

		System.out.println(arr[(int) n]);
	}
}