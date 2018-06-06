<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<c:forEach var="par" items="${paramValues.role}">
	<li><c:out value="${par}"/></li>
	</c:forEach>
</body>
