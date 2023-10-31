<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/j4lab2/tamgiac" method="post">
	<input name="a" placeholder="Cạnh a?"><br>
	<input name="b" placeholder="Cạnh b?"><br>
	<input name="c" placeholder="Cạnh c?"><hr>
	<button formaction="/j4lab2/dientich">Tính diện tích</button>
	<button formaction="/j4lab2/chuvi">Tính chu vi</button>
	</form>
	<h3>${message}</h3>
</body>
</html>