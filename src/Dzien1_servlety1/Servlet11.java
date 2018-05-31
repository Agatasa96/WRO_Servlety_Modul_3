package Dzien1_servlety1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlt11")
public class Servlet11 extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException{
		
		response.getWriter().append("<h1> Hello first servlet </h1>");
	}
}
