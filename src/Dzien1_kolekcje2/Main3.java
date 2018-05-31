package Dzien1_kolekcje2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Main3 {
	public static List<Country> initialize() {
		List<Country> countriesList = new ArrayList<>();

		Country c1 = new Country("Niemcy", "Brelin");
		Country c2 = new Country("Polska", "Warszawa");
		Country c3 = new Country("Rosja", "Moskwa");
		Country c4 = new Country("Czechy", "Praga");
		Country c5 = new Country("Litwy", "Wilno");

		countriesList.add(c1);
		countriesList.add(c2);
		countriesList.add(c3);
		countriesList.add(c4);
		countriesList.add(c5);

		return countriesList;
	}

	public static Map<String, Country> getMap(List<Country> list) {

		Map<String, Country> countriesMap = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			countriesMap.put(list.get(i).getCapital(), list.get(i));
		}
		return countriesMap;
	}

	public static void main(String[] args) {
		List<Country> countryList = initialize();
		Map<String, Country> countryMap = getMap(countryList);

		for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue().getName());

		}
	}
}
