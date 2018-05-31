package Dzien1_kolekcje1;

import java.util.ArrayList;
import java.util.List;


public class Main3 {

	public static List<City> initialize() {
		City c1 = new City("name1", 1);
		City c2 = new City("name2", 2);
		City c3 = new City("name3", 3);
		City c4 = new City("name4", 4);
		City c5 = new City("name5", 5);

		List<City> cities = new ArrayList<>();
		cities.add(c1);
		cities.add(c2);
		cities.add(c3);
		cities.add(c4);
		cities.add(c5);

		return cities;
	}

	public static List<City> sublist(List<City> list, int start, int end) {

		try {
			List<City> temp = new ArrayList<>(list);
			return temp.subList(start, end);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Twój indeks końcowy jest większy niż długość listy");
		}

		return null;
	}

}
