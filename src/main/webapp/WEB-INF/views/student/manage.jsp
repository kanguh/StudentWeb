<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보 관리</title>
</head>
<body>
	<h3>학생 정보 착</h3>
	<form action="/student/register" method="post">
		<input type="text" name = "name" placeholder="이름">
		<input type="text" name = "firstScore"  placeholder="첫번째 점수">
		<input type="text" name = "secondScore"  placeholder="두번째 점수">
		<input type="submit" value="등록">
	</form>
	<h3>학생 정보 삭제</h3>
	<form action="/student/remove" method="get">
		<input type="text" name = "name">
		<input type="submit" value="삭제">
	</form>
</body>
</html>