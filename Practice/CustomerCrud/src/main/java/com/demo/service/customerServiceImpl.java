package com.demo.service;

import java.util.List;

import com.demo.Models.Customers;
import com.demo.dao.*;
public class customerServiceImpl implements customerService{

	@Override
	public List<Customers> getALL() 
	{
		customerDao cdao=new customerDaoImpl();
	List<Customers> clist=cdao.getAll();
		return clist;
	}

	@Override
	public void DeletebyId(int id) {
		customerDao cdao=new customerDaoImpl();
		cdao.deletebyid(id);
		
	}

	@Override
	public Customers getbyid(int id) {
		customerDao cdao=new customerDaoImpl();
		Customers c=cdao.getData(id);
		return c;
	}

	@Override
	public void update(int cnum, String name, String city, float rating, int salary) {
		// TODO Auto-generated method stub
		customerDao cdao=new customerDaoImpl();
		cdao.upatedata(cnum,name,city,rating,salary);
	}

}
