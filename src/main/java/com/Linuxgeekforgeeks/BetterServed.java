package com.Linuxgeekforgeeks;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class BetterServed
 */
@WebServlet("/Multiobject")
public class BetterServed extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Student> list=Arrays.asList(new Student(1,"Navir"),new Student(2,"Juma"));
		request.setAttribute("student", list);
		
		
		RequestDispatcher rd=request.getRequestDispatcher("ShowMultiObj.jsp");
		rd.forward(request, response);
		
	}

}
