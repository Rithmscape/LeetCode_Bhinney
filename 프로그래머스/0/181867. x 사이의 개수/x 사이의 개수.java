class Solution {
    public int[] solution(String myString) {
        String[] arr = myString.split("x");
		int len = arr.length;
		if (myString.charAt(myString.length() - 1) == 'x') len++;
		int[] ans = new int[len];

		for (int i = 0; i < arr.length; i++) {
			ans[i] = arr[i].length();
		}

		return ans;
    }
}