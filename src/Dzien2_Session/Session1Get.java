package Dzien2_Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Session1Get
 */
@WebServlet("/Session1Get")
public class Session1Get extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		if (session.getAttribute("counter") == null) {
			response.getWriter().append("<h1> Brak atrybutow</h1>");

		}

		else {
			int counter = (int) session.getAttribute("counter");
			counter++;
			session.setAttribute("counter", counter);
			response.getWriter().append("<h1> Aktualny stan countera to: ").append(String.valueOf(counter));
		}
	}

}
