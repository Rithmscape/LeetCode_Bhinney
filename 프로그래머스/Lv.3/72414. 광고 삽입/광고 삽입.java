import java.util.Arrays;

class Solution {
    public static String solution(String play_time, String adv_time, String[] logs) {
		int play = timeToInt(play_time);
		int adv = timeToInt(adv_time);
		int[] time = new int[play + 1];

		for (String log : logs) {
			int start = timeToInt(log.split("-")[0]);
			int end = timeToInt(log.split("-")[1]);

			for (int i = start; i < end; i++) {
				time[i]++;
			}
		}

		int idx = 0;
		long total = 0;
		for (int i = 0; i < adv; i++) {
			total += time[i];
		}

		long max = total;

		for (int i = adv; i < play; i++) {
			total += time[i] - time[i - adv];
			if (total > max) {
				max = total;
				idx = i - adv + 1;
			}
		}

		return timeToString(idx);
	}

	/* String -> Int 변환 (초) */
	private static int timeToInt(String time) {
		int[] arr = Arrays.stream(time.split(":")).mapToInt(Integer::parseInt).toArray();
		return arr[0] * 3600 + arr[1] * 60 + arr[2];
	}

	/* Int -> String 변환 */
	private static String timeToString(int time) {
		int H = time / 3600;
		int M = (time - H * 3600) / 60;
		int S = time - 3600 * H - 60 * M;

		return (H < 10 ? "0" : "") + H + ":"
			+ (M < 10 ? "0" : "") + M + ":"
			+ (S < 10 ? "0" : "") + S;
	}
}