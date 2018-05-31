package Dzien1_kolekcje1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main4 {
	public static List<City> reverse(List<City> list) {

		List<City> temp = new ArrayList<>(list);
		ListIterator<City> li = temp.listIterator(temp.size());

		List<City> listPr = new ArrayList<>();
		while (li.hasPrevious()) {
			listPr.add(li.previous());
		}

		return listPr;
	}
}
