package Dzien2_homework;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet_01
 */
@WebServlet("/Servlet_01")
public class Servlet_01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double[] kurs = new double[2];
		kurs[0] = 4.29; // euro
		kurs[1] = 3.66; // usd

		String kw = request.getParameter("kwota");
		int kwota = Integer.parseInt(kw);

		String walutaZ = request.getParameter("walutaZ");
		String walutaNa = request.getParameter("walutaN");
		double przeliczone = 0;
		if (walutaZ.equals("EUR") && walutaNa.equals("PLN")) {
			przeliczone = kwota * kurs[0];
		} else if (walutaZ.equals("EUR") && walutaNa.equals("USD")) {
			przeliczone = kwota * kurs[0] / kurs[1];
		} else if (walutaZ.equals("USD") && walutaNa.equals("PLN")) {
			przeliczone = kwota * kurs[1];

		} else if (walutaZ.equals("USD") && walutaNa.equals("EUR")) {
			przeliczone = kwota * kurs[1] / kurs[0];
		} else if (walutaZ.equals("PLN") && walutaNa.equals("EUR")) {
			przeliczone = kwota / kurs[0];
		} else if (walutaZ.equals("PLN") && walutaNa.equals("USD")) {
			przeliczone = kwota / kurs[1];
		}
		String res = "<h1>Twoja kwota to: " + przeliczone + "</h1>";
		response.getWriter().append(res);

	}

}
