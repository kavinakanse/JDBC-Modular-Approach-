package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BankDao {
	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into bank values(101, 'SBI', 7), (102, 'axis', 10)");
		System.out.println("Data is inserted...");
		c.close();
	}
	
	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204","root","root");
		Statement s = c.createStatement();
		s.executeUpdate("update bank set name = 'hdfc' where id = 102");
		System.out.println("updated data");
		c.close();
	}
	
	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from bank where id = 102");
		System.out.println("data is deleted");
		c.close();
	}
	
	public void getAllData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch204", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from bank");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3));
		}
	}
}
