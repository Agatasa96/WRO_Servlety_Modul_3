<%@page import="java.util.List"%>
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
	<h1>Witaj na stronie 4 - historii!</h1>
	<%
		HttpSession sess = request.getSession();
	%>
	<%
		List<String> history = (List<String>) sess.getAttribute("history");
	%>
	<h2>Odwiedziles:</h2>
	<c:forEach var="s" items="<%=history%>">
		<p>
			<c:out value="Strona" />
			<c:out value="${s }" />
		</p>
	</c:forEach>
</body>
</html>