package Dzien2_Cookie;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cookie52
 */
@WebServlet("/Cookie52")
public class Cookie52 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();

        Cookie c = null;
        for (Cookie cookie : cookies) {
            if ("User".equals(cookie.getName())) {
                c = cookie;
            }
        }
        String resp;
        if (Objects.nonNull(c)) {
        	System.out.println("Mam ciastok!");
            c.setMaxAge(0);
            response.addCookie(c);
            resp = "Ciasteczko zostało zjedzone :3";    
            response.getWriter().append("<h1>").append(resp).append("</h1>");
        } else {
        	System.out.println("NIE ma ciastka");
        	resp = "Nie odwiedziles tej strony";
            response.sendRedirect(request.getContextPath() + "/cookie51");
        }

	}

	
}
