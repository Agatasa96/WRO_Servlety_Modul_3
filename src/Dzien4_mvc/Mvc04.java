package Dzien4_mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc04
 */
@WebServlet("/Mvc04")
public class Mvc04 extends HttpServlet {
	public static final String TITLE = "title";
	public static final String AUTHOR = "author";
	public static final String ISBN = "ISBN";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/dzien4_jsp/form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> books = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			String title = request.getParameter(TITLE + i);
			String author = request.getParameter(AUTHOR + i);
			String ISBn = request.getParameter(ISBN + i);
			Book b = new Book(title, author, ISBn);
			books.add(b);
		}

		request.setAttribute("books", books);

		getServletContext().getRequestDispatcher("/WEB-INF/dzien4_jsp/resultZ4.jsp").forward(request, response);

	}
}
