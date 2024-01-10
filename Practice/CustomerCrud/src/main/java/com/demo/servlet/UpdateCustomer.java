package com.demo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.customerService;
import com.demo.service.customerServiceImpl;

/**
 * Servlet implementation class UpdateCustomer
 */
@WebServlet("/update")
public class UpdateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cnum=Integer.parseInt(request.getParameter("cnum"));
		String name=request.getParameter("cname");
		String City=request.getParameter("city");
		float rating=Float.parseFloat(request.getParameter("rating"));
		int salary=Integer.parseInt(request.getParameter("snum"));
		customerService cs=new customerServiceImpl();
		cs.update(cnum,name,City,rating,salary);
		RequestDispatcher rd = request.getRequestDispatcher("DisplayCust.jsp");
		rd.forward(request, response);
	}
	
}
