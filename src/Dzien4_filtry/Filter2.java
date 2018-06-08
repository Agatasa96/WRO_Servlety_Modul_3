package Dzien4_filtry;


import java.io.IOException;
import java.sql.Date;
import java.util.Collections;
import java.util.stream.Collectors;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


/**
 * Servlet Filter implementation class RequestExecutionTimeFilter
 */
@WebFilter("/*")
public class Filter2 implements Filter {

	private FilterInfoService service;

	/**
	 * Default constructor.
	 */
	public Filter2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long start = System.currentTimeMillis();
		chain.doFilter(request, response);
		long stop = System.currentTimeMillis();
		long exec = stop - start;
		HttpServletRequest req = (HttpServletRequest) request;
		FilterInfo info = createFilterInfo(req);
		info.setExecutionTime(exec);
		service.insertFilterInfo(info);
		System.out.println(req.getHeader("User-Agent"));
		System.out.println("Execution time: " + exec + " ms.");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		service = new FilterInfoService();
		// TODO Auto-generated method stub
	}

	private FilterInfo createFilterInfo(HttpServletRequest req) {
		FilterInfo info = new FilterInfo();
		info.setBrowserInfo(req.getHeader("User-Agent"));
		info.setDateTime(new Date(System.currentTimeMillis()));
		// Util, ktory zamienia Enumerable<String> na List<String>
		// A następnie zamienia to na strumien, ktory joinujemy przy pomocy ,
		// Lista -> {a, b, c} zmieni sie w Stringga -> a,b,c
		info.setParameters(Collections.list(req.getParameterNames()).stream().collect(Collectors.joining(",")));
		return info;
	}
}