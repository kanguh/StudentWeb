package com.kh.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*
 * 학생 정보 등록
 * URL : /student/register
 */
@WebServlet("/student/register")
public class StudentRegisterServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student>sList = new ArrayList<Student>();
		String name = request.getParameter("name");
		int firstScore = Integer.parseInt(request.getParameter("firstScore"));
		int secondScore =  Integer.parseInt(request.getParameter("secondScore"));
		/*
		 * 원인 : 문자열을 int로 변환할 수 없음
		 * 해결 : 문자열을 int로 변환해주기
		 * Integer.parseInt("");
		 */
		sList.add(new Student("일용자", 99, 88));
		sList.add(new Student("이용자", 88, 77));
		RequestDispatcher view;
		String message="";
		for(Student std : sList) {
			if(std.getName().equals(name)) {
//				out.println("<h1>이미 존재하는 이름<h1>");
				message = "이미 존재하는 이름";
				view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
				view.forward(request, response);
				return;
			}
		}
		sList.add(new Student(name, firstScore, secondScore));
//		out.println("<h1>학생정보 추가 성공<h1>");
		message = "추가 완료";
		view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
		view.forward(request, response);
	}
}
