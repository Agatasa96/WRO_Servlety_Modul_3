package Dzien4_mvc;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc02
 */
@WebServlet("/Mvc02")
public class Mvc02 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");

		try {
			int aP = Integer.parseInt(a) + 10;
			int bP = Integer.parseInt(b) + 10;
			request.setAttribute("a", aP);
			request.setAttribute("b", bP);

		} catch (NumberFormatException e) {
			System.out.println("Nie da sie przeparsowac");
		}
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/mvc02.jsp").forward(request, response);
	}

}
