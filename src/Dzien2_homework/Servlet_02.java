package Dzien2_homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_02")
public class Servlet_02 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ciag = request.getParameter("ciag");
		String resp = "";
		int liczba = 0;
		int k = 0;
		int sum = 0;

		String[] ciagSplit = new String[ciag.length()];
		ciagSplit = ciag.split("");

		for (int i = ciagSplit.length - 1; i > -1; i--) {
			if (ciagSplit[i].equals("0") || ciagSplit[i].equals("1")) {

				liczba = Integer.parseInt(ciagSplit[i]);
				sum += Math.pow(2, k) * liczba;
				k++;
				resp = ciag + " to liczba: " + sum;
			}

			else {
				resp = "Nie podales ciagu binarnego... <przerwaca oczami>";
			}

		}
		response.getWriter().append(resp);
	}

}
