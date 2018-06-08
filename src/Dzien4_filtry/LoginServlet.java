package Dzien4_filtry;


import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = { "/login" }, initParams = { @WebInitParam(name = "login", value = "root"),
		@WebInitParam(name = "password", value = "coderslab") })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String login, password;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		login = config.getInitParameter("login");
		password = config.getInitParameter("password");
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String reqLogin = request.getParameter("login");
		String reqPass = request.getParameter("password");
		
		String msg;
		if (reqLogin.equals(login) && reqPass.equals(password)) {
			HttpSession session = request.getSession();
			session.setAttribute("username", login);
			msg = "<h1>Sucessfuly LoggedIn!</h1>";
		} else {
			msg = "<h1>Invalid Login or Password!</h1>";
		}
		response.getWriter().append(msg);
	}

}