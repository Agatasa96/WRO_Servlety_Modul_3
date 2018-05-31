package Dzien1_homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet_04")
public class Servlet_04 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Random r = new Random();
		ArrayList<Integer> liczby = new ArrayList<>();
		int liczba = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("<style>\n" + "table, th, td {\n" + "    border: 1px solid black;\n"
				+ "    border-collapse: collapse;\n" + "}\n" + "</style>");
		sb.append("<table>");
		sb.append("<tr><th>Nieposortowane</th><tr>");
		for (int i = 0; i < 10; i++) {
			liczba = r.nextInt(100);
			liczby.add(liczba);
			sb.append("<tr><td>");
			sb.append(liczba);
			sb.append("</tr></td>");
		}

		sb.append("</table>");

		Collections.sort(liczby);
		sb.append("<style>\n" + "table, th, td {\n" + "    border: 1px solid black;\n"
				+ "    border-collapse: collapse;\n" + "}\n" + "</style>");
		sb.append("<table>");
		sb.append("<tr><th>Posortowane</th><tr>");
		for (int i = 0; i < liczby.size(); i++) {
			sb.append("<tr><td>");
			sb.append(liczby.get(i));
			sb.append("</tr></td>");
		}
		sb.append("</table>");
		response.getWriter().append(sb);
	}

	
}
