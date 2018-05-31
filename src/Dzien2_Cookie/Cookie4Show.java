package Dzien2_Cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookie4Show")
public class Cookie4Show extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] ciasteczka = request.getCookies();

		String resp = "";
		for (Cookie c : ciasteczka) {
			String name = c.getName();
			resp = "<a href = \"/Dzien2_Cookie/Cookie4Del?name=" + name + "\">" + "Ciasteczko: " + name + "</a>" + "     ";
			response.getWriter().append(resp);
		}
	}

}
