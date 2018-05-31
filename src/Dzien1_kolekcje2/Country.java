package Dzien1_kolekcje2;

public class Country {
	String name;
	String capital;

	public Country(String name, String capital) {

		this.name = name;
		this.capital = capital;
	}

	public String getName() {
		return name;
	}

	public String getCapital() {
		return capital;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + "]";
	}
}
