package Dzien2_Cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie4Del")
public class Cookie4Del extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Cookie[] ciasteczka = request.getCookies();
		String name = request.getParameter("name");

		for (Cookie c : ciasteczka) {
			if (name.equals(c.getName())) {
				c.setMaxAge(0);
				response.addCookie(c);
				response.getWriter().append("Usunieto ciacho...");
			}
		}
	}

}
