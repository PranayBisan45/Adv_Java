package com.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class JDBC {
//
//	public static void main(String[] args) {
//		//Step 1--Register the driver
//		try {
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//			//step 2--Get connection
//			String url="jdbc:mysql://localhost:3306/d4?useSSL=false";
//			Connection conn=DriverManager.getConnection(url,"root","Pran@1234");
//			if (conn!=null) {
//				System.out.println("connection done");
//				PreparedStatement st=conn.prepareStatement("select*from Student");
//				ResultSet rs=st.executeQuery();
//				while(rs.next()) {
//					System.out.println(rs.getString(2));
//				}
//	
//			}
//
//		} catch (SQLException e) {
//			System.out.println("Error occured"+e.getMessage());
//			e.printStackTrace();
//		}
//		
//	}
//
//}



public class JDBC {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/d4?useSSL=false";
			Connection conn= DriverManager.getConnection(url,"root","Pran@1234");
			if(conn!=null) {
				System.out.println("Connection Done");
				PreparedStatement st = conn.prepareStatement("select * from Student");
				ResultSet r= st.executeQuery();
				while(r.next()) {
					System.out.println(r.getString(2));
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}