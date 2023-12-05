class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean check = true;

		switch (ineq + eq) {
			case ">=" -> check = n >= m;
			case ">!" -> check = n > m;
			case "<=" -> check = n <= m;
			case "<!" -> check = n < m;
		}

		return check ? 1 : 0;
    }
}