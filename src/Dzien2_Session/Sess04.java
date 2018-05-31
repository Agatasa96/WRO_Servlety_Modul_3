package Dzien2_Session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess04
 */
@WebServlet("/Sess04")
public class Sess04 extends HttpServlet {

	@Override

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.sendRedirect("index_04.html");

	}

	@Override

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		List<String> koszykProduktow = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		String name = request.getParameter("nazwa");
		String cena = request.getParameter("cena");
		String ilosc = request.getParameter("ilosc");

		if (sess.getAttribute("koszyk") == null) {
			koszykProduktow.add(name);
			koszykProduktow.add(ilosc);
			koszykProduktow.add(cena);
			sess.setAttribute("koszyk", koszykProduktow);
		} else {
			koszykProduktow = (List<String>) sess.getAttribute("koszyk");
			koszykProduktow.add(name);
			koszykProduktow.add(ilosc);
			koszykProduktow.add(cena);
			sess.setAttribute("koszyk", koszykProduktow);
		}

		response.getWriter().append("<h1> Produkt dodany</h1>");
		int sum = 0;

		for (int i = 0; i < koszykProduktow.size(); i = i + 3) {
			sum += Integer.parseInt(koszykProduktow.get(i + 2));
			sb.append("<h1>").append(koszykProduktow.get(i)).append(" - ").append(koszykProduktow.get(i + 1)).append(" x ").append(cena);

		}
		sb.append("<div><h1>").append("SUMA: ").append(sum).append("</h1></div>");
		response.getWriter().append(sb);

	}
}
