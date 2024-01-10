package com.demo.service;

import java.util.List;

import com.demo.Models.Customers;

public interface customerService {

	List<Customers> getALL();

	void DeletebyId(int id);

	Customers getbyid(int id);

	void update(int cnum, String name, String city, float rating, int salary);

}
