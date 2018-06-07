package Dzien4_mvc;

public class Books {
	private String author;
	private String title;
	private String ISBN;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String toString() {
		return "Book: author = " + author + ", title = " + title;
	}

	public Books(String author, String title, String iSBN) {
		super();
		this.author = author;
		this.title = title;
		ISBN = iSBN;
	}

	public Books() {

	}

}
