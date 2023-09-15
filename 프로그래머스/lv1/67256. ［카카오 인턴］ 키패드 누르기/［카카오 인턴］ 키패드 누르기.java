class Solution {
    /*
	 * 좌측 키패드 : 1, 4, 7, *(10) ==> n % 3 == 1
	 * 우측 키패드 : 3, 6, 9, # (12) ==> n % 3 == 0
	 * 중앙 키패드 : 2, 5, 8, 0 -> 더 가까운 쪽 == > n % 3 == 2
	 */
    public String solution(int[] numbers, String hand) {
       StringBuilder ans = new StringBuilder();

		/* 왼손 위치도 기록, 오른손 위치 기록 */
		int left = 10;
		int right = 12;

		for (int n : numbers) {

			/* 좌측인지 확인 */
			if (n == 1 || n == 4 || n == 7) {
				ans.append("L");
				left = n;
			} else if (n == 3 || n == 6 || n == 9) { /* 우측인지 확인 */
				ans.append("R");
				right = n;
			} else {
				if (n == 0) n = 11; /* 나머지 연산자로 쉽게 하기 위함 */

				int lDist = (Math.abs(n - left) / 3) + (Math.abs(n - left) % 3);
				int rDist = (Math.abs(n - right) / 3) + (Math.abs(n - right) % 3);

				if (lDist < rDist) {
					ans.append("L");
					left = n;
				} else if (lDist > rDist) {
					ans.append("R");
					right = n;
				} else {
					if (hand.equals("left")) {
						ans.append("L");
						left = n;
					} else {
						ans.append("R");
						right = n;
					}
				}
			}
		}

		return ans.toString();
    }
}