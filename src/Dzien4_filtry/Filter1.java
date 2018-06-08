package Dzien4_filtry;


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Filter1
 */
@WebFilter("/Filter1")
public class Filter1 implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	private String charsetEncoding = "utf-8";
	private String contentType = "text/html";

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(charsetEncoding);
		response.setContentType(contentType);
		response.setCharacterEncoding(charsetEncoding);

		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
