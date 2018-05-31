package Dzien1_kolekcje2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

	public static Map<String, String> getMap() {
		Map<String, String> game = new HashMap<>();
		game.put("ciepło", "zimno");
		game.put("czarny", "biały");
		game.put("lato", "zima");
		game.put("kawa", "herbata");
		game.put("spodnie", "spódnica");
		return game;
	}

	public static void main(String[] args) {
		Map<String, String> game = getMap();
		String answer = "";
		Scanner sc = new Scanner(System.in);
		int counter = 0;

		for (Map.Entry<String, String> entry : game.entrySet()) {
			System.out.println("Podaj przeciwieństwo do " + entry.getKey());
			answer = sc.next();
			if (answer.equals(entry.getValue())) {
				counter++;
			}
		}
		sc.close();
		System.out.println("Liczba poprawnych odp: " + counter);
	}
}
