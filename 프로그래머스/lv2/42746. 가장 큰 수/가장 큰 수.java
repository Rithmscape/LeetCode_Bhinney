import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
   public static String solution(int[] numbers) {
		String answer = IntStream.of(numbers)
			.mapToObj(String::valueOf)
			.sorted((n1, n2) -> (n2+n1).compareTo(n1+n2))
			.collect(Collectors.joining());
       
       if (answer.charAt(0) == '0') {
			return "0";
		}

       return answer;
	}
}