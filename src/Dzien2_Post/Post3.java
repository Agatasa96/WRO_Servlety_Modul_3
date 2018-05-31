package Dzien2_Post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Post3")
public class Post3 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int a = Integer.parseInt(request.getParameter("a"));
		int b = Integer.parseInt(request.getParameter("b"));
		int c = Integer.parseInt(request.getParameter("c"));
		double delta = (b*b)-(4*a*c);
		String res="";
		if (delta>0){
			double x1 = -b+Math.sqrt(((delta)/(2*a)));
			double x2 = -b-Math.sqrt(((delta)/(2*a)));
			res = "<h1>Miejsca zerowe funkcji to: " + x1 + " oraz " + x2 +"</h1>";
			
		}
		else if (delta==0){
			double x0=-b/(2*a);
			res = "<h1>Miejsca zerowe funkcji to: " + x0+"</h1>";
		}
		else{
			res = "<h1>Delta <0, brak msc zerowych</h1>";
		}
		
		response.getWriter().append(res);
	}

}
