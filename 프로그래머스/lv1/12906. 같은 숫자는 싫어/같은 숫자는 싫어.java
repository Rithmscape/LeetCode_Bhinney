import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
		Queue<Integer> que=new LinkedList<>();
		
		int temp = -1;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == temp) continue;
			else {
				temp=arr[i];
				que.add(temp);
				
			}
		}
		answer = new int[que.size()];
		int idx = 0;
		for (Integer num : que) {
			answer[idx++] = num;
		}
        return answer;
    }
}