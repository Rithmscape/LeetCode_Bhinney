class Solution {
    public static boolean solution(int x) {
		int h = String.valueOf(x).chars().map(Character::getNumericValue).sum();
		return x % h == 0;
	}
}