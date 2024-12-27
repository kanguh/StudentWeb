<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이름 중복 안내</title>
<style type="text/css">
	h1{
		color: red;
	}
	
</style>
	<%	
		/*스크립틀릿 : jsp에서 자바코드를 작성하게 해줌
		- jsp는 servlet으로 변환되어 실행함
		그래서 html기반 이지만 자바코드가 작성 가능함
		서블릿은? PrintWriter를 통해서 웹페이 태그를 출력
		- jsp와 비교했을 때 자바 기반의 파일이지마 html코드를 쓸 수 있는 특징을 가짐
		jsp를 사용하는 이유
		- 자바코드와 html코드를 분리할 수 있음 -> 
			지금의 result.jsp는 자바와 html 코드가 하께 존재함
				자바코드와 html 코드를 분리하려고 하는것임
		 MVC모델 1, 2 
		 - 지금처럼 jsp에 자바코드와 html 코드가 함께있는 방식으로 코딩하는것을 model 1방식이라고 함
		 - 쓰는건 가능, 하지만 구바익, 공동 작업시 유지보수가 힘들다는 단점이 있음
		 - 혼자서 할땐 편리함 한눈에 코드가 들어오기 때문에 헷갈리지 않음
		 - 백엔드 프로그래밍 부분을 servlet에서 하고 Servlet에서 처리한 데이터를 jsprk cnffur,
		   컨트롤로, 모델, 뷰로 나누는 것이 model 2 방식 이제 이걸로 해보겟슴*/
		
	
		
		//String message = (String)request.getAttribute("message");
	%>
</head>
<body>
	꺽쇠 퍼센트 이코르 기호 엽에 변수명 대신 getAttrubute할때 전달했던 키값을 다러 안에 적어주면댐
	<h1>${message }$</h1>
</body>
</html>