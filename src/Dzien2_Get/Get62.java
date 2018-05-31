package Dzien2_Get;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Get62")
public class Get62 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String year = request.getParameter("year");
		
		StringBuilder sb = new StringBuilder();
		int min = -10;
		int max = 10;
		Random r = new Random();
		
		for (int i=0; i<5; i++){
			int mix = r.nextInt(max+1-min)+min;
			
		sb.append("<div>").append("<a href=\"/Dzien2/Get63?year=")
		.append(year)
		.append("&mix=")
		.append(mix)
		.append("\">")
		.append("Link do roku: ")
		.append(year)
		.append(" z mix: ")
		.append(mix)
		.append("</a>")
		.append("</div>");
	}
		
		response.getWriter().append(sb);
	}
	
}
