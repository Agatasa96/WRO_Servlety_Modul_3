package Dzien4_jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





/**
 * Servlet implementation class MvcJdbc01
 */
@WebServlet("/add-book")
public class MvcJdbc01 extends HttpServlet {
private BookService bs= new BookService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/dzien4_jsp/jdbc1.jsp")
		.forward(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String ISBN = request.getParameter("isbn");
		
		Book b1 = new Book(title, author, ISBN);
		response.getWriter().append(bs.saveBook(b1));
	}

}
