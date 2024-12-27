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
 * 학생 리스트 조회
 * URL : /student/list 
 */
@WebServlet("/student/list")
public class StudentListServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student>sList = new ArrayList<Student>();
		sList.add(new Student("일용자", 99, 88));
		sList.add(new Student("이용자", 88, 77));
		sList.add(new Student("삼용자", 77, 66));
		sList.add(new Student("사용자", 66, 55));
		RequestDispatcher view;
		request.setAttribute("sList", sList);
//		request.setAttribute("name", sList.get(0).getName());
//		request.setAttribute("firstScore", sList.get(0).getFirstScore());
//		request.setAttribute("secondScore", sList.get(0).getSecondScore());
		view = request.getRequestDispatcher("WEB-INF/views/common/list.jsp");	
		view.forward(request, response);
		
		
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
//		String name = sList.get(0).getName();
//		int fScore  = sList.get(0).getFirstScore();
//		int sScore  = sList.get(0).getSecondScore();
//		for(int i=0; i<sList.size(); i++) {
//			
//			out.println("<h1>학생리스트 조회<h1>");
//			out.println("<ul><li>학생이름 : "+name+"</li>");
//			out.println("<li>1차점수 : "+fScore+"</li>");
//			out.println("<li>2차점수 : "+sScore+"</li></ul>");
//		}
		
	
		
//		for(Student std : sList) {
//			System.out.println(std.toString());
//		}
	}
}
