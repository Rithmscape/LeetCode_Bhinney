class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder(my_string);

		for (int[] q : queries) {
			StringBuilder nsb = new StringBuilder(sb.substring(q[0], q[1] + 1)).reverse();
			sb.replace(q[0], q[1] + 1, nsb.toString());
		}

		return sb.toString();
    }
}