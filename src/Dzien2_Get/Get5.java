package Dzien2_Get;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get5")
public class Get5 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String[]> param = request.getParameterMap();

		for (Entry<String, String[]> entry : param.entrySet()) {
			String resp = "";
			if (entry.getValue().length > 1) {
				resp += entry.getKey() + ": ";
				for (int i = 0; i < entry.getValue().length; i++) {
					resp += entry.getValue()[i] + " ";
				}

			} else {
				resp = entry.getKey() + ": " + entry.getValue()[0];
			}
			response.getWriter().append("<h1> ").append(resp).append(" </h1>");
		}
	}
}
