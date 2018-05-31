package Dzien1_servlety2;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet21")
public class Servlety21 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated metwhod stub
		LocalDateTime localDate = LocalDateTime.now();
		response.getWriter().append("<h1>" + localDate.format(DateTimeFormatter.ISO_DATE_TIME) + "</h1>");

	}

}
