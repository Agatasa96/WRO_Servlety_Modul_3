package Dzien1_homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GenerateRandom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkRand(10, 3));
	}

	public static Map<Integer, Integer> checkRand(int amount, int interval) {

		Map<Integer, Integer> mapOfRandoms = new HashMap<>();
		Random r = new Random();

		for (int i = 0; i < amount; i++) {
			int key = r.nextInt(interval);
			if (mapOfRandoms.containsKey(key)) {
				mapOfRandoms.put(key, mapOfRandoms.get(key) + 1);
			} else {
				mapOfRandoms.put(key, 1);
			}
		}
		return mapOfRandoms;
	}

}
