<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<body>
	<c:forEach items = "${header}" var = "h">

            Header Name ${h.key}
            Header Value ${h.value} 
            <br/>
</c:forEach>
</body>
