package Dzien4_jdbc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/all-books")
public class MvcJdbc03 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookService bs = new BookService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder msg = null;
		try {

			msg = bs.viewBooks();
		} catch (Exception ex) {
			msg.append("Something wrong happend ;(");
		}
		response.getWriter().append(msg);
	}
}
