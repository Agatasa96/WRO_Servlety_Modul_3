package Dzien4_jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MvcJdbc02
 */
@WebServlet("/delete-book")
public class MvcJdbc02 extends HttpServlet {
	private BookService bs = new BookService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String msg;
		try {
			String id = request.getParameter("id");
			long idP = Long.parseLong(id);
			msg = bs.deleteBook(idP);
		} catch (Exception ex) {
			msg = "<h1> Please specify GET parameter \"id\"!!!</h1>";
		}
		response.getWriter().append(msg);
	}

}