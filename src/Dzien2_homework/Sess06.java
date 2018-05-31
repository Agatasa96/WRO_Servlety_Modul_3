package Dzien2_homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/favImages")
public class Sess06 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		sess.setAttribute("pagesVisited", 0);
		if (sess.getAttribute("pagesVisited").equals(0)) {
			sess.setAttribute("pagesVisited", 1);
			response.sendRedirect("wybor_1.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
		StringBuilder sb = new StringBuilder();

		if (sess.getAttribute("pagesVisited").equals(1)) {
			String choice1 = request.getParameter("choice");
			sess.setAttribute("choice1", choice1);
			sess.setAttribute("pagesVisited", 2);
			response.sendRedirect("wybor_2.html");
		} else if (sess.getAttribute("pagesVisited").equals(2)) {
			String choice2 = request.getParameter("choice");
			sess.setAttribute("choice2", choice2);
			sess.setAttribute("pagesVisited", 3);
			response.sendRedirect("wybor_3.html");
		} else if (sess.getAttribute("pagesVisited").equals(3)) {
			String choice3 = request.getParameter("choice");
			sess.setAttribute("choice3", choice3);
			sess.setAttribute("pagesVisited", 4);
			response.sendRedirect("wybor_4.html");
		} else if (sess.getAttribute("pagesVisited").equals(4)) {
			String choice4 = request.getParameter("choice");
			sess.setAttribute("choice4", choice4);
			sb.append("<h1> Te obrazy Ci sie podobaly: </h1>");
			if (sess.getAttribute("choice1").equals("tak")) {
				sb.append("Strona 1 ");
			}
			if (sess.getAttribute("choice2").equals("tak")) {
				sb.append("Strona 2 ");
			}
			if (sess.getAttribute("choice3").equals("tak")) {
				sb.append("Strona 3 ");
			}
			if (sess.getAttribute("choice4").equals("tak")) {
				sb.append("Strona 4 ");
			}
			response.getWriter().append(sb);
			
		}
	}

}
