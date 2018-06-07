package Dzien4_mvc;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mvc01
 */
@WebServlet(urlPatterns = "/Mvc01", initParams = { @WebInitParam(name = "exchangeRate", value = "4.33") })
public class Mvc01 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String message = "";
		String euro = request.getParameter("euro");
		double wartosc = 0;
		try {
			int euroP = Integer.parseInt(euro);
			double exchangeP = Double.parseDouble(exchange);
			wartosc = euroP * exchangeP;
			request.setAttribute("total", wartosc);
		} catch (NumberFormatException e) {
			System.out.println("Nie da sie przeparsowac");
		}

		getServletContext().getRequestDispatcher("/WEB-INF/jsp/mvc01.jsp").forward(request, response);
	}

	String exchange;

	@Override
	public void init(ServletConfig config) throws ServletException {

		exchange = config.getInitParameter("exchangeRate");
		super.init(config);
	}

}
