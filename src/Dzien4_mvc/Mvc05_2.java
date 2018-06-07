package Dzien4_mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Mvc05_2
 */
@WebServlet("/Mvc05_2")
public class Mvc05_2 extends HttpServlet {
	public static final String TITLE = "title";
	public static final String AUTHOR = "author";
	public static final String ISBN = "ISBN";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/dzien4_jsp/mvc05_2.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Book> b = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			String title = request.getParameter(TITLE + i);
			String author = request.getParameter(AUTHOR + i);
			String ISBn = request.getParameter(ISBN + i);
			Book b1 = new Book(title, author, ISBn);
			b.add(b1);
		}

		HttpSession sess = request.getSession();

		sess.setAttribute("b", b);

		getServletContext().getRequestDispatcher("/WEB-INF/dzien4_jsp/resultZ5.jsp").forward(request, response);
	}
}
