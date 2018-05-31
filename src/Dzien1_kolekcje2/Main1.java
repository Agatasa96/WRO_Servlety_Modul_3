package Dzien1_kolekcje2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "";
		Set<String> set = new HashSet<>();
		int count = 0;

		while (true) {
			if (text.equals("quit")) {
				break;
			} else {
				System.out.println("podaj napis:");
				text = sc.next();
				set.add(text);
				count++;
			}
		}

		System.out.println("Podanych napisow bylo: " + (count - 1) + " Rozmiar kolekcji: " + (set.size()-1));
	}
}
