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
	<%!String[] names = { "A", "B", "C", "D" };%>

	<c:forEach var="e" items="<%=names%>">
		<table border="1" rules="all">
			<tr>
				<th><c:out value="${e}" /></th>
			</tr>
		</table>

	</c:forEach>
</body>
</html>