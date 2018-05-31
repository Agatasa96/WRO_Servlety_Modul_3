package Dzien2_homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_06")
public class Servlet_06 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] numbers = request.getParameterValues("num");
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		int divide = 1;
		sb.append("<h1>Liczby: ");

		for (int i = 0; i < numbers.length; i++) {
			sb.append(numbers[i]).append(" ");
			int num = Integer.parseInt(numbers[i]);
			sum += num;
			divide *= num;
		}
		double avg = sum / numbers.length;
		sb.append("<div>Srednia: ").append(avg).append("</div>").append("<div>").append("Suma: ").append(sum)
				.append("</div>").append("<div>").append("Iloczyn: ").append(divide).append("</div></h1>");

		response.getWriter().append(sb);

	}

}
