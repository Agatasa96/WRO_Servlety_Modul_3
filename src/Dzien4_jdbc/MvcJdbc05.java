package Dzien4_jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MvcJdbc05
 */
@WebServlet("/search-book")
public class MvcJdbc05 extends HttpServlet {

	private BookService bs = new BookService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/jdbc3.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder msg = null;
		String title = request.getParameter("title");
		try {

			msg = bs.searchBook(title);
		} catch (Exception ex) {
			msg.append("Something wrong happend ;(");
		}
		response.getWriter().append(msg);

	}
}
