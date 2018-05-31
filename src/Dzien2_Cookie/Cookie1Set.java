package Dzien2_Cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setCookie")
public class Cookie1Set extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie cookie = new Cookie("User", "Coders_lab");
		cookie.setMaxAge(24 * 60 * 60);
		response.addCookie(cookie);
	}

}
