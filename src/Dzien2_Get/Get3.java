package Dzien2_Get;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Get3")
public class Get3 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String width = request.getParameter("width");
		String height = request.getParameter("height");

		if (!Objects.nonNull(width) && !Objects.nonNull(height)) {
			int ii = 5;
			int jj = 10;
			for (int i = 1; i < ii; i++) {
				for (int j = 1; j < jj; j++) {

					response.getWriter().append(" " + i * j);
				}
				response.getWriter().append(" \n");
			}
		} else {

			for (int i = 1; i < Integer.parseInt(width); i++) {
				for (int j = 1; j < Integer.parseInt(height); j++) {

					response.getWriter().append(" " + i * j);
				}
				response.getWriter().append("\n");
			}

		}

	}

}
