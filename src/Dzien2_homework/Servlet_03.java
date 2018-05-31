package Dzien2_homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet_03")
public class Servlet_03 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();

		HttpSession sess = request.getSession();

		if (sess.isNew()) {

			sb.append("<form action = \"/Homework_02/Servlet_03\" method = \"post\">").append("<div>")
					.append("<label>Imie</label>").append("<input type = \"text\" name = \"name\">").append("</div>")
					.append("<div>").append("<label>Nazwisko</label>")
					.append("<input type = \"text\" name = \"surname\">").append("</div>").append("<div>")
					.append("<label>Wiek</label>").append("<input type = \"text\" name = \"age\">").append("</div>")
					.append("<div>").append("<label>Plec</label>").append("<input type = \"text\" name = \"gender\">")
					.append("</div>").append("<div>").append("<input type = \"submit\" value = \"Wyslij\">")
					.append("</div>").append("</form>");

			response.getWriter().append(sb);

		} else {

			sb.append("<form action = \"/Homework_02/Servlet_03\" method = \"post\">").append("<div>")
					.append("<label>Imie</label>").append("<input type = \"text\" name = \"name\" value=\"")
					.append(sess.getAttribute("name")).append("\">").append("</div>").append("<div>")
					.append("<label>Nazwisko</label>").append("<input type = \"text\" name = \"surname\" value=\"")
					.append(sess.getAttribute("surname")).append("\">").append("</div>").append("<div>")
					.append("<label>Wiek</label>").append("<input type = \"text\" name = \"age\" value=\"")
					.append(sess.getAttribute("age")).append("\">").append("</div>").append("<div>")
					.append("<label>Plec</label>").append("<input type = \"text\" name = \"gender\" value = \"")
					.append(sess.getAttribute("gender")).append("\">").append("</div>").append("<div>")
					.append("<input type = \"submit\" value = \"Wyslij\">").append("</div>").append("</form>");

			response.getWriter().append(sb);

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String age = request.getParameter("age");
		String gender = request.getParameter("gender");
		sess.setAttribute("name", name);
		sess.setAttribute("surname", surname);
		sess.setAttribute("age", age);
		sess.setAttribute("gender", gender);
	}

}
