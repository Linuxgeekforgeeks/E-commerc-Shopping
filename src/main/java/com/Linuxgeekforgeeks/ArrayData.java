package com.Linuxgeekforgeeks;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class List
 */
@WebServlet("/List")
public class ArrayData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int[] number= {1,3,4,5,6};
		
		request.setAttribute("array", number);
		RequestDispatcher rd=request.getRequestDispatcher("Array.jsp");
		rd.forward(request, response);
	}

}
