package Dzien1_kolekcje1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main2 {
	public static List<Integer> removeDivider(List<Integer> list, int divider) {
		List<Integer> temp = new ArrayList<>(list);
		Iterator<Integer> it = temp.iterator();

		while (it.hasNext()) {
			if (it.next() % divider == 0) {
				it.remove();
			}
		}
		return temp;

	}

}
