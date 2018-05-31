package Dzien2_Session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess08
 */
@WebServlet("/Sess08")
public class Sess08 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();
		StringBuilder sb = new StringBuilder();

		sess.setAttribute("czechy", "praga");
		sess.setAttribute("niemcy", "berlin");
		sess.setAttribute("rosja", "moskwa");

		sb.append("<form method =\"post\">").append("Podaj stolice Czech: ")
				.append("<input type = \"text\" name=\"answer1\">").append("Podaj stolice Niemiec: ")
				.append("<input type = \"text\" name=\"answer2\">").append("Podaj stolice Rosji: ")
				.append("<input type = \"text\" name=\"answer3\">").append("<input type = \"submit\" value=\"Wyslij\">")
				.append("</form>");
		response.getWriter().append(sb);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();
		StringBuilder sb = new StringBuilder();

		String answer1 = request.getParameter("answer1");
		String answer2 = request.getParameter("answer2");
		String answer3 = request.getParameter("answer3");
		int i = 0;
		if (answer1.equals(sess.getAttribute("czechy"))) {
			i++;
		}
		if (answer2.equals(sess.getAttribute("niemcy"))) {
			i++;
		}
		if (answer3.equals(sess.getAttribute("rosja"))) {
			i++;
		}

		response.getWriter().append("Ilosc poprawnych odp: " + i);
	}

}
