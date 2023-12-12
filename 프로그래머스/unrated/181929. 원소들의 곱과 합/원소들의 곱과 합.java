class Solution {
    public int solution(int[] num_list) {
        int multiply = num_list[0];
		int sum = num_list[0];
		for (int i = 1; i < num_list.length; i++) {
			sum += num_list[i];
			multiply *= num_list[i];
		}
		sum = (int)Math.pow(sum, 2);

		return multiply < sum ? 1 : 0;
    }
}