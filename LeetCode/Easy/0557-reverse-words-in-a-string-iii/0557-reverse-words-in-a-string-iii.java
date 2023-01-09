class Solution {
    public static String reverseWords(String s) {
		String[] arr = s.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reverseString(arr[i]);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i] + " ");
		}
		
		return sb.toString().substring(0, sb.length() -1 );
	}
	private static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}
}