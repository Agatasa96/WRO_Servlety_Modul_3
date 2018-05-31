package Dzien2_homework;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet_05_02
 */
@WebServlet("/Servlet_05_02")
public class Servlet_05_02 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		List<String> koszyk = (List<String>) sess.getAttribute("koszyk");
		StringBuilder sb = new StringBuilder();
		double suma = 0;
		for (int i = 0; i < koszyk.size(); i = i + 3) {
			int cena = Integer.parseInt(koszyk.get(i + 1));
			int ilosc = Integer.parseInt(koszyk.get(i + 2));
			suma += cena * ilosc;
			sb.append("<h1>").append(koszyk.get(i)).append(" - ").append(koszyk.get(i + 1)).append(" x ")
					.append(koszyk.get(i + 2)).append("zl = ").append(cena * ilosc).append("zl").append("</h1>");

		}
		sb.append("<div><h1>SUMA: ").append(suma).append("zl</h1></div>");

		response.getWriter().append(sb);
	}

}
