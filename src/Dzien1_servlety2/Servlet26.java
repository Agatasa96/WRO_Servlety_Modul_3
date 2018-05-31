package Dzien1_servlety2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet26")
public class Servlet26 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userAgent = request.getHeader("User-Agent");
		String browser = userAgent.substring(0, userAgent.length() / 2);

		if (browser.contains("Chrome")) {
			response.getWriter().append("<h1> Użytkownik używa Google Chrome</h1>");
		} else if (browser.contains("Safari")) {
			response.getWriter().append("<h1> Użytkownik używa Safari</h1>");
		} else if (browser.contains("Mozilla")) {
			response.getWriter().append("<h1> Użytkownik używa Mozilla Firefox</h1>");
		} else if (browser.contains("Opera")) {
			response.getWriter().append("<h1> Użytkownik używa Opera</h1>");
		} else {
			response.getWriter().append("<h1>Brak informacji o przeglądarce</h1>");
		}
	}

}
