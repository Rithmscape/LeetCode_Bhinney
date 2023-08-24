class Solution {
    public static String solution(String m, String[] music) {
		String ans = "(None)";
		int play = -1;
		m = convert(m);
		for (String s : music) {
			String[] arr = s.split(",");
			int time = countTime(arr[0], arr[1]);
			String melody = arr[3];
			melody = convert(melody);
			String title = arr[2];

			if (time > melody.length()) {
				melody = newMelody(melody, time);
			} else {
				melody = melody.substring(0, time);
			}

			if (melody.contains(m) && time > play) {
				ans = title;
				play = time;
			}
		}

		return ans;
	}

	private static String convert(String str) {
		str = str.replaceAll("A#", "a");
		str = str.replaceAll("C#", "c");
		str = str.replaceAll("D#", "d");
		str = str.replaceAll("F#", "f");
		str = str.replaceAll("G#", "g");

		return str;
	}

	private static int countTime(String start, String end) {
		int s = Integer.parseInt(start.split(":")[0]) * 60 + Integer.parseInt(start.split(":")[1]);
		int e = Integer.parseInt(end.split(":")[0]) * 60 + Integer.parseInt(end.split(":")[1]);

		return e - s;
	}

	private static String newMelody(String melody, int time) {
		StringBuilder newMelody = new StringBuilder();
		for (int i = 0; i < time; i++) {
			newMelody.append(melody.charAt(i % melody.length()));
		}

		return newMelody.toString();
	}
}