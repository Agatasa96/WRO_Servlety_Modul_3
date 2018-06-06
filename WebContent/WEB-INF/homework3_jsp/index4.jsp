
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	<c:set var="now" value="<%= new java.util.Date()%>" />
	<p>
		Data:
		<fmt:formatDate pattern="yyyy-MM-dd" value="${now}" />
	</p>
	<c:set var="Amount" value="99.14115" />
	<c:set var="Amount1" value=".9914115" />
	<p>
		Opcja 1:
		<fmt:formatNumber type="number" groupingUsed="false" value="${Amount}" />
	</p>
	<p>
		Opcja 2:
		<c:out value="${Amount}" />
	</p>
	<p>
		Opcja3:
		<fmt:formatNumber type="percent" maxIntegerDigits="1"
			minFractionDigits="3" value="${Amount1}" />
	</p>

	<p>
		Opcja 4:

		<fmt:formatNumber minFractionDigits="3" value="${Amount}"
			type="currency" currencySymbol="ZL" />

	</p>
</body>
