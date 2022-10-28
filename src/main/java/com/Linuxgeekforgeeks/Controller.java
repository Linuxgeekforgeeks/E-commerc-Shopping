package com.Linuxgeekforgeeks;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int[] number= {1,2,3,4,5};
		request.setAttribute("array", number);
		String name="Moudy";
		request.setAttribute("label", name);
//		response.sendRedirect("display.jsp");
		
		Student s=new Student(1,"linuxgeekforgeeks");
		request.setAttribute("student", s);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}

}
