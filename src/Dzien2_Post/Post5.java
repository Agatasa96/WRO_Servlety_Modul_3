package Dzien2_Post;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post5
 */
@WebServlet("/Post5")
public class Post5 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String button = request.getParameter("cT");
		String value = request.getParameter("degrees");
		double degree = Double.parseDouble(value);
		if (button.equals("cToF")) {
			degree = 32 + (degree * 9 / 5);
		} else {
			degree = (5 * (degree - 32)) / 9;
		}
		
		response.getWriter().append("Wynik: " +degree);
	}

}
