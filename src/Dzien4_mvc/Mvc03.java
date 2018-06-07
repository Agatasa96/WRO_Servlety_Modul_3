package Dzien4_mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc03
 */
@WebServlet("/Mvc03")
public class Mvc03 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		String ISBN = request.getParameter("ISBN");

		Book b1 = new Book();
		b1.setAuthor(author);
		b1.setTitle(title);
		b1.setISBN(ISBN);

		request.setAttribute("b1", b1);
		getServletContext().getRequestDispatcher("/WEB-INF/dzien3_jsp/result.jsp").forward(request, response);
	}

}
