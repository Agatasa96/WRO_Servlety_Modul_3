<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formularz</title>
</head>
<body>
	<form action="./add-book" method="post">
		<label>Title</label> <input type="text" name="title"> <label>Author</label>
		<input type="text" name="author"> <label>ISBN</label> <input
			type="text" name="isbn"> <input type="submit" value="Send">
	</form>
</body>
</html>