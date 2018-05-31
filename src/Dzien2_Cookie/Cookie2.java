package Dzien2_Cookie;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie2
 */
@WebServlet("/Cookie2")
public class Cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		
		String resp;
		
		if (Objects.isNull(key)||Objects.isNull(value)){
			resp = "Ciesteczko musi skladac sie z klucza i wartosci";
		}
		else {
			resp = "Dodaje pyszne ciasteczko";
			Cookie cookie = new Cookie(key, value);
			cookie.setMaxAge(24*60*60);
			response.addCookie(cookie);
		}
	response.getWriter().append("<h1>").append(resp).append("</h1>");
	
	}

}
