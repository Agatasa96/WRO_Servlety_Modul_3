package Dzien2_Session;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Sess03_Add
 */
@WebServlet("/addToSession")
public class Sess03_Add extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String key = request.getParameter("key");
		String value = request.getParameter("value");

		HttpSession session = request.getSession();

		List<String> keys = new ArrayList<>();

		if (session.getAttribute("keys") == null) {
			session.setAttribute("keys", keys);
		} else {

		}
		session.setAttribute(key, value);

	}

}
