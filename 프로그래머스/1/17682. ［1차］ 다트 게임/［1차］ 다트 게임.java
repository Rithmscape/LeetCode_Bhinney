class Solution {
    public int solution(String dartResult) {
        int[] score = new int[4];
		score[0] = 0;
		int idx = 0;
		char[] dart = dartResult.toCharArray();

		for (int i = 0; i < dart.length; i++) {
			char d = dart[i];

			if (Character.isDigit(d)) {
				idx++;
				score[idx] = Character.getNumericValue(d);
				if (i < dart.length -1 && d == '1' && dart[i + 1] == '0') {
					score[idx] = 10;
					i++;
				}

				continue;
			}

			switch (d) {
				case 'D' -> score[idx] = (int)Math.pow(score[idx], 2);
				case 'T' -> score[idx] = (int)Math.pow(score[idx], 3);
				case '*' -> {
					score[idx] *= 2;
					score[idx - 1] *= 2;
				}
				case '#' -> score[idx] *= -1;
			}
		}

		return score[1] + score[2] + score[3];
    }
}