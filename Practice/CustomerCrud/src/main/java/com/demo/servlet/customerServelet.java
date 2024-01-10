package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.Models.*;
import com.demo.service.*;
import java.util.*; 
/**
 * Servlet implementation class customerServelet
 */
@WebServlet("/customerServelet")
public class customerServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customerService cs=new customerServiceImpl();
		
		List<Customers> clist= cs.getALL();
		request.setAttribute("list",clist);
		RequestDispatcher rd=request.getRequestDispatcher("DisplayCust.jsp");
		rd.forward(request, response);
	}

}
