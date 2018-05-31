package Dzien1_homework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_01")
public class Servlet_02 extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext con = getServletContext();
		String path = con.getRealPath("oop.txt");
		File file = new File(path);
		Scanner sc = new Scanner(file);
		
		
		while (sc.hasNextLine()){
			response.getWriter().append(sc.nextLine());
		}
		sc.close();
	}

}
