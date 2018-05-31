package Dzien1_servlety2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet22 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().append("<h1>" + getInitParameter("myParam") + "</h1>");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		String myParam = config.getInitParameter("myParam");
		System.out.println(myParam);
		super.init(config);
	}

}