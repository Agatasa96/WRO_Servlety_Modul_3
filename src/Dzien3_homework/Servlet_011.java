package Dzien3_homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_01
 */
@WebServlet(name = "Servlet_011", urlPatterns = { "/Servlet_011" })
public class Servlet_011 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// request.getRequestDispatcher("WEB-INF/jsp/jsp1.jsp").forward(request,
		// response);
		request.getRequestDispatcher("WEB-INF/homework3_jsp/index6_1.jsp").forward(request, response);
	}
}
