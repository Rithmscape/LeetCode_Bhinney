class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean check = true;

		if (ineq.equals(">")) {
			switch (eq) {
				case "!" -> check = n > m;
				case "=" -> check = n >= m;
			}
		} else {
			switch (eq) {
				case "!" -> check = n < m;
				case "=" -> check = n <= m;
			}
		}

		return check ? 1 : 0;
    }
}