<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생리스트 조회<h1>
	<!--만약 출력하고자 하는 데이터가 List객체로 넘어온다면
	for문을 이용해 하나씩 꺼내와 출력하면 됨
	자바에서 사용한 for문을 대체할 수 있응 라이브러리가 존재
	바로바로 JSTL  -->
	<c:forEach items="${sList }" var="std">
	<ul>
		<li>학생이름 : ${std.name }$</li>
		<li>1차점수 : ${std.firstScore }$</li>
		<li>2차점수 : ${std.secondScore }$</li>
	</ul>
	</c:forEach>
</body>
</html>