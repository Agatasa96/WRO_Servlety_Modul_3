package Dzien2_Cookie;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Dzien2_Cookie/deleteCookie")
public class Cookie1Del extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		Cookie c = null;
		for (Cookie cookie : cookies) {
			if ("User".equals(cookie.getName())) {
				c = cookie;
			}
		}

		String respon;
		if (Objects.isNull(c)) {
			respon = "Brak ciasteczka";

		}

		else {
			c.setMaxAge(0);
			response.addCookie(c);
			respon = "Ciasteczko zostalo zjedzone!";
		}

		response.getWriter().append("<h1>").append(respon).append("</h1>");
	}

}
