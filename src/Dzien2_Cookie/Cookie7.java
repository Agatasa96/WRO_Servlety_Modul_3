package Dzien2_Cookie;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie7 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StringBuilder sb = new StringBuilder();

		Cookie[] cookies = request.getCookies();
		for (Cookie c : cookies) {
			if ("userName".equals(c.getName())) {
				sb.append("<h1> Czesc " + c.getValue() + " Twoje ciasteczka zostaly wczytane" + "</h1>");

			} else {

				sb.append("<form action=\"/Dzien2_Cookie/rememberMe\" method=\"post\"> ");
				sb.append("<label>Imie: </label>");
				sb.append("<input type= \"text\" name=\"name\">");
				sb.append("<input type = \"checkbox\" name=\"choice\" value=\"true\">");
				sb.append("Zapamietaj mnie");
				sb.append("<input type = \"submit\" value=\"Wyslij\">");
				sb.append("</form>");

			}
		}
		response.getWriter().append(sb);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");

		String check = request.getParameter("choice");
		StringBuilder sb = new StringBuilder();
		if (!Objects.isNull(name)) {
			sb.append("<h1> Czesc " + name + "</h1>");
			if (!Objects.isNull(check)) {
				if (check.equals("true")) {
					Cookie cookie = new Cookie("userName", name);
					response.addCookie(cookie);
				}
			}
		}
		response.getWriter().append(sb);

	}

}
