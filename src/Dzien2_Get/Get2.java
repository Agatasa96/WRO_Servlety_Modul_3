package Dzien2_Get;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get2")
public class Get2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String[]> params = request.getParameterMap();
		for (Map.Entry<String, String[]> entry : params.entrySet()) {
			String responseString = "";
			if (entry.getValue().length > 1) {
				responseString += entry.getKey() + ": ";
				for (int i = 0; i < entry.getValue().length; i++) {
					responseString += entry.getValue()[i] + " ";
				}

			}

			else {
				responseString += entry.getKey() + " : " + entry.getValue()[0];
			}

			response.getWriter().append("<h1> ").append(responseString).append(" </h1>");
		}
	}

}
