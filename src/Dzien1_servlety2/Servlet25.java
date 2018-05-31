package Dzien1_servlety2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet25")
public class Servlet25 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getLocalAddr();

		response.getWriter().append("<h1>" + request.getHeader("Accept") + "</h1>");
		response.getWriter().append("<h1>" + request.getHeader("User-Agent") + "</h1>");
		response.getWriter().append("<h1>" + request.getHeader("Host") + "</h1>");
	}

}
