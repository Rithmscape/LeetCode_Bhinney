import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public static long[] solution(long k, long[] room_number) {
		/*
		 * 호텔 방 개수 : k -> 1번 ~ k번까지
		 * 고객들이 원하는 방 번호 순서 : room_number
		 */

		HashMap<Long, Long> assignRoom = new HashMap<>(); // 배정된 방만 저장

		long[] ans = new long[room_number.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = checkRoom(assignRoom, room_number[i]);
		}

		return ans;
	}

	private static long checkRoom(HashMap<Long, Long> assignRoom, long roomNo) {
		if (!assignRoom.containsKey(roomNo)) { // 배정되지 않았다면
			assignRoom.put(roomNo, roomNo + 1);
			return roomNo;
		}

		long empty = checkRoom(assignRoom, assignRoom.get(roomNo));
		assignRoom.put(roomNo, empty);
		return empty;
	}
}