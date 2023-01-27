import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static int[] solution(int[] fees, String[] records) {

		HashMap<String, Long> inCar = new HashMap<>();
		HashMap<String, Long> total = new HashMap<>();
		HashMap<String, Boolean> car_in = new HashMap<>();
		List<String> carNum = new ArrayList<>();

		for (int i = 0; i < records.length; i++) {
			String time = records[i].split(" ")[0];
			String car = records[i].split(" ")[1];
			String status = records[i].split(" ")[2];

			if (status.equals("IN")) {
				long hour = Integer.parseInt(time.split(":")[0]);
				long minute = Integer.parseInt(time.split(":")[1]);
				long total_min = hour * 60 + minute;

				inCar.put(car, total_min);
				car_in.put(car, true);
				carNum.add(car);
			} else {
				long hour = Integer.parseInt(time.split(":")[0]);
				long minute = Integer.parseInt(time.split(":")[1]);
				long total_min = hour * 60 + minute - inCar.get(car);

				total.put(car, total.getOrDefault(car, 0L) + total_min);
				car_in.put(car, false);
			}
		}

		carNum = carNum.stream().distinct().sorted().collect(Collectors.toList());

		for (int i = 0; i < carNum.size(); i++) {
			if (car_in.get(carNum.get(i))) {
				long total_min = 1439 - inCar.get(carNum.get(i));
				total.put(carNum.get(i), total.getOrDefault(carNum.get(i), 0L) + total_min);
				car_in.put(carNum.get(i), false);
			}
		}

		int[] result = new int[carNum.size()];

		for (int i = 0; i < carNum.size(); i++) {
			long base_time = fees[0]; // 기본 시간
			long base_cost = fees[1]; // 기본 요금
			double min = fees[2]; // 단위 시간
			int min_cost = fees[3]; // 단위 요금

			long park_time = total.get(carNum.get(i));
			int park_cost = 0;

			if (base_time >= park_time) {
				park_cost = (int) base_cost;
			} else {
				int cost = (int) Math.ceil((park_time - base_time) / min);
				park_cost = (int)(base_cost + cost * min_cost);
			}

			result[i] = park_cost;
		}

		return result;
	}
}