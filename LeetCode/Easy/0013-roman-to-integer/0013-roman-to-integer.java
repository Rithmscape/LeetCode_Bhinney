class Solution {
    public int romanToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int num = getNum(c);

			/* 만약 다음 수가 없다면 */
			if (i + 1 == s.length()) {
				sum += num;
				continue;
			}

			/* 뒤에 오는 수가 지금 현재보다 크면 빼야함 */
			char next = s.charAt(i + 1);
			if (num < getNum(next)) {
				sum -= num;
			} else {
				sum += num;
			}
		}
		return sum;
	}

	/* 비교할 수 있는 메서드 생성 */
	public static int getNum(char character) {
		switch (character) {
			case 'I': {return 1;}
			case 'V': {return 5;}
			case 'X': {return 10;}
			case 'L': {return 50;}
			case 'C': {return 100;}
			case 'D': {return 500;}
			case 'M': {return 1000;}

			default: { return 1; }
		}
	}
}