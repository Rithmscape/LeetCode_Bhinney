import java.util.ArrayList;

class Solution {
   public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];

		ArrayList<Integer> lotto = new ArrayList<>();
		ArrayList<Integer> nums = new ArrayList<>();

		for (int i = 0; i < lottos.length; i++) {
			lotto.add(lottos[i]);
			nums.add(win_nums[i]);
		}

		int count = 0;

		for (int i = 0; i < lotto.size(); i++) {
			if (nums.contains(lotto.get(i))) {
				count++;
			}
		}

		int cnt = (int)lotto.stream().filter(n -> n == 0).count();
		
		answer[0] = getRank(count + cnt);
		answer[1] = getRank(count);


		return answer;
	}

	public static int getRank(int num){
		switch (num) {
			case 6 : return 1;
			case 5 : return 2;
			case 4 : return 3;
			case 3 : return 4;
			case 2 : return 5;
			default: return 6;
		}
	}
}