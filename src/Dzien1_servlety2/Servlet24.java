package Dzien1_servlety2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet24 extends HttpServlet {


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String contextParam = getServletContext().getInitParameter("applicationName");
		resp.getWriter().append("<h1>" + contextParam + "</h1>");

	}

}
