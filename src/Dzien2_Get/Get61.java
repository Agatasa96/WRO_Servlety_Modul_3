package Dzien2_Get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get61")
public class Get61 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		StringBuilder sb = new StringBuilder();

		for (int i = 1980; i <= 2010; i++) {
			sb.append("<div>").append("<a href=\"/Dzien2/Get62?year=").append(i).append("\">").append("Link do roku: ")
					.append(i).append("</a>").append("</div>");
		}
		
		response.getWriter().append(sb);
	}

}
