package Dzien2_homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		int check = 0;
		for (Cookie c : cookies) {
			if ("visits".equals(c.getName())) {
				int counter = Integer.parseInt(c.getValue());
				String resp = "<h1> Witaj, odwiedziles strone juz " + counter + " razy</h1>";
				response.getWriter().append(resp);
				counter = counter + 1;
				String newValue = counter + "";
				c.setValue(newValue);
				c.setMaxAge(365 * 24 * 60 * 60);
				response.addCookie(c);
				check++;
			}

		}

		if (check == 0) {

			String resp = "<h1>Witaj pierwszy raz na naszej stronie</h1>";
			response.getWriter().append(resp);
			Cookie cookie = new Cookie("visits", "1");
			response.addCookie(cookie);

		}

	}
}
