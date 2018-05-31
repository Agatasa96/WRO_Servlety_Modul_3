package Dzien2_Get;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get1")
public class Get1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String start = request.getParameter("start");
		String end = request.getParameter("end");

		if (!Objects.nonNull(start) && !Objects.nonNull(end)) {
			response.getWriter().append("<h1> Brak parametrów!</h1>");
		} else {
			try {
				for (int i = Integer.parseInt(start); i <= Integer.parseInt(end); i++) {
					response.getWriter().append("<h1>" + i + "</h1>");
				}
			} catch (NumberFormatException e) {
				response.getWriter().append("<h1>Podales ze znaki parametrow</h1>");
			}
		}
	}

}
