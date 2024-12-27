<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 로그인</title>
</head>
<body>
	<h1>학생 로그인</h1>
	<form action="/student/login"method ="post">
		<input type= "text" nmae="userId" placeholder = "아이디">
		<input type= "password" nmae="userPw" placeholder = "비밀번호">
		<input type="submit" value="로그인">
	</form>
</body>
</html>