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
 * Servlet implementation class Cookie6
 */
@WebServlet("/Cookie6")
public class Cookie6 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String txtColor = request.getParameter("textColor");
		String backgroundColor = request.getParameter("backgroundColor");
		StringBuilder out = new StringBuilder();
		if (txtColor.equals("") || backgroundColor.equals("")) {
			Cookie[] cookies = request.getCookies();
			for (Cookie c : cookies) {
				if ("txtColor".equals(c.getName())) {
					txtColor = c.getValue();
				}
				if ("backgroundColor".equals(c.getName())) {
					backgroundColor = c.getValue();
				}
			}

			out.append("<body style='background-color:");
			out.append(backgroundColor);
			out.append("', text='");
			out.append(txtColor);
			out.append("'>");
			out.append("<h1> Zapamietany w ciasteczku kolor tekstu to:  " + txtColor + ", oraz tla jako: "
					+ backgroundColor + "</h1>");
			out.append("</body>");

		} else if (Objects.isNull(txtColor) || Objects.isNull(backgroundColor)) {
			out.append("<a href=/Dzien2/index_6.html>Wybierz kolorki!</a>");
		}

		else {
			Cookie txtColCookie = new Cookie("txtColor", txtColor);
			Cookie backrdColCookie = new Cookie("backgroundColor", backgroundColor);
			response.addCookie(txtColCookie);
			response.addCookie(backrdColCookie);

			out.append("<body style='background-color:");
			out.append(backgroundColor);
			out.append("', text='");
			out.append(txtColor);
			out.append("'>");
			out.append("<h1> Wybrales kolor tekstu jako: " + txtColor + ", oraz tla jako: " + backgroundColor
					+ ". Twój wybór zostal zapisany w ciasteczku." + "</h1>");
			out.append("</body>");

		}

		response.getWriter().append(out);
	}

}
