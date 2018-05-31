package Dzien2_Session;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Sess05")
public class Sess05 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Random r = new Random();
		int liczba1 = r.nextInt(100);
		int liczba2 = r.nextInt(100);
		int sum = liczba1 + liczba2;

		HttpSession sess = request.getSession();
		sess.setAttribute("captcha", sum);

		StringBuilder sb = new StringBuilder();
		sb.append("<form method = \"post\">").append("<label>Imie</label>")
				.append("<input type = \"text\" name=\"name\">").append("<label>Nazwisko</label>")
				.append("<input type = \"text\" name=\"surname\">").append("<label>Mail</label>")
				.append("<input type = \"text\" name=\"mail\">").append("<label>Wynik dzialania ").append(liczba1)
				.append(" oraz ").append(liczba2).append("</label>").append("<input type = \"number\" name=\"number\">")
				.append("<div>").append("<input type = \"submit\" value=\"Wyslij\">").append("</div>")
				.append("</form>");

		response.getWriter().append(sb);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sess = request.getSession();
		int sum = (int) sess.getAttribute("captcha");
		int wynik = Integer.parseInt(request.getParameter("number"));
		if (sum == wynik) {
			response.getWriter().append("Brawo! Podales dobry wynik");
		} else {
			response.getWriter().append("Podales zly wnik ;(");
		}
	}

}
