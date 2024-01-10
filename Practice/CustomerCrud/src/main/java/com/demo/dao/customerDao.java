package com.demo.dao;

import java.util.List;

import com.demo.Models.Customers;

public interface customerDao {

	List<Customers> getAll();

	void deletebyid(int id);

	Customers getData(int id);

	void upatedata(int cnum, String name, String city, float rating, int salary);

}
