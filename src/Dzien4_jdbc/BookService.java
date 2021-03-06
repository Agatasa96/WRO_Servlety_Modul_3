package Dzien4_jdbc;

import java.util.List;

public class BookService {

	private BookDao bookDao;

	public BookService() {
		this.bookDao = new BookDao();
	}

	public String saveBook(Book book) {
		String msg;
		if (bookDao.insert(book)) {
			msg = "<h1>Zapisano " + book.toString() + "</h1>";
		} else {
			msg = "<h1>Cannot save entity!</h1>";
		}
		return msg;
	}

	public String deleteBook(Long id) {
		String msg;
		if (bookDao.delete(id)) {
			msg = "<h1>Usunieto ksiazke o id:" + id.toString() + "</h1>";
		} else {
			msg = "<h1>Cannot delete entity!</h1>";
		}
		return msg;
	}

	public StringBuilder viewBooks() {

		StringBuilder msg = new StringBuilder();
		List<String> books = bookDao.view();
		msg.append("<table style=\"width:100%\" frame=\"border\"");
		for (int i = 0; i < books.size(); i = i + 4) {
			msg.append("<tr>").append("<th>").append(books.get(i)).append("</th><th>").append(books.get(i + 1))
					.append("</th><th>").append(books.get(i + 2)).append("</th><th> ").append(books.get(i + 3))
					.append("</th><th>").append("<a href = \"./delete-book?id=").append(books.get(i))
					.append("\">Usun</a>").append("</th><th>").append("<a href = \"./Jdbc0444?id=").append(books.get(i))
					.append("\">Edytuj</a>").append("</th></tr>");

		}
		msg.append("</table>");

		msg.append("<div><a href = \"./search-book\">Wyszukaj ksiazke</a></div>");
		return msg;
	}

	public String editBook(Book book, Long id) {
		String msg;
		if (bookDao.edit(book, id)) {
			msg = "<h1>Zedytowano ksiazke o id:" + id.toString() + "</h1>";
		} else {
			msg = "<h1>Nie mozna edytowac </h1>";
		}
		return msg;
	}

	public StringBuilder searchBook(String title) {
		StringBuilder msg = new StringBuilder();
		List<String> books = bookDao.view();
		msg.append("<table border=\"1\" rules=\"all\"");
		for (int i = 0; i < books.size(); i = i + 4) {
			if (books.get(i + 2).contains(title)) {
				msg.append("<tr>").append("<th>").append(books.get(i)).append("</th><th>").append(books.get(i + 1))
						.append("</th><th>").append(books.get(i + 2)).append("</th><th> ").append(books.get(i + 3))
						.append("</th>");
			}
		}
		return msg;
	}

}
