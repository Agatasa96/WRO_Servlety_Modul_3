
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<body>
	<c:choose>
		<c:when test="${not empty param.role}">
		<c:out value="${param.role}" escapeXml="false"/>
		</c:when>
		<c:when test="${empty param.role}">
		<c:out value="${param.role}" default="guest" escapeXml="false"/>
		</c:when>
	</c:choose>

</body>
</html>