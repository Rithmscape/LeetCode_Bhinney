class Solution {
    public int myAtoi(String s) {
        s = s.stripLeading().split(" ")[0];
		System.out.println(s);

		if (s.length() == 0) {return 0;}

		String result = "";

		char ch = s.charAt(0);
		boolean isPositive = true;
		if (ch == '-') {
			isPositive = false;
			s = s.substring(1);
		} else if (ch == '+') {
			s = s.substring(1);
		} else if(!Character.isDigit(ch)) {
			return 0;
		}

		for (int i = 0; i < s.length() && Character.isDigit(s.charAt(i)); i++) {
			result += String.valueOf(s.charAt(i));

			if (Long.valueOf(result) > Integer.MAX_VALUE || Long.valueOf(result) < Integer.MIN_VALUE) {
				return isPositive? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
		}

		if (result.length() == 0) {
			return 0;
		}

		return isPositive? Integer.valueOf(result) : Integer.valueOf(result) * -1;
    }
}