class Solution {
    public static String solution(String new_id) {
		/* 1. 소문자로 치환 */
		new_id = new_id.toLowerCase();

		/* 2. 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거*/
		new_id = new_id.replaceAll("[^-_.a-z0-9]", "");

		/* 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환 */
		new_id = new_id.replaceAll("[.]{2,}", ".");

		/* 4. 마침표(.)가 처음이나 끝에 위치한다면 제거 */
		new_id = new_id.replaceAll("^[.]|[.]$", "");

		/* 5. 빈 문자열이라면, new_id에 "a"를 대입 */
		if (new_id.length() == 0) {
			new_id = "a";
		}

		/* 6. 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거,
		 * 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거
		 */
		if (new_id.length() >= 16) {
			new_id = new_id.substring(0, 15);
			new_id = new_id.replaceAll("[.]$","");
		}

		/* 7. 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임 */
		while (new_id.length() <= 2) {
			new_id += new_id.charAt(new_id.length() - 1);

			if (new_id.length() == 3) {
				break;
			}
		}

		return new_id;
	}
}