package Dzien1_homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_03_01")
public class Servlet_03_01 extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<7;i++){
			
			sb.append("<div>");
			sb.append("<a href = \"/Homework_01/Servlet_03_2?id=");
			sb.append(i);
			sb.append("\">");
			sb.append("Link do produktu</a>");
			sb.append("</div>");
			
		}
		response.getWriter().append(sb);
	}

}
