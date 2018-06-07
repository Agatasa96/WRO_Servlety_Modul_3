package Dzien4_mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Mvc05_1
 */
@WebServlet("/Mvc05_1")
public class Mvc05_1 extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getServletContext().getRequestDispatcher("/WEB-INF/dzien4_jsp/mvc05_1.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String author = request.getParameter("author");
		String title = request.getParameter("title");
		String ISBN = request.getParameter("ISBN");

		Book b = new Book();
		b.setAuthor(author);
		b.setTitle(title);
		b.setISBN(ISBN);

		HttpSession sess = request.getSession();
		sess.setAttribute("b", b);
		getServletContext().getRequestDispatcher("/WEB-INF/dzien4_jsp/resultZ5.jsp").forward(request, response);
	}

}
