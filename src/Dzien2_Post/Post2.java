package Dzien2_Post;

import java.io.IOException;
import java.util.Objects;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Post2")
public class Post2 extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String value = request.getParameter("value");
		String known = request.getParameter("known");

		StringTokenizer tokenizer = new StringTokenizer(value);

		if (Objects.isNull(known)) {

			StringBuilder sb = new StringBuilder();
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken();
				if (Const.wulgarymy.contains(token.toLowerCase())) {
					sb.append(token.replaceAll(".", "*")).append(" ");

				} else {
					sb.append(token).append(" ");
				}
			}
			value = sb.toString();
		}

		response.getWriter().append(value);
	}
}
