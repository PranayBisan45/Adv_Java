package com.demo.Models;

public class Customers {

	
	public int cnum;
	public String cname;
	public String city;
	public float rating;
	public int snum;
	public Customers(int cnum, String cname, String city, float rating, int snum) {
		super();
		this.cnum = cnum;
		this.cname = cname;
		this.city = city;
		this.rating = rating;
		this.snum = snum;
	}
	public Customers() {
		super();
	}
	public int getCnum() {
		return cnum;
	}
	public void setCnum(int cnum) {
		this.cnum = cnum;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getcity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getSnum() {
		return snum;
	}
	public void setSnum(int snum) {
		this.snum = snum;
	}
	@Override
	public String toString() {
		return "Customers [cnum=" + cnum + ", cname=" + cname + ", City=" + city + ", rating=" + rating + ", snum="
				+ snum + "]";
	}

}
