<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Witaj na stronie 3!</h1>
	<a href="./Servlet_01"> Link do strony 1</a>
	<a href="./Servlet6_2"> Link do strony 2</a>
	<a href="./Servlet6_4"> Link do historii</a>

	<%
		HttpSession sess = request.getSession();
	%>
	<%
		List<Integer> history;
	%>


	<%
		history = (List<Integer>) sess.getAttribute("history");
	%>
	<%
		history.add(3);
	%>
	<%
		sess.setAttribute("history", history);
	%>



</body>
</html>