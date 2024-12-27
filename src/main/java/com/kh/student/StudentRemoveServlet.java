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

@WebServlet("/student/remove")
public class StudentRemoveServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student>sList = new ArrayList<Student>();
		sList.add(new Student("일용자",99, 88));
		sList.add(new Student("이용자",88, 77));
		sList.add(new Student("삼용자",77, 66));
		sList.add(new Student("사용자", 66, 55));
		//이름이 입력되었을때 
		//해당 이름이 있으면 지우고 없으면 존재하지 않는다 출력
		String name = request.getParameter("name");
		String message = "";
		boolean isExit = false;
		RequestDispatcher view;
		for(Student std : sList) {
			if(std.getName().equals(name)) {
				sList.remove(std);
				isExit = true;
				break;
//				System.out.println(std.getName()+"삭제완료");
//				return;
			}
		}
		if(isExit) {
			message = "데이터 삭제 완료";
		}else {
			message = "검색 결과가 없습니다.";
		}
		request.setAttribute("message", message);
		view = request.getRequestDispatcher("/WEB-INF/views/common/result.jsp");
		view.forward(request, response);
	}
}
