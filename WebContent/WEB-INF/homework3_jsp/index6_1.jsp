
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



	<h1>Witaj na stronie 1!</h1>

	<a href='<c:url value = "/Servlet6_2"/>'> Link do strony 2</a>
	<a href='<c:url value = "/Servlet6_3"/>'> Link do strony 3</a>
	<a href='<c:url value = "/Servlet6_4"/>'> Link do historii</a>

	<%
		HttpSession sess = request.getSession();
	%>


	<c:choose>
		<c:when test="<%sess.isNew();%>">
			<%
				List<Integer> history = new ArrayList<>();
			%>
			<%
				history.add(1);
			%>
			<%
				sess.setAttribute("history", history);
			%>
		</c:when>
		<c:otherwise>

			<%
				List<Integer> history = (List<Integer>) sess.getAttribute("history");
			%>
			<%
				history.add(1);
			%>
			<%
				sess.setAttribute("history", history);
			%>
		</c:otherwise>
	</c:choose>



</body>
</html>