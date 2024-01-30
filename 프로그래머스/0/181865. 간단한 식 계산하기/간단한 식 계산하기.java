class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");

		return switch (arr[1]) {
			case "+" -> Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
			case "-" -> Integer.parseInt(arr[0]) - Integer.parseInt(arr[2]);
			case "*" -> Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
			default -> 0;
		};
    }
}