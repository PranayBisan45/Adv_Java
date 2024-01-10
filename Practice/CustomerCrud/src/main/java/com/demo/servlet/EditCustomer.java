package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.Models.Customers;
import com.demo.service.customerService;
import com.demo.service.customerServiceImpl;

/**
 * Servlet implementation class EditCustomer
 */
@WebServlet("/editcust")
public class EditCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;



	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id= Integer.parseInt(request.getParameter("cnum"));
		customerService cs=new customerServiceImpl();
		Customers c =cs.getbyid(id);
		request.setAttribute("cust", c);
		RequestDispatcher rd=request.getRequestDispatcher("edit.jsp");
		rd.forward(request, response);
		
		
	}
	
}
