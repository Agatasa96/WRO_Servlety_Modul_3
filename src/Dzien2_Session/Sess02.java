package Dzien2_Session;

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
 * Servlet implementation class Sess02
 */
@WebServlet("/Sess02")
public class Sess02 extends HttpServlet {

	@Override

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StringBuilder sb = new StringBuilder();

		sb.append("<form action=\"/Dzien2/Sess02\" method=\"post\">")
				.append("<label for=\"ocena\">Podaj ocenę </label>")
				.append("<input type=\"text\" name=\"ocena\" id=\"ocena\">")
				.append("<input type=\"submit\" value=\"Wyślij\">").append("</form>");

		response.getWriter().append(sb);

	}

	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		String ocena = request.getParameter("ocena");
		int ocenaParse = Integer.parseInt(ocena);

		List<Integer> oceny = new ArrayList<>();
		if (ocenaParse >= 1 && ocenaParse <= 6) {
			if (session.getAttribute("ocena") == null) {
				oceny.add(ocenaParse);
				session.setAttribute("scores", oceny);
			} else {
				oceny = (List<Integer>) session.getAttribute("scores");
				oceny.add(ocenaParse);
				session.setAttribute("scores", oceny);
			}
		}
		
		int sum = 0;
		double avg = 0.0;

		for (int i = 0; i < oceny.size(); i++) {
			sum += oceny.get(i);

			avg = (double) sum / oceny.size();

			StringBuilder sb = new StringBuilder();

			sb.append("<h1>").append("Średnia z liczb ").append(oceny.toString()).append(" wynosi: ").append(avg)
					.append("</h1>");

			doGet(request, response);

			response.getWriter().append(sb);

		}
	}

}