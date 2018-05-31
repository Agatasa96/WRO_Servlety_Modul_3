package Dzien2_Post;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Post4
 */
@WebServlet("/Post4")
public class Post4 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String resp = "<form action='' method='post'>\n" + 
			"<input name='numbers'/><br/>\n" + 
			"<input name='numbers'/><br/>\n" + 
			"<input name='numbers'/><br/>\n" + 
			"<input name='numbers'/><br/>\n" + 
			"<input type='submit'/>\n" + 
			"</form>";
		response.getWriter().append(resp);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] param = request.getParameterValues("numbers");
		List<Integer> paramList = new ArrayList<>();
		for (int i=0; i<param.length; i++){
			try{
				int a = Integer.parseInt(param[i]);
				paramList.add(a);
			} catch (NumberFormatException e){
				
			}
		}
		
		Collections.sort(paramList);
		String resp = "";
		for (int i=0; i< paramList.size(); i++){
			resp += "<h1>" + paramList.get(i) + "</h1>";
		}
		
		response.getWriter().append(resp);
	}

}
