import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
   public String[] solution(String myStr) {
		myStr = myStr.replace("a", "&").replace("b", "&").replace("c", "&");
		String[] ans = Arrays.stream(myStr.split("&")).filter(arr -> !arr.isEmpty()).collect(Collectors.toList()).toArray(new String[0]);
		return ans.length != 0 ? ans : new String[]{"EMPTY"};
	}
}