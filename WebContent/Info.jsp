<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>get 방식에서 한글 깨짐 방지</h3>
	<form method="get" action="InfoServlet">
		이름 : <input type="text" name="name"><br>
		주소 : <input type="text" name="addr"><br>
		<input type="submit" value="get 전송">
	</form>
	<hr>
	<h3>post 방식에서 한글 깨짐 방지</h3>
	<form method="post" action="InfoServlet">
		이름 : <input type="text" name="name"><br>
		주소 : <input type="text" name="addr"><br>
		<input type="submit" value="post 전송">
	</form>
</body>
</html>