package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


import com.demo.Models.Customers;

public class customerDaoImpl implements customerDao {
	static Connection conn;
	static PreparedStatement getall, deletebyid,getbyid,update;
	static {
		
		try {
			conn=DBUtil.getMyConnection();
			getall=conn.prepareStatement("select * from customers1");
			deletebyid=conn.prepareStatement("delete from customers1 where cnum=?");
			getbyid=conn.prepareStatement("select * from customers1 where cnum=?");
			update=conn.prepareStatement("update customers1 set cname=?, city=? ,rating=?,snum=? where cnum=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Customers> getAll() {
		List<Customers> clist=new ArrayList<>();
		try {
			ResultSet rs=getall.executeQuery();
			 while(rs.next()) {
				Customers cs= new Customers(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5));
				 clist.add(cs);
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clist;
	}
	@Override
	public void deletebyid(int id) {
		// TODO Auto-generated method stub
		try {
			deletebyid.setInt(1,id);
			deletebyid.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public Customers getData(int id) {
		try {
			getbyid.setInt(1, id);
			ResultSet rs=getbyid.executeQuery();
			if(rs.next()) {
				Customers c=new Customers(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getInt(5));
				return c;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void upatedata(int cnum, String name, String city, float rating, int salary) {
		// TODO Auto-generated method stub
		try {
			update.setString(1, name);
			update.setString(2,city);
			update.setFloat(3,rating);
			update.setInt(4, salary);
			update.setInt(5,cnum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
