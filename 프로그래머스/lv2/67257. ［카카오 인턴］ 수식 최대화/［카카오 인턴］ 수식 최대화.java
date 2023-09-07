import java.util.ArrayList;

class Solution {
    static char[] op = {'*', '-', '+'};
	static ArrayList<Long> list;
	static ArrayList<Character> opList;
	static long ans = -1;
	public static long solution(String expression) {
		list = new ArrayList<>();
		opList = new ArrayList<>();

		addList(expression);
		dfs(0);
		return ans;
	}

	private static void addList(String expression){
		StringBuilder num = new StringBuilder();
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9') {
				num.append(expression.charAt(i));
			} else {
				list.add(Long.parseLong(num.toString()));
				opList.add(expression.charAt(i));
				num = new StringBuilder();
			}
		}

		/* 마지막엔 숫자로 끝나기 때문 */
		list.add(Long.parseLong(num.toString()));
	}

	private static void swap(int a, int b) {
		char o = op[a];
		op[a] = op[b];
		op[b] = o;
	}

	private static long calculate(ArrayList<Long> list, ArrayList<Character> opList) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < opList.size(); j++) {
				if (opList.get(j) == op[i]) {
					switch (op[i]) {
						case '-' -> list.add(j, list.remove(j) - list.remove(j));
						case '+' -> list.add(j, list.remove(j) + list.remove(j));
						case '*' -> list.add(j, list.remove(j) * list.remove(j));
					}

					opList.remove(j--);
				}
			}
		}

		return Math.abs(list.get(0));
	}

	private static void dfs(int depth) {
		if (depth == 3) {
			long tmp = calculate((ArrayList<Long>)list.clone(), (ArrayList<Character>)opList.clone());

			if (tmp > ans) ans = tmp;
			return;
		}

		for (int i = depth; i < 3; i++) {
			swap(i, depth);
			dfs(depth + 1);
			swap(i, depth);
		}
	}
}