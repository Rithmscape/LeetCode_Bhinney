class Solution {
   public static List<String> letterCombinations(String digits) {
		String alpha[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		List<String> result = new ArrayList<>();

		if (digits.length()==0) return result;

		result.add("");
		for (int i=0; i<digits.length(); i++)
			result = combine(alpha[Character.getNumericValue(digits.charAt(i))], result);

		return result;
	}

	public static List<String> combine(String digit, List<String> l) {
		List<String> result = new ArrayList<>();

		for (int i = 0; i < digit.length(); i++)
			for (String s : l)
				result.add(s + digit.charAt(i));

		return result;
	}
}