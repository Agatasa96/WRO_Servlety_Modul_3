package Dzien2_homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet_05_01")
public class Servlet_05_01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();

		sb.append("<form action = \"./Servlet_05_01\" method = \"post\">").append("<div>")
				.append("<label>Nazwa</label>").append("<input type = \"text\" name = \"nazwa\">").append("</div>")
				.append("<div>").append("<label>Cena</label>").append("<input type = \"number\" name = \"cena\">")
				.append("</div>").append("<div>").append("<label>Ilosc</label>")
				.append("<input type = \"number\" name = \"ilosc\">").append("</div>").append("<div>")
				.append("<input type = \"submit\" value = \"Dodaj do koszka\">").append("</div>").append("</form>");

		response.getWriter().append(sb);

		StringBuilder sb2 = new StringBuilder();
		sb2.append("<h1> <a href = \"./Servlet_05_02\">Zawartosc koszyka</a></h1>");
		response.getWriter().append(sb2);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();
		List<String> koszyk = new ArrayList<>();
		String name = request.getParameter("nazwa");
		String cena = request.getParameter("cena");
		String ilosc = request.getParameter("ilosc");

		if (sess.getAttribute("koszyk") == null) {

			koszyk.add(name);
			koszyk.add(ilosc);
			koszyk.add(cena);
			sess.setAttribute("koszyk", koszyk);
		} else {
			koszyk = (List<String>) sess.getAttribute("koszyk");

			koszyk.add(name);
			koszyk.add(ilosc);
			koszyk.add(cena);

			sess.setAttribute("koszyk", koszyk);
		}

		response.getWriter().append("<h1> Produkt dodany</h1>");
		doGet(request, response);

	}

}
