package Dzien2_Session;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess07
 */
@WebServlet("/Sess07")
public class Sess07 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Random r = new Random();
		int liczba1 = r.nextInt(1000 - 20 + 1) + 20;
		int liczba2 = r.nextInt(1000 - 20 + 1) + 20;

		HttpSession sess = request.getSession();
		sess.setAttribute("liczba1", liczba1);
		sess.setAttribute("liczba2", liczba2);

		StringBuilder sb = new StringBuilder();
		sb.append("<form method = \"post\">").append("<label>Wylosowane liczby to: ").append(liczba1).append(" oraz ")
				.append(liczba2).append("</label>").append("<div><label>Wpisz wynik dodawania</div></label>")
				.append("<input type = \"number\" name= \"dod\">")
				.append("<div><label>Wpisz wynik odejmowania</div></label>")
				.append("<input type = \"number\" name= \"ode\">")
				.append("<div><label>Wpisz wynik mnozenia</div></label>")
				.append("<input type = \"number\" name= \"mn\">")
				.append("<div><input type = \"submit\" value= \"Sprawdz\"><div>").append("</form>");

		response.getWriter().append(sb);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		StringBuilder sb = new StringBuilder();
		int liczba1 = (int) sess.getAttribute("liczba1");
		int liczba2 = (int) sess.getAttribute("liczba2");

		sb.append(liczba1).append(" + ").append(liczba2).append(" = ").append(request.getParameter("dod"));
		if (Integer.parseInt(request.getParameter("dod")) == (liczba1 + liczba2)) {
			sb.append(" correct    ");
		} else {
			sb.append(" wrong    ");
		}

		sb.append(liczba1).append(" - ").append(liczba2).append(" = ").append(request.getParameter("ode"));
		if (Integer.parseInt(request.getParameter("ode")) == (liczba1 - liczba2)) {
			sb.append(" correct    ");
		} else {
			sb.append(" wrong   ");
		}

		sb.append(liczba1).append(" * ").append(liczba2).append(" = ").append(request.getParameter("mn"));
		if (Integer.parseInt(request.getParameter("mn")) == (liczba1 * liczba2)) {
			sb.append(" correct   ");
		} else {
			sb.append(" wrong   ");
		}

		response.getWriter().append(sb);
	}

}
