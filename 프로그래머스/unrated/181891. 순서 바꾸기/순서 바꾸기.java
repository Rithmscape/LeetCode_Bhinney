import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> numList = Arrays.stream(num_list).boxed().collect(Collectors.toList());
		List<Integer> l1 = numList.subList(n, numList.size());
		List<Integer> l2 = numList.subList(0, n);

		return Stream.of(l1, l2).flatMap(Collection::stream).mapToInt(i -> i).toArray();
    }
}