package Dzien4_jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class MvcJdbc04
 */
@WebServlet("/edit-book")
public class MvcJdbc04 extends HttpServlet {
	private BookService bs = new BookService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		HttpSession sess = request.getSession();
		sess.setAttribute("id", id);
		getServletContext().getRequestDispatcher("/WEB-INF/dzien4_jsp/jdbc4.jsp")
		.forward(request, response);	
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg;
		HttpSession sess = request.getSession();
		try {
			String id = (String) sess.getAttribute("id");
			long idP = Long.parseLong(id);
			String title = request.getParameter("title");
			String author = request.getParameter("author");
			String ISBN = request.getParameter("isbn");
			
			Book b1 = new Book(title, author, ISBN);
			response.getWriter().append(bs.editBook(b1, idP));
		} catch (Exception ex) {
			msg = "<h1> You specified wrong parameter \\\"id\\\"!!!</h1>";
			response.getWriter().append(msg);
		}
		
		
	}


}
