package Dzien1_servlety1;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet14")
public class Servlet14 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String[]> params = request.getParameterMap();
		response.getWriter().append("<h1>Wyswietl:</h1>");
		for (Map.Entry<String, String[]> entry : params.entrySet()) {

			response.getWriter().append("<h1>" + entry.getKey() + " : " + entry.getValue()[0] + "</h1>");
		}
	}

}
