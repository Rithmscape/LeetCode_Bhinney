class Solution {
    public static String solution(String X, String Y) {
		int[] x = new int[10];
		int[] y = new int[10];
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < X.length(); i++) {
			x[Character.getNumericValue(X.charAt(i))]++;
		}

		for (int i = 0; i < Y.length(); i++) {
			y[Character.getNumericValue(Y.charAt(i))]++;
		}

		for(int i = 9; i >= 0; i--){
			answer.append(String.valueOf(i).repeat(Math.max(0, Math.min(x[i], y[i]))));
		}

		if (answer.toString().length() == 0) return "-1";
		if (answer.toString().charAt(0) == '0') return "0";

		return answer.toString();
	}
}